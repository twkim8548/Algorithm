package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = arrayOf(br.readLine(), br.readLine(), br.readLine(), br.readLine(), br.readLine())
//    for (i in 0 until array.maxof{ it.length }) {
//        repeat(5) { index ->
//            if (array[index].length > i)
//                bw.write("${array[index][i]}")
//        }
//    }

    bw.flush()
    bw.close()
    br.close()
}
