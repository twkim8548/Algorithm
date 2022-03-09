package com.taewoong.baekjoon.bronze

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = IntArray(9)

    repeat(9) {
        array[it] = br.readLine().toInt()
    }
    array.sort()

    var first = 0
    var second = 0

    for (i in 0 until 9) {
        for (j in 1 until 9) {
            if (array.sum() - array[i] - array[j] == 100) {
                first = array[i]
                second = array[j]
            }
        }
    }

    array.forEach {
        if (it != first && it != second) {
            bw.write("$it\n")
        }
    }

    bw.flush()
    bw.close()

    br.close()
}