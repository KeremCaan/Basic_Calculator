import java.util.Scanner

fun main(args: Array<String>) {
val x = Scanner(System.`in`)
    println("Toplama (1)")
    println("Çıkarma (2)")
    println("Çarpma (3)")
    println("Bölme (4)")

    var işlem = x.nextInt()
    println("Birinci sayıyı girin: ")
    var sayi1 = x.nextInt()
    println("İkinci sayıyı girin: ")
    var sayi2 = x.nextInt()
    when (işlem) {
        1 -> println("Sonuç: ${sayi1+sayi2}")
        2 -> println("Sonuç: ${sayi1-sayi2}")
        3 -> println("Sonuç: ${sayi1*sayi2}")
        4 -> println("Sonuç: ${sayi1/sayi2}")
        else -> println("Bu işlem yapılamaz. Lütfen geçerli bir işlem kodu girin.")
    }
}
