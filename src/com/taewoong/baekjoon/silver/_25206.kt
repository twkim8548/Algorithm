package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var totalCredit = 0.0
    var totalGrade = 0.0

    repeat(20) {
        val token = StringTokenizer(br.readLine())
        val subject = token.nextToken()
        val credit = token.nextToken().toDouble()
        val grade = token.nextToken()

        if (grade != "P")
            totalCredit += credit

        when (grade) {
            "A+" -> {
                totalGrade += credit * 4.5
            }
            "A0" -> {
                totalGrade += credit * 4.0
            }
            "B+" -> {
                totalGrade += credit * 3.5
            }
            "B0" -> {
                totalGrade += credit * 3.0
            }
            "C+" -> {
                totalGrade += credit * 2.5
            }
            "C0" -> {
                totalGrade += credit * 2.0
            }
            "D+" -> {
                totalGrade += credit * 1.5
            }
            "D0" -> {
                totalGrade += credit * 1.0
            }
            "F" -> {
                totalGrade += credit * 0.0
            }
        }
    }

    bw.write("${totalGrade / totalCredit}")
    bw.flush()
    bw.close()
    br.close()
}
