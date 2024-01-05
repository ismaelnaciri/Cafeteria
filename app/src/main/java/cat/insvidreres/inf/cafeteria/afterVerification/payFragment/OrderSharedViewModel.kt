package cat.insvidreres.inf.cafeteria.afterVerification.payFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cat.insvidreres.inf.cafeteria.afterVerification.drinkFragment.Drink
import cat.insvidreres.inf.cafeteria.afterVerification.mealFragment.Meal

class OrderSharedViewModel : ViewModel() {
    var customerOrder = mutableListOf<Any>()
    var total: Double = 0.0

    val _order = MutableLiveData<List<Any>>()
    val order: LiveData<List<Any>> = _order

    fun getOrder() {
        _order.value = customerOrder
    }

    fun addElementToOrder(element: Any) {
        customerOrder.add(element)
    }

    fun calculateTotal() {
        total = 0.0

        for (element: Any in customerOrder) {
            if (element is Meal)
                total += element.price
            else if (element is Drink)
                total += element.price
        }
    }

}