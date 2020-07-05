package br.com.lymtec.treinamar.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Galeria de Fotos de Equipamentos"
    }
    val text: LiveData<String> = _text
}