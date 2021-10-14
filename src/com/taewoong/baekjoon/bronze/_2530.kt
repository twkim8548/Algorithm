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

    val hour = token.nextToken().toInt()
    var min = token.nextToken().toInt()
    var sec = token.nextToken().toInt()

    val time = br.readLine().toInt()

    if (time >= 60) {
        min += time / 60
        sec += sec + time - time/60
    }

}
