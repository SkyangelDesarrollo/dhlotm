package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlRootElement(name="Transmission",namespace="")
@XmlAccessorType(XmlAccessType.FIELD)
data class Transmission (
    @XmlElement var TransmissionHeader: Any? = null,
    @XmlElement var TransmissionBody: TransmissionBody? = null,
)