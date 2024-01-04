import java.util.Scanner

//  (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C
fun main() {
    val s = Scanner(System.`in`)
    val a = s.nextInt()
    val b = s.nextInt()
    val c = s.nextInt()
    
    println((a+b)%c)
    println(((a%c)+(b%c))%c)
    println((a*b)%c)
    println(((a%c)*(b%c))%c)
}