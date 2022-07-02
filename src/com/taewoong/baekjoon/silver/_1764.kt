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
    val m = token.nextToken().toInt()

    var map = mutableMapOf<String, Int>()

    val listenArray = arrayOfNulls<String>(n)
    val seeArray = arrayOfNulls<String>(m)
    val answerArray = ArrayList<String>()

    repeat(n + m) {
        val name = br.readLine()
        if (map[name] != null) {
            map[name] = map[name]!!.plus(1)
        } else {
            map[name] = 1
        }
    }

    bw.write("${map.filter { it.value >= 2 }.size}\n")
    map = map.toList().sortedBy { it.first }.toMap().toMutableMap()

    map.forEach {
        if (it.value >= 2) {
            bw.write("${it.key}\n")
        }
    }
    bw.flush()
    bw.close()

    br.close()
}