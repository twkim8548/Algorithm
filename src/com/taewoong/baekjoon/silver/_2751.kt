package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = IntArray(br.readLine().toInt())
    repeat(array.size) {
        array[it] = br.readLine().toInt()
    }

    getAnswer(array).forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()

    br.close()

}

fun getAnswer(array: IntArray): IntArray {

    return array.sorted().toIntArray()
}
