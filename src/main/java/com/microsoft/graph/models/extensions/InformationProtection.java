// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Bitlocker;
import com.microsoft.graph.models.extensions.DataLossPreventionPolicy;
import com.microsoft.graph.models.extensions.SensitivityLabel;
import com.microsoft.graph.models.extensions.SensitivityPolicySettings;
import com.microsoft.graph.models.extensions.InformationProtectionPolicy;
import com.microsoft.graph.models.extensions.ThreatAssessmentRequest;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DataLossPreventionPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.SensitivityLabelCollectionPage;
import com.microsoft.graph.requests.extensions.ThreatAssessmentRequestCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection.
 */
public class InformationProtection extends Entity implements IJsonBackedObject {


    /**
     * The Bitlocker.
     * 
     */
    @SerializedName(value = "bitlocker", alternate = {"Bitlocker"})
    @Expose
    public Bitlocker bitlocker;

    /**
     * The Data Loss Prevention Policies.
     * 
     */
    @SerializedName(value = "dataLossPreventionPolicies", alternate = {"DataLossPreventionPolicies"})
    @Expose
    public DataLossPreventionPolicyCollectionPage dataLossPreventionPolicies;

    /**
     * The Sensitivity Labels.
     * 
     */
    @SerializedName(value = "sensitivityLabels", alternate = {"SensitivityLabels"})
    @Expose
    public SensitivityLabelCollectionPage sensitivityLabels;

    /**
     * The Sensitivity Policy Settings.
     * 
     */
    @SerializedName(value = "sensitivityPolicySettings", alternate = {"SensitivityPolicySettings"})
    @Expose
    public SensitivityPolicySettings sensitivityPolicySettings;

    /**
     * The Policy.
     * 
     */
    @SerializedName(value = "policy", alternate = {"Policy"})
    @Expose
    public InformationProtectionPolicy policy;

    /**
     * The Threat Assessment Requests.
     * 
     */
    @SerializedName(value = "threatAssessmentRequests", alternate = {"ThreatAssessmentRequests"})
    @Expose
    public ThreatAssessmentRequestCollectionPage threatAssessmentRequests;


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


        if (json.has("dataLossPreventionPolicies")) {
            dataLossPreventionPolicies = serializer.deserializeObject(json.get("dataLossPreventionPolicies").toString(), DataLossPreventionPolicyCollectionPage.class);
        }

        if (json.has("sensitivityLabels")) {
            sensitivityLabels = serializer.deserializeObject(json.get("sensitivityLabels").toString(), SensitivityLabelCollectionPage.class);
        }

        if (json.has("threatAssessmentRequests")) {
            threatAssessmentRequests = serializer.deserializeObject(json.get("threatAssessmentRequests").toString(), ThreatAssessmentRequestCollectionPage.class);
        }
    }
}
