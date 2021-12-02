package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = br.readLine().toInt()

    bw.write("${findABArray(k)[0]} ${findABArray(k)[1]}")
    bw.flush()
    bw.close()
    br.close()
}

fun findABArray(k: Int): IntArray {
    val array = Array(k + 1) { IntArray(2) }
    array[0][0] = 1
    array[0][1] = 0

    for (i in 1..k) {
        array[i][0] = array[i - 1][1]
        array[i][1] = array[i - 1][0] + array[i - 1][1]
    }

    return array[k]
}

