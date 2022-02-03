package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        var n = br.readLine().toInt()

        if (n == 0) {
            break
        }

        while (n.toString().length > 1) {
            var a = 0
            n.toString().forEach {
                a += it.toString().toInt()
            }

            n = a
        }
        bw.write("$n\n")
    }

    bw.flush()

    bw.close()
    br.close()
}
