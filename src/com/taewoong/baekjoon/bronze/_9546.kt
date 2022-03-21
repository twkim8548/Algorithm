package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val k = br.readLine().toInt()
        var answer = 1
        repeat(k - 1) {
            answer = 2 * answer + 1
        }
        bw.write("$answer\n")
    }
    bw.flush()
    bw.close()

    br.close()
}
