package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = IntArray(3)
    var token = StringTokenizer(br.readLine())
    repeat(a.size) {
        a[it] = token.nextToken().toInt()
    }

    val c = IntArray(3)
    token = StringTokenizer(br.readLine())
    repeat(c.size) {
        c[it] = token.nextToken().toInt()
    }

    val b = getCakeNumber(a, c)
    bw.write("${b[0]} ${b[1]} ${b[2]}")
    bw.flush()

    bw.close()
}

fun getCakeNumber(a: IntArray, c: IntArray): IntArray {
    val b = IntArray(3)
    b[0] = c[0] - a[2]
    b[1] = c[1] / a[1]
    b[2] = c[2] - a[0]
    return b
}
