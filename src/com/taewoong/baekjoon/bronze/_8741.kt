package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = br.readLine().toInt()

    repeat(k) {
    bw.write("1")
    }

    repeat(k-1){
        bw.write("0")
    }
    bw.flush()
    bw.close()

    br.close()
}