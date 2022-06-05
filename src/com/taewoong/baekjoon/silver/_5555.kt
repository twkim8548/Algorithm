package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val string = br.readLine()
    val n = br.readLine().toInt()
    var answer = 0
    repeat(n) {
        var sentence = br.readLine()
        sentence = sentence + sentence + sentence

        if (sentence.contains(string)) {
            answer++
        }
    }

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}
