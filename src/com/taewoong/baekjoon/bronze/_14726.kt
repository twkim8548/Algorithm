package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val array = IntArray(16)

        val string = br.readLine()
        repeat(16) {
            array[it] = string.toCharArray()[it].toString().toInt()
        }


        array.reverse()
        array.forEachIndexed { index, c ->
            if ((index + 1) % 2 == 0) {
                var temp = c * 2
                if (temp >= 10) {
                    temp = temp.toString()[0].toString().toInt() + temp.toString()[1].toString().toInt()
                }
                array[index] = temp
            }
        }

        if (array.sum() % 10 == 0) {
            bw.write("T\n")
        } else {
            bw.write("F\n")
        }
    }
    bw.flush()
    bw.close()

    br.close()
}