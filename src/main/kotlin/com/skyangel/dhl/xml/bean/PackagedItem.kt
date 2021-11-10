package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class PackagedItem (
    @XmlElement var Packaging: Packaging? = null,
    @XmlElement var Item: Item? = null,
)