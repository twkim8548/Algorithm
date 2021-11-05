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

    val c = token.nextToken().toInt()
    val r = token.nextToken().toInt()

    bw.write("${memoization(c, r)}")
    bw.flush()

    bw.close()
    br.close()
}

fun memoization(n: Int, r: Int): Int {
    if (r > n) {
        return 0
    }
    if (r == 0 || r == n) {
        return 1
    }
    return memoization(n - 1, r - 1) + memoization(n - 1, r)
}
