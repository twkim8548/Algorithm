package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()

        if (string == "#") {
            break
        }

        if (string.contains("a") || string.contains("c") || string.contains("e") || string.contains("f") || string.contains(
                "g"
            ) || string.contains("h") || string.contains("j") || string.contains("k") || string.contains("l") || string.contains(
                "m"
            ) || string.contains("n") || string.contains("r") || string.contains("s") || string.contains("t") || string.contains(
                "u"
            ) || string.contains("y") || string.contains("z")
        ) {
            bw.write("INVALID")
        } else {
            string.reversed().forEach {
                if (it.toString() == "b") bw.write("d")
                else if (it.toString() == "d") bw.write("b")
                else if (it.toString() == "p") bw.write("q")
                else if (it.toString() == "q") bw.write("p")
                else bw.write("$it")
            }

        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()

    br.close()
}