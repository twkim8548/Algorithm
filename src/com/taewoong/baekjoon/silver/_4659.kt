package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val password = br.readLine()

        if (password == "end") {
            break
        }

        var isFirst = false
        var isSecond = true
        var isThird = true

        val array = password.toCharArray()

        for (i in array.indices) {
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {
                isFirst = true
                break
            }

        }
        for (i in 0 until password.length - 2) {
            if (isVowel(array[i]) && isVowel(array[i + 1]) && isVowel(array[i + 2])) {
                isSecond = false
                break
            }
            if (!isVowel(array[i]) && !isVowel(array[i + 1]) && !isVowel(array[i + 2])) {
                isSecond = false
                break
            }
        }
        for (i in 0 until password.length - 1) {
            if (array[i] != 'e' && array[i] != 'o') {
                if (array[i] == array[i+1]) {
                    isThird = false
                    break
                }

            }
        }
        if (isFirst && isSecond && isThird) {
            bw.write("<${password}> is acceptable.\n")
        } else {
            bw.write("<${password}> is not acceptable.\n")
        }
    }
    bw.flush()
    bw.close()
    br.close()
}

fun isVowel(char: Char): Boolean {
    return char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u'
}
