package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class TransmissionBody (
    @XmlElement var GLogXMLElement: GLogXMLElement? = null,
)