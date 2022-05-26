package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()
        if (string == null || string == "") {
            break
        }

        val token = StringTokenizer(string)

        val n = token.nextToken().toInt()
        val m = token.nextToken().toInt()

        var cnt = m - n + 1
        for (i in n..m) {
            val number = i.toString().toCharArray()
            number.sort()

            for (j in 0 until number.size - 1) {
                if (number[j] == number[j+1]) {
                    cnt--
                    break
                }
            }
        }
        bw.write("$cnt\n")
    }
    bw.flush()
    bw.close()

    br.close()
}