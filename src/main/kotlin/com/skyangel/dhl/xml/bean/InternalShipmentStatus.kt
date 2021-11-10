package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class InternalShipmentStatus (
    @XmlElement var StatusTypeGid: StatusTypeGid? = null,
    @XmlElement var StatusValueGid: StatusValueGid? = null,
)