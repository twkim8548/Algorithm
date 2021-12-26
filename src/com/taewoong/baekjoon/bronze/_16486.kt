package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val d1 = br.readLine().toInt()
    val d2 = br.readLine().toInt()

    bw.write("${d1 * 2 + d2 * 2 * 3.141592}")
    bw.flush()
    bw.close()

    br.close()
}
