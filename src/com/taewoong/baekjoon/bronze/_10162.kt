import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = 300
    val b = 60
    val c = 10
    val array = IntArray(3)

    var t = br.readLine().toInt()

    if (t % 10 == 0) {
while (t > 0 ) {
        if ( t >= a) {
                array[0] = t / a
                t -= a * array[0]
         } else if (t >= b) {
                array[1] = t / b
                t -= b * array[1]
         } else if (t >= c) {
                array[2] = t / c
                t -= c * array[2]
         } 
}
array.forEach{ 
        bw.write("$it ")
}
} else {
    bw.write("-1")
}
   

    bw.flush()

    bw.close()
    br.close()
}
