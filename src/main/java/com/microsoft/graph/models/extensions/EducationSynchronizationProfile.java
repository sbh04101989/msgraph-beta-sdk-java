// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EducationSynchronizationDataProvider;
import com.microsoft.graph.models.extensions.EducationIdentitySynchronizationConfiguration;
import com.microsoft.graph.models.extensions.EducationSynchronizationLicenseAssignment;
import com.microsoft.graph.models.generated.EducationSynchronizationProfileState;
import com.microsoft.graph.models.extensions.EducationSynchronizationError;
import com.microsoft.graph.models.extensions.EducationSynchronizationProfileStatus;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EducationSynchronizationErrorCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Synchronization Profile.
 */
public class EducationSynchronizationProfile extends Entity implements IJsonBackedObject {


    /**
     * The Data Provider.
     * The data provider used for the profile.
     */
    @SerializedName(value = "dataProvider", alternate = {"DataProvider"})
    @Expose
    public EducationSynchronizationDataProvider dataProvider;

    /**
     * The Display Name.
     * Name of the configuration profile for syncing identities.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Expiration Date.
     * The date the profile should be considered expired and cease syncing. When null. the profile will never expire. (optional)
     */
    @SerializedName(value = "expirationDate", alternate = {"ExpirationDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly expirationDate;

    /**
     * The Handle Special Character Constraint.
     * Determines if School Data Sync should automatically replace unsupported special characters while syncing from source.
     */
    @SerializedName(value = "handleSpecialCharacterConstraint", alternate = {"HandleSpecialCharacterConstraint"})
    @Expose
    public Boolean handleSpecialCharacterConstraint;

    /**
     * The Identity Synchronization Configuration.
     * Determines how the Profile should [create new][fullsync] or [match existing][dirsync] AAD Users.
     */
    @SerializedName(value = "identitySynchronizationConfiguration", alternate = {"IdentitySynchronizationConfiguration"})
    @Expose
    public EducationIdentitySynchronizationConfiguration identitySynchronizationConfiguration;

    /**
     * The Licenses To Assign.
     * License setup configuration.
     */
    @SerializedName(value = "licensesToAssign", alternate = {"LicensesToAssign"})
    @Expose
    public java.util.List<EducationSynchronizationLicenseAssignment> licensesToAssign;

    /**
     * The State.
     * The state of the profile. Possible values are: provisioning, provisioned, provisioningFailed, deleting, deletionFailed.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public EducationSynchronizationProfileState state;

    /**
     * The Errors.
     * All errors associated with this synchronization profile.
     */
    @SerializedName(value = "errors", alternate = {"Errors"})
    @Expose
    public EducationSynchronizationErrorCollectionPage errors;

    /**
     * The Profile Status.
     * The synchronization status.
     */
    @SerializedName(value = "profileStatus", alternate = {"ProfileStatus"})
    @Expose
    public EducationSynchronizationProfileStatus profileStatus;


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


        if (json.has("errors")) {
            errors = serializer.deserializeObject(json.get("errors").toString(), EducationSynchronizationErrorCollectionPage.class);
        }
    }
}
