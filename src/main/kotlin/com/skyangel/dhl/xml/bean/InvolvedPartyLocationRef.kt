package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class InvolvedPartyLocationRef (
    @XmlElement var LocationRef: LocationRef? = null,
)