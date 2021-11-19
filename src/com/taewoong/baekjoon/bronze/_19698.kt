package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Math.pow
import java.util.*
import kotlin.math.ceil
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    bw.write(
        "${
            findMaximumCows(
                token.nextToken().toInt(),
                token.nextToken().toInt(),
                token.nextToken().toInt(),
                token.nextToken().toInt()
            )
        }"
    )

    bw.flush()
    bw.close()

    br.close()
}

fun findMaximumCows(n: Int, w: Int, h: Int, l: Int): Int {
    val ans =  (w / l) * (h / l)
    return if (n < ans) {
        n
    } else {
        ans
    }
}
