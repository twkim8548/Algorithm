package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        val array = IntArray(10)

        for (i in 0 until 10) {
            array[i] = token.nextToken().toInt()
        }

        bw.write("${array.sortedDescending()[2]}\n")
    }
    bw.flush()
    bw.close()
    br.close()
}
