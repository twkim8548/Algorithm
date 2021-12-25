package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = IntArray(7)
    repeat(array.size) {
        array[it] = br.readLine().toInt()
    }

    val oddNumbers = ArrayList<Int>()

    array.forEach {
        if (it % 2 != 0) {
            oddNumbers.add(it)
        }
    }
    oddNumbers.sort()

    if (oddNumbers.size > 0) {
        bw.write("${oddNumbers.sum()}\n${oddNumbers[0]}")
    } else {
        bw.write("-1")
    }

    bw.flush()
    bw.close()
}
