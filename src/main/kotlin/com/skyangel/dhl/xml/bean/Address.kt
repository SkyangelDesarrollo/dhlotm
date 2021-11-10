package com.skyangel.dhl.xml.bean

import jakarta.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
data class Address (
        @XmlElement var ProvinceCode: String? = null,
        @XmlElement var PostalCode: Int = 0,
        @XmlElement var CountryCode3Gid: CountryCode3Gid? = null,
        @XmlElement var Latitude: Double = 0.0,
        @XmlElement var Longitude: Double = 0.0,
)
