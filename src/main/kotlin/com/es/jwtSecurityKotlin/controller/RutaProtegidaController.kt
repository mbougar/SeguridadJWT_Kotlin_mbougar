package com.es.jwtSecurityKotlin.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rutas_protegidas")
class RutaProtegidaController {


    @GetMapping("/recurso1")
    fun getRecursoProtegidoUno () : String {
        return "Este recurso sólo puede ser accedido por usuarios registrados en la BDD \uD83E\uDD75"
    }

    @PostMapping("/recurso2")
    fun crearRecursoProtegidoDos(): String {
        return """
  .---------.
  |.-------.|
  ||>run#  ||
  ||       ||
  |"-------'|etf
.-^---------^-.
| ---~   AMiGA|
"-------------'
        """.trimIndent()
    }

    @PostMapping("/recurso3")
    fun crearRecursoProtegidoTres(): String {
        return "Este recurso es el tercero"
    }

    @GetMapping("/recurso/{id}")
    fun getRecursoById(@PathVariable id: String): String {
        return "La id es: $id"
    }

    @DeleteMapping("/recurso/{id}")
    fun deleteRecursoById(@PathVariable id: String): String {
        return "La id es ha eliminar es: $id"
    }
}