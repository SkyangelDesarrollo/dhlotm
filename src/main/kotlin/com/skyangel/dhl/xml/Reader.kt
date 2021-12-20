package com.skyangel.dhl.xml

import com.skyangel.dhl.xml.bean.Transmission
import jakarta.xml.bind.JAXBContext
import java.io.File

class Reader {
    companion object {
        @JvmStatic
        fun unmarshall(xmlFile: File): Transmission {
            val jaxbContext = JAXBContext.newInstance(Transmission::class.java)
            val unmarshaller = jaxbContext.createUnmarshaller()
            return unmarshaller.unmarshal(xmlFile) as Transmission
        }
    }
}
