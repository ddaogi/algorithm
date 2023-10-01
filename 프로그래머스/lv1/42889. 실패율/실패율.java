import java.util.*;
class Solution {
    public static int[] solution(int N, int[] stages) {
		int []result = new int[N];
		int []numClear = new int[N+1];
		int []numFail = new int[N+2];
		for(int i : stages) {
			for(int j=0;j<i;j++)
				numClear[j]++;
			numFail[i]++;
		}
		double[] failRate = new double[N+1];
		
		for(int i =1;i<N+1;i++){
			if(numFail[i] + numClear[i] == 0) failRate[i]=0d;
            else     
                failRate[i] = (double) numFail[i] / (numFail[i]+numClear[i]);
			
		}
		failRate[0] = -1;
		double [] sorted = failRate.clone();
		Arrays.sort(sorted);
		int idx=0;
		for(int i =sorted.length-1;i>0;i--)
		{
			for(int j = 1; j<failRate.length;j++)		
			{
				if(sorted[i] == failRate[j]) {
					failRate[j] = -1;
					result[idx++] = j;
				}
			}
		}
		
		
		
		
		return result;
	}
}