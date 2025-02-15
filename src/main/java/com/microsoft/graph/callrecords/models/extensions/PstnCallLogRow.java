// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Pstn Call Log Row.
 */
public class PstnCallLogRow implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Callee Number.
     * 
     */
    @SerializedName(value = "calleeNumber", alternate = {"CalleeNumber"})
    @Expose
    public String calleeNumber;

    /**
     * The Caller Number.
     * 
     */
    @SerializedName(value = "callerNumber", alternate = {"CallerNumber"})
    @Expose
    public String callerNumber;

    /**
     * The Call Id.
     * 
     */
    @SerializedName(value = "callId", alternate = {"CallId"})
    @Expose
    public String callId;

    /**
     * The Call Type.
     * 
     */
    @SerializedName(value = "callType", alternate = {"CallType"})
    @Expose
    public String callType;

    /**
     * The Charge.
     * 
     */
    @SerializedName(value = "charge", alternate = {"Charge"})
    @Expose
    public java.math.BigDecimal charge;

    /**
     * The Conference Id.
     * 
     */
    @SerializedName(value = "conferenceId", alternate = {"ConferenceId"})
    @Expose
    public String conferenceId;

    /**
     * The Connection Charge.
     * 
     */
    @SerializedName(value = "connectionCharge", alternate = {"ConnectionCharge"})
    @Expose
    public java.math.BigDecimal connectionCharge;

    /**
     * The Currency.
     * 
     */
    @SerializedName(value = "currency", alternate = {"Currency"})
    @Expose
    public String currency;

    /**
     * The Destination Context.
     * 
     */
    @SerializedName(value = "destinationContext", alternate = {"DestinationContext"})
    @Expose
    public String destinationContext;

    /**
     * The Destination Name.
     * 
     */
    @SerializedName(value = "destinationName", alternate = {"DestinationName"})
    @Expose
    public String destinationName;

    /**
     * The Duration.
     * 
     */
    @SerializedName(value = "duration", alternate = {"Duration"})
    @Expose
    public Integer duration;

    /**
     * The End Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Id.
     * 
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
    public String id;

    /**
     * The Inventory Type.
     * 
     */
    @SerializedName(value = "inventoryType", alternate = {"InventoryType"})
    @Expose
    public String inventoryType;

    /**
     * The License Capability.
     * 
     */
    @SerializedName(value = "licenseCapability", alternate = {"LicenseCapability"})
    @Expose
    public String licenseCapability;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The Tenant Country Code.
     * 
     */
    @SerializedName(value = "tenantCountryCode", alternate = {"TenantCountryCode"})
    @Expose
    public String tenantCountryCode;

    /**
     * The Usage Country Code.
     * 
     */
    @SerializedName(value = "usageCountryCode", alternate = {"UsageCountryCode"})
    @Expose
    public String usageCountryCode;

    /**
     * The User Display Name.
     * 
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
    public String userDisplayName;

    /**
     * The User Id.
     * 
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
    public String userId;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;


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
