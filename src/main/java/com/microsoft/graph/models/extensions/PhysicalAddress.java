// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.PhysicalAddressType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Physical Address.
 */
public class PhysicalAddress implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The City.
     * The city.
     */
    @SerializedName(value = "city", alternate = {"City"})
    @Expose
    public String city;

    /**
     * The Country Or Region.
     * The country or region. It's a free-format string value, for example, 'United States'.
     */
    @SerializedName(value = "countryOrRegion", alternate = {"CountryOrRegion"})
    @Expose
    public String countryOrRegion;

    /**
     * The Postal Code.
     * The postal code.
     */
    @SerializedName(value = "postalCode", alternate = {"PostalCode"})
    @Expose
    public String postalCode;

    /**
     * The Post Office Box.
     * The post office box number.
     */
    @SerializedName(value = "postOfficeBox", alternate = {"PostOfficeBox"})
    @Expose
    public String postOfficeBox;

    /**
     * The State.
     * The state.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public String state;

    /**
     * The Street.
     * The street.
     */
    @SerializedName(value = "street", alternate = {"Street"})
    @Expose
    public String street;

    /**
     * The Type.
     * The type of address. Possible values are: unknown, home, business, other.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
    public PhysicalAddressType type;


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
