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

    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    if (m <= 2) {
        bw.write("NEWBIE!")
    } else {
        if (m <= n) {
            bw.write("OLDBIE!")
        } else {
            bw.write("TLE!")
        }
    }

    bw.flush()
    bw.close()

    br.close()
}
