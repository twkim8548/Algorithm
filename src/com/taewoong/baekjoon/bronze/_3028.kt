package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = BooleanArray(3) { false }

    array[0] = true

    val shuffleArray = br.readLine().toCharArray()

    shuffleArray.forEach {
        when (it.toString()) {
            "A" -> {
                array[0] = array[0] xor array[1]
                array[1] = array[0] xor array[1]
                array[0] = array[0] xor array[1]
            }
            "B" -> {
                array[1] = array[1] xor array[2]
                array[2] = array[1] xor array[2]
                array[1] = array[1] xor array[2]
            }
            "C" -> {
                array[0] = array[0] xor array[2]
                array[2] = array[0] xor array[2]
                array[0] = array[0] xor array[2]
            }

        }
    }
    if (array[0]) {
        bw.write("1")
    } else if (array[1]) {
        bw.write("2")
    } else if (array[2]) {
        bw.write("3")
    }

    bw.flush()
    bw.close()
    br.close()
}
