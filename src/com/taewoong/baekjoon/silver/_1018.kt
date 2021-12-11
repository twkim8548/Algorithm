package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

lateinit var array: Array<Array<Boolean>>
var min = 64

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    array = Array(n) { Array(m) { false } }

    for (i in 0 until n) {
        val charArray = br.readLine().toCharArray()
        for (j in 0 until m) {
            if (charArray[j].toString() == "W")
                array[i][j] = true
        }
    }

    val row = n - 7
    val col = m - 7

    for (i in 0 until row) {
        for (j in 0 until col) {
            find(i, j)
        }
    }
    bw.write("$min")
    bw.flush()
    bw.close()

    br.close()
}

fun find(x: Int, y: Int) {
    val endX = x + 8
    val endY = y + 8
    var count = 0

    var tf = array[x][y]

    for (i in x until endX) {
        for (j in y until endY) {
            if (array[i][j] != tf) {
                count += 1
            }
            tf = !tf
        }
        tf = !tf
    }

    count = min(count, 64 - count)
    min = min(min, count)
}
