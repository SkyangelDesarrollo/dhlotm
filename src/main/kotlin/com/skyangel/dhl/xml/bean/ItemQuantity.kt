package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class ItemQuantity (
        @XmlElement var PackagedItemCount: Int = 0,
)