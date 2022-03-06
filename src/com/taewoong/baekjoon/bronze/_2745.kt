package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().reversed()
    val b = token.nextToken().toDouble()

    var answer = "0".toBigInteger()

    n.forEachIndexed { index, c ->
        if (c.code in 48..57) {
            answer += ((c.code - 48) * b.pow(index)).toBigDecimal().toBigInteger()
        } else {
            answer += ((c.code - 55) * b.pow(index)).toBigDecimal().toBigInteger()
        }
    }

    bw.write("$answer")
    bw.flush()

    bw.close()
    br.close()
}