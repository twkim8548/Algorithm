package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    while (true) {
        var cnt = 0
        val list = br.readLine()
        if (list == "-1") {
            break
        }

        var array = list.split(" ")
        for (i in 0 until array.size - 1) {
            for (j in 0 until array.size - 1) {
                if (array[i].toInt() * 2 == array[j].toInt()) {
                    cnt++
                }
            }
        }
        bw.write("$cnt\n")
    }

    bw.flush()
    bw.close()
    br.close()
}