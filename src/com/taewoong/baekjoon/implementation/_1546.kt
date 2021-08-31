package com.taewoong.baekjoon.implementation

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()

    val grades = ArrayList<Double>()

    val token = StringTokenizer(br.readLine())
    repeat(N) {
        grades.add(token.nextToken().toDouble())
    }

    grades.sort()

    val M = grades.last()

    grades.forEachIndexed { index, i ->
        grades[index] = (i / M) * 100
    }

    bw.write("${grades.average()}")
    bw.flush()
    bw.close()

    br.close()
}

