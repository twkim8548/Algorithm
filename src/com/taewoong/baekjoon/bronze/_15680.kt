package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    if (br.readLine().toInt() == 0) {
        bw.write("YONSEI")
    } else {
        bw.write("Leading the Way to the Future")
    }

    bw.flush()

    bw.close()
    br.close()
}
