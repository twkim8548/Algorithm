package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        val n2 = n * n

        if (n2.toString().endsWith(n.toString())) {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}
