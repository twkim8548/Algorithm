package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val string = br.readLine()

    if (string == string.reversed()) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.flush()
    bw.close()

    br.close()
}