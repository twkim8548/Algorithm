package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = IntArray(6)
    repeat(array.size) {
        array[it] = br.readLine().toInt()
    }

    val array1 = arrayOf(array[0], array[1], array[2], array[3])
    array1.sortDescending()

    bw.write("${array1[0] + array1[1] + array1[2] + max(array[4], array[5])}")
    bw.flush()

    bw.close()
    br.close()
}
