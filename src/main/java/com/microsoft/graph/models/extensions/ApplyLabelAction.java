// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import com.microsoft.graph.models.generated.ActionSource;
import com.microsoft.graph.models.extensions.LabelDetails;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apply Label Action.
 */
public class ApplyLabelAction extends InformationProtectionAction implements IJsonBackedObject {


    /**
     * The Actions.
     * The collection of specific actions that should be taken by the consuming application to label the document. See  informationProtectionAction for the full list.
     */
    @SerializedName(value = "actions", alternate = {"Actions"})
    @Expose
    public java.util.List<InformationProtectionAction> actions;

    /**
     * The Action Source.
     * Possible values are: manual, automatic, recommended, default.
     */
    @SerializedName(value = "actionSource", alternate = {"ActionSource"})
    @Expose
    public ActionSource actionSource;

    /**
     * The Label.
     * Object that describes the details of the label to apply.
     */
    @SerializedName(value = "label", alternate = {"Label"})
    @Expose
    public LabelDetails label;

    /**
     * The Responsible Sensitive Type Ids.
     * If the label was the result of an automatic classification, supply the list of sensitive info type GUIDs that resulted in the returned label.
     */
    @SerializedName(value = "responsibleSensitiveTypeIds", alternate = {"ResponsibleSensitiveTypeIds"})
    @Expose
    public java.util.List<java.util.UUID> responsibleSensitiveTypeIds;


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
