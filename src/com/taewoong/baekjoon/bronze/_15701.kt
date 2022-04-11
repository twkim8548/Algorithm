package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toDouble()

    val temp = ArrayList<Int>()
    val answer = ArrayList<Int>()

    for (i in 1..sqrt(n).toInt()) {
        if (n.toInt() % i == 0) {
            temp.add(i)
            answer.add(i)
        }
    }

    temp.forEach {
        answer.add(n.toInt() / it)
    }

    bw.write("${answer.distinct().size}")
    bw.flush()
    bw.close()

    br.close()
}
