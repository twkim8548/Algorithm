package com.taewoong.baekjoon.implementation

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

    var answer = 0.0

    repeat(5) {
        answer += token.nextToken().toDouble().pow(2)
    }

    bw.write("${(answer%10).toInt()}")
    bw.flush()
    bw.close()

    br.close()
}
