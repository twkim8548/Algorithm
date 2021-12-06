package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = Array(br.readLine().toInt()) { IntArray(2) }

    repeat(array.size) {
        val token = StringTokenizer(br.readLine())
        array[it][0] = token.nextToken().toInt()
        array[it][1] = token.nextToken().toInt()
    }
    array.sortWith(compareBy({it[0]}, {it[1]}))
    array.forEach {
        bw.write("${it[0]} ${it[1]}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}
