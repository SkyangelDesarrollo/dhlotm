package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class ShipmentStopDetail (
    @XmlElement var Activity: String? = null,
    @XmlElement var ShipUnitGid: ShipUnitGid? = null,
)