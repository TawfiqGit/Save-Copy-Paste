package com.tawfiqdev.save_copy_paste

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform