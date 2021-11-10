package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class Gid (
    @XmlElement var Xid: String? = null,
    @XmlElement var DomainName: String? = null,
)