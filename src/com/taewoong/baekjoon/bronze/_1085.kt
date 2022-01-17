package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.absoluteValue

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = BufferedReader(InputStreamReader(System.`in`))

    val token = StringTokenizer(br.readLine())

    val x = token.nextToken().toInt()
    val y = token.nextToken().toInt()
    val w = token.nextToken().toInt()
    val h = token.nextToken().toInt()


    val array = IntArray(4)
    array[0] = (x-w).absoluteValue
    array[1] = (y-h).absoluteValue
    array[2] = (0-x).absoluteValue
    array[3] = (0-y).absoluteValue

    bw.write("${array.min()}")
    bw.flush()

    bw.close()
    br.close()
}
