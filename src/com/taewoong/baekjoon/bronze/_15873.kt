package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var a = n / 10
    var b = n % 100

    if (a > 10) {
        a /= 10
    }

    if (b > 10) {
        b %= 10
    }

    bw.write("${a + b}")

    bw.flush()
    bw.close()

    br.close()
}
