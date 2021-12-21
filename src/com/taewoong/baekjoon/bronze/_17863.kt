package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val number = br.readLine()

    if (number.substring(0,3) == "555") {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()

    br.close()
}
