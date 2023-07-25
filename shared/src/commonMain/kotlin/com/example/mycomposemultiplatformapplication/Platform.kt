package com.example.mycomposemultiplatformapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform