package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val rBox = br.readLine().toInt()
    val sBox = br.readLine().toInt()

    val answer = (rBox * 8 + sBox * 3) - 28

    if (answer <= 0) {
        bw.write("0")
    } else {
        bw.write("$answer")
    }
    bw.flush()
    bw.close()

    br.close()
}