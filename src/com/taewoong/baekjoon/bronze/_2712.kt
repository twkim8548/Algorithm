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
        val n = token.nextToken().toDouble()
        val unit = token.nextToken()

        when (unit) {
            "kg" -> {
                bw.write(String.format("%.4f",n * 2.2046) + " lb\n")
            }
            "l" -> {
                bw.write(String.format("%.4f",n * 0.2642) + " g\n")
            }
            "lb" -> {
                bw.write(String.format("%.4f",n * 0.4536) + " kg\n")
            }
            "g" -> {
                bw.write(String.format("%.4f",n * 3.7854) + " l\n")
            }
        }
    }

    bw.flush()
    bw.close()

    br.close()
}