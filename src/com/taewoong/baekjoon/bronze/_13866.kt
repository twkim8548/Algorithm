package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val array = IntArray(4)
    repeat(4) {
        array[it] = token.nextToken().toInt()
    }

    array.sort()

    bw.write("${abs(array[3] + array[0] - array[1] - array[2])}")
    bw.flush()
    bw.close()

    br.close()
}
