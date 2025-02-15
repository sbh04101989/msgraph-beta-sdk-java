// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.IdentityUserFlowAttributeDataType;
import com.microsoft.graph.models.generated.IdentityUserFlowAttributeType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Attribute.
 */
public class IdentityUserFlowAttribute extends Entity implements IJsonBackedObject {


    /**
     * The Data Type.
     * The data type of the user flow attribute. This cannot be modified after the custom user flow attribute is created. The supported values for dataType are:string - denotes that the dataType for the identityUserFlowAttribute is a string. boolean - denotes that the dataType for the identityUserFlowAttribute is a Boolean.int64 - denotes that the dataType for the identityUserFlowAttribute is an integer.
     */
    @SerializedName(value = "dataType", alternate = {"DataType"})
    @Expose
    public IdentityUserFlowAttributeDataType dataType;

    /**
     * The Description.
     * The description of the user flow attribute that's shown to the user at the time of sign-up.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * The display name of the user flow attribute.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The User Flow Attribute Type.
     * The type of the user flow attribute. This is a read-only attribute that is automatically set. Depending on the type of attribute, the values for this property will be builtIn or custom.
     */
    @SerializedName(value = "userFlowAttributeType", alternate = {"UserFlowAttributeType"})
    @Expose
    public IdentityUserFlowAttributeType userFlowAttributeType;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
