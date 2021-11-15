package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(3) {
        val n = br.readLine().toInt()
        val array = arrayOfNulls<String>(n)
        repeat(array.size) {
            array[it] = br.readLine()
        }
        bw.write("${findPlusMinusZero(array)}\n")
    }

    bw.flush()
    bw.close()

    br.close()
}

fun findPlusMinusZero(array: Array<String?>) : String {
    var sum = "0".toBigInteger()
    array.forEach {
        sum += it?.toBigInteger() ?: "0".toBigInteger()
    }

    return if (sum > "0".toBigInteger()) {
        "+"
    } else if (sum < "0".toBigInteger()) {
        "-"
    } else {
        "0"
    }
}
