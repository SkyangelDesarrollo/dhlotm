package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class SourceLocationRef (
    @XmlElement var LocationRef: LocationRef? = null,
)