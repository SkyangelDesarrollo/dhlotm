package com.skyangel.dhl.xml

import org.junit.Test
import java.io.File
import kotlin.test.assertNotNull

class ReaderTest {
    @Test
    fun read() {
        val xmlFile = File("src/test/resources/items.xml")
        val transmission = Reader.unmarshall(xmlFile)
        assertNotNull(transmission)
    }
}