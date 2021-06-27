package data

import anotation.NotBlank

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long   // notBlank hanya dibuat untuk string, jadi meskipun diberikan anotation notBlank, tidak berfungsi
)

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String
)
