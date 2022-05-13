package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val array = ArrayList<Int>()

    for (i in 1 .. n) {
        array.add(i)
    }

    while (array.size > 1) {
        bw.write("${array[0]} ")
        array.removeAt(0)
        array.add(array[0])
        array.removeAt(0)
    }

    bw.write("${array[0]}")

    bw.flush()
    bw.close()


}