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

    val a = token.nextToken().toDouble()
    val b = token.nextToken().toDouble()

    val m = (b - a) / 400

    bw.write("${1 / (1 + Math.pow(10.0, m))}")

    bw.flush()
    bw.close()

    br.close()
}