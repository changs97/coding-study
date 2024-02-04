fun main()  {
    try {
        System.`in`.bufferedReader().use { br ->

            val n = br.readLine().toInt()
            val numList = mutableListOf<Int>()

            repeat(n) {
                numList.add(br.readLine().toInt())
            }

            numList.sort()

            System.out.bufferedWriter().use { bw ->
                for (i in numList) bw.write("${i}\n")
            }

        }
    } catch (e: Exception) {
        println(e.message)
    }
}