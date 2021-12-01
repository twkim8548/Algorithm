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
    val cardArray = IntArray(n)
    val cardToken = StringTokenizer(br.readLine())
    repeat(n) {
        cardArray[it] = cardToken.nextToken().toInt()
    }

    cardArray.sort()

    val m = br.readLine().toInt()
    val answerArray = IntArray(m)
    val findCountToken = StringTokenizer(br.readLine())
    repeat(m) {
        val key = findCountToken.nextToken().toInt()
//        answerArray[it] = findCountNumber(cardArray, key)
        answerArray[it] = findUpperBound(cardArray, key) - findLowerBound(cardArray, key)
    }

    answerArray.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    br.close()
}

// count 함수 사용, 시간초과...?
fun findCountNumber(cardArray: IntArray, key: Int): Int {

    return cardArray.count{ it == key}
}

// 이분 탐색
fun findLowerBound(cardArray: IntArray, key: Int): Int {
    var lo = 0
    var hi = cardArray.size

    while (lo < hi) {
        val mid = (hi + lo) / 2
        if (key <= cardArray[mid]) {
            hi = mid
        } else {
            lo = mid + 1
        }
    }

    return lo
}

fun findUpperBound(cardArray: IntArray, key: Int): Int {
    var lo = 0
    var hi = cardArray.size

    while (lo < hi) {
        val mid = (hi + lo) / 2
        if (key >= cardArray[mid]) {
            lo = mid + 1
        } else {
            hi = mid
        }
    }
    return hi
}

