package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val map = mutableMapOf<Int, String>()
    while (true) {
        val number = br.readLine().toInt()
        if (number == 0) {
            break
        }
        val answer = br.readLine()


        if (answer == "right on") {
            var isLie = false
            map.forEach {
                if (it.value == "too high") {
                    if (it.key <= number) {
                        isLie = true
                    }
                } else if (it.value == "too low") {
                    if (it.key >= number) {
                        isLie = true
                    }
                }
            }
            if (isLie) {
                bw.write("Stan is dishonest\n")
            } else {
                bw.write("Stan may be honest\n")
            }
            map.clear()
        } else {
            map[number] = answer
        }
    }

    bw.flush()
    bw.close()

    br.close()

}
