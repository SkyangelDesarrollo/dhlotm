package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.XmlAccessType
import jakarta.xml.bind.annotation.XmlAccessorType
import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class GLogXMLElement (
    @XmlElement var TransactionHeader: TransactionHeader? = null,
    @XmlElement var PlannedShipment: PlannedShipment? = null,
)