package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val map = mutableMapOf<String, Int>()
    repeat(n) {
        val bookName = br.readLine()
        if (map[bookName] == null) {
            map[bookName] = 1
        } else {
            map[bookName] = map[bookName]!!.plus(1)
        }
    }

    bw.write(map.toList().sortedBy { it.first }.sortedByDescending { it.second }[0].first)
    bw.flush()
    bw.close()

    br.close()
}