package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()

        if (string == "***") break

        bw.write("${string.reversed()}\n")
    }

    bw.flush()
    bw.close()

    br.close()
}