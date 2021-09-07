package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val number = br.readLine().toInt()

        if (number == 0) {
            break
        }

        val array = number.toString().toCharArray()
        val reverseArray = number.toString().toCharArray().reversedArray()

        if (array.contentEquals(reverseArray)) {
            bw.write("yes\n")
        } else {
            bw.write("no\n")
        }
        bw.flush()
    }

    bw.close()
    br.close()
}
