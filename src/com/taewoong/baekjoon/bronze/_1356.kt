package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()

    var isYes = false
    run {
        repeat(n.length - 1) {
            var a = 1
            var b = 1
            n.substring(0, it + 1).forEach {
                a *= it.toString().toInt()
            }
            n.substring(it + 1, n.length).forEach {
                b *= it.toString().toInt()
            }

            if (a == b) {
                bw.write("YES")
                isYes = true
                return@run
            }
        }
    }

    if (!isYes)
        bw.write("NO")

    bw.flush()
    bw.close()
    br.close()
}