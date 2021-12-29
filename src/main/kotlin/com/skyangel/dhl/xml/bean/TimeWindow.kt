package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.XmlElement

data class TimeWindow(
    @XmlElement var LateDeliveryDt: LateDeliveryDt? = null,
    @XmlElement var DeliveryIsAppt: String? = null
)
