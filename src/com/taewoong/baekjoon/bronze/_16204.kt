package com.taewoong.baekjoon.bronze

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
    val m = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    val array = Array(n) { arrayOf(false, false) }

    for (i in 0 until m) {
        array[i][0] = true
    }
    for (i in 0 until k) {
        array[i][1] = true
    }

    var count = 0
    array.forEach {
        if (it.contentEquals(arrayOf(true, true)) || it.contentEquals(arrayOf(false, false))) {
            count += 1
        }
    }

    bw.write("$count")
    bw.flush()
    bw.close()

    br.close()

}
