package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class ArrivalTime (
    @XmlElement var EventTime: EventTime? = null,
)