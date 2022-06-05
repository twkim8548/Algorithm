package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val alphabet = br.readLine()

    if (alphabet == "n" || alphabet == "N") {
        bw.write("Naver D2")
    } else {
        bw.write("Naver Whale")
    }

    bw.flush()
    bw.close()

    br.close()
}