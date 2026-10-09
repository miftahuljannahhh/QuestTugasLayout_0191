package com.example.tugas

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit

data class Idol(
    @StringRes val nama: Int,
    @StringRes val telepon: Int?,
    @StringRes val alamat: Int,
    @ColorRes val warnaCard: Int,
    @DrawableRes val fotoKanan: Int,
    @StringRes val descFoto: Int,
    val fontNama: FontFamily = FontFamily.Default
)

@Composable
fun spResource(id: Int): TextUnit {
    val dp = dimensionResource(id)
    return with(LocalDensity.current) { dp.toSp() }
}
