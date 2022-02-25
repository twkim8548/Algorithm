package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = IntArray(10)
    repeat(10) {
        array[it] = br.readLine().toInt()
    }

    array.sort()

    val map = mutableMapOf<Int, Int>()
    array.forEach {
        if (map[it] != null) {
            map[it] = map[it]!!.plus(1)
        } else {
            map[it] = 0
        }
    }

    bw.flush()

    bw.write("${array.average().toInt()}\n${ map.filterValues { it == map.maxOf { map -> map.value  } }.keys.first()}")
    bw.close()

    br.close()
}