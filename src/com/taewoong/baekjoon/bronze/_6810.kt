package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 91
    answer += br.readLine().toInt()
    answer += br.readLine().toInt() * 3
    answer += br.readLine().toInt()

    bw.write("The 1-3-sum is $answer")
    bw.flush()
    bw.close()

    br.close()
}
