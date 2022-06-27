package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val array = arrayOfNulls<MutableMap.MutableEntry<String, Int>>(n)
    val map = mutableMapOf<String, Int>()
    val answerMap = mutableMapOf<String, Int>()
    var answer = 0

    for (i in 0 until n) {
        val string = br.readLine()
        map[string] = string.length
    }

    var cnt = 0
    for (mutableEntry in map) {
        array[cnt] = mutableEntry
        cnt++
    }

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (String(
                    array[i]!!.key.toCharArray().sortedArray().distinct().toCharArray()
                ) == String(
                    array[j]!!.key.toCharArray().sortedArray().distinct().toCharArray()
                ) && array[i]!!.value == array[j]!!.value
            ) {
                if (answerMap[String(array[i]!!.key.toCharArray().sortedArray().distinct().toCharArray())] != null) {
                    answerMap[String(array[i]!!.key.toCharArray().sortedArray().distinct().toCharArray())] =
                        answerMap[String(array[i]!!.key.toCharArray().sortedArray().distinct().toCharArray())]!!.plus(1)
                } else {
                    answerMap[String(array[i]!!.key.toCharArray().sortedArray().distinct().toCharArray())] = 1
                }
            }
        }
    }



    for (mutableEntry in answerMap) {
        if (mutableEntry.value >= 1) {
            answer++
        }
    }

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}
