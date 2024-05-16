// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

/**
 * Samples for FhirServices Delete.
 */
public final class FhirServicesDeleteSamples {
    /*
     * x-ms-original-file: specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2024-03-31/examples/fhirservices/FhirServices_Delete.json
     */
    /**
     * Sample code: Delete a Fhir Service.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void deleteAFhirService(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.fhirServices().delete("testRG", "fhirservice1", "workspace1", com.azure.core.util.Context.NONE);
    }
}
