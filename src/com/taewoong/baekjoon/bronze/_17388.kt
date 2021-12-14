package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val array = IntArray(3)

    for (i in array.indices) {
        array[i] = token.nextToken().toInt()
    }

    if (array.sum() >= 100) {
        bw.write("OK")
    } else {
        var min = array[0]
        array.forEach {
            min = min(min, it)
        }

        array.forEachIndexed { index, i ->
            if (i == min) {
                if (index == 0) {
                    bw.write("Soongsil")
                } else if (index == 1) {
                    bw.write("Korea")
                } else {
                    bw.write("Hanyang")
                }
            }
        }

    }
    bw.flush()
    bw.close()
    br.close()
}
