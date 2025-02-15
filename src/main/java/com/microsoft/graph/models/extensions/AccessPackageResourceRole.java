// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AccessPackageResource;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Role.
 */
public class AccessPackageResourceRole extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * A description for the resource role.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * The display name of the resource role such as the role defined by the application.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Origin Id.
     * The unique identifier of the resource role in the origin system.
     */
    @SerializedName(value = "originId", alternate = {"OriginId"})
    @Expose
    public String originId;

    /**
     * The Origin System.
     * The type of the resource in the origin system, such as SharePointOnline, AadApplication or AadGroup.
     */
    @SerializedName(value = "originSystem", alternate = {"OriginSystem"})
    @Expose
    public String originSystem;

    /**
     * The Access Package Resource.
     * Read-only. Nullable.
     */
    @SerializedName(value = "accessPackageResource", alternate = {"AccessPackageResource"})
    @Expose
    public AccessPackageResource accessPackageResource;


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
