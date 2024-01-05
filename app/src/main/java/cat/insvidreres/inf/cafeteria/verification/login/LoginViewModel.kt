package cat.insvidreres.inf.cafeteria.verification.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _login = MutableLiveData<List<LoginModel>>()
    val login: LiveData<List<LoginModel>> = _login

    fun getLogins() {
        _login.value = LoginProvider.loadLogins()
    }
}