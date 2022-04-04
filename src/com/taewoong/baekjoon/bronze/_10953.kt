package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val string = br.readLine().split(",")
        bw.write("${string[0].toInt() + string[1].toInt()}\n")
    }
    bw.flush()
    bw.close()

    br.close()
}