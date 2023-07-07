import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val s1 = readLine()!!
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    s1.forEach {
        if (it.isUpperCase()) {
            bw.write(it.lowercase())
        } else {
            bw.write(it.uppercase())
        }
    }
    bw.flush()
    bw.close()

}