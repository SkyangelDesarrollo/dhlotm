package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class RemarkQualifierGid (
    @XmlElement var Gid: Gid? = null,
)