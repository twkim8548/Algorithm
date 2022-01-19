package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = arrayOfNulls<String>(br.readLine().toInt())

    repeat(array.size) {
        array[it] = br.readLine()
    }

    var map: MutableMap<String, Int> = mutableMapOf()

    array.forEach {
        if (map.containsKey(it!![0].toString())) {
            map[it[0].toString()] = map[it[0].toString()]!! + 1
        } else {
            map[it[0].toString()] = 1
        }
    }

    var isEmpty = true

    val answer = ArrayList<String>()
    map.forEach {
        if (it.value >= 5) {
            isEmpty = false
            answer.add(it.key)
        }
    }

    if (isEmpty) bw.write("PREDAJA")

    answer.sort()
    answer.forEach {
        bw.write(it)
    }
    bw.flush()
    bw.close()

    br.close()
}