package com.skyangel.dhl.xml

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.skyangel.dhl.xml.bean.Transmission
import jakarta.xml.bind.JAXBContext
import java.io.File
import java.lang.reflect.Type

fun main(args: Array<String>) {
    val gson = Gson()
    val xmlFile = File("src/main/resources/items.xml")
    val transmission = Reader.unmarshall(xmlFile) /** Objeto leído con éxito */
    //val tType = object : TypeToken<Transmission>() {}.type
    //println(gson.toJson(transmission, tType))  // Probar algo diferente a gson o buscar la relación circular en el XML
}

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
