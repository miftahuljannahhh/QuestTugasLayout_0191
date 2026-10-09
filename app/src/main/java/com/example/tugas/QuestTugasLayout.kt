package com.example.tugas

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
        Idol(
            nama = R.string.nama_4,
            telepon = R.string.telp_4,
            alamat = R.string.alamat_4,
            warnaCard = R.color.card_4,
            fotoKanan = R.drawable.seonghyeon,
            descFoto = R.string.desc_foto_4
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.padding_layar)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(dimensionResource(R.dimen.jarak_atas)))
        Text(
            text = stringResource(R.string.judul),
            fontSize = spResource(R.dimen.ukuran_judul),
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.teks_utama),
            textAlign = TextAlign.Center
        )
        Text(
            text = stringResource(R.string.subjudul),
            fontSize = spResource(R.dimen.ukuran_subjudul),
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.teks_utama),
            textAlign = TextAlign.Center
        )
        Spacer(Modifier.height(dimensionResource(R.dimen.jarak_judul_card)))

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.jarak_antar_card))
        ) {
            daftar.forEach { CardIdol(it) }
        }

        Text(
            text = stringResource(R.string.copyright),
            fontSize = spResource(R.dimen.ukuran_copyright),
            color = colorResource(R.color.teks_utama)
        )
    }
}

@Composable
fun CardIdol(data: Idol) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(dimensionResource(R.dimen.radius_card)),
        colors = CardDefaults.cardColors(containerColor = colorResource(data.warnaCard))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_card)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            GambarCard(R.drawable.kucing, R.string.desc_kucing)

        }
    }
}







