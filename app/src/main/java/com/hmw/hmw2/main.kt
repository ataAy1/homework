package com.hmw.hmw2

fun main() {
    val hesaplayici = homework2()

    // 1. İç açı hesapla
    println("İç açı: ${hesaplayici.icAciHesapla(6)}")

    // 2. Maaş hesapla
    println("Maaş: ${hesaplayici.maasHesapla(20)} TL")

    // 3. Otopark ücreti hesapla
    println("Otopark ücreti: ${hesaplayici.otoparkUcretiHesapla(5)} TL")

    // 4. Kilometreden mile çevir
    println("Kilometreden mile: ${hesaplayici.kmToMil(10.0)} mil")

    // 5. Dikdörtgenin alanını hesapla
    println("Dikdörtgen alanı: ${hesaplayici.alanHesapla(5.0, 10.0)} m²")

    // 6. Faktöriyel hesapla
    println("Faktöriyel: ${hesaplayici.faktoriyelHesapla(5)}")

    // 7. 'e' harfi sayısı
    println("'e' harfi sayısı: ${hesaplayici.eHarfiSayisi("merhaba dünya")}")
}
