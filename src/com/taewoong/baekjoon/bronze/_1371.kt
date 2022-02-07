package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sentence = ArrayList<Char>()
    while (true) {
        val str = br.readLine() ?: break
        str.forEach {
            if (it.toString() != " ")
                sentence.add(it)
        }
    }
    var max = 0

    val array = mutableMapOf<String, Int>()
    array["a"] = sentence.count { it == 'a' }
    array["b"] = sentence.count { it == 'b' }
    array["c"] = sentence.count { it == 'c' }
    array["d"] = sentence.count { it == 'd' }
    array["e"] = sentence.count { it == 'e' }
    array["f"] = sentence.count { it == 'f' }
    array["g"] = sentence.count { it == 'g' }
    array["h"] = sentence.count { it == 'h' }
    array["i"] = sentence.count { it == 'i' }
    array["j"] = sentence.count { it == 'j' }
    array["k"] = sentence.count { it == 'k' }
    array["l"] = sentence.count { it == 'l' }
    array["m"] = sentence.count { it == 'm' }
    array["n"] = sentence.count { it == 'n' }
    array["o"] = sentence.count { it == 'o' }
    array["p"] = sentence.count { it == 'p' }
    array["q"] = sentence.count { it == 'q' }
    array["r"] = sentence.count { it == 'r' }
    array["s"] = sentence.count { it == 's' }
    array["t"] = sentence.count { it == 't' }
    array["u"] = sentence.count { it == 'u' }
    array["v"] = sentence.count { it == 'v' }
    array["w"] = sentence.count { it == 'w' }
    array["x"] = sentence.count { it == 'x' }
    array["y"] = sentence.count { it == 'y' }
    array["z"] = sentence.count { it == 'z' }

    array.forEach {
        if (it.value > max) {
            max = it.value
        }
    }

    array.forEach {
        if (it.value == max) {
            bw.write(it.key)
        }
    }

    bw.flush()
    bw.close()

    br.close()

}


