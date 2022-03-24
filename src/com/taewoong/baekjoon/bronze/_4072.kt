package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()
        if (string == "#") {
            break
        }

        val array = string.split(" ")

        array.forEach {
            bw.write("${it.reversed()} ")
        }
        bw.write("\n")
    }

    bw.flush()

    bw.close()

    br.close()
}
