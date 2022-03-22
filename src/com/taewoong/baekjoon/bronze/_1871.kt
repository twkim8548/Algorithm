package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val licensePlate = br.readLine().split("-")

        var value = 0
        licensePlate[0].reversed().forEachIndexed { index, c ->
            value += (c.code - 65) * 26.0.pow(index).toInt()
        }

        if (abs(value - licensePlate[1].toInt()) <= 100) {
            bw.write("nice\n")
        }else {
            bw.write("not nice\n")
        }
    }
    bw.flush()
    bw.close()

    br.close()
}