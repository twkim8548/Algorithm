package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in n downTo 4 ) {
        val array = BooleanArray(i.toString().length)
        i.toString().forEachIndexed { index, c ->
            if (c == '4' || c == '7')
            array[index] = true
        }
        if (!array.contains(false)) {
            bw.write("$i")
            break
        }
    }

    bw.flush()
    bw.close()

    br.close()
}