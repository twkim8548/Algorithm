package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()

    val answer = Array<Int>(26) { -1 }

    s.forEachIndexed() { i, c ->
        var alphabet = 'a'
        while (alphabet <= 'z') {
            if (answer[c.toInt() - 97] >= 0) {
                break
            }
            if (c == alphabet) {
                answer[c.toInt() - 97] = i
                break
            }
            ++alphabet
        }
    }


    answer.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()

    br.close()
}
