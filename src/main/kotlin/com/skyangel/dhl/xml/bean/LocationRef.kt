package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class LocationRef (
    @XmlElement var LocationGid: LocationGid? = null,
)