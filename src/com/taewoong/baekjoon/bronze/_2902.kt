package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val fullName = br.readLine()

    val name = fullName.split("-")
    name.forEach {
        bw.write("${it[0]}")
    }

    bw.flush()
    bw.close()
    br.close()
}