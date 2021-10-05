package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()

    val number = n.toBigInteger(2)

    bw.write((number * "17".toBigInteger()).toString(2))

    bw.flush()
    bw.close()

    br.close()
}
