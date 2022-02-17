package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken()
    val b = token.nextToken()

    val max = a.replace('5', '6').toInt() + b.replace('5', '6').toInt()
    val min = a.replace('6', '5').toInt() + b.replace('6', '5').toInt()

    bw.write("$min $max")
    bw.flush()
    bw.close()

    br.close()

}