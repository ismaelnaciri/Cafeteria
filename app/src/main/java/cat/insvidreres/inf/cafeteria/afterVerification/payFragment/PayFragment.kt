package cat.insvidreres.inf.cafeteria.afterVerification.payFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import cat.insvidreres.inf.cafeteria.R
import cat.insvidreres.inf.cafeteria.databinding.FragmentPayBinding

class PayFragment : Fragment() {
    private val viewModel: PayViewModel by viewModels()
    private lateinit var binding: FragmentPayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPayBinding.inflate(inflater)
//        val payRecyclerView
        val totalTextView = binding.TotalTextView

        val sharedViewModel: OrderSharedViewModel = ViewModelProvider(requireActivity()).get(OrderSharedViewModel::class.java)

        viewModel.getTotal(sharedViewModel)
        viewModel.total.observe(viewLifecycleOwner) {orderTotal ->
            totalTextView.text = getString(R.string.total, orderTotal.toString())
        }

        return binding.root
    }
}