package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    val first = ArrayList<Int>()
    val second = ArrayList<Int>()

    repeat(n) {
        first.add(br.readLine().toInt() - 1, it + 1)
    }

    repeat(m) {
        second.add(br.readLine().toInt() - 1, first[m - it - 1])
    }


    bw.write("${second[0]}\n${second[1]}\n${second[2]}")

    bw.flush()
    bw.close()
    br.close()
}
