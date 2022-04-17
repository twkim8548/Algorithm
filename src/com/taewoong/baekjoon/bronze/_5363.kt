package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val array = br.readLine().split(" ")

        array.forEachIndexed { index, s ->
            if (index != 0 && index != 1) {
                bw.write("$s ")
            }
        }

        bw.write("${array[0]} ${array[1]}\n")
    }
    bw.flush()
    bw.close()

    br.close()
}