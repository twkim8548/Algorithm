package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val p = token.nextToken().toInt()

    val array = ArrayList<Int>()
    var number = n
    var count = 0
    var isRepeat = false

    while (!isRepeat) {
        number = n * number % p

        array.forEachIndexed { index, i ->
            if (i == number) {
                bw.write("${count - index}")
                isRepeat = true
            }
        }


        count ++
        array.add(number)
    }

    bw.flush()
    bw.close()

    br.close()
}