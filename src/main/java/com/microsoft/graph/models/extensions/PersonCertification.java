// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ItemFacet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Certification.
 */
public class PersonCertification extends ItemFacet implements IJsonBackedObject {


    /**
     * The Certification Id.
     * The referenceable identifier for the certification.
     */
    @SerializedName(value = "certificationId", alternate = {"CertificationId"})
    @Expose
    public String certificationId;

    /**
     * The Description.
     * Description of the certification.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * Title of the certification.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The End Date.
     * The date that the certification expires.
     */
    @SerializedName(value = "endDate", alternate = {"EndDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly endDate;

    /**
     * The Issued Date.
     * The date that the certification was issued.
     */
    @SerializedName(value = "issuedDate", alternate = {"IssuedDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly issuedDate;

    /**
     * The Issuing Authority.
     * Authority which granted the certification.
     */
    @SerializedName(value = "issuingAuthority", alternate = {"IssuingAuthority"})
    @Expose
    public String issuingAuthority;

    /**
     * The Issuing Company.
     * Company which granted the certification.
     */
    @SerializedName(value = "issuingCompany", alternate = {"IssuingCompany"})
    @Expose
    public String issuingCompany;

    /**
     * The Start Date.
     * The date that the certification became valid.
     */
    @SerializedName(value = "startDate", alternate = {"StartDate"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly startDate;

    /**
     * The Thumbnail Url.
     * URL referencing a thumbnail of the certification.
     */
    @SerializedName(value = "thumbnailUrl", alternate = {"ThumbnailUrl"})
    @Expose
    public String thumbnailUrl;

    /**
     * The Web Url.
     * URL referencing the certification.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
    public String webUrl;


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
