package com.taewoong.baekjoon.implementation

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()
    val hash: HashMap<String, Int> = HashMap()

    s.forEach {
        if (!hash.containsKey(it.toUpperCase().toString())) {
            hash[it.toUpperCase().toString()] = 1
        } else {
            hash[it.toUpperCase().toString()] = hash[it.toUpperCase().toString()].toString().toInt() + 1
        }
    }

    var array = hash.toList()

    array = array.sortedByDescending { it.second }

    if (array.size > 1 && (array[0].second == array[1].second)) {
        bw.write("?")
    } else {
        bw.write(array[0].first)
    }

    bw.flush()
    bw.close()

    br.close()
}
