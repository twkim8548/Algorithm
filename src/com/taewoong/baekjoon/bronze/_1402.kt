package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        bw.write("${isChangedCase(token.nextToken().toInt(), token.nextToken().toInt())}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}

fun isChangedCase(a: Int, b: Int) : String{
    return "yes"
}
