package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (i == 0 || i == n-1) {
                    bw.write("#")
                } else {
                    if (j == 0 || j == n-1) {
                        bw.write("#")
                    } else {
                        bw.write("J")
                    }
                }
                if (j == n -1 ){
                    bw.write("\n")
                }
            }
        }
        bw.write("\n")
    }

    bw.flush()

    bw.close()
    br.close()
}
