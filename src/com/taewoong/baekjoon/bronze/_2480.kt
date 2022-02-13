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

    val array = intArrayOf(token.nextToken().toInt(), token.nextToken().toInt(), token.nextToken().toInt())

    array.sort()

    if (array[0] == array[1]  && array[1] == array[2]) {
        bw.write("${(array[0] * 1000) + 10000}")
    } else if (array[0] == array[1] || array[1] == array[2]) {
        bw.write("${(array[1] * 100) + 1000}")
    } else {
        bw.write("${array[2] * 100}")
    }

    bw.flush()
    bw.close()
    br.close()
}
