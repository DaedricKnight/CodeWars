package solution

object JosephusSurvivor {
	fun josephusSurvivor(n: Int, k: Int): Int {
     var iter: Int
        val numbers = mutableListOf(1)
        for (i in 2..n) {
            numbers.add(i)
        }
        var mutableIterator = numbers.iterator()
        while (numbers.size > 1) {
            iter = k
            while (iter > 0) {
                if (mutableIterator.hasNext()) {
                    mutableIterator.next()
                    iter--
                }
                else
                    mutableIterator = numbers.iterator()
            }
            mutableIterator.remove()
        }
        return numbers[0]
	}
}