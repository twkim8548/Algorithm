package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${getFibonacciNumber(br.readLine().toInt())}")
    bw.flush()
    bw.close()

    br.close()

}

fun getFibonacciNumber(n: Int): Int {
    val array = IntArray(46)
    array[0] = 0
    array[1] = 1

    for (i in 2..n) {
        array[i] = array[i-2] + array[i-1]
    }

    return array[n]
}
