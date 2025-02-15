// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Yammer Device Usage User Detail.
 */
public class YammerDeviceUsageUserDetail extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Last Activity Date.
     * 
     */
    @SerializedName(value = "lastActivityDate", alternate = {"LastActivityDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly lastActivityDate;

    /**
     * The Report Period.
     * 
     */
    @SerializedName(value = "reportPeriod", alternate = {"ReportPeriod"})
    @Expose
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName(value = "reportRefreshDate", alternate = {"ReportRefreshDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The State Change Date.
     * 
     */
    @SerializedName(value = "stateChangeDate", alternate = {"StateChangeDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly stateChangeDate;

    /**
     * The Used Android Phone.
     * 
     */
    @SerializedName(value = "usedAndroidPhone", alternate = {"UsedAndroidPhone"})
    @Expose
    public Boolean usedAndroidPhone;

    /**
     * The Usedi Pad.
     * 
     */
    @SerializedName(value = "usediPad", alternate = {"UsediPad"})
    @Expose
    public Boolean usediPad;

    /**
     * The Usedi Phone.
     * 
     */
    @SerializedName(value = "usediPhone", alternate = {"UsediPhone"})
    @Expose
    public Boolean usediPhone;

    /**
     * The Used Others.
     * 
     */
    @SerializedName(value = "usedOthers", alternate = {"UsedOthers"})
    @Expose
    public Boolean usedOthers;

    /**
     * The Used Web.
     * 
     */
    @SerializedName(value = "usedWeb", alternate = {"UsedWeb"})
    @Expose
    public Boolean usedWeb;

    /**
     * The Used Windows Phone.
     * 
     */
    @SerializedName(value = "usedWindowsPhone", alternate = {"UsedWindowsPhone"})
    @Expose
    public Boolean usedWindowsPhone;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;

    /**
     * The User State.
     * 
     */
    @SerializedName(value = "userState", alternate = {"UserState"})
    @Expose
    public String userState;


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
