package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        bw.write("${getVPS(br.readLine().toCharArray())}\n")
    }
    bw.flush()
    bw.close()

    br.close()

}

fun getVPS(array: CharArray): String {
    val stack = ArrayList<String>()
    array.forEachIndexed { index, c ->
        if (c.toString() == ")") {
            if (stack.size > 0 && stack.last() == "(") {
                stack.removeAt(stack.lastIndex)
            } else {
                stack.add(c.toString())
            }
        } else {
            stack.add(c.toString())
        }
    }

    return if (stack.isEmpty()) {
        "YES"
    } else {
        "NO"
    }
}
