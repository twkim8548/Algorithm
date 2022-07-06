package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val array = IntArray(n)
    val token = StringTokenizer(br.readLine())
    val map = mutableMapOf<Int, Boolean>()

    repeat(n) {
        val number = token.nextToken().toInt()
        array[it] = number
        map[number] = false
    }

    array.forEach {
        if (array.contains(m - it) && !map[m - it]!! && !map[it]!!) {
            map[it] = true
            map[m - it] = true
        }
    }

    var answer = 0
    map.forEach {
        if (it.value) {
            answer++
        }
    }

    bw.write("${answer / 2}")
    bw.flush()
    bw.close()

    br.close()
}