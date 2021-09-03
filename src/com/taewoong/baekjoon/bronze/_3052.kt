package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = ArrayList<Int>()

    repeat(10) {
        array.add(br.readLine().toInt() % 42)
    }

    bw.write("${array.distinct().size}")
    bw.flush()

    bw.close()
    br.close()
}
