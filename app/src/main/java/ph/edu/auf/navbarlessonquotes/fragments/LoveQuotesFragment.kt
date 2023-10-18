package ph.edu.auf.navbarlessonquotes.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import ph.edu.auf.navbarlessonquotes.R
import ph.edu.auf.navbarlessonquotes.databinding.FragmentLoveQuotesBinding
import ph.edu.auf.navbarlessonquotes.helpers.QuotesGenerator
import ph.edu.auf.navbarlessonquotes.helpers.SharedPreferenceManager
import ph.edu.auf.navbarlessonquotes.helpers.constants.SharedPrefKeys


class LoveQuotesFragment : Fragment() {

    private var _binding: FragmentLoveQuotesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var quotesGenerator: QuotesGenerator

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoveQuotesBinding.inflate(inflater,container,false)

        quotesGenerator = QuotesGenerator.generateLoveQuotes().build()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtLoveQuote.text = quotesGenerator.getRandomQuote()

        binding.btnRandomizeQuote.setOnClickListener {
            binding.txtLoveQuote.text = quotesGenerator.getRandomQuote()
        }

        binding.btnSaveQuote.setOnClickListener {
            val quote = binding.txtLoveQuote.text.toString()
            SharedPreferenceManager.putString(SharedPrefKeys.FAVEQUOTE.key,quote)
            Snackbar.make(binding.rootConstraintLayout,"Quote has been saved",Snackbar.LENGTH_LONG)
                .setAction("Ok"){}.show()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}