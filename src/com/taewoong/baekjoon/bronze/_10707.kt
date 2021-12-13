package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine().toInt()
    val y = br.readLine().toInt()
    val c = br.readLine().toInt()
    val d = br.readLine().toInt()
    val p = br.readLine().toInt()

    val xFee = x * p

    var yFee = y
    if (p > c) {
        yFee += (p - c) * d
    }

    bw.write("${xFee.coerceAtMost(yFee)}")

    bw.flush()
    bw.close()

    br.close()

}
