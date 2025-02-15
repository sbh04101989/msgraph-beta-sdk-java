// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PhysicalOfficeAddress;
import com.microsoft.graph.models.extensions.OnPremisesProvisioningError;
import com.microsoft.graph.models.extensions.Phone;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact.
 */
public class OrgContact extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Addresses.
     * Postal addresses for this organizational contact. For now a contact can only have one physical address.
     */
    @SerializedName(value = "addresses", alternate = {"Addresses"})
    @Expose
    public java.util.List<PhysicalOfficeAddress> addresses;

    /**
     * The Company Name.
     * Name of the company that this organizational contact belong to.
     */
    @SerializedName(value = "companyName", alternate = {"CompanyName"})
    @Expose
    public String companyName;

    /**
     * The Department.
     * The name for the department in which the contact works.
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
    public String department;

    /**
     * The Display Name.
     * Display name for this organizational contact.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Given Name.
     * First name for this organizational contact.
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
    public String givenName;

    /**
     * The Job Title.
     * Job title for this organizational contact.
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
    public String jobTitle;

    /**
     * The Mail.
     * The SMTP address for the contact, for example, 'jeff@contoso.onmicrosoft.com'.
     */
    @SerializedName(value = "mail", alternate = {"Mail"})
    @Expose
    public String mail;

    /**
     * The Mail Nickname.
     * Email alias (portion of email address pre-pending the @ symbol) for this organizational contact.
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
    public String mailNickname;

    /**
     * The On Premises Last Sync Date Time.
     * Date and time when this organizational contact was last synchronized from on-premises AD. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Provisioning Errors.
     * List of any synchronization provisioning errors for this organizational contact.
     */
    @SerializedName(value = "onPremisesProvisioningErrors", alternate = {"OnPremisesProvisioningErrors"})
    @Expose
    public java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;

    /**
     * The On Premises Sync Enabled.
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced and now mastered in Exchange; null if this object has never been synced from an on-premises directory (default).
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Phones.
     * List of phones for this organizational contact. Phone types can be mobile, business, and businessFax. Only one of each type can ever be present in the collection.
     */
    @SerializedName(value = "phones", alternate = {"Phones"})
    @Expose
    public java.util.List<Phone> phones;

    /**
     * The Proxy Addresses.
     * For example: 'SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com'. The any operator is required for filter expressions on multi-valued properties. Supports $filter.
     */
    @SerializedName(value = "proxyAddresses", alternate = {"ProxyAddresses"})
    @Expose
    public java.util.List<String> proxyAddresses;

    /**
     * The Surname.
     * Last name for this organizational contact.
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
    public String surname;

    /**
     * The Direct Reports.
     * The contact's direct reports. (The users and contacts that have their manager property set to this contact.) Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage directReports;

    /**
     * The Manager.
     * The user or contact that is this contact's manager. Read-only.
     */
    @SerializedName(value = "manager", alternate = {"Manager"})
    @Expose
    public DirectoryObject manager;

    /**
     * The Member Of.
     * Groups that this contact is a member of. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Transitive Member Of.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMemberOf;


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


        if (json.has("directReports")) {
            directReports = serializer.deserializeObject(json.get("directReports").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("memberOf")) {
            memberOf = serializer.deserializeObject(json.get("memberOf").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("transitiveMemberOf")) {
            transitiveMemberOf = serializer.deserializeObject(json.get("transitiveMemberOf").toString(), DirectoryObjectCollectionPage.class);
        }
    }
}
