package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class Remark (
        @XmlElement var RemarkSequence: Int = 0,
        @XmlElement var RemarkQualifierGid: RemarkQualifierGid? = null,
        @XmlElement var RemarkText: String? = null,
)