package com.unlistedi.overviewanime

data class Anime (
    var id : Int,
    var judul : String,
    var artist : String,
    var urlFoto : String,
    var deskripsi : String,
    var deskripsiKecil : String,
    var statusSerial :  String,
    var statusManga :  String,
    var genre : Array<String>,
    var summary : Array<String>
)