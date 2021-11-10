package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class InvolvedParty (
    @XmlElement var InvolvedPartyQualifierGid: InvolvedPartyQualifierGid? = null,
    @XmlElement var InvolvedPartyLocationRef: InvolvedPartyLocationRef? = null,
    @XmlElement var ContactRef: ContactRef? = null,
)