package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = IntArray(5)
    repeat(5) { person ->
        val token = StringTokenizer(br.readLine())
        repeat(4) {
            array[person] += token.nextToken().toInt()
        }
    }
    var max = 0
    var num = 0
    array.forEachIndexed { index, i ->
        if (max < i) {
            num = index + 1
            max = i
        }
    }

    bw.write("$num $max")
    bw.flush()
    bw.close()

    br.close()
}
