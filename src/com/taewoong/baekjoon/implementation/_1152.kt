package com.taewoong.baekjoon.implementation

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    var array = ArrayList<String>()

    while (token.hasMoreTokens()) {
        array.add(token.nextToken().toString())
    }

    bw.write("${array.size}")
    bw.flush()
    bw.close()

    br.close()

}
