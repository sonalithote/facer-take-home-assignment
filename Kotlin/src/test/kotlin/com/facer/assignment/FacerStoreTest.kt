package com.facer.assignment

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FacerStoreTest {

    @Test
    fun foo() {
        val items = listOf(Item("foo", 0, 0))
        val app = FacerStore(items)
        app.updateQuality()
        assertEquals("fixme", app.items[0].name)

    }

}


