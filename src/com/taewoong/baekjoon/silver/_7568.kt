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

    val array = ArrayList<Body>()
    repeat(n) {
        val token = StringTokenizer(br.readLine())
        array.add(Body(token.nextToken().toInt(), token.nextToken().toInt(), it))
    }

    array.sortByDescending {
        it.weight
        it.height
    }

    for (i in 0 until array.size) {
        for (j in 1 until array.size) {
            if (array[i].weight > array[j].weight && array[i].height > array[j].height) {
                array[j].rank++
            }
        }
    }

    array.sortBy { it.idx }

    var answer = ""
    array.forEach {
        answer += it.rank.toString() + " "
    }

    bw.write(answer.trim())

    bw.flush()
    bw.close()

    br.close()
}

class Body(val weight: Int, val height: Int, val idx: Int) {
    var rank: Int = 1
}
