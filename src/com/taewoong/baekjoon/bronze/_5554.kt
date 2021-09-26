package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = BufferedReader(InputStreamReader(System.`in`))

    var sec = 0

    repeat(4) {
        sec += br.readLine().toInt()
    }

    val x = sec / 60
    val y = sec - (60 * x)

    bw.write("$x\n$y")
    bw.flush()
    bw.close()
    br.close()
}
