package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0
    repeat(5) {
        answer += br.readLine().toInt()
    }

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}
