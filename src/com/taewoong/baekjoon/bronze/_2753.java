package com.taewoong.baekjoon.bronze;

import java.io.*;

public class _2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(bufferedReader.readLine());

        bufferedWriter.write(Integer.toString(getAnswer(year)));
        bufferedWriter.flush();
        bufferedWriter.close();

        bufferedReader.close();

    }

    private static int getAnswer(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return 1;
            }
        }
        return 0;
    }
}
