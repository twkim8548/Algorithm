package com.taewoong.baekjoon.bronze

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
        val array = IntArray(5)
        for (i in 0 until 5) {
            array[i] = token.nextToken().toInt()
        }
        array.sort()

        if (array[3] - array[1] >= 4) {
            bw.write("KIN\n")
        } else {
            bw.write("${array[1] + array[2] + array[3]}\n")
        }
    }

    bw.flush()
    bw.close()

    br.close()
}