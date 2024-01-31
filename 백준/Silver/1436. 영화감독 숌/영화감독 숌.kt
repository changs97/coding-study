fun main() = with(System.`in`.bufferedReader()){
    var n = readLine().toInt()
    var number = 665
    
    while(n!=0){
        number++
        if(number.toString().contains("666")){
            n--
        }
    }

    println(number)
}