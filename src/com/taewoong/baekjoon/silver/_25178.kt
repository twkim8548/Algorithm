package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val before = br.readLine()
    val after = br.readLine()
    if (before.first() == after.first() && before.last() == after.last()) {
        if (before.toCharArray().sorted() == after.toCharArray().sorted()) {
            val beforeOnlyConsonant =
                before.substring(1, before.length - 1).replace("a", "").replace("e", "").replace("i", "")
                    .replace("o", "")
                    .replace("u", "")
            val afterOnlyConsonant = after.substring(1, before.length - 1).replace("a", "").replace("e", "")
                .replace("i", "").replace("o", "").replace("u", "")
            if (beforeOnlyConsonant == afterOnlyConsonant) {
                bw.write("YES")
            } else {
                bw.write("NO")
            }
        } else {
            bw.write("NO")
        }
    } else {
        bw.write("NO")
    }
    bw.flush()
    bw.close()

    br.close()
}
