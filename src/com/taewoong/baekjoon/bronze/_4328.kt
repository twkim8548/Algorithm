package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()
        if (string == "0") {
            break
        }
        val token = StringTokenizer(string)
        val b = token.nextToken().toInt()
        val p = token.nextToken().toBigInteger(b)
        val m = token.nextToken().toBigInteger(b)

        bw.write("${(p%m).toString(b)}\n")
    }
    bw.flush()
    bw.close()
    br.close()
}