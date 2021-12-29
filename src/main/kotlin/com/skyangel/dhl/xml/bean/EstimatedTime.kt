package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class EstimatedTime (
        @XmlElement var GLogDate: Double? = null,
        @XmlElement var TZId: String? = null,
        @XmlElement var TZOffset: String? = null
)