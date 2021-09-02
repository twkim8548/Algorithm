package com.taewoong.baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class _10430 {
    public static void main(String[] args) throws IOException {
//        첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s);

        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());
        int C = Integer.parseInt(stringTokenizer.nextToken());

        bufferedWriter.write((A + B) % C + "\n");
        bufferedWriter.write(((A % C) + (B % C)) % C + "\n");
        bufferedWriter.write((A * B) % C + "\n");
        bufferedWriter.write(((A % C) * (B % C)) % C + "\n");

        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();

    }
}
