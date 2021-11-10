package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class CountryCode3Gid (
    @XmlElement var Gid: Gid? = null,
)