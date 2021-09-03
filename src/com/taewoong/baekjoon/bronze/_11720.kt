package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val s = br.readLine()
    val array = s.split("")
    var answer = 0
    array.forEach{ s: String ->
        if (!s.equals("")) answer += s.toInt()
    }
    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}
