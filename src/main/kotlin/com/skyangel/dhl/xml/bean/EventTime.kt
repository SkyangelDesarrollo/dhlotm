package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class EventTime (
    @XmlElement var EstimatedTime: EstimatedTime? = null,
)