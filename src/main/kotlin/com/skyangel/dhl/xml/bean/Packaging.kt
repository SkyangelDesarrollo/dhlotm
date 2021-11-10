package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class Packaging (
    @XmlElement var PackagedItemGid: PackagedItemGid? = null,
)