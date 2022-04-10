package com.kotlin.kotlin.controller

import com.kotlin.kotlin.dto.SignupDto
import com.kotlin.kotlin.dto.SignupResponseDto
import com.kotlin.kotlin.model.User
import com.kotlin.kotlin.repository.UserRepository

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController (
    private val userRepository: UserRepository
) {
    @GetMapping("/ind")
    fun index(): String = ("index")

    @PostMapping("/signup")
    fun signup(@RequestBody data: SignupDto): SignupResponseDto {
        val user: User = User(
            email = data.email,
            password = data.password,
        )
        userRepository.save(user)
        return SignupResponseDto(data.email, data.password)
    }
}