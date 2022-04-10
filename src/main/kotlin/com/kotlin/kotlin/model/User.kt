package com.kotlin.kotlin.model

import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import javax.persistence.*

@NoArgsConstructor
@AllArgsConstructor
@Entity
class User (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(nullable = false)
    var email: String,

    @Column(nullable = false)
    var password: String,
)
