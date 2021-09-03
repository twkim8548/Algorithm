package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val a = token.nextToken().toCharArray()
    val b = token.nextToken().toCharArray()

    a.reverse()
    b.reverse()

    val reverseA = String(a).toInt()
    val reverseB = String(b).toInt()

    bw.write("${max(reverseA, reverseB)}")
    bw.flush()

    bw.close()
    br.close()
}
