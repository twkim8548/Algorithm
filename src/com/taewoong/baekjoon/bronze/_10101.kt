package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    val c = br.readLine().toInt()

    if (a == 60 && b == 60 && c == 60) {
        bw.write("Equilateral")
    } else {
        if (a + b + c == 180) {
            if (a == b || b == c || a == c) {
                bw.write("Isosceles")
            } else {
                bw.write("Scalene")
            }
        } else {
            bw.write("Error")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}
