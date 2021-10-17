package com.taewoong.baekjoon.bronze

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.time.LocalDate

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${LocalDate.now()}")
    bw.flush()
    bw.close()
}
