package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var max = 0
    var x = 0
    var y = 0
    repeat(9) {
        val token = StringTokenizer(br.readLine())
        (0 until 9).forEach { i ->
            val value = token.nextToken().toInt()
            if (value > max) {
                max = value
                x = it + 1
                y = i + 1
            }
        }
    }

    bw.write("$max\n$x $y")

    bw.flush()
    bw.close()

    br.close()


}