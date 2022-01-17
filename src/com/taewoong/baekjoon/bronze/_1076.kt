package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val first = br.readLine()
    val second = br.readLine()
    val third = br.readLine()

    val answer = (getValue(first) + getValue(second)).toBigInteger() * getMultiplication(third).toBigInteger()

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}

fun getValue(string: String): String {
    when (string) {
        "black" -> {
            return "0"
        }
        "brown" -> {
            return "1"
        }
        "red" -> {
            return "2"
        }
        "orange" -> {
            return "3"
        }
        "yellow" -> {
            return "4"
        }
        "green" -> {
            return "5"
        }
        "blue" -> {
            return "6"
        }
        "violet" -> {
            return "7"
        }
        "grey" -> {
            return "8"
        }
        "white" -> {
            return "9"
        }
        else -> {
            return ""
        }
    }
}

fun getMultiplication(string: String): Int {
    when (string) {
        "black" -> {
            return 1
        }
        "brown" -> {
            return 10
        }
        "red" -> {
            return 100
        }
        "orange" -> {
            return 1000
        }
        "yellow" -> {
            return 10000
        }
        "green" -> {
            return 100000
        }
        "blue" -> {
            return 1000000
        }
        "violet" -> {
            return 10000000
        }
        "grey" -> {
            return 100000000
        }
        "white" -> {
            return 1000000000
        }
        else -> {
            return 0
        }
    }
}