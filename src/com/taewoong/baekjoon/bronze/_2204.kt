package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val n = br.readLine().toInt()
        if (n == 0) {
            break
        }
        var array = mutableMapOf<Int, String>()
        val realArray = Array(n) { "" }

        repeat(n) {
            realArray[it] = br.readLine()
            array[it] = realArray[it].uppercase()
        }
        array = array.toList().sortedBy { it.second }.toMap().toMutableMap()

        run {
            array.forEach {
                bw.write("${realArray[it.key]}\n")
                return@run
            }
        }

    }
    bw.flush()
    bw.close()

    br.close()
}