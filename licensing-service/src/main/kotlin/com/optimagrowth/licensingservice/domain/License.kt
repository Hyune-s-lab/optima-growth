package com.optimagrowth.licensingservice.domain

data class License(
    val id: Int,
    val licenseId: String,
    val description: String,
    var organizationId: String,
    val productName: String,
    val licenseType: String
)
