package br.com.lymtec.treinamar.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Treinamentos para Profissionais do MAR"
    }
    val text: LiveData<String> = _text
}