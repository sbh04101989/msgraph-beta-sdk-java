// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserFlowLanguagePage;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.UserFlowLanguagePageCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Flow Language Configuration.
 */
public class UserFlowLanguageConfiguration extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The language name to display. This property is read-only.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Is Enabled.
     * Indicates whether the language is enabled within the user flow.
     */
    @SerializedName(value = "isEnabled", alternate = {"IsEnabled"})
    @Expose
    public Boolean isEnabled;

    /**
     * The Default Pages.
     * Collection of pages with the default content to display in a user flow for a specified language. This collection does not allow any kind of modification.
     */
    @SerializedName(value = "defaultPages", alternate = {"DefaultPages"})
    @Expose
    public UserFlowLanguagePageCollectionPage defaultPages;

    /**
     * The Overrides Pages.
     * Collection of pages with the overrides messages to display in a user flow for a specified language. This collection only allows to modify the content of the page, any other modification is not allowed (creation or deletion of pages).
     */
    @SerializedName(value = "overridesPages", alternate = {"OverridesPages"})
    @Expose
    public UserFlowLanguagePageCollectionPage overridesPages;


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


        if (json.has("defaultPages")) {
            defaultPages = serializer.deserializeObject(json.get("defaultPages").toString(), UserFlowLanguagePageCollectionPage.class);
        }

        if (json.has("overridesPages")) {
            overridesPages = serializer.deserializeObject(json.get("overridesPages").toString(), UserFlowLanguagePageCollectionPage.class);
        }
    }
}
