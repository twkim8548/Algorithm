package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()){
        val string =br.readLine()
        if (string.length == 1) {
            bw.write("$string$string\n")
        } else {
            bw.write("${string[0]}${string[string.length-1]}\n")
        }
    }

    bw.flush()
    bw.close()

    br.close()
}