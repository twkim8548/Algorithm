package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.ceil

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val r = token.nextToken().toDouble()
    val c = token.nextToken().toDouble()
    val n = token.nextToken().toDouble()

    val answer= ceil((r/n)).toBigDecimal().toBigInteger() * ceil((c/n)).toBigDecimal().toBigInteger()

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}


