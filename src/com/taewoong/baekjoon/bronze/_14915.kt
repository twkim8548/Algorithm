package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val m = token.nextToken().toInt()
    val n = token.nextToken().toInt()

    bw.write(m.toString(n).toUpperCase())
    bw.flush()
    bw.close()

    br.close()
}
