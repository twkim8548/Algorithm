package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val array = IntArray(3)

    repeat(3) {
        array[it] = token.nextToken().toInt()
    }

    val count = if (array[2] - array[1] > array[1] - array[0]) array[2] - array[1] else array[1] - array[0]

    bw.write("${count - 1}")

    bw.flush()
    bw.close()

    br.close()

}