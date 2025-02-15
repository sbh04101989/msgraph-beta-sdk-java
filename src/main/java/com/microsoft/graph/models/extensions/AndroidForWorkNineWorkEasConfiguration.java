// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AndroidForWorkEasEmailProfileBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Nine Work Eas Configuration.
 */
public class AndroidForWorkNineWorkEasConfiguration extends AndroidForWorkEasEmailProfileBase implements IJsonBackedObject {


    /**
     * The Sync Calendar.
     * Toggles syncing the calendar. If set to false the calendar is turned off on the device.
     */
    @SerializedName(value = "syncCalendar", alternate = {"SyncCalendar"})
    @Expose
    public Boolean syncCalendar;

    /**
     * The Sync Contacts.
     * Toggles syncing contacts. If set to false contacts are turned off on the device.
     */
    @SerializedName(value = "syncContacts", alternate = {"SyncContacts"})
    @Expose
    public Boolean syncContacts;

    /**
     * The Sync Tasks.
     * Toggles syncing tasks. If set to false tasks are turned off on the device.
     */
    @SerializedName(value = "syncTasks", alternate = {"SyncTasks"})
    @Expose
    public Boolean syncTasks;


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
