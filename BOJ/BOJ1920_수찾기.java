package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920_수찾기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = stoi(br.readLine());
		int Ns[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < Ns.length; i++) {
			Ns[i] = stoi(st.nextToken());
		}
		Arrays.sort(Ns);
		
		int M = stoi(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			bw.write(String.valueOf(binarysearch(st.nextToken(), N, Ns))+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int stoi(String s) {
		return Integer.parseInt(s);
	}
	
	public static int binarysearch(String s,int N, int[] Ns) {
		int tmp = stoi(s);
		int start = 0;
		int end = N-1;
		
		while(start <= end){
			int mid = (start + end) / 2;
			int val = Ns[mid];
			
			if(val == tmp) {
				return 1;
			}else if(val < tmp) {
				start = mid+1;
			}else {
				end = mid - 1;
			}
			
		}
		
		return 0;
	}

}
