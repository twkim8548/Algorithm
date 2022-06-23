package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val array = IntArray(n)

    val token = StringTokenizer(br.readLine())

    repeat(n) {
        array[it] = token.nextToken().toInt()
    }
    val v = br.readLine().toInt()
    var answer = 0
    array.forEach {
        if (it == v) {
            answer++
        }
    }

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}