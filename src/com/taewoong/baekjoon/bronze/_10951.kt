package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var s: String?
    while ( br.readLine().also { s = it } != null) {
        val token = StringTokenizer(s)
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        bw.write("${a + b}\n")
        bw.flush()
    }
}
