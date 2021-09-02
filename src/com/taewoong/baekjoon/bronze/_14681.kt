package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()

    if (a > 0 && b > 0) {
        bw.write("1")
    } else if (a < 0 && b > 0) {
        bw.write("2")
    } else if (a < 0 && b < 0) {
        bw.write("3")
    } else if (a > 0 && b < 0) {
        bw.write("4")
    }

    bw.flush()
    bw.close()
    br.close()
}
