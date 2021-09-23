package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val lPToken = StringTokenizer(br.readLine())

    val total = lPToken.nextToken().toInt() * lPToken.nextToken().toInt()

    val token = StringTokenizer(br.readLine())

    repeat(5) {
        bw.write("${token.nextToken().toInt() - total} ")
    }

    bw.flush()

    bw.close()
    br.close()

}
