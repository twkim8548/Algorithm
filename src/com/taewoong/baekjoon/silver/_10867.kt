package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var array = IntArray(br.readLine().toInt())

    val token = StringTokenizer(br.readLine())

    repeat(array.size) {
        array[it] = token.nextToken().toInt()
    }

    val answer = array.distinct().sorted()

    answer.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    br.close()
}
