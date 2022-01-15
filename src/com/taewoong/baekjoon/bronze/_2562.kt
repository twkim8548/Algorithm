package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = ArrayList<Int>()

    repeat(9) {
        array.add(br.readLine().toInt())
    }

    val a = array.max()
    val b = array.indexOf(array.max()) + 1
    bw.write("${a}\n${b}")

    bw.flush()
    bw.close()
    br.close()

}
