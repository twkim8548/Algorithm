package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var binary = br.readLine()

    while (binary.length % 3 != 0) {
        binary = "0$binary"
    }

    val binarys = binary.chunked(3)
    var answer = ""

    binarys.forEach {
        var string = it
        while (string.length < 3) {
            string = "0$string"
        }

        when (string) {
            "000" ->
                answer += "0"

            "001" ->
                answer += "1"

            "010" ->
                answer += "2"

            "011" ->
                answer += "3"

            "100" ->
                answer += "4"

            "101" ->
                answer += "5"

            "110" ->
                answer += "6"

            "111" ->
                answer += "7"
        }
    }

    bw.write(answer)
    bw.flush()
    bw.close()

    br.close()
}
