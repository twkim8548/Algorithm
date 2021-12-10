package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toDouble()
    val b = token.nextToken().toDouble()
    val c = token.nextToken().toDouble()

    bw.write("${max((a * b / c), (a / b * c)).toInt()}")
    bw.flush()
    bw.close()

    br.close()

}
