// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeliveryOptimizationBandwidth;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Delivery Optimization Bandwidth Percentage.
 */
public class DeliveryOptimizationBandwidthPercentage extends DeliveryOptimizationBandwidth implements IJsonBackedObject {


    /**
     * The Maximum Background Bandwidth Percentage.
     * The default value 0 (zero) means that Delivery Optimization dynamically adjusts to use the available bandwidth for background downloads. Valid values 0 to 100
     */
    @SerializedName(value = "maximumBackgroundBandwidthPercentage", alternate = {"MaximumBackgroundBandwidthPercentage"})
    @Expose
    public Integer maximumBackgroundBandwidthPercentage;

    /**
     * The Maximum Foreground Bandwidth Percentage.
     * The default value 0 (zero) means that Delivery Optimization dynamically adjusts to use the available bandwidth for foreground downloads. Valid values 0 to 100
     */
    @SerializedName(value = "maximumForegroundBandwidthPercentage", alternate = {"MaximumForegroundBandwidthPercentage"})
    @Expose
    public Integer maximumForegroundBandwidthPercentage;


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
