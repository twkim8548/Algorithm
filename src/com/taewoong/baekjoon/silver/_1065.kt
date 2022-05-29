package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var answer = 0
    if (n < 100) {
        answer = n
    } else {
        answer = 99
        for (i in 100 .. n) {
            val array = i.toString().toCharArray()
            var isArithmetic = true
            val gap = array[1].toString().toInt() - array[0].toString().toInt()
            for (j in 1 until array.size - 1) {
                if (gap != array[j+1] - array[j]) {
                    isArithmetic = false
                    break
                }
            }
            if (isArithmetic) {
                answer ++
            }
        }
    }

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()

}
