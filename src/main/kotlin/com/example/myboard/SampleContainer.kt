package com.example.myboard

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleContainer {

    @GetMapping("/sample")
    fun sample(): String {
        return "sample"
    }

    @PostMapping("/sample")
    fun post(
        @RequestParam name: String,
        id: Long,
    ): String {
        return "post : $name"
    }
}
