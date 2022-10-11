package com.example.ej1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Persona(val name: String, val tel: String, val email: String, val pic: Int) : Parcelable