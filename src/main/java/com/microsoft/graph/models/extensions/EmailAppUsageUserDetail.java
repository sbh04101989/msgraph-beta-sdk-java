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
 * The class for the Email App Usage User Detail.
 */
public class EmailAppUsageUserDetail extends Entity implements IJsonBackedObject {


    /**
     * The Deleted Date.
     * 
     */
    @SerializedName(value = "deletedDate", alternate = {"DeletedDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly deletedDate;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Imap4App.
     * 
     */
    @SerializedName(value = "imap4App", alternate = {"Imap4App"})
    @Expose
    public java.util.List<String> imap4App;

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
     * The Mail For Mac.
     * 
     */
    @SerializedName(value = "mailForMac", alternate = {"MailForMac"})
    @Expose
    public java.util.List<String> mailForMac;

    /**
     * The Other For Mobile.
     * 
     */
    @SerializedName(value = "otherForMobile", alternate = {"OtherForMobile"})
    @Expose
    public java.util.List<String> otherForMobile;

    /**
     * The Outlook For Mac.
     * 
     */
    @SerializedName(value = "outlookForMac", alternate = {"OutlookForMac"})
    @Expose
    public java.util.List<String> outlookForMac;

    /**
     * The Outlook For Mobile.
     * 
     */
    @SerializedName(value = "outlookForMobile", alternate = {"OutlookForMobile"})
    @Expose
    public java.util.List<String> outlookForMobile;

    /**
     * The Outlook For Web.
     * 
     */
    @SerializedName(value = "outlookForWeb", alternate = {"OutlookForWeb"})
    @Expose
    public java.util.List<String> outlookForWeb;

    /**
     * The Outlook For Windows.
     * 
     */
    @SerializedName(value = "outlookForWindows", alternate = {"OutlookForWindows"})
    @Expose
    public java.util.List<String> outlookForWindows;

    /**
     * The Pop3App.
     * 
     */
    @SerializedName(value = "pop3App", alternate = {"Pop3App"})
    @Expose
    public java.util.List<String> pop3App;

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
     * The Smtp App.
     * 
     */
    @SerializedName(value = "smtpApp", alternate = {"SmtpApp"})
    @Expose
    public java.util.List<String> smtpApp;

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
