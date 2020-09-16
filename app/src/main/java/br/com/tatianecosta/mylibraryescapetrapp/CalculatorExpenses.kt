package br.com.tatianecosta.mylibraryescapetrapp

class CalculatorExpenses {
    fun sumExpenses(totalExpense: Double , value: Double): Double {
        val total = totalExpense + value
        return total
    }
    
    fun subtractionExpenses(totalExpense: Double , value: Double): Double {
        val total = totalExpense - value
        return total
    }
}
