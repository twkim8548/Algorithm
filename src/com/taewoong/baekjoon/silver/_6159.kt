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

    val array = IntArray(token.nextToken().toInt())
    val s = token.nextToken().toInt()

    repeat(array.size) {
        array[it] = br.readLine().toInt()
    }
    var answer = 0
    for (i in array.indices) {
        for (j in i+1 until array.size) {
            if (array[i] + array[j] <= s) answer++
        }
    }
    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}
