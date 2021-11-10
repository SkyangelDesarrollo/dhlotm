package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class SendReason (
    @XmlElement var Remark: Remark? = null,
    @XmlElement var SendReasonGid: SendReasonGid? = null,
    @XmlElement var ObjectType: String? = null,
)