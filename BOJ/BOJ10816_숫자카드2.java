package BOJ;

import java.io.*;
import java.util.*;

public class BOJ10816_숫자카드2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = stoi(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] Ns = new int[N];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < Ns.length; i++) {
			int tmp = stoi(st.nextToken());
			if(!map.containsKey(tmp)) {
				map.put(tmp,1);
			}else {
				map.put(tmp, map.get(tmp)+1);
			}
			
		}
		
		int M = stoi(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < M; i++) {
			int t = stoi(st.nextToken());
			if(map.containsKey(t)) {
				bw.write( map.get(t) + " " );
			}else {
				bw.write("0 ");
			}
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int stoi(String s) {
		return Integer.parseInt(s);
	}

}
