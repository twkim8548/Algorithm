package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val gandalfScore = intArrayOf(1, 2, 3, 3, 4, 10)
    val sauronScore = intArrayOf(1, 2, 2, 2, 3, 5, 10)

    repeat(br.readLine().toInt()) { round ->
        var gandalf = 0
        var sauron = 0
        repeat(2) {
            val token = StringTokenizer(br.readLine())
            if (it == 0) {
                repeat(6) {
                    gandalf += token.nextToken().toInt() * gandalfScore[it]
                }
            }

            if (it == 1) {
                repeat(7) {
                    sauron += token.nextToken().toInt() * sauronScore[it]
                }
            }
        }
        if (gandalf > sauron) {
            bw.write("Battle ${round + 1}: Good triumphs over Evil\n")
        }
        else if (gandalf < sauron) {
            bw.write("Battle ${round + 1}: Evil eradicates all trace of Good\n")
        } else {
            bw.write("Battle ${round + 1}: No victor on this battle field\n")
        }
    }
    bw.flush()
    bw.close()
    br.close()
}