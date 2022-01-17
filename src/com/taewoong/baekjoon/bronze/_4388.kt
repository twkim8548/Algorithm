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

        var a = token.nextToken().reversed()
        var b = token.nextToken().reversed()

        if (a == "0" && b == "0") {
            break
        }

        when {
            a > b -> {
                b += "0".repeat(a.length - b.length)
            }
            b > a -> {
                a += "0".repeat(b.length - a.length)
            }
        }

        var answer = 0
        var carry = false

        for (i in a.indices) {
            if (carry) {
                if (1 + a[i].toInt() + b[i].toInt() - 96 > 9) {
                    answer++
                } else {
                    carry = false
                }
            } else {
                if (a[i].toInt() + b[i].toInt() - 96 > 9) {
                    carry = true
                    answer++
                }

            }
        }
        bw.write("$answer\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
