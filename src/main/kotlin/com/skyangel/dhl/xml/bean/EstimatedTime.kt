package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class EstimatedTime (
        @XmlElement var GLogDate: Double = 0.0,
)