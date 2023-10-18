package ph.edu.auf.navbarlessonquotes.helpers

class QuoteList private constructor(private val quotes: List<String>) {
    fun printQuotes() {
        println("List of Quotes:")
        for ((index, quote) in quotes.withIndex()) {
            println("${index + 1}. $quote")
        }
    }

    class QuoteBuilder {
        internal val quotes = mutableListOf<String>()

        fun addQuote(quote: String) = apply { quotes.add(quote) }

        fun build() = QuoteList(quotes)
    }

    companion object {
        fun predefined(): QuoteBuilder {
            val predefinedQuotes = listOf(
                "Quote 1: This is the first quote.",
                "Quote 2: Another insightful quote.",
                "Quote 3: A third inspiring quote."
            )
            return QuoteBuilder().apply { quotes.addAll(predefinedQuotes) }
        }
    }
}