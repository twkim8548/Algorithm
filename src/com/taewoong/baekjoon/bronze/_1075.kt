package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = (br.readLine().toInt() / 100) * 100
    val f = br.readLine().toInt()

    for (i in 0 until 100) {
        if ((n + i) % f == 0) {
            bw.write(String.format("%02d", i))
            break
        }
    }

    bw.flush()
    bw.close()
    br.close()
}
