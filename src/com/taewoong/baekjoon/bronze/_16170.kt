package com.taewoong.baekjoon.bronze

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy\nMM\ndd")
    val formatted = current.format(formatter)

    val bw = BufferedWriter(OutputStreamWriter(System.out))
    bw.write(formatted)
    bw.flush()
    bw.close()
}
