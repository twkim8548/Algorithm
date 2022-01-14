package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    val array = ArrayList<Int>()

    for (j in 1..n) {
        if (n % j == 0) {
            array.add(j)
        }
    }

    if (k > array.size) {
        bw.write("0")
    } else {
        bw.write("${array[k - 1]}")
    }
    bw.flush()
    bw.close()

    br.close()
}
