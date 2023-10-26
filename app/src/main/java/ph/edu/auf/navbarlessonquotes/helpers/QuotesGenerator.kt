package ph.edu.auf.navbarlessonquotes.helpers

import kotlin.random.Random

class QuotesGenerator private constructor(private val quotes: List<String>) {

    fun getRandomQuote(): String{
        val random = Random.nextInt(0,quotes.size )
        return quotes[random]
    }

    class QuoteBuilder{
        internal val quotes = mutableListOf<String>()
        fun build() = QuotesGenerator(quotes)

    }

    companion object{

        private val loveQuotes = listOf(
            "Love is composed of a single soul inhabiting two bodies. - Aristotle",
            "In all the world, there is no heart for me like yours. In all the world, there is no love for you like mine. - Maya Angelou",
            "Love is not finding someone to live with; it's finding someone you can't imagine living without. - Rafael Ortiz",
            "Life is the flower for which love is the honey. - Victor Hugo",
            "The best thing to hold onto in life is each other. - Audrey Hepburn",
            "Love is like the wind, you can't see it but you can feel it. - Nicholas Sparks",
            "Love is an endless act of forgiveness. Forgiveness is the key to action and freedom. - Maya Angelou",
            "Where there is love, there is life. - Mahatma Gandhi",
            "Love is when the other person's happiness is more important than your own. - H. Jackson Brown Jr.",
            "To love and be loved is to feel the sun from both sides. - David Viscott"
        )


        fun generateLoveQuotes(): QuoteBuilder{
            return QuoteBuilder().apply { quotes.addAll(loveQuotes) }
        }


        fun generateAllQuotes(): QuoteBuilder{
            return QuoteBuilder().apply { quotes.addAll(loveQuotes) }
        }
    }

}