package com.taewoong.baekjoon.implementation

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()

    bw.write("${a+b}")
    bw.flush()
    bw.close()

    br.close()
}
