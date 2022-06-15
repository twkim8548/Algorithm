package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()

    var answer = 0.0
    n.forEach {
        answer += Math.pow(it.toString().toDouble(), 5.0)
    }

    bw.write("${answer.toInt()}")
    bw.flush()
    bw.close()
    br.close()
}