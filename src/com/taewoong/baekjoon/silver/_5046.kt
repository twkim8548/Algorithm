package com.taewoong.baekjoon.silver

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
    val b = token.nextToken().toInt()
    val h = token.nextToken().toInt()
    val w = token.nextToken().toInt()
    val array = ArrayList<Int>()

    repeat(h) {
        val cost = br.readLine().toInt()
        var isStay = false
        val money = br.readLine().split(" ")

        money.forEach {
            if (it.toInt() >= n) {
                isStay = true
            }

        }

        if (isStay) {
            array.add(n * cost)
        }
    }
    if (array.isEmpty()) {
        bw.write("stay home")
    } else if (array.minOrNull()!!.toInt() > b) {
        bw.write("stay home")
    } else {
        bw.write("${array.minOrNull()}")
    }
    bw.flush()
    bw.close()

    br.close()
}
