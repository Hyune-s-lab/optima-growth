package com.optimagrowth.licensingservice.domain

import org.springframework.stereotype.Service
import java.util.*

@Service
class LicenseService {
    fun getLicense(licenseId: String, organizationId: String): License {
        return License(
            Random().nextInt(1000),
            licenseId,
            organizationId,
            "Software product",
            "Ostock",
            "full"
        )
    }

    fun createLicense(license: License?, newOrganizationId: String): String? {
        return license?.run {
            organizationId = newOrganizationId
            "This is the post and the object is: $license"
        }
    }

    fun updateLicense(license: License?, newOrganizationId: String): String? {
        return license?.run {
            organizationId = newOrganizationId
            "This is the put and the object is: $license"
        }
    }

    fun deleteLicense(licenseId: String?, organizationId: String?): String? {
        return "Deleting license with id $licenseId for the organization $organizationId"
    }
}
