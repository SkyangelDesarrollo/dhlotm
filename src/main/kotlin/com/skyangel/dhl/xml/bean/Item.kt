package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class Item (
    @XmlElement var TransactionCode: String? = null,
    @XmlElement var ItemGid: ItemGid? = null,
)