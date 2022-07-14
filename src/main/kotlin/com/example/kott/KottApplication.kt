package com.example.kott

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KottApplication

fun main(args: Array<String>) {
    runApplication<KottApplication>(*args)
}
