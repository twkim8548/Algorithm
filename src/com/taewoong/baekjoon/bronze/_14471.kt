package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    val array = IntArray(m) { 0 }

    repeat(m) {
        token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()

        if (n - a > 0) {
            array[it] = n - a
        }
    }

    array.sort()

    var answer = 0

    repeat(m - 1) {
        answer += array[it]
    }
    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}