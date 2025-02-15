// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Detail.
 */
public class AuthenticationDetail implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Authentication Method.
     * The type of authentication method used to perform this step of authentication. Possible values: Password, SMS, Voice, Authenticator App, Software OATH token, Satisfied by token.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
    public String authenticationMethod;

    /**
     * The Authentication Method Detail.
     * Details about the authentication method used to perform this authentication step. For example, phone number (for SMS and voice), device name (for Authenticator app), and password source (e.g. cloud, AD FS, PTA, PHS).
     */
    @SerializedName(value = "authenticationMethodDetail", alternate = {"AuthenticationMethodDetail"})
    @Expose
    public String authenticationMethodDetail;

    /**
     * The Authentication Step Date Time.
     * Represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     */
    @SerializedName(value = "authenticationStepDateTime", alternate = {"AuthenticationStepDateTime"})
    @Expose
    public java.util.Calendar authenticationStepDateTime;

    /**
     * The Authentication Step Requirement.
     * The step of authentication that this satisfied. For example, primary authentication, or multi-factor authentication.
     */
    @SerializedName(value = "authenticationStepRequirement", alternate = {"AuthenticationStepRequirement"})
    @Expose
    public String authenticationStepRequirement;

    /**
     * The Authentication Step Result Detail.
     * Details about why the step succeeded or failed. For examples, user is blocked, fraud code entered, no phone input - timed out, phone unreachable, or claim in token.
     */
    @SerializedName(value = "authenticationStepResultDetail", alternate = {"AuthenticationStepResultDetail"})
    @Expose
    public String authenticationStepResultDetail;

    /**
     * The Succeeded.
     * Indicates the status of the authentication step. Possible values: succeeded, failed.
     */
    @SerializedName(value = "succeeded", alternate = {"Succeeded"})
    @Expose
    public Boolean succeeded;


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
