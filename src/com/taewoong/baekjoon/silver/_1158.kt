package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    val array = mutableListOf<Int>()

    for (i in 1..n) {
        array.add(i)
    }

    var idx = k - 1
    bw.write("<")
    while (array.size > 0) {
        if (array.size == 1) {
            bw.write("${array[idx]}")
        } else {
            bw.write("${array[idx]}, ")
        }
        array.removeAt(idx)
        idx--
        repeat(k) {
            idx += 1
            if (idx >= array.size) {
                idx = 0
            }
        }
    }
    bw.write(">")
    bw.flush()
    bw.close()

    br.close()
}
