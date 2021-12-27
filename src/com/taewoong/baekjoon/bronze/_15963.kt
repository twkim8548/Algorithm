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

    if (token.nextToken().toBigInteger() != token.nextToken().toBigInteger()) {
        bw.write("0")
    } else {
        bw.write("1")
    }

    bw.flush()

    bw.close()
    br.close()
}
