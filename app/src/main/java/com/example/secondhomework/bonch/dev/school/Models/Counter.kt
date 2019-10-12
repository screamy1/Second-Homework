package com.example.secondhomework.bonch.dev.school.Models

class Counter(startCount: Int = 0) {

    var currentCount = startCount
        private set

    fun increment() {
        ++currentCount
    }

}