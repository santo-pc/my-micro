package org.buenosairespeeps.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {
    @GetMapping("/")
    fun index(): String {
        return "Greetings from Spring Boot!"
    }


    @GetMapping("/users")
    fun getUsers(): List<User> {
        val users = mutableListOf<User>()

        for (i in 1..3) {
            users.add(User("Papito $i"))
        }

        return users
    }
}

data class User(val name: String)
