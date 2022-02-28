package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val w = token.nextToken().toInt()
    val h = token.nextToken().toInt()
    val answer = (w + h) - sqrt((w*w + h*h).toDouble())
    bw.write(String.format("%.9f", answer))
    bw.flush()
    bw.close()
    br.close()
}