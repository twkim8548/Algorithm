package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Math.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val bessie = IntArray(2)
    val daisy = IntArray(2)
    val coordinate = IntArray(2)

    var token = StringTokenizer(br.readLine())
    bessie[0] = token.nextToken().toInt()
    bessie[1] = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    daisy[0] = token.nextToken().toInt()
    daisy[1] = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    coordinate[0] = token.nextToken().toInt()
    coordinate[1] = token.nextToken().toInt()

    val bessieCnt = max(abs(bessie[0] - coordinate[0]), (kotlin.math.abs(bessie[1] - coordinate[1])))
    val daisyCnt = kotlin.math.abs(coordinate[0] - daisy[0]) + kotlin.math.abs(coordinate[1] - daisy[1])

    when {
        daisyCnt > bessieCnt -> bw.write("bessie")
        daisyCnt < bessieCnt -> bw.write("daisy")
        else -> bw.write("tie")
    }

    bw.flush()
    bw.close()

    br.close()
}
