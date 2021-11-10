package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class ShipUnitContent (
        @XmlElement var PackagedItemRef: PackagedItemRef? = null,
        @XmlElement var LineNumber: Int = 0,
        @XmlElement var ItemQuantity: ItemQuantity? = null,
        @XmlElement var PackagedItemSpecCount: Int = 0,
        @XmlElement var TransOrderGid: TransOrderGid? = null,
)