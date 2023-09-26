import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var direction = 'N' 
    repeat(10) {
        when(br.readLine().toInt()) {
            1 -> {
                when(direction) {
                    'N' -> direction = 'E'
                    'E' -> direction = 'S'
                    'S' -> direction = 'W'
                    'W' -> direction = 'N'
                }
            }
            2 -> {
                when(direction) {
                    'N' -> direction = 'S'
                    'E' -> direction = 'W'
                    'S' -> direction = 'N'
                    'W' -> direction = 'E'
                }
            }
            3 -> {
                when(direction) {
                    'N' -> direction = 'W'
                    'E' -> direction = 'N'
                    'S' -> direction = 'E'
                    'W' -> direction = 'S'
                }
            }
        }
    }
    bw.write("$direction")


    bw.flush()
    bw.close()
}
