// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Account details of the data to be transferred. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "dataAccountType",
    defaultImpl = DataAccountDetails.class)
@JsonTypeName("DataAccountDetails")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ManagedDisk", value = ManagedDiskDetails.class),
    @JsonSubTypes.Type(name = "StorageAccount", value = StorageAccountDetails.class)
})
@Fluent
public class DataAccountDetails {
    /*
     * Password for all the shares to be created on the device. Should not be passed for TransferType:ExportFromAzure
     * jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call.
     * Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at
     * least one uppercase alphabet, one number and one special character. Password cannot have the following
     * characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     */
    @JsonProperty(value = "sharePassword")
    private String sharePassword;

    /** Creates an instance of DataAccountDetails class. */
    public DataAccountDetails() {
    }

    /**
     * Get the sharePassword property: Password for all the shares to be created on the device. Should not be passed for
     * TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will
     * not be returned in Get Call. Password Requirements : Password must be minimum of 12 and maximum of 64 characters.
     * Password must have at least one uppercase alphabet, one number and one special character. Password cannot have
     * the following characters : IilLoO0 Password can have only alphabets, numbers and these characters
     * : @#\-$%^!+=;:_()]+.
     *
     * @return the sharePassword value.
     */
    public String sharePassword() {
        return this.sharePassword;
    }

    /**
     * Set the sharePassword property: Password for all the shares to be created on the device. Should not be passed for
     * TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will
     * not be returned in Get Call. Password Requirements : Password must be minimum of 12 and maximum of 64 characters.
     * Password must have at least one uppercase alphabet, one number and one special character. Password cannot have
     * the following characters : IilLoO0 Password can have only alphabets, numbers and these characters
     * : @#\-$%^!+=;:_()]+.
     *
     * @param sharePassword the sharePassword value to set.
     * @return the DataAccountDetails object itself.
     */
    public DataAccountDetails withSharePassword(String sharePassword) {
        this.sharePassword = sharePassword;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
