package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${findLastCard(br.readLine().toInt())}")
    bw.flush()
    bw.close()

    br.close()
}

fun findLastCard(n: Int): Int {
    val cardList = ArrayDeque<Int>()
    for (i in 1 .. n) {
        cardList.addLast(i)
    }
    while (cardList.size > 1) {
        cardList.removeFirst()
        cardList.offerLast(cardList.pollFirst())
    }

    return cardList.last
}
