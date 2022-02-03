package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        val n = token.nextToken().toInt() - 1
        var string = token.nextToken()

        string = string.removeRange(n, n + 1)

        bw.write("$string\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
