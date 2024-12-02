package com.es.jwtSecurityKotlin.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/secretos_extra_confidenciales")
class RecursosExtraConfidencialesController {

    @PostMapping("/ficha1")
    fun getSecretoExtraConfidencialUno(): String {
        return "Josema usó ChatGPT para aprender a leer."
    }
}