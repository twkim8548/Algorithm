package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()

    var answer = 1
    var cnt = 0

    while (true) {
        answer += 1

        val answerArray = answer.toString().toCharArray()
        if (checkDevil(answerArray)) {
            cnt++
            if (cnt == N)
                break
        }
    }


    bw.write("$answer")

    bw.flush()
    bw.close()

    br.close()
}

fun checkDevil(array: CharArray): Boolean {

    array.forEachIndexed() { i: Int, c: Char ->
        if (i != 0 && i != array.size - 1) {
            if (c == '6' && c == array[i - 1] && c == array[i + 1]) {
                return true
            }
        }
    }
    return false
}
