package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    if((1 * br.readLine().toInt()) + (2 * br.readLine().toInt()) + (3 * br.readLine().toInt()) >= 10) bw.write("happy")
    else bw.write("sad")

    bw.flush()
    bw.close()
    br.close()
}
