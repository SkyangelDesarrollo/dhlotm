package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class ContactRef (
    @XmlElement var Contact: Contact? = null,
)