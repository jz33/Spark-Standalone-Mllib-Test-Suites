package search

object Search {
    def binarySearch[A <% Ordered[A]](arr: IndexedSeq[A], tag: A): Boolean = {
        var i = 0
        var j = arr.length - 1
        while (i <= j) {
            var m = (i + j >> 1)
            arr(m) compare tag match {
                case -1 => i = m + 1
                case 0  => return true
                case 1  => j = m - 1
            }
        }
        false
    }

    /*
     * Returns an iterator pointing to the first element in the range [first,last) which does not compare less than val.
     * http://www.cplusplus.com/reference/algorithm/lower_bound/
     */
    def lowerBound[A <% Ordered[A]](arr: IndexedSeq[A], tag: A): Int = {
        var i = 0
        var j = arr.length - 1
        var m = 0
        while (i < j) {
            m = (i + j >> 1)
            arr(m) compare tag match {
                case -1 =>
                    i = m + 1
                case _ =>
                    j = m - 1
            }
        }
        if (arr(i) >= tag) i else i + 1
    }

    /*
     * Returns an iterator pointing to the first element in the range [first,last) which compares greater than val.
     * http://www.cplusplus.com/reference/algorithm/upper_bound/
     */
    def upperBound[A <% Ordered[A]](arr: IndexedSeq[A], tag: A): Int = {
        var i = 0
        var j = arr.length - 1
        var m = 0
        while (i < j) {
            m = (i + j >> 1)
            arr(m) compare tag match {
                case 1 =>
                    j = m - 1
                case _ =>
                    i = m + 1
            }
        }
        if (arr(i) > tag) i else i + 1
    }
}