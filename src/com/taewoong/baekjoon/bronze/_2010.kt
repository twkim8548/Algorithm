package com.taewoong.baekjoon.bronze

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

    bw.write("${findMaxComputer(array)}")
    bw.flush()

    bw.close()
    br.close()

}

fun findMaxComputer(array: IntArray): Int {
    var computer = 0
    array.forEachIndexed { index, i ->
        computer += if (index == array.size - 1)
            i
        else
            i - 1
    }
    return computer
}
