package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.XmlAccessType
import jakarta.xml.bind.annotation.XmlAccessorType
import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class PlannedShipment (
    @XmlElement var Shipment: Shipment? = null,
)