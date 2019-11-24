package solution

import java.util.*

object RemovedNumbers {
    fun removNb(n: Long): Array<LongArray> {
        val pairs = LinkedList<LongArray>()
        val sum = n * (n + 1) / 2
        val lower = (n - 1) * n / 2 / (n + 1)
        val upper= Math.sqrt((sum + 1).toDouble()).toLong() - 1
        for (a in upper downTo lower) {
            val b = (sum - a) / (a + 1)
            if (a * b + a + b == sum) {
                pairs.addFirst(longArrayOf(a, b))
                pairs.addLast(longArrayOf(b, a))
            }
        }
        val array2 = Array<LongArray>(pairs.size) {longArrayOf(0, 1)}
        pairs.forEachIndexed { index, longs -> array2[index] = longs }
        return array2
    }
}