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
    val array = Array(8) { 0 }

    repeat(array.size) {
        array[it] = token.nextToken().toInt()
    }

    val ascending = arrayOf(1,2,3,4,5,6,7,8)
    val descending = arrayOf(8,7,6,5,4,3,2,1)

    if (array.contentEquals(ascending)) bw.write("ascending")
    else if (array.contentEquals(descending)) bw.write("descending")
    else bw.write("mixed")

    bw.flush()
    bw.close()

    br.close()
}
