package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0.0
    val n = br.readLine().toInt()
    var total = 0.0
    repeat(n) {
        val string = br.readLine().split(" ")
        val credit = string[1].toDouble()
        total += credit
        when (string[2]) {
            "A+" -> {
                answer += credit * 4.3
            }
            "A0" -> {
                answer += credit * 4.0
            }
            "A-" -> {
                answer += credit * 3.7
            }
            "B+" -> {
                answer += credit * 3.3
            }
            "B0" -> {
                answer += credit * 3.0
            }
            "B-" -> {
                answer += credit * 2.7
            }
            "C+" -> {
                answer += credit * 2.3
            }
            "C0" -> {
                answer += credit * 2.0
            }
            "C-" -> {
                answer += credit * 1.7
            }
            "D+" -> {
                answer += credit * 1.3
            }
            "D0" -> {
                answer += credit * 1.0
            }
            "D-" -> {
                answer += credit * 0.7
            }
            "F" -> {
                answer += 0
            }
        }
    }

    bw.write("${String.format("%.2f" , answer / total)}")
    bw.flush()
    bw.close()

    br.close()
}