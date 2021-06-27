package anotation
@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

class ExampleTarget(
    // default anotation spring secara default menempatkan anotationnya pada parameter propertiesnya
    // dengan menambahkan @Beta val firstName: String
    // namun bisa diubah ke masing-masing untuk menyesuaikan dengan kebutuhannya
        // biasanya disesuaikan dengan kebutuhan ketika menggunakan framework java
    // anotation diubah menjadi
    // @field:Beta untuk menempatkan anotation pada field/properties/attribute
    // @get:Beta untuk menempatkan anotation pada getter
    // @param:Beta untuk menempatkan anotation pada propertiesnya seperti default
    @field:Beta val firstName: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String
)