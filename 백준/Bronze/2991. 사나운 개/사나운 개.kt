import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toInt()
    val d = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    val array = IntArray(3) { token.nextToken().toInt() }

    repeat(3) { deliveryType ->
        var answer = 0

        repeat(2) {
            var arriveTime = array[deliveryType]
            var cnt = 1
            while (true) {
                if (it == 0) {
                    if (cnt % 2 != 0) {
                        if (arriveTime <= a) {
                            answer ++
                            break
                        } else {
                            arriveTime -= a
                        }
                    } else {
                        if (arriveTime <= b) {
                            break
                        } else {
                            arriveTime -= b
                        }
                    }
                } else {
                    if (cnt % 2 != 0) {
                        if (arriveTime <= c) {
                            answer++
                            break
                        } else {
                            arriveTime -= c
                        }
                    } else {
                        if (arriveTime <= d) {
                            break
                        } else {
                            arriveTime -= d
                        }
                    }
                }
                cnt++
            }
        }
        bw.write("$answer\n")
    }

    bw.flush()
    br.close()
}
