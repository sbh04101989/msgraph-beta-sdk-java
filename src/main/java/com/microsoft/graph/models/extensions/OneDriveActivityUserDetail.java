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
 * The class for the One Drive Activity User Detail.
 */
public class OneDriveActivityUserDetail extends Entity implements IJsonBackedObject {


    /**
     * The Assigned Products.
     * 
     */
    @SerializedName(value = "assignedProducts", alternate = {"AssignedProducts"})
    @Expose
    public java.util.List<String> assignedProducts;

    /**
     * The Deleted Date.
     * 
     */
    @SerializedName(value = "deletedDate", alternate = {"DeletedDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly deletedDate;

    /**
     * The Is Deleted.
     * 
     */
    @SerializedName(value = "isDeleted", alternate = {"IsDeleted"})
    @Expose
    public Boolean isDeleted;

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
     * The Shared Externally File Count.
     * 
     */
    @SerializedName(value = "sharedExternallyFileCount", alternate = {"SharedExternallyFileCount"})
    @Expose
    public Long sharedExternallyFileCount;

    /**
     * The Shared Internally File Count.
     * 
     */
    @SerializedName(value = "sharedInternallyFileCount", alternate = {"SharedInternallyFileCount"})
    @Expose
    public Long sharedInternallyFileCount;

    /**
     * The Synced File Count.
     * 
     */
    @SerializedName(value = "syncedFileCount", alternate = {"SyncedFileCount"})
    @Expose
    public Long syncedFileCount;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;

    /**
     * The Viewed Or Edited File Count.
     * 
     */
    @SerializedName(value = "viewedOrEditedFileCount", alternate = {"ViewedOrEditedFileCount"})
    @Expose
    public Long viewedOrEditedFileCount;


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
