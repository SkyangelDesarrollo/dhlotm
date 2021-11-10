package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.XmlAccessType
import jakarta.xml.bind.annotation.XmlAccessorType
import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class TransactionHeader (
        @XmlElement var SenderTransactionId: Int = 0,
        @XmlElement var SendReason: SendReason? = null,
)