package com.lepffm.ijhttpcliexample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody

@RestController
class MessageController {

    @GetMapping("/message")
    fun index(): List<Message> = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
    )
    @PostMapping("/message")
    fun post(@RequestBody msg: Message): List<Message> = listOf(
        msg, Message("post","worked")
    )
}
data class Message(val id: String?, val text: String)