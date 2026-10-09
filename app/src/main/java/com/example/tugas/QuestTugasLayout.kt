package com.example.tugas

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.text.font.FontFamily

data class Idol(
    @StringRes val nama: Int,
    @StringRes val telepon: Int?,
    @StringRes val alamat: Int,
    @ColorRes val warnaCard: Int,
    @DrawableRes val fotoKanan: Int,
    @StringRes val descFoto: Int,
    val fontNama: FontFamily = FontFamily.Default
)

