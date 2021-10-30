package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.ceil
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val l = br.readLine().toInt()
    val a = br.readLine().toDouble()
    val b = br.readLine().toDouble()
    val c = br.readLine().toDouble()
    val d = br.readLine().toDouble()

    val workDay = max(ceil((a/c)), ceil((b/d)))

    bw.write("${(l - workDay).toInt()}")
    bw.flush()
    bw.close()

    br.close()

}
