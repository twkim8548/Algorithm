package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var cnt = 2015

        br.readLine().toMutableList().distinct().forEach {
            cnt -= it.toInt()
        }
        bw.write("$cnt\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
