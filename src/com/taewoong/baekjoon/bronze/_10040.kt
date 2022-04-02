package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    val games = IntArray(n)
    val tests = IntArray(m)
    repeat(n) {
        games[it] = br.readLine().toInt()
    }
    repeat(m) {
        tests[it] = br.readLine().toInt()
    }

    val cnt = IntArray(m)

    tests.forEach test@{ test ->
        games.forEachIndexed { index, game ->
            if (game <= test) {
                cnt[index]++
                return@test
            }
        }
    }

    bw.write("${cnt.indexOf(cnt.max()!!) + 1}")
    bw.flush()
    br.close()

}
