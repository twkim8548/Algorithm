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
        val n = token.nextToken().toInt()
        val array = IntArray(n)

        repeat(array.size) {
            array[it] = token.nextToken().toInt()
        }

        var cnt = 0.0
        array.forEach {
            if (it > array.average()) {
                cnt++
            }
        }

        bw.write("${String.format("%.3f", ((cnt / array.size) * 100))}%\n")
    }

    bw.flush()
    bw.close()

    br.close()
}