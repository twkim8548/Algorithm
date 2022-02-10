package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val line = br.readLine().split(" ")

        val char = line[0]
        if (char == "#") {

            break
        }

        var sentence = ""

        line.forEachIndexed { index, s ->
            if (index != 0)
                sentence += s
        }

        var cnt = 0
        sentence.lowercase().forEach {
            if (char == it.toString())
                cnt++
        }

        bw.write("$char $cnt\n")

    }
    bw.flush()
    bw.close()
    br.close()
}