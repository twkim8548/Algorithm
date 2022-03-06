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

    val c = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    bw.write("${(Math.round(c.toDouble() / Math.pow(10.0, k.toDouble())) * Math.pow(10.0, k.toDouble())).toInt()}")
    bw.flush()
    bw.close()

    br.close()
}