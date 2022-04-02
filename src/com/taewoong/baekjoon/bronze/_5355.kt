package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = br.readLine().split(" ")
        var answer = token[0].toDouble()

        repeat(token.size - 1) {
            val string = token[it + 1]
            if (string == "@") {
                answer *= 3
            } else if (string == "%") {
                answer += 5
            } else if (string == "#") {
                answer -= 7
            }
        }
        bw.write("${String.format("%.2f", answer)}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}
