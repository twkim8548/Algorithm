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

    val n = br.readLine().toInt()
    val array = ArrayList<Int>()

    val token = StringTokenizer(br.readLine())
    var student = 1
    repeat(n) {
        array.add(token.nextToken().toInt(), student)

        student++
    }

    array.reverse()

    array.forEach {
        bw.write("$it ")
    }


    bw.flush()
    bw.close()

    br.close()
}
