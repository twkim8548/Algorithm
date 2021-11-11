package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = IntArray(4)
    val token = StringTokenizer(br.readLine())

    repeat(array.size) {
        array[it] = token.nextToken().toInt()
    }

    bw.write("${getArea(array)}")
    bw.flush()
    bw.close()
    br.close()
}

fun getArea(array: IntArray) : Int {

    array.sort()

    val width = min(array[0], array[1])
    val height = min(array[2], array[3])

    return width * height
}
