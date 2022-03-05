package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val sentence = br.readLine()
        bw.write("${sentence.replaceFirst(sentence[0], sentence[0].uppercaseChar())}\n")
    }

    bw.flush()
    bw.close()

    br.close()
}