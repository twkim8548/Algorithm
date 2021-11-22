package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var remainPeople = 0
    var maxPeople = 0
    repeat(4) {
        val token = StringTokenizer(br.readLine())

        remainPeople += getRemainPeoPleNumber(token.nextToken().toInt(), token.nextToken().toInt())
        maxPeople = max(remainPeople, maxPeople)
    }

    bw.write("$maxPeople")
    bw.flush()

    bw.close()
    br.close()
}

fun getRemainPeoPleNumber(outPeopleNumber: Int, inPeopleNumber: Int): Int {
    return inPeopleNumber - outPeopleNumber
}
