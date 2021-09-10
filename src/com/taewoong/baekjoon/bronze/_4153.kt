package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.max
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val token = StringTokenizer(br.readLine())

        val array = IntArray(3)

        array[0] = token.nextToken().toInt()
        array[1] = token.nextToken().toInt()
        array[2] = token.nextToken().toInt()

        array.sort()

        if (array.contentEquals(IntArray(3){0})) {
            break
        }

        if (array[0].toDouble().pow(2) + array[1].toDouble().pow(2) == array[2].toDouble().pow(2)) {
            bw.write("right\n")
        } else {
            bw.write("wrong\n")
        }

        bw.flush()
    }

    bw.close()
    br.close()
}
