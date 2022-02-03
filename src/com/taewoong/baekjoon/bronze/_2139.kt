package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val token = StringTokenizer(br.readLine())

        var isYoon = false

        val day = token.nextToken().toInt()
        val month = token.nextToken().toInt()
        val year = token.nextToken().toInt()

        if (day == 0 && month == 0 && year == 0) {
            break
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isYoon = true
                }
            } else {
                isYoon = true
            }
        }
        var answer = 0
        for (i in 1..month) {
            when (i) {
                month -> {
                    answer += day
                }
                2 -> {
                    answer += if (isYoon) {
                        29
                    } else {
                        28
                    }
                }
                1, 3, 5, 7, 8, 10, 12 -> {
                    answer += 31
                }
                4, 6, 9, 11 -> {
                    answer += 30
                }
            }
        }

        bw.write("$answer\n")
    }
    bw.flush()
    bw.close()

    br.close()
}
