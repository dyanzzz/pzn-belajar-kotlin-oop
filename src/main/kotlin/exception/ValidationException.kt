package exception

// implement exception, dengan menampilkan message yg dicustom
class ValidationException(message: String): Throwable(message)