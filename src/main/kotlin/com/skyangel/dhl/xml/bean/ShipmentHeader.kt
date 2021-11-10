package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class ShipmentHeader (
        @XmlElement var ShipmentGid: ShipmentGid? = null,
        @XmlElement var ShipmentRefnum: List<ShipmentRefnum>? = null,
        @XmlElement var TransactionCode: String? = null,
        @XmlElement var InternalShipmentStatus: List<InternalShipmentStatus>? = null,
        @XmlElement var ServiceProviderGid: ServiceProviderGid? = null,
        @XmlElement var InvolvedParty: List<InvolvedParty>? = null,
        @XmlElement var StopCount: Int = 0,
        @XmlElement var NumOrderReleases: Int = 0,
        @XmlElement var SourceLocationRef: SourceLocationRef? = null,
)