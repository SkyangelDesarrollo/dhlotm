package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class Location (
    @XmlElement var TransactionCode: String? = null,
    @XmlElement var LocationGid: LocationGid? = null,
    @XmlElement var LocationName: String? = null,
    @XmlElement var Address: Address? = null,
)