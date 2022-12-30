package com.alpstein.firstkmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform