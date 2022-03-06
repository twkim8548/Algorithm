package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine()

        val reverseN = n.reversed()

        val sum = n.toInt() + reverseN.toInt()

        if (sum.toString() == sum.toString().reversed()) {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }

    }

    bw.flush()
    bw.close()

    br.close()
}