package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = IntArray(5)

    repeat(5) {
        array[it] = br.readLine().toInt()
    }

    array.sort()

    bw.write("${array.sum()/5}\n${array[2]}")
    bw.flush()
    bw.close()
}