package com.taewoong.baekjoon.bronze

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write(
        "n e\n" +
                "- -----------\n"
    )
    for (n in 0..9) {
        var answer = 0.0
        for (i in 0..n) {
            answer += 1 / factorial(i)
        }
        if (n == 0 || n == 1) {
            bw.write("$n ${String.format("%.0f", answer)}\n")
        } else if (n == 2) {
            bw.write("$n ${String.format("%.1f", answer)}\n")
        }
        else {
            bw.write("$n ${String.format("%.9f", answer)}\n")
        }
    }

    bw.flush()
    bw.close()

}

fun factorial(n: Int): Double {
    var answer = 1.0
    for (i in 1..n) {
        answer *= i
    }
    return answer
}
