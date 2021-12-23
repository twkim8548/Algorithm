package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val kda = br.readLine()
    val kill = kda.split("/")[0].toInt()
    val death = kda.split("/")[1].toInt()
    val assist = kda.split("/")[2].toInt()
    if (kill + assist < death || death == 0) {
        bw.write("hasu")
    } else {
        bw.write("gosu")
    }

    bw.flush()
    bw.close()

    br.close()
}
