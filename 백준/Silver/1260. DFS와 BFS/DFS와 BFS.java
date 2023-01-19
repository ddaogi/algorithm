import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //vertex 갯수
		int M = sc.nextInt(); // edge 갯수
		int V = sc.nextInt();
		
		
		List<Integer>[] adList = new ArrayList[N+1];
		
		for(int i=0;i<adList.length;i++) {
			adList[i] = new ArrayList<Integer>();
		}
		
		
		// 리스트로 그래프구현
		for(int i=0;i<M;i++) {
			int v1= sc.nextInt();
			int v2 = sc.nextInt();
			
			//방향성이 없으므로 양쪽 vertex에 edge를 연결
			adList[v1].add(v2); 
			adList[v2].add(v1);
		}
		
		for(int i =0;i<adList.length;i++) {
			Collections.sort(adList[i]);
		}
		
		boolean[] visited = new boolean[N+1];
		dfs(adList,visited,V);
		Arrays.fill(visited,false);
		System.out.println();
		bfs(adList,visited,V);
				
		sc.close();
	}	
	static void dfs(List<Integer>[] list, boolean[] visit, int v) {
		visit[v] =true;
		System.out.print(v+" ");
		for(int i:list[v]) {
			if(!visit[i]) {
				dfs(list,visit,i);
			}
		}
	}
	static void bfs(List<Integer>[] list, boolean[]visit, int v) {
		Queue <Integer> q = new LinkedList<>();
		q.add(v);
		visit[v] = true;
		
		
		while(!q.isEmpty()){
			v=q.poll();
			System.out.print(v+" ");
			
			for(int i:list[v]) {
				if(!visit[i]) {
					q.add(i);
					visit[i]= true;
				}
			}
		}
	}
}

		