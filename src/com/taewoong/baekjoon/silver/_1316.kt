package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var answer = 0
    repeat(br.readLine().toInt()) {
        val string = br.readLine()
        var isGroupChar = true

        var lastChar = string.first()

        val map = mutableMapOf<Char, Boolean>()

        run {
            string.forEach {
                if (lastChar != it) {
                    if (map[it] == true) {
                        isGroupChar = false
                        return@run
                    } else {
                        map[it] = true
                    }
                } else {
                    map[it] = true
                }
                lastChar = it
            }
        }

        if (isGroupChar) {
            answer++
        }


    }
    bw.write("$answer\n")

    bw.flush()
    bw.close()

    br.close()
}