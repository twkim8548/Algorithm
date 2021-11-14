package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arrayTime = IntArray(n)
    val token = StringTokenizer(br.readLine())
    repeat(n) {
        arrayTime[it] = token.nextToken().toInt()
    }

    bw.write(findSmallPlan(arrayTime))
    bw.flush()
    bw.close()

    br.close()
}

fun findSmallPlan(array: IntArray) : String {
    var mPlanMoney = 0
    var yPlanMoney = 0

    array.forEach {
        mPlanMoney += (it/60 + 1) * 15
        yPlanMoney += (it/30 + 1) * 10
    }

    return if (mPlanMoney < yPlanMoney) {
        "M $mPlanMoney"
    } else if (yPlanMoney < mPlanMoney) {
        "Y $yPlanMoney"
    } else {
        "Y M $mPlanMoney"
    }
}
