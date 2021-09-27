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

    var hour = token.nextToken().toInt()
    var min = token.nextToken().toInt()

    val time = br.readLine().toInt()

    min += time

    if (min / 60 >= 1) {
        hour += min / 60
        min -= (min / 60) * 60
    }

    if (hour >= 24) {
        hour -= 24
    }

    bw.write("$hour $min")
    bw.flush()

    bw.close()
    br.close()
}
