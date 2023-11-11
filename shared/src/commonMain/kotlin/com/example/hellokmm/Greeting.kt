package com.example.hellokmm

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    private val daysPhrase = "There are only ${daysUntilNewYear()} days left until New Year! 🎆"

    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "Hi!" else "Hello!")
        add( "Hello, ${platform.name}!")
        add("Hello, My Name is Akbar")
        add(daysPhrase)
    }
}