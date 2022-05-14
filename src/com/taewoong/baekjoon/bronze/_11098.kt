package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val map = mutableMapOf<String, BigInteger>()

        repeat(n) {
            val token = StringTokenizer(br.readLine())
            val money = token.nextToken().toBigInteger()
            val name = token.nextToken()
            map[name] = money
        }

//        map.forEach {
//            if (it.value == map.maxOf { it.value }) {
//                bw.write("${it.key}\n")
//            }
//        }
    }

    bw.flush()
    bw.close()

    br.close()

}
