package org.example

internal object IntListUtils {

    /**
     * Находит сумму [List], состоящего из [Int], между индексами включительно
     * @param list [List], состоящий из [Int], в котором будет найдена сумма
     * @param start индекс, с которого начинается суммирование включительно
     * @param end индекс, на котором заканчивается суммирование включительно
     * @return искомая сумма. null, если границы вне размеров [list]
     */
    fun sumBetweenIndexes(list: List<Int>, start: Int, end: Int): Int? {
        var sum = 0
        for (i in start..end) {
            sum += list.getOrNull(i) ?: return null
        }
        return sum
    }

    /**
     * Находит сумму четных элементов в [List], состощемим из [Int]
     * @param list [List], состоящий из [Int], в котором будет найдена сумма
     * @return искомая сумма
     */
    fun sumOfEvenNumbers(list: List<Int>): Int {
        return list.filter { it % 2 == 0 }.sum()
    }

    /**
     * Находит количество элементов в [List], состоящем из [Int], которые большем, чем среднее арифметическое
     * @param list [List], состоящий из [Int], в котором будет найдено количество
     * @return искомое количество
     */
    fun countNumbersMoreThanAverage(list: List<Int>): Int {
        if (list.isEmpty()) return 0

//        val average = list.sum() / list.size // Without fix
        val average = list.sum().toFloat() / list.size // With fix
        print(list.size)
        var count = 0
        list.forEach { currentNumber ->
            if (currentNumber > average) count++
        }

        return count
    }

    /**
     * Находит индекс искомого элемента в [List], состоящем из [Int]
     * @param list [List], состоящий из [Int], в котором будет найден индекс
     * @param target искомый элемент
     * @return индекс искомого элемента. null, если такового элемента в [list] нет
     */
    fun firstIndexOfTargetElement(list: List<Int>, target: Int): Int? {
        list.forEachIndexed { index: Int, i: Int ->
            if (i == target) return index
        }

        return null
    }

    /**
     * Удваивает элементы на четных местах в [List], состоящем из [Int]
     * @param list [List], состоящий из [Int], который будет преобразован
     * @return [List], состоящий из [Int], в котором элемента на четных индексах удвоены по сравнению с [list]
     */
    fun doubleElementsOnEvenIndexes(list: List<Int>): List<Int> {
        val newList = mutableListOf<Int>()
        list.mapIndexed { index, i ->
            newList.add(
                if (index % 2 == 0) 2 * i else i,
            )
        }

        return newList
    }
}