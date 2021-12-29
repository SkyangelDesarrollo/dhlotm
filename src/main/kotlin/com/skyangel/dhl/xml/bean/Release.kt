package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class Release (
    @XmlElement var ReleaseGid: ReleaseGid? = null,
    @XmlElement var TransactionCode: String? = null,
    @XmlElement var TimeWindow: TimeWindow? = null,
    @XmlElement var ReleaseLine: ReleaseLine? = null,
)