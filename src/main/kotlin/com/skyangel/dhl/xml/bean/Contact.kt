package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class Contact (
    @XmlElement var ContactGid: ContactGid? = null,
    @XmlElement var FirstName: String? = null,
    @XmlElement var LastName: String? = null,
)