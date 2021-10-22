package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine().toInt()
    val b = br.readLine()
    val bArray = b.toCharArray()

    bw.write("${a * (bArray[2] - '0')}\n${a * (bArray[1] - '0')}\n${a * (bArray[0] - '0')}\n${a * b.toInt()}")

    bw.flush()
    bw.close()
    br.close()
}
