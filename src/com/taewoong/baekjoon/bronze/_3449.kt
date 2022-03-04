package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val a = br.readLine()
        val b = br.readLine()
        var cnt = 0
        a.forEachIndexed { index, c ->
            if (c != b[index]) {
                cnt++
            }
        }

        bw.write("Hamming distance is $cnt.\n")
    }

    bw.flush()
    br.close()
}