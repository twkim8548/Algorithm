package com.taewoong.baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class _10950 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(bufferedReader.readLine());
        for (int j = 0; j < i; j++) {


            String s = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(s);

            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            int answer = a + b;

            bufferedWriter.write(Integer.toString(answer) + "\n");

            bufferedWriter.flush();

        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
