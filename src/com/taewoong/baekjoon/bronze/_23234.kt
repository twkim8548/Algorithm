package com.taewoong.baekjoon.bronze

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("The world says hello!")
    bw.flush()
    bw.close()
}
