package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val array = mutableListOf<Int>()
    val token = StringTokenizer(br.readLine())
    repeat(n) {
        array.add(token.nextToken().toInt())
    }

    array.sort()

    bw.write("${array[0]} ${array[array.size-1]}")
    bw.flush()
    bw.close()
    br.close()
}

