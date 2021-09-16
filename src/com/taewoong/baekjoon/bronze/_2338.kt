package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine().toBigInteger()
    val b = br.readLine().toBigInteger()

    bw.write("${a+b}\n${a-b}\n${a*b}")
    bw.flush()
    bw.close()

    br.close()
}
