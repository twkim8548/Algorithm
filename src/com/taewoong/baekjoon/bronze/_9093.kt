package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val string = br.readLine().split(" ")

        string.forEach {
            bw.write("${it.reversed()} ")
        }

        bw.write("\n")
    }

    bw.flush()
    bw.close()

    br.close()
}