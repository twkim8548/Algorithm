package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val n = BufferedReader(InputStreamReader(System.`in`)).readLine().toInt()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${(n - 1) * n}")
    bw.flush()
    bw.close()
}
