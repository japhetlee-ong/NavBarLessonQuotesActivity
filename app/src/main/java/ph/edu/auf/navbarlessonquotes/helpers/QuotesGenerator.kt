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

        private val motivationalQuotes = listOf(
            "Believe you can and you're halfway there. -Theodore Roosevelt",
            "The only way to do great work is to love what you do. -Steve Jobs",
            "Don't watch the clock; do what it does. Keep going. -Sam Levenson",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. -Winston Churchill",
            "The future depends on what you do today. -Mahatma Gandhi",
            "The only place where success comes before work is in the dictionary. -Vidal Sassoon",
            "It does not matter how slowly you go as long as you do not stop. -Confucius",
            "Your time is limited, don't waste it living someone else's life. -Steve Jobs",
            "The only limit to our realization of tomorrow will be our doubts of today. -Franklin D. Roosevelt",
            "I find that the harder I work, the more luck I seem to have. -Thomas Jefferson"

        )

        fun generateLoveQuotes(): QuoteBuilder{
            return QuoteBuilder().apply { quotes.addAll(loveQuotes) }
        }

        fun generateMotivationalQuotes(): QuoteBuilder{
            return QuoteBuilder().apply { quotes.addAll(motivationalQuotes) }
        }

        fun generateAllQuotes(): QuoteBuilder{
            val allQuotes = mutableListOf<String>()
            allQuotes.addAll(loveQuotes)
            allQuotes.addAll(motivationalQuotes)
            return QuoteBuilder().apply { quotes.addAll(allQuotes) }
        }
    }

}