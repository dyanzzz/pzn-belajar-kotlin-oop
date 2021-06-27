package app

import anotation.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validateRequest(request)

    val request2 = CreateCategoryRequest("1", "")
    validateRequest(request2)
}

fun validateRequest(request: Any) {
    val clazz = request::class
    // gagal karena import kotlin.reflect.full.memberProperties & .findAnnotation
    // atau kotlin.reflect.full tidak ada
    /*
    val properties = clazz.memberProperties

    // iterate satu satu, lalu cek kalo anotation @NotBlank
    for(property in properties){
        if (property.findAnnotation<NotBlank>() != null){
            val value = property.call(request)
            if("" == value){
                throw ValidationException("${property.name} is blank")
            }
        }
    }*/
}

