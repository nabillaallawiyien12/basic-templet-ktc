fun main(args: Array<String>){

    val nama = "Nabilla Allawiyien Putri"
    val usia = 21
    val alamat = "Ngawi"

    val template = """
    nama: $nama
    usia: $usia tahun
    alamat: $alamat

    nabilla 5 tahun lagi akan berusia ${usia + 26} tahun
    """
    println(template)


}