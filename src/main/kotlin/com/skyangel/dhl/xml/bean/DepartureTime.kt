package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class DepartureTime (
    @XmlElement var EventTime: EventTime? = null,
)