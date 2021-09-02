package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    /*
    각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
     */

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var count = 0

    repeat(br.readLine().toInt()) {
        count += 1
        val token = StringTokenizer(br.readLine())
        val sum = (token.nextToken().toInt() + token.nextToken().toInt()).toString()

        bw.write("Case #$count: $sum\n")
    }

    bw.flush()
    bw.close()
}
