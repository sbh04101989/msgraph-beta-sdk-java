// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Account;
import com.microsoft.graph.models.extensions.JournalLine;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.JournalLineCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Journal.
 */
public class Journal extends Entity implements IJsonBackedObject {


    /**
     * The Balancing Account Id.
     * 
     */
    @SerializedName(value = "balancingAccountId", alternate = {"BalancingAccountId"})
    @Expose
    public java.util.UUID balancingAccountId;

    /**
     * The Balancing Account Number.
     * 
     */
    @SerializedName(value = "balancingAccountNumber", alternate = {"BalancingAccountNumber"})
    @Expose
    public String balancingAccountNumber;

    /**
     * The Code.
     * 
     */
    @SerializedName(value = "code", alternate = {"Code"})
    @Expose
    public String code;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Account.
     * 
     */
    @SerializedName(value = "account", alternate = {"Account"})
    @Expose
    public Account account;

    /**
     * The Journal Lines.
     * 
     */
    @SerializedName(value = "journalLines", alternate = {"JournalLines"})
    @Expose
    public JournalLineCollectionPage journalLines;


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


        if (json.has("journalLines")) {
            journalLines = serializer.deserializeObject(json.get("journalLines").toString(), JournalLineCollectionPage.class);
        }
    }
}
