package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import java.util.Arrays.binarySearch

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val nArray = IntArray(n)
    var token = StringTokenizer(br.readLine())
    repeat(nArray.size) {
        nArray[it] = token.nextToken().toInt()
    }

    nArray.sort()
    val m = br.readLine().toInt()
    token = StringTokenizer(br.readLine())
    repeat(m) {
        bw.write("${binarySearch(nArray, token.nextToken().toInt())}\n")
    }
    bw.flush()
    bw.close()

}

//fun binarySearch(array: IntArray, key: Int): Int {
//    var lo = 0
//    var hi = array.lastIndex
//
//    while (lo <= hi) {
//        val mid = (lo + hi) / 2
//        if (key < array[mid]) {
//            hi = mid - 1
//        } else if (key > array[mid]) {
//            lo = mid + 1
//        } else {
//            return 1
//        }
//    }
//    return 0
//}
