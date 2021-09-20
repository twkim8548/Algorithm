package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.round

fun main() {
    /*
    첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다.
    단, N은 홀수이다. 그 다음 N개의 줄에는 정수들이 주어진다.
    입력되는 정수의 절댓값은 4,000을 넘지 않는다.

    첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
    둘째 줄에는 중앙값을 출력한다.
    셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
    넷째 줄에는 범위를 출력한다.

    산술평균 : N개의 수들의 합을 N으로 나눈 값
    중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
    최빈값 : N개의 수들 중 가장 많이 나타나는 값
    범위 : N개의 수들 중 최댓값과 최솟값의 차이

    -2 1 2 3 8
     */
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = List(br.readLine().toInt()) { br.readLine().toInt() }.sorted()

    bw.write("${round(array.average()).toInt()}\n")
    bw.write("${array[(array.size / 2)]}\n")
    bw.write("${findModeNumber(array)}\n")
    bw.write("${array.last() - array.first()}\n")

    bw.flush()
    bw.close()

    br.close()
}

fun findModeNumber(array: List<Int>): Int {
    val arr = array.groupingBy { it }.eachCount()

    var list = arr.toList()
    list = list.sortedByDescending { it.second }

    if (list.size > 1 && list[0].second == list[1].second) {
        val answer = ArrayList<Int>()
        list.forEach {
            if (it.second == list[0].second) {
                answer.add(it.first)
            }
        }
        return answer[1]
    }

    return list[0].first
}
