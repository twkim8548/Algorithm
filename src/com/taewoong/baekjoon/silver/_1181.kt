package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = Array(br.readLine().toInt()){""}
    repeat(array.size) {
        array[it] = br.readLine()
    }

    var answer =  array.distinct().sorted()

    answer = answer.sortedWith(Comparator { a, b ->
        when {
            a.length > b.length -> 1
            a.length < b.length -> -1
            else -> 0
        }
    })

    answer.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
    br.close()

}
