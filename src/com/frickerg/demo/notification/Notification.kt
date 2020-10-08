package com.frickerg.demo.notification

import java.util.*

class Notification {
    var message: String? = null
    var timestamp: Date? = null

    constructor() {
        // do nothing
    }

    constructor(message: String?, timestamp: Date?) {
        this.message = message
        this.timestamp = timestamp
        println("generated notification: $this")
        showText("asdf", "ghjkl")
    }

    private fun showText(string1: String, string2: String) {
        println(string1)
        println(string2)
    }

    override fun toString(): String {
        return "Notification{message='$message', timestamp=$timestamp}"
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val that = o as Notification
        return message == that.message && timestamp == that.timestamp
    }

    override fun hashCode(): Int {
        return Objects.hash(message, timestamp)
    }
}