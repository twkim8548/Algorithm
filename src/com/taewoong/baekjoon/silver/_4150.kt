package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val array = ArrayList<BigInteger>()

    array.add(0.toBigInteger())
    array.add(1.toBigInteger())

    if (n == 1 || n == 2) {
        bw.write("1")
    } else {
        for (i in 2 .. n) {
            array.add(array[i - 1] + array[i - 2])
        }
        bw.write("${array[n]}")
    }

    bw.flush()
    bw.close()

    br.close()
}
