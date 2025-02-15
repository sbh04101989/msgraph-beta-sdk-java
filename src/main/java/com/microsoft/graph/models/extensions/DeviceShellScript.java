// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RunAsAccountType;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptDeviceState;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptRunSummary;
import com.microsoft.graph.models.extensions.DeviceManagementScriptUserState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Shell Script.
 */
public class DeviceShellScript extends Entity implements IJsonBackedObject {


    /**
     * The Block Execution Notifications.
     * Does not notify the user a script is being executed
     */
    @SerializedName(value = "blockExecutionNotifications", alternate = {"BlockExecutionNotifications"})
    @Expose
    public Boolean blockExecutionNotifications;

    /**
     * The Created Date Time.
     * The date and time the device management script was created. This property is read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Optional description for the device management script.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * Name of the device management script.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Execution Frequency.
     * The interval for script to run. If not defined the script will run once
     */
    @SerializedName(value = "executionFrequency", alternate = {"ExecutionFrequency"})
    @Expose
    public javax.xml.datatype.Duration executionFrequency;

    /**
     * The File Name.
     * Script file name.
     */
    @SerializedName(value = "fileName", alternate = {"FileName"})
    @Expose
    public String fileName;

    /**
     * The Last Modified Date Time.
     * The date and time the device management script was last modified. This property is read-only.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Retry Count.
     * Number of times for the script to be retried if it fails
     */
    @SerializedName(value = "retryCount", alternate = {"RetryCount"})
    @Expose
    public Integer retryCount;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tag IDs for this PowerShellScript instance.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Run As Account.
     * Indicates the type of execution context. Possible values are: system, user.
     */
    @SerializedName(value = "runAsAccount", alternate = {"RunAsAccount"})
    @Expose
    public RunAsAccountType runAsAccount;

    /**
     * The Script Content.
     * The script content.
     */
    @SerializedName(value = "scriptContent", alternate = {"ScriptContent"})
    @Expose
    public byte[] scriptContent;

    /**
     * The Assignments.
     * The list of group assignments for the device management script.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
    public DeviceManagementScriptAssignmentCollectionPage assignments;

    /**
     * The Device Run States.
     * List of run states for this script across all devices.
     */
    @SerializedName(value = "deviceRunStates", alternate = {"DeviceRunStates"})
    @Expose
    public DeviceManagementScriptDeviceStateCollectionPage deviceRunStates;

    /**
     * The Group Assignments.
     * The list of group assignments for the device management script.
     */
    @SerializedName(value = "groupAssignments", alternate = {"GroupAssignments"})
    @Expose
    public DeviceManagementScriptGroupAssignmentCollectionPage groupAssignments;

    /**
     * The Run Summary.
     * Run summary for device management script.
     */
    @SerializedName(value = "runSummary", alternate = {"RunSummary"})
    @Expose
    public DeviceManagementScriptRunSummary runSummary;

    /**
     * The User Run States.
     * List of run states for this script across all users.
     */
    @SerializedName(value = "userRunStates", alternate = {"UserRunStates"})
    @Expose
    public DeviceManagementScriptUserStateCollectionPage userRunStates;


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


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments").toString(), DeviceManagementScriptAssignmentCollectionPage.class);
        }

        if (json.has("deviceRunStates")) {
            deviceRunStates = serializer.deserializeObject(json.get("deviceRunStates").toString(), DeviceManagementScriptDeviceStateCollectionPage.class);
        }

        if (json.has("groupAssignments")) {
            groupAssignments = serializer.deserializeObject(json.get("groupAssignments").toString(), DeviceManagementScriptGroupAssignmentCollectionPage.class);
        }

        if (json.has("userRunStates")) {
            userRunStates = serializer.deserializeObject(json.get("userRunStates").toString(), DeviceManagementScriptUserStateCollectionPage.class);
        }
    }
}
