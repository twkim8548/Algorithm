package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 1
    while (true) {
        val n = br.readLine().toInt()
        if (n == 0) {
            break
        }

        val array = Array<String>(n) { br.readLine() }
        var map = mutableMapOf<Int, String>()
        repeat((2 * n) - 1) {
            val token = StringTokenizer(br.readLine())

            val int = token.nextToken().toInt()
            val string = token.nextToken()

            if (map[int] != null) {
                map.remove(int)
            } else {
                map[int] = string
            }
        }
        map.forEach {
            bw.write("$cnt ${array[it.key - 1]}\n")
        }
        cnt++
    }
    bw.flush()
    bw.close()

    br.close()
}
