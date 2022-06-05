package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val m = br.readLine().toInt()
    val n = br.readLine().toInt()

    val array = ArrayList<Int>()

    for (i in m..n) {
        if (i == 1) {
            continue
        }
        var cnt = 0
        for (j in 1..sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                cnt++
            }
        }
        if (cnt < 2) {
            array.add(i)
        }
    }

    if (array.size > 0) {
        bw.write("${array.sum()}\n${array[0]}")
    } else {
        bw.write("-1")
    }
    bw.flush()
    bw.close()

    br.close()
}