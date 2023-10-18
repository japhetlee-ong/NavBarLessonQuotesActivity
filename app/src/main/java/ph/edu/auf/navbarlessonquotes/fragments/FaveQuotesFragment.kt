package ph.edu.auf.navbarlessonquotes.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import ph.edu.auf.navbarlessonquotes.R
import ph.edu.auf.navbarlessonquotes.databinding.FragmentFaveQuotesBinding
import ph.edu.auf.navbarlessonquotes.helpers.SharedPreferenceManager
import ph.edu.auf.navbarlessonquotes.helpers.constants.SharedPrefKeys

class FaveQuotesFragment : Fragment() {

    private var _binding: FragmentFaveQuotesBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFaveQuotesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtFaveQuote.text = SharedPreferenceManager.getString(SharedPrefKeys.FAVEQUOTE.key,"")

        binding.btnRemoveFave.setOnClickListener {
            MaterialAlertDialogBuilder(requireActivity())
                .setTitle("Are you sure?")
                .setMessage("Do you want to remove your fave quote?")
                .setPositiveButton("Yes"){_,_ ->
                    SharedPreferenceManager.removeString(SharedPrefKeys.FAVEQUOTE.key)
                    Toast.makeText(requireActivity(),"Fave quotes removed",Toast.LENGTH_SHORT).show()
                    findNavController().popBackStack()
                }
                .setNegativeButton("No"){dialog,_ ->
                    dialog.dismiss()
                }.show()
        }

    }
}