package com.lepffm.ijhttpcliexample

import org.springframework.web.bind.annotation.*

@RestController
class SecondController {

    @GetMapping("/second/{name}")
    fun index(@PathVariable("name") name:String): String = "get ${name}"
    @PostMapping("/second/{name}")
    fun post(@PathVariable("name") name:String): String = "post ${name}" 
}
