package BOJ;

import java.io.*;
import java.util.*;

public class BOJ10250_ACM호텔 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = stoi(br.readLine());
		for (int i = 0; i < tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = stoi(st.nextToken());
			int W = stoi(st.nextToken());
			int N = stoi(st.nextToken());
			
			int floor = N % H;
			int ho = N / H + 1;
			if(floor == 0) {
				floor = H;
			}
			if(ho >= 10) {
				bw.write(String.valueOf(floor) + String.valueOf(ho) + "\n");
				
			}
			else {
				bw.write(String.valueOf(floor) + "0" + String.valueOf(ho) + "\n");
				
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
