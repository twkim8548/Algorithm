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

    val x = token.nextToken().reversed().toInt()
    val y = token.nextToken().reversed().toInt()

    bw.write("${(x + y).toString().reversed().toInt()}")
    bw.flush()
    bw.close()

    br.close()
}