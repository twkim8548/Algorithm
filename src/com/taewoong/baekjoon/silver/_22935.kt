package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var n = br.readLine().toInt()
        val array =
            arrayOf(2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3)

        if (n > 15) {
            n = array[n % 28]
        }

        var string = n.toString(2)
        while (string.length < 4) {
            string = "0$string"
        }
        var answer = ""
        string.forEach {
            if (it == '0') {
                answer += "V"
            } else {
                answer += "딸기"
            }
        }
        bw.write("$answer\n")
    }
    bw.flush()
    bw.close()

    br.close()
}
