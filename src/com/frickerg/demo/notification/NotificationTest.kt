package com.frickerg.demo.notification

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.*

class NotificationTest {
    private var notification: Notification? = null
    @Before
    @Throws(Exception::class)
    fun setUp() {
        notification = Notification("message", Date())
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
    }

    @get:Test
    val message: Unit
        get() {
            Assert.assertEquals("message", notification!!.message)
        }

    @Test
    fun setMessage() {
        val changeString = "new_message"
        notification!!.message = changeString
        println(notification!!.message)
        Assert.assertEquals(changeString, notification!!.message)
    }

    @get:Test
    val timestamp: Unit
        get() {}

    @Test
    fun setTimestamp() {
    }

    @Test
    fun testToString() {
    }

    @Test
    fun testEquals() {
    }

    @Test
    fun testHashCode() {
    }
}