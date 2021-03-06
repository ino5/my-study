package my.baekjoon.io;

import java.io.*;
import java.util.*;

public class P1000 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()); 
		int b = Integer.parseInt(st.nextToken());
		bw.write(Integer.toString(a+b));
		
		br.close();
		bw.close();
	}
}
