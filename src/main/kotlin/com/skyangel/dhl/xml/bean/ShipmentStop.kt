package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class ShipmentStop (
        @XmlElement var StopSequence: Int = 0,
        @XmlElement var LocationRef: LocationRef? = null,
        @XmlElement var ArrivalTime: ArrivalTime? = null,
        @XmlElement var DepartureTime: DepartureTime? = null,
        @XmlElement var ShipmentStopDetail: List<ShipmentStopDetail>? = null,
        @XmlElement var StopType: String? = null,
)