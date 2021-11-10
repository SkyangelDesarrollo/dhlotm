package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class Shipment (
    @XmlElement var ShipmentHeader: ShipmentHeader? = null,
    @XmlElement var ShipmentHeader2: Any? = null,
    @XmlElement var ShipmentStop: List<ShipmentStop>? = null,
    @XmlElement var Location: List<Location>? = null,
    @XmlElement var ShipUnit: List<ShipUnit>? = null,
    @XmlElement var Release: List<Release>? = null,
    @XmlElement var PackagedItem: PackagedItem? = null,
)