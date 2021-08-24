package com.taewoong.baekjoon.bronze;

import java.io.*;

public class _8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bufferedReader.readLine());
        int answer = 0;
        for (int i = 1; i <= a; i++) {
            answer +=i;
        }

        bufferedWriter.write(Integer.toString(answer));
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
    }
}
