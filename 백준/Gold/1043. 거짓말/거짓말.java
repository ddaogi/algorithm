import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int knowNum = Integer.parseInt(st.nextToken());
        boolean[] knowPeople;

        if(knowNum == 0){
            System.out.println(M);
            return;
        }
        parent = new int[N+1];
        for(int i = 1; i<=N; i++)
            parent[i] = i;

        knowPeople = new boolean[N+1];
        for(int i = 0; i<knowNum; i++) {
            int num = Integer.parseInt(st.nextToken());

            knowPeople[num] = true;
        }

        List<List<Integer>> partyList = new ArrayList<>();
        for(int i = 0; i<M; i++)
            partyList.add(new ArrayList<>());

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            for(int j = 0; j<num; j++) {
                partyList.get(i).add(Integer.parseInt(st.nextToken()));

                if(j != 0){
                    int nowIdx = partyList.get(i).get(j);
                    int exIdx = partyList.get(i).get(j-1);

                    union(exIdx, nowIdx);
                }
            }
        }

        boolean[] visited = new boolean[N+1];
        for(int i = 1; i<=N; i++){
            if(knowPeople[i] && !visited[i]) {
                int root = find(i);

                for (int j = 1; j <= N; j++) {
                    if(find(j) == root){
                        knowPeople[j] = true;
                        visited[j] = true;
                    }
                }
            }
        }

        boolean[] goParty = new boolean[M];
        for(int i = 0; i<M; i++)
            goParty[i] = true;

        for(int i = 0; i<M; i++){
            for(int j = 1; j<=N; j++){
                if(knowPeople[j]){
                    if(partyList.get(i).contains(j))
                        goParty[i] = false;
                }
            }
        }

        int sum = 0;
        for(int i = 0; i<M; i++)
            if(goParty[i])
                sum++;

        System.out.println(sum);
    }

    static int find(int idx){
        if(parent[idx] == idx)
            return idx;
        else {
            parent[idx] = find(parent[idx]);
            return parent[idx];
        }
    }

    static void union(int idx1, int idx2){
        int parent1 = find(idx1);
        int parent2 = find(idx2);

        if(parent1 != parent2)
            parent[parent2] = parent1;
    }
}