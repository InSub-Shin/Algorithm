package BOJ;

import java.io.*;
import java.util.*;

public class BOJ2896_달팽이는올라가고싶다 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = stoi(st.nextToken());
		int B = stoi(st.nextToken());
		int V = stoi(st.nextToken());
		
		int t = (V - A) / (A-B);
		if((V-A)%(A-B) != 0)t++;
		bw.write(String.valueOf(++t));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int stoi(String s) {
		return Integer.parseInt(s);
	}

}
