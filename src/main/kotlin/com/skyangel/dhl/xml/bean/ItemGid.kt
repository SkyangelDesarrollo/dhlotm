package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class ItemGid (
    @XmlElement val Gid: Gid? = null,
)