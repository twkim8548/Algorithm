package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    bw.write("${(n * 0.78).toInt()} ${((n * 0.8) + ((n * 0.2) * 0.78)).toInt()}")
    bw.flush()
    bw.close()
    br.close()
}
