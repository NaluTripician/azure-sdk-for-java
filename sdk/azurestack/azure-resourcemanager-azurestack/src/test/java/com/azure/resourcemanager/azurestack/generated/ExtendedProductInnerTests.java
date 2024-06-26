// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestack.fluent.models.ExtendedProductInner;

public final class ExtendedProductInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExtendedProductInner model =
            BinaryData
                .fromString(
                    "{\"galleryPackageBlobSasUri\":\"zzvdudgwds\",\"productKind\":\"hotwmcynpwlbjnp\",\"properties\":{\"version\":\"wey\",\"osDiskImage\":{\"operatingSystem\":\"Linux\",\"sourceBlobSasUri\":\"uesnzwdejbavo\"},\"dataDiskImages\":[{\"lun\":1432436623,\"sourceBlobSasUri\":\"hctbqvudwxdn\"},{\"lun\":378897714,\"sourceBlobSasUri\":\"w\"},{\"lun\":1798708201,\"sourceBlobSasUri\":\"ugw\"}],\"computeRole\":\"None\",\"isSystemExtension\":true,\"sourceBlob\":{\"uri\":\"lazjdyggdtjixhbk\"},\"supportMultipleExtensions\":true,\"vmOsType\":\"Windows\",\"vmScaleSetEnabled\":false}}")
                .toObject(ExtendedProductInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExtendedProductInner model = new ExtendedProductInner();
        model = BinaryData.fromObject(model).toObject(ExtendedProductInner.class);
    }
}
