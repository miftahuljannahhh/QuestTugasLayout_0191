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

@Composable
fun HalamanUtama() {
    val daftar = listOf(
        Idol(
            nama = R.string.nama_1,
            telepon = null,
            alamat = R.string.alamat_1,
            warnaCard = R.color.card_1,
            fotoKanan = R.drawable.jin,
            descFoto = R.string.desc_foto_1,
            fontNama = FontFamily.Cursive
        ),
        Idol(
            nama = R.string.nama_2,
            telepon = R.string.telp_2,
            alamat = R.string.alamat_2,
            warnaCard = R.color.card_2,
            fotoKanan = R.drawable.wonwoo,
            descFoto = R.string.desc_foto_2
        ),
        Idol(
            nama = R.string.nama_3,
            telepon = R.string.telp_3,
            alamat = R.string.alamat_3,
            warnaCard = R.color.card_3,
            fotoKanan = R.drawable.haechan,
            descFoto = R.string.desc_foto_3
        ),

    )
}

