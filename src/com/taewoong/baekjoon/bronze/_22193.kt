package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    val trash = br.readLine()

    val a = br.readLine().toBigInteger()
    val b = br.readLine().toBigInteger()

    bw.write("${a * b}")

    bw.flush()
    bw.close()


}
