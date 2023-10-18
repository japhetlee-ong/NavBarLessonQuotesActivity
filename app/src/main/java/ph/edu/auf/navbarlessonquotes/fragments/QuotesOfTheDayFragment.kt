package ph.edu.auf.navbarlessonquotes.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ph.edu.auf.navbarlessonquotes.R
import ph.edu.auf.navbarlessonquotes.databinding.FragmentQuotesOfTheDayBinding
import ph.edu.auf.navbarlessonquotes.helpers.QuotesGenerator

class QuotesOfTheDayFragment : Fragment() {

    private var _binding: FragmentQuotesOfTheDayBinding? = null

    private val binding get() = _binding!!
    private lateinit var quotesGenerator: QuotesGenerator

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        _binding = FragmentQuotesOfTheDayBinding.inflate(inflater,container,false)

        quotesGenerator = QuotesGenerator.generateAllQuotes().build()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtQuoteOfDay.text = quotesGenerator.getRandomQuote()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}