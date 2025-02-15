// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Identity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Print Usage Summary.
 */
public class GroupPrintUsageSummary implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Completed Job Count.
     * 
     */
    @SerializedName(value = "completedJobCount", alternate = {"CompletedJobCount"})
    @Expose
    public Integer completedJobCount;

    /**
     * The Group.
     * 
     */
    @SerializedName(value = "group", alternate = {"Group"})
    @Expose
    public Identity group;

    /**
     * The Group Display Name.
     * 
     */
    @SerializedName(value = "groupDisplayName", alternate = {"GroupDisplayName"})
    @Expose
    public String groupDisplayName;

    /**
     * The Group Mail.
     * 
     */
    @SerializedName(value = "groupMail", alternate = {"GroupMail"})
    @Expose
    public String groupMail;

    /**
     * The Incomplete Job Count.
     * 
     */
    @SerializedName(value = "incompleteJobCount", alternate = {"IncompleteJobCount"})
    @Expose
    public Integer incompleteJobCount;


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
