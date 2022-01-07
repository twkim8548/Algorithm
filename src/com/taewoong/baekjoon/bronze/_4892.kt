package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var count = 0
    while (true) {
        count += 1
        val n0 = br.readLine().toInt()
        if (n0 == 0) {
            break
        }
        val n1 = 3 * n0

        val n2 = if (n1 % 2 == 0) {
            n1 / 2
        } else {
            (n1 + 1) / 2
        }

        val n3 = n2 * 3
        val n4 = n3 / 9

        if (n1 % 2 == 0) {
            bw.write("$count. even $n4\n")
        } else {
            bw.write("$count. odd $n4\n")
        }
    }
    bw.flush()
    bw.close()
    br.close()
}
