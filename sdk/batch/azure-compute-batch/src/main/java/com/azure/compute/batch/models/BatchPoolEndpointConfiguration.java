// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The endpoint configuration for a Pool.
 */
@Immutable
public final class BatchPoolEndpointConfiguration implements JsonSerializable<BatchPoolEndpointConfiguration> {

    /*
     * A list of inbound NAT Pools that can be used to address specific ports on an individual Compute Node externally. The maximum number of inbound NAT Pools per Batch Pool is 5. If the maximum number of inbound NAT Pools is exceeded the request fails with HTTP status code 400. This cannot be specified if the IPAddressProvisioningType is NoPublicIPAddresses.
     */
    @Generated
    private final List<InboundNatPool> inboundNatPools;

    /**
     * Creates an instance of BatchPoolEndpointConfiguration class.
     *
     * @param inboundNatPools the inboundNatPools value to set.
     */
    @Generated
    public BatchPoolEndpointConfiguration(List<InboundNatPool> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
    }

    /**
     * Get the inboundNatPools property: A list of inbound NAT Pools that can be used to address specific ports on an
     * individual Compute Node externally. The maximum number of inbound NAT Pools per Batch Pool is 5. If the maximum
     * number of inbound NAT Pools is exceeded the request fails with HTTP status code 400. This cannot be specified if
     * the IPAddressProvisioningType is NoPublicIPAddresses.
     *
     * @return the inboundNatPools value.
     */
    @Generated
    public List<InboundNatPool> getInboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("inboundNATPools", this.inboundNatPools,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchPoolEndpointConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchPoolEndpointConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchPoolEndpointConfiguration.
     */
    @Generated
    public static BatchPoolEndpointConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<InboundNatPool> inboundNatPools = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("inboundNATPools".equals(fieldName)) {
                    inboundNatPools = reader.readArray(reader1 -> InboundNatPool.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new BatchPoolEndpointConfiguration(inboundNatPools);
        });
    }
}
