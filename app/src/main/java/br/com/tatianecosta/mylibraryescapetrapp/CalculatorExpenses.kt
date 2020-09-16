package br.com.tatianecosta.mylibraryescapetrapp

class CalculatorExpenses {
    var totalExpense: Double = 0.0
    
    fun sumExpenses(value: Double): Double {
        totalExpense = totalExpense + value
        return totalExpense
    }
    
    fun getExpenses(): Double {
        return totalExpense
    }
    
    fun subtractionExpenses(totalExpense: Double , value: Double): Double {
        val total = totalExpense - value
        return total
    }
}
