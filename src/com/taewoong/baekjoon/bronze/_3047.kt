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
    val numbers = IntArray(3)

    repeat(3) {
        numbers[it] = token.nextToken().toInt()
    }

    numbers.sort()

    val map = mutableMapOf<String, Int>()

    map["A"] = numbers[0]
    map["B"] = numbers[1]
    map["C"] = numbers[2]

    br.readLine().forEach {
        bw.write("${map[it.toString()]} ")
    }

    bw.flush()
    bw.close()

}
