package com.taewoong.baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class _10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        bufferedWriter.write(a+b + "\n");
        bufferedWriter.write(a-b+ "\n");
        bufferedWriter.write(a*b+ "\n");
        bufferedWriter.write(a/b+ "\n");
        bufferedWriter.write(a%b+ "\n");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
