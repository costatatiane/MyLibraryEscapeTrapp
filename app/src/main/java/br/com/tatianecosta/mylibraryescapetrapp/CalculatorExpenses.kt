package br.com.tatianecosta.mylibraryescapetrapp

class CalculatorExpenses {
    fun calculateExpenses(
        ticketsExpenses: Double,
        transportExpenses: Double,
        foodExpenses: Double,
        tourExpenses: Double,
        shoppingExpenses: Double
    ): Double {
        val totalExpense = ticketsExpenses + transportExpenses + foodExpenses + tourExpenses + shoppingExpenses
        return totalExpense
    }
}