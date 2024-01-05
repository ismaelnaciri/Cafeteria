package cat.insvidreres.inf.cafeteria.afterVerification.payFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PayViewModel : ViewModel() {

    private val _total = MutableLiveData<Double>()
    val total: LiveData<Double> = _total

    fun getTotal(orderSharedViewModel: OrderSharedViewModel) {
        orderSharedViewModel.calculateTotal()

        _total.value = orderSharedViewModel.total
    }
}