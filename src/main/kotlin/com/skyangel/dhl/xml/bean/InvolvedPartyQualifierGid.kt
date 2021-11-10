package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class InvolvedPartyQualifierGid (
    @XmlElement var Gid: Gid? = null,
)