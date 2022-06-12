package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0.0
    when (br.readLine()) {
        "A+" -> {
            answer += 4.3
        }
        "A0" -> {
            answer += 4.0
        }
        "A-" -> {
            answer += 3.7
        }
        "B+" -> {
            answer += 3.3
        }
        "B0" -> {
            answer += 3.0
        }
        "B-" -> {
            answer += 2.7
        }
        "C+" -> {
            answer += 2.3
        }
        "C0" -> {
            answer += 2.0
        }
        "C-" -> {
            answer += 1.7
        }
        "D+" -> {
            answer += 1.3
        }
        "D0" -> {
            answer += 1.0
        }
        "D-" -> {
            answer += 0.7
        }
        "F" -> {
            answer += 0
        }
    }
    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}
