// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.KeyValue;
import com.microsoft.graph.models.extensions.AuditActivityInitiator;
import com.microsoft.graph.models.generated.OperationResult;
import com.microsoft.graph.models.extensions.TargetResource;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Audit.
 */
public class DirectoryAudit extends Entity implements IJsonBackedObject {


    /**
     * The Activity Date Time.
     * Indicates the date and time the activity was performed. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "activityDateTime", alternate = {"ActivityDateTime"})
    @Expose
    public java.util.Calendar activityDateTime;

    /**
     * The Activity Display Name.
     * Indicates the activity name or the operation name (E.g. 'Create User', 'Add member to group'). For a list of activities logged, refer to Azure Ad activity list.
     */
    @SerializedName(value = "activityDisplayName", alternate = {"ActivityDisplayName"})
    @Expose
    public String activityDisplayName;

    /**
     * The Additional Details.
     * Indicates additional details on the activity.
     */
    @SerializedName(value = "additionalDetails", alternate = {"AdditionalDetails"})
    @Expose
    public java.util.List<KeyValue> additionalDetails;

    /**
     * The Category.
     * Indicates which resource category that's targeted by the activity. (For example: User Management, Group Management etc..)
     */
    @SerializedName(value = "category", alternate = {"Category"})
    @Expose
    public String category;

    /**
     * The Correlation Id.
     * Indicates a unique ID that helps correlate activities that span across various services. Can be used to trace logs across services.
     */
    @SerializedName(value = "correlationId", alternate = {"CorrelationId"})
    @Expose
    public String correlationId;

    /**
     * The Initiated By.
     * Indicates information about the user or app initiated the activity.
     */
    @SerializedName(value = "initiatedBy", alternate = {"InitiatedBy"})
    @Expose
    public AuditActivityInitiator initiatedBy;

    /**
     * The Logged By Service.
     * Indicates information on which service initiated the activity (For example: Self-service Password Management, Core Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management.
     */
    @SerializedName(value = "loggedByService", alternate = {"LoggedByService"})
    @Expose
    public String loggedByService;

    /**
     * The Operation Type.
     * 
     */
    @SerializedName(value = "operationType", alternate = {"OperationType"})
    @Expose
    public String operationType;

    /**
     * The Result.
     * Indicates the result of the activity. Possible values are: success, failure, timeout, unknownFutureValue.
     */
    @SerializedName(value = "result", alternate = {"Result"})
    @Expose
    public OperationResult result;

    /**
     * The Result Reason.
     * Indicates the reason for failure if the result is 'Failure' or 'timeout'.
     */
    @SerializedName(value = "resultReason", alternate = {"ResultReason"})
    @Expose
    public String resultReason;

    /**
     * The Target Resources.
     * Indicates information on which resource was changed due to the activity. Target Resource Type can be User, Device, Directory, App, Role, Group, Policy or Other.
     */
    @SerializedName(value = "targetResources", alternate = {"TargetResources"})
    @Expose
    public java.util.List<TargetResource> targetResources;


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
