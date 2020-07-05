package br.com.lymtec.treinamar.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Vídeos de Treinamentos"
    }
    val text: LiveData<String> = _text
}