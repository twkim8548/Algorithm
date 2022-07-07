package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine().toInt()
    var total = 0
    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        total += token.nextToken().toInt() * token.nextToken().toInt()
    }

    if (total == x) bw.write("Yes")
    else bw.write("No")

    bw.flush()
    bw.close()

    br.close()
}