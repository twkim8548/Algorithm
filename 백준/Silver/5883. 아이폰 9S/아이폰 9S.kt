import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val array = ArrayList<Int>()
    var exArray = ArrayList<Int>()
    var answer = 0

    repeat(n) {
        array.add(br.readLine().toInt())
    }

    array.distinct().forEach { ex ->
        array.forEach {
            if (it != ex) exArray.add(it)
        }

        var max = 0

        for (i in 0 until exArray.size - 1) {
            if (exArray[i] == exArray[i + 1]) {
                max++
            } else {
                if (answer < max) {
                    answer = max
                }
                max = 0
            }
        }
        if (answer < max) {
            answer = max
        }
        
        exArray.clear()
    }

    bw.write("${answer + 1} ")
    bw.flush()
    bw.close()

    br.close()


}