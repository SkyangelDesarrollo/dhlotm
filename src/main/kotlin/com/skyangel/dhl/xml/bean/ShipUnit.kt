package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class ShipUnit (
        @XmlElement var ShipUnitGid: ShipUnitGid? = null,
        @XmlElement var ShipUnitContent: ShipUnitContent? = null,
        @XmlElement var ShipUnitCount: Int = 0,
)