package com.taewoong.baekjoon.implementation;

import java.io.*;
import java.util.StringTokenizer;

public class _1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(s);

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        if (a > b) {
            bufferedWriter.write(">");
        } else if (a < b) {
            bufferedWriter.write("<");
        } else {
            bufferedWriter.write("==");
        }
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
    }
}
