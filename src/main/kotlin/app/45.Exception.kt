package app

import exception.ValidationException

fun main() {
    try {
        validateAndSayHello("budi")
        validateAndSayHello("")
    } catch (error: ValidationException){
        // jika terjadi error seperti ini, program akan berhenti di sini, dan melanjutkan statement lainnya
            // tanpa force close/ crash programnya
        println("Error : ${error.message}")
    }catch (error: Throwable){
        println("Error Throwable : ${error.message}")
    }finally {
        // finnaly akan selalu di eksekusi ketika berhasil ataupun gagal
        // contoh : nutup koneksi ke database
            // ketika berhasil/ gagal, harus ditutup biar engga bengkak koneksinya
        println("finaly printed")
    }
}

fun validateAndSayHello(name: String){
    when {
        name.isBlank() -> {
            // menggunakan exception dengan keyword throw
            // dan panggil class exceptionnya dengan descriptionnya
            // error seperti ini akan menjadi error, dan aplikasi tertutup crash/ force close
            // handlenya dengan menggunakan try catch
            throw ValidationException("Name is blank")
        }
        name.isNullOrEmpty() -> {
            throw ValidationException("Name is null or empty")
        }
        else -> {
            println("Hello $name")
        }
    }
}

