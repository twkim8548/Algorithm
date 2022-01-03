package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var answer = n % 8

    if (answer == 0) {
        answer = 2
    } else if (answer == 6) {
        answer = 4
    } else if (answer == 7) {
        answer = 3
    }

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}
