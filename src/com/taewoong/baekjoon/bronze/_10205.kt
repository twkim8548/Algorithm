package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var k = br.readLine().toInt()

        val string = br.readLine()

        string.forEach {
           if (it.toString() == "c") {
               k--
               k += 2
           } else if (it.toString() == "b") {
               k--
           }
        }

        bw.write("Data Set ${it + 1}:\n$k\n\n")
    }

    bw.flush()
    bw.close()

    br.close()
}