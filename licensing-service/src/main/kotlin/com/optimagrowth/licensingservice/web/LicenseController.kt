package com.optimagrowth.licensingservice.web

import com.optimagrowth.licensingservice.domain.License
import com.optimagrowth.licensingservice.domain.LicenseService
import org.springframework.web.bind.annotation.*

@RestController
class LicenseController(val licenseService: LicenseService) {

    @GetMapping("v1/organization/{organizationId}/license/{licenseId}")
    fun getLicense(
        @PathVariable organizationId: String,
        @PathVariable licenseId: String
    ): License {
        return licenseService.getLicense(licenseId, organizationId)
    }

    @PutMapping("v1/organization/{organizationId}/license")
    fun updateLicense(
        @PathVariable organizationId: String,
        @RequestBody request: License
    ): String? {
        return licenseService.updateLicense(request, organizationId)
    }

    @PostMapping("v1/organization/{organizationId}/license")
    fun createLicense(
        @PathVariable organizationId: String,
        @RequestBody request: License
    ): String? {
        return licenseService.createLicense(request, organizationId)
    }

    @DeleteMapping("v1/organization/{organizationId}/license/{licenseId}")
    fun deleteLicense(
        @PathVariable organizationId: String,
        @PathVariable licenseId: String
    ): String? {
        return licenseService.deleteLicense(licenseId, organizationId)
    }
}
