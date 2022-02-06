package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    val n = br.readLine().toInt()
    bw.write("${2 * (n + 1)} ${3 * (n + 1)}")
    bw.flush()
    bw.close()
}
