import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var number = ""
        br.readLine().uppercase().forEach {
            when (it) {
                'A', 'B', 'C' -> {
                    number += "2"
                }

                'D', 'E', 'F' -> {
                    number += "3"

                }

                'G', 'H', 'I' -> {
                    number += "4"

                }

                'J', 'K', 'L' -> {
                    number += "5"

                }

                'M', 'N', 'O' -> {
                    number += "6"

                }

                'P', 'Q', 'R', 'S' -> {
                    number += "7"

                }

                'T', 'U', 'V' -> {
                    number += "8"

                }

                'W', 'X', 'Y', 'Z' -> {
                    number += "9"

                }
            }
        }
        if (number == number.reversed()) {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }
    }

    bw.flush()
    bw.close()
}
