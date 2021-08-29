package com.taewoong.baekjoon.implementation

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val array = ArrayList<Int>()

    repeat(3) {
        array.add(token.nextToken().toInt())
    }

    array.sort()

    bw.write("${array[1]}\n")
    bw.flush()
    bw.close()

    br.close()
}
