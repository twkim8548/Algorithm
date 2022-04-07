package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    val n = token.nextToken().toInt()

    bw.write("${find(a, b, c, n)}")
    bw.flush()
    bw.close()
    br.close()

}

fun find(a: Int, b: Int, c: Int, n: Int): Int {

    for (i in 0 until n + 1 step (a)) {
        for (j in 0 until n + 1 step (b)) {
            for (k in 0 until n + 1 - i - j step (c)) {
                if (i + j + k == n) {
                    return 1
                }
            }
        }
    }
    return 0
}