package com.hmw.hmw2

class homework2 {

    // 1. Kenar sayısına göre iç açıyı hesapla
    fun icAciHesapla(kenarSayisi: Int): Double {
        return ((kenarSayisi - 2) * 180.0) / kenarSayisi
    }

    // 2. Gün sayısına göre maaşı hesapla
    fun maasHesapla(gunSayisi: Int): Int {
        val toplamSaat = gunSayisi * 8
        val mesaiSaat = if (toplamSaat > 150) toplamSaat - 150 else 0
        val normalSaat = toplamSaat - mesaiSaat
        return (normalSaat * 40) + (mesaiSaat * 80)
    }

    // 3. Otopark ücreti hesapla
    fun otoparkUcretiHesapla(saat: Int): Int {
        return if (saat <= 1) 50 else 50 + (saat - 1) * 10
    }

    // 4. Kilometreyi mile çevir
    fun kmToMil(km: Double): Double {
        return km * 0.621
    }

    // 5. Dikdörtgenin alanını hesapla
    fun alanHesapla(genislik: Double, yukseklik: Double): Double {
        return genislik * yukseklik
    }

    // 6. Faktöriyel hesapla
    fun faktoriyelHesapla(sayi: Int): Long {
        return if (sayi == 0 || sayi == 1) 1 else sayi * faktoriyelHesapla(sayi - 1)
    }

    // 7. Kelimede kaç tane 'e' harfi var
    fun eHarfiSayisi(kelime: String): Int {
        return kelime.count { it == 'e' || it == 'E' }
    }
}