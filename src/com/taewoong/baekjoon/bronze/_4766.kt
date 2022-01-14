package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var preTemp = -11.0
    var nowTemp: Double
    while (true) {
        nowTemp = br.readLine().toDouble()
        if (nowTemp == 999.0) {
            break
        }

        if (preTemp != -11.0) {
            bw.write("${String.format("%.2f", nowTemp - preTemp)}\n")
        }
        preTemp = nowTemp
    }

    bw.flush()
    bw.close()
    br.close()
}