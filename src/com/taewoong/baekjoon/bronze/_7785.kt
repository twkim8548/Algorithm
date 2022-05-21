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
    val array = mutableMapOf<String, Boolean>()

    repeat(n) {
        val token = StringTokenizer(br.readLine())
        val name = token.nextToken()
        val type = token.nextToken()

        array[name] = type == "enter"
    }


    array.toList().sortedByDescending { it.first }.forEach {
        if (it.second)
            bw.write("${it.first}\n")
    }
    bw.flush()
    bw.close()

    br.close()
}