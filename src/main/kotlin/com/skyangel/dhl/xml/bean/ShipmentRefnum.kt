package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class ShipmentRefnum (
    @XmlElement var ShipmentRefnumQualifierGid: ShipmentRefnumQualifierGid? = null,
    @XmlElement var ShipmentRefnumValue: String? = null,
)