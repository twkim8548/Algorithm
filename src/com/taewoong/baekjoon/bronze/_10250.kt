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
        val h = token.nextToken().toInt()
        val w = token.nextToken().toInt()
        val n = token.nextToken().toInt()

        val floor = if (n % h == 0) h else n % h
        val number = if (n % h == 0) n / h else n / h + 1

        bw.write("$floor${String.format("%02d", number)}\n")
    }
    bw.flush()
    bw.close()
    br.close()
}
