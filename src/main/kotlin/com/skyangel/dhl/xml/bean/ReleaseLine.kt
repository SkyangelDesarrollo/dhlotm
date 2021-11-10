package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class ReleaseLine (
    @XmlElement var ReleaseLineGid: ReleaseLineGid? = null,
    @XmlElement var ItemQuantity: ItemQuantity? = null,
)