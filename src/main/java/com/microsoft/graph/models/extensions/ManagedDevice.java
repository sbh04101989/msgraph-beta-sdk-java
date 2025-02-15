// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ChassisType;
import com.microsoft.graph.models.generated.ComplianceState;
import com.microsoft.graph.models.extensions.ConfigurationManagerClientEnabledFeatures;
import com.microsoft.graph.models.extensions.ConfigurationManagerClientHealthState;
import com.microsoft.graph.models.extensions.ConfigurationManagerClientInformation;
import com.microsoft.graph.models.extensions.DeviceActionResult;
import com.microsoft.graph.models.generated.DeviceEnrollmentType;
import com.microsoft.graph.models.extensions.DeviceHealthAttestationState;
import com.microsoft.graph.models.generated.DeviceRegistrationState;
import com.microsoft.graph.models.generated.DeviceType;
import com.microsoft.graph.models.generated.DeviceManagementExchangeAccessState;
import com.microsoft.graph.models.generated.DeviceManagementExchangeAccessStateReason;
import com.microsoft.graph.models.extensions.HardwareInformation;
import com.microsoft.graph.models.generated.JoinType;
import com.microsoft.graph.models.generated.LostModeState;
import com.microsoft.graph.models.generated.ManagedDeviceOwnerType;
import com.microsoft.graph.models.generated.ManagementAgentType;
import com.microsoft.graph.models.generated.ManagedDeviceManagementFeatures;
import com.microsoft.graph.models.generated.ManagementState;
import com.microsoft.graph.models.generated.OwnerType;
import com.microsoft.graph.models.generated.ManagedDevicePartnerReportedHealthState;
import com.microsoft.graph.models.generated.ManagedDeviceArchitecture;
import com.microsoft.graph.models.extensions.LoggedOnUser;
import com.microsoft.graph.models.extensions.SecurityBaselineState;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyState;
import com.microsoft.graph.models.extensions.DeviceConfigurationState;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationState;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.models.extensions.DeviceCategory;
import com.microsoft.graph.models.extensions.DeviceLogCollectionResponse;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.WindowsProtectionState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.SecurityBaselineStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationStateCollectionPage;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceLogCollectionResponseCollectionPage;
import com.microsoft.graph.requests.extensions.UserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device.
 */
public class ManagedDevice extends Entity implements IJsonBackedObject {


    /**
     * The Aad Registered.
     * Whether the device is Azure Active Directory registered. This property is read-only.
     */
    @SerializedName(value = "aadRegistered", alternate = {"AadRegistered"})
    @Expose
    public Boolean aadRegistered;

    /**
     * The Activation Lock Bypass Code.
     * Code that allows the Activation Lock on a device to be bypassed. This property is read-only.
     */
    @SerializedName(value = "activationLockBypassCode", alternate = {"ActivationLockBypassCode"})
    @Expose
    public String activationLockBypassCode;

    /**
     * The Android Security Patch Level.
     * Android security patch level. This property is read-only.
     */
    @SerializedName(value = "androidSecurityPatchLevel", alternate = {"AndroidSecurityPatchLevel"})
    @Expose
    public String androidSecurityPatchLevel;

    /**
     * The Autopilot Enrolled.
     * Reports if the managed device is enrolled via auto-pilot. This property is read-only.
     */
    @SerializedName(value = "autopilotEnrolled", alternate = {"AutopilotEnrolled"})
    @Expose
    public Boolean autopilotEnrolled;

    /**
     * The Azure Active Directory Device Id.
     * The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     */
    @SerializedName(value = "azureActiveDirectoryDeviceId", alternate = {"AzureActiveDirectoryDeviceId"})
    @Expose
    public String azureActiveDirectoryDeviceId;

    /**
     * The Azure ADDevice Id.
     * The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     */
    @SerializedName(value = "azureADDeviceId", alternate = {"AzureADDeviceId"})
    @Expose
    public String azureADDeviceId;

    /**
     * The Azure ADRegistered.
     * Whether the device is Azure Active Directory registered. This property is read-only.
     */
    @SerializedName(value = "azureADRegistered", alternate = {"AzureADRegistered"})
    @Expose
    public Boolean azureADRegistered;

    /**
     * The Chassis Type.
     * Chassis type of the device. This property is read-only. Possible values are: unknown, desktop, laptop, worksWorkstation, enterpriseServer, phone, tablet, mobileOther, mobileUnknown.
     */
    @SerializedName(value = "chassisType", alternate = {"ChassisType"})
    @Expose
    public ChassisType chassisType;

    /**
     * The Compliance Grace Period Expiration Date Time.
     * The DateTime when device compliance grace period expires. This property is read-only.
     */
    @SerializedName(value = "complianceGracePeriodExpirationDateTime", alternate = {"ComplianceGracePeriodExpirationDateTime"})
    @Expose
    public java.util.Calendar complianceGracePeriodExpirationDateTime;

    /**
     * The Compliance State.
     * Compliance state of the device. This property is read-only. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod, configManager.
     */
    @SerializedName(value = "complianceState", alternate = {"ComplianceState"})
    @Expose
    public ComplianceState complianceState;

    /**
     * The Configuration Manager Client Enabled Features.
     * ConfigrMgr client enabled features. This property is read-only.
     */
    @SerializedName(value = "configurationManagerClientEnabledFeatures", alternate = {"ConfigurationManagerClientEnabledFeatures"})
    @Expose
    public ConfigurationManagerClientEnabledFeatures configurationManagerClientEnabledFeatures;

    /**
     * The Configuration Manager Client Health State.
     * Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent
     */
    @SerializedName(value = "configurationManagerClientHealthState", alternate = {"ConfigurationManagerClientHealthState"})
    @Expose
    public ConfigurationManagerClientHealthState configurationManagerClientHealthState;

    /**
     * The Configuration Manager Client Information.
     * Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent
     */
    @SerializedName(value = "configurationManagerClientInformation", alternate = {"ConfigurationManagerClientInformation"})
    @Expose
    public ConfigurationManagerClientInformation configurationManagerClientInformation;

    /**
     * The Device Action Results.
     * List of ComplexType deviceActionResult objects. This property is read-only.
     */
    @SerializedName(value = "deviceActionResults", alternate = {"DeviceActionResults"})
    @Expose
    public java.util.List<DeviceActionResult> deviceActionResults;

    /**
     * The Device Category Display Name.
     * Device category display name. This property is read-only.
     */
    @SerializedName(value = "deviceCategoryDisplayName", alternate = {"DeviceCategoryDisplayName"})
    @Expose
    public String deviceCategoryDisplayName;

    /**
     * The Device Enrollment Type.
     * Enrollment type of the device. This property is read-only. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin, windowsCoManagement, appleUserEnrollment, appleUserEnrollmentWithServiceAccount, azureAdJoinUsingAzureVmExtension, androidEnterpriseDedicatedDevice, androidEnterpriseFullyManaged, androidEnterpriseCorporateWorkProfile.
     */
    @SerializedName(value = "deviceEnrollmentType", alternate = {"DeviceEnrollmentType"})
    @Expose
    public DeviceEnrollmentType deviceEnrollmentType;

    /**
     * The Device Health Attestation State.
     * The device health attestation state. This property is read-only.
     */
    @SerializedName(value = "deviceHealthAttestationState", alternate = {"DeviceHealthAttestationState"})
    @Expose
    public DeviceHealthAttestationState deviceHealthAttestationState;

    /**
     * The Device Name.
     * Name of the device. This property is read-only.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
    public String deviceName;

    /**
     * The Device Registration State.
     * Device registration state. This property is read-only. Possible values are: notRegistered, registered, revoked, keyConflict, approvalPending, certificateReset, notRegisteredPendingEnrollment, unknown.
     */
    @SerializedName(value = "deviceRegistrationState", alternate = {"DeviceRegistrationState"})
    @Expose
    public DeviceRegistrationState deviceRegistrationState;

    /**
     * The Device Type.
     * Platform of the device. This property is read-only. Possible values are: desktop, windowsRT, winMO6, nokia, windowsPhone, mac, winCE, winEmbedded, iPhone, iPad, iPod, android, iSocConsumer, unix, macMDM, holoLens, surfaceHub, androidForWork, androidEnterprise, windows10x, androidnGMS, blackberry, palm, unknown, cloudPC.
     */
    @SerializedName(value = "deviceType", alternate = {"DeviceType"})
    @Expose
    public DeviceType deviceType;

    /**
     * The Eas Activated.
     * Whether the device is Exchange ActiveSync activated. This property is read-only.
     */
    @SerializedName(value = "easActivated", alternate = {"EasActivated"})
    @Expose
    public Boolean easActivated;

    /**
     * The Eas Activation Date Time.
     * Exchange ActivationSync activation time of the device. This property is read-only.
     */
    @SerializedName(value = "easActivationDateTime", alternate = {"EasActivationDateTime"})
    @Expose
    public java.util.Calendar easActivationDateTime;

    /**
     * The Eas Device Id.
     * Exchange ActiveSync Id of the device. This property is read-only.
     */
    @SerializedName(value = "easDeviceId", alternate = {"EasDeviceId"})
    @Expose
    public String easDeviceId;

    /**
     * The Email Address.
     * Email(s) for the user associated with the device. This property is read-only.
     */
    @SerializedName(value = "emailAddress", alternate = {"EmailAddress"})
    @Expose
    public String emailAddress;

    /**
     * The Enrolled Date Time.
     * Enrollment time of the device. This property is read-only.
     */
    @SerializedName(value = "enrolledDateTime", alternate = {"EnrolledDateTime"})
    @Expose
    public java.util.Calendar enrolledDateTime;

    /**
     * The Ethernet Mac Address.
     * Ethernet MAC. This property is read-only.
     */
    @SerializedName(value = "ethernetMacAddress", alternate = {"EthernetMacAddress"})
    @Expose
    public String ethernetMacAddress;

    /**
     * The Exchange Access State.
     * The Access State of the device in Exchange. This property is read-only. Possible values are: none, unknown, allowed, blocked, quarantined.
     */
    @SerializedName(value = "exchangeAccessState", alternate = {"ExchangeAccessState"})
    @Expose
    public DeviceManagementExchangeAccessState exchangeAccessState;

    /**
     * The Exchange Access State Reason.
     * The reason for the device's access state in Exchange. This property is read-only. Possible values are: none, unknown, exchangeGlobalRule, exchangeIndividualRule, exchangeDeviceRule, exchangeUpgrade, exchangeMailboxPolicy, other, compliant, notCompliant, notEnrolled, unknownLocation, mfaRequired, azureADBlockDueToAccessPolicy, compromisedPassword, deviceNotKnownWithManagedApp.
     */
    @SerializedName(value = "exchangeAccessStateReason", alternate = {"ExchangeAccessStateReason"})
    @Expose
    public DeviceManagementExchangeAccessStateReason exchangeAccessStateReason;

    /**
     * The Exchange Last Successful Sync Date Time.
     * Last time the device contacted Exchange. This property is read-only.
     */
    @SerializedName(value = "exchangeLastSuccessfulSyncDateTime", alternate = {"ExchangeLastSuccessfulSyncDateTime"})
    @Expose
    public java.util.Calendar exchangeLastSuccessfulSyncDateTime;

    /**
     * The Free Storage Space In Bytes.
     * Free Storage in Bytes. This property is read-only.
     */
    @SerializedName(value = "freeStorageSpaceInBytes", alternate = {"FreeStorageSpaceInBytes"})
    @Expose
    public Long freeStorageSpaceInBytes;

    /**
     * The Hardware Information.
     * The hardward details for the device.  Includes information such as storage space, manufacturer, serial number, etc. This property is read-only.
     */
    @SerializedName(value = "hardwareInformation", alternate = {"HardwareInformation"})
    @Expose
    public HardwareInformation hardwareInformation;

    /**
     * The Iccid.
     * Integrated Circuit Card Identifier, it is A SIM card's unique identification number. This property is read-only.
     */
    @SerializedName(value = "iccid", alternate = {"Iccid"})
    @Expose
    public String iccid;

    /**
     * The Imei.
     * IMEI. This property is read-only.
     */
    @SerializedName(value = "imei", alternate = {"Imei"})
    @Expose
    public String imei;

    /**
     * The Is Encrypted.
     * Device encryption status. This property is read-only.
     */
    @SerializedName(value = "isEncrypted", alternate = {"IsEncrypted"})
    @Expose
    public Boolean isEncrypted;

    /**
     * The Is Supervised.
     * Device supervised status. This property is read-only.
     */
    @SerializedName(value = "isSupervised", alternate = {"IsSupervised"})
    @Expose
    public Boolean isSupervised;

    /**
     * The Jail Broken.
     * whether the device is jail broken or rooted. This property is read-only.
     */
    @SerializedName(value = "jailBroken", alternate = {"JailBroken"})
    @Expose
    public String jailBroken;

    /**
     * The Join Type.
     * Device join type. Possible values are: unknown, azureADJoined, azureADRegistered, hybridAzureADJoined.
     */
    @SerializedName(value = "joinType", alternate = {"JoinType"})
    @Expose
    public JoinType joinType;

    /**
     * The Last Sync Date Time.
     * The date and time that the device last completed a successful sync with Intune. This property is read-only.
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Lost Mode State.
     * Indicates if Lost mode is enabled or disabled. This property is read-only. Possible values are: disabled, enabled.
     */
    @SerializedName(value = "lostModeState", alternate = {"LostModeState"})
    @Expose
    public LostModeState lostModeState;

    /**
     * The Managed Device Name.
     * Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     */
    @SerializedName(value = "managedDeviceName", alternate = {"ManagedDeviceName"})
    @Expose
    public String managedDeviceName;

    /**
     * The Managed Device Owner Type.
     * Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
     */
    @SerializedName(value = "managedDeviceOwnerType", alternate = {"ManagedDeviceOwnerType"})
    @Expose
    public ManagedDeviceOwnerType managedDeviceOwnerType;

    /**
     * The Management Agent.
     * Management channel of the device. Intune, EAS, etc. This property is read-only. Possible values are: eas, mdm, easMdm, intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController, microsoft365ManagedMdm.
     */
    @SerializedName(value = "managementAgent", alternate = {"ManagementAgent"})
    @Expose
    public ManagementAgentType managementAgent;

    /**
     * The Management Certificate Expiration Date.
     * Reports device management certificate expiration date. This property is read-only.
     */
    @SerializedName(value = "managementCertificateExpirationDate", alternate = {"ManagementCertificateExpirationDate"})
    @Expose
    public java.util.Calendar managementCertificateExpirationDate;

    /**
     * The Management Features.
     * Device management features. Possible values are: none, microsoftManagedDesktop.
     */
    @SerializedName(value = "managementFeatures", alternate = {"ManagementFeatures"})
    @Expose
    public ManagedDeviceManagementFeatures managementFeatures;

    /**
     * The Management State.
     * Management state of the device. This property is read-only. Possible values are: managed, retirePending, retireFailed, wipePending, wipeFailed, unhealthy, deletePending, retireIssued, wipeIssued, wipeCanceled, retireCanceled, discovered.
     */
    @SerializedName(value = "managementState", alternate = {"ManagementState"})
    @Expose
    public ManagementState managementState;

    /**
     * The Manufacturer.
     * Manufacturer of the device. This property is read-only.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
    public String manufacturer;

    /**
     * The Meid.
     * MEID. This property is read-only.
     */
    @SerializedName(value = "meid", alternate = {"Meid"})
    @Expose
    public String meid;

    /**
     * The Model.
     * Model of the device. This property is read-only.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
    public String model;

    /**
     * The Notes.
     * Notes on the device created by IT Admin
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
    public String notes;

    /**
     * The Operating System.
     * Operating system of the device. Windows, iOS, etc. This property is read-only.
     */
    @SerializedName(value = "operatingSystem", alternate = {"OperatingSystem"})
    @Expose
    public String operatingSystem;

    /**
     * The Os Version.
     * Operating system version of the device. This property is read-only.
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
    public String osVersion;

    /**
     * The Owner Type.
     * Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
     */
    @SerializedName(value = "ownerType", alternate = {"OwnerType"})
    @Expose
    public OwnerType ownerType;

    /**
     * The Partner Reported Threat State.
     * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read Only. This property is read-only. Possible values are: unknown, activated, deactivated, secured, lowSeverity, mediumSeverity, highSeverity, unresponsive, compromised, misconfigured.
     */
    @SerializedName(value = "partnerReportedThreatState", alternate = {"PartnerReportedThreatState"})
    @Expose
    public ManagedDevicePartnerReportedHealthState partnerReportedThreatState;

    /**
     * The Phone Number.
     * Phone number of the device. This property is read-only.
     */
    @SerializedName(value = "phoneNumber", alternate = {"PhoneNumber"})
    @Expose
    public String phoneNumber;

    /**
     * The Physical Memory In Bytes.
     * Total Memory in Bytes. This property is read-only.
     */
    @SerializedName(value = "physicalMemoryInBytes", alternate = {"PhysicalMemoryInBytes"})
    @Expose
    public Long physicalMemoryInBytes;

    /**
     * The Prefer Mdm Over Group Policy Applied Date Time.
     * Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only.
     */
    @SerializedName(value = "preferMdmOverGroupPolicyAppliedDateTime", alternate = {"PreferMdmOverGroupPolicyAppliedDateTime"})
    @Expose
    public java.util.Calendar preferMdmOverGroupPolicyAppliedDateTime;

    /**
     * The Processor Architecture.
     * Processor architecture. This property is read-only. Possible values are: unknown, x86, x64, arm, arM64.
     */
    @SerializedName(value = "processorArchitecture", alternate = {"ProcessorArchitecture"})
    @Expose
    public ManagedDeviceArchitecture processorArchitecture;

    /**
     * The Remote Assistance Session Error Details.
     * An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     */
    @SerializedName(value = "remoteAssistanceSessionErrorDetails", alternate = {"RemoteAssistanceSessionErrorDetails"})
    @Expose
    public String remoteAssistanceSessionErrorDetails;

    /**
     * The Remote Assistance Session Url.
     * Url that allows a Remote Assistance session to be established with the device. This property is read-only.
     */
    @SerializedName(value = "remoteAssistanceSessionUrl", alternate = {"RemoteAssistanceSessionUrl"})
    @Expose
    public String remoteAssistanceSessionUrl;

    /**
     * The Require User Enrollment Approval.
     * Reports if the managed iOS device is user approval enrollment. This property is read-only.
     */
    @SerializedName(value = "requireUserEnrollmentApproval", alternate = {"RequireUserEnrollmentApproval"})
    @Expose
    public Boolean requireUserEnrollmentApproval;

    /**
     * The Retire After Date Time.
     * Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only.
     */
    @SerializedName(value = "retireAfterDateTime", alternate = {"RetireAfterDateTime"})
    @Expose
    public java.util.Calendar retireAfterDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tag IDs for this Device instance.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Serial Number.
     * SerialNumber. This property is read-only.
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
    public String serialNumber;

    /**
     * The Sku Family.
     * Device sku family
     */
    @SerializedName(value = "skuFamily", alternate = {"SkuFamily"})
    @Expose
    public String skuFamily;

    /**
     * The Sku Number.
     * Device sku number, see also: https://docs.microsoft.com/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only.
     */
    @SerializedName(value = "skuNumber", alternate = {"SkuNumber"})
    @Expose
    public Integer skuNumber;

    /**
     * The Specification Version.
     * Specification version. This property is read-only.
     */
    @SerializedName(value = "specificationVersion", alternate = {"SpecificationVersion"})
    @Expose
    public String specificationVersion;

    /**
     * The Subscriber Carrier.
     * Subscriber Carrier. This property is read-only.
     */
    @SerializedName(value = "subscriberCarrier", alternate = {"SubscriberCarrier"})
    @Expose
    public String subscriberCarrier;

    /**
     * The Total Storage Space In Bytes.
     * Total Storage in Bytes. This property is read-only.
     */
    @SerializedName(value = "totalStorageSpaceInBytes", alternate = {"TotalStorageSpaceInBytes"})
    @Expose
    public Long totalStorageSpaceInBytes;

    /**
     * The Udid.
     * Unique Device Identifier for iOS and macOS devices. This property is read-only.
     */
    @SerializedName(value = "udid", alternate = {"Udid"})
    @Expose
    public String udid;

    /**
     * The User Display Name.
     * User display name. This property is read-only.
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
    public String userDisplayName;

    /**
     * The User Id.
     * Unique Identifier for the user associated with the device. This property is read-only.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
    public String userId;

    /**
     * The User Principal Name.
     * Device user principal name. This property is read-only.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;

    /**
     * The Users Logged On.
     * Indicates the last logged on users of a device. This property is read-only.
     */
    @SerializedName(value = "usersLoggedOn", alternate = {"UsersLoggedOn"})
    @Expose
    public java.util.List<LoggedOnUser> usersLoggedOn;

    /**
     * The Wi Fi Mac Address.
     * Wi-Fi MAC. This property is read-only.
     */
    @SerializedName(value = "wiFiMacAddress", alternate = {"WiFiMacAddress"})
    @Expose
    public String wiFiMacAddress;

    /**
     * The Windows Active Malware Count.
     * Count of active malware for this windows device. This property is read-only.
     */
    @SerializedName(value = "windowsActiveMalwareCount", alternate = {"WindowsActiveMalwareCount"})
    @Expose
    public Integer windowsActiveMalwareCount;

    /**
     * The Windows Remediated Malware Count.
     * Count of remediated malware for this windows device. This property is read-only.
     */
    @SerializedName(value = "windowsRemediatedMalwareCount", alternate = {"WindowsRemediatedMalwareCount"})
    @Expose
    public Integer windowsRemediatedMalwareCount;

    /**
     * The Security Baseline States.
     * Security baseline states for this device.
     */
    @SerializedName(value = "securityBaselineStates", alternate = {"SecurityBaselineStates"})
    @Expose
    public SecurityBaselineStateCollectionPage securityBaselineStates;

    /**
     * The Device Compliance Policy States.
     * Device compliance policy states for this device.
     */
    @SerializedName(value = "deviceCompliancePolicyStates", alternate = {"DeviceCompliancePolicyStates"})
    @Expose
    public DeviceCompliancePolicyStateCollectionPage deviceCompliancePolicyStates;

    /**
     * The Device Configuration States.
     * Device configuration states for this device.
     */
    @SerializedName(value = "deviceConfigurationStates", alternate = {"DeviceConfigurationStates"})
    @Expose
    public DeviceConfigurationStateCollectionPage deviceConfigurationStates;

    /**
     * The Managed Device Mobile App Configuration States.
     * Managed device mobile app configuration states for this device.
     */
    @SerializedName(value = "managedDeviceMobileAppConfigurationStates", alternate = {"ManagedDeviceMobileAppConfigurationStates"})
    @Expose
    public ManagedDeviceMobileAppConfigurationStateCollectionPage managedDeviceMobileAppConfigurationStates;

    /**
     * The Detected Apps.
     * All applications currently installed on the device
     */
    public DetectedAppCollectionPage detectedApps;

    /**
     * The Device Category.
     * Device category
     */
    @SerializedName(value = "deviceCategory", alternate = {"DeviceCategory"})
    @Expose
    public DeviceCategory deviceCategory;

    /**
     * The Log Collection Requests.
     * List of log collection requests
     */
    @SerializedName(value = "logCollectionRequests", alternate = {"LogCollectionRequests"})
    @Expose
    public DeviceLogCollectionResponseCollectionPage logCollectionRequests;

    /**
     * The Users.
     * The primary users associated with the managed device.
     */
    @SerializedName(value = "users", alternate = {"Users"})
    @Expose
    public UserCollectionPage users;

    /**
     * The Windows Protection State.
     * The device protection status.
     */
    @SerializedName(value = "windowsProtectionState", alternate = {"WindowsProtectionState"})
    @Expose
    public WindowsProtectionState windowsProtectionState;


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


        if (json.has("securityBaselineStates")) {
            securityBaselineStates = serializer.deserializeObject(json.get("securityBaselineStates").toString(), SecurityBaselineStateCollectionPage.class);
        }

        if (json.has("deviceCompliancePolicyStates")) {
            deviceCompliancePolicyStates = serializer.deserializeObject(json.get("deviceCompliancePolicyStates").toString(), DeviceCompliancePolicyStateCollectionPage.class);
        }

        if (json.has("deviceConfigurationStates")) {
            deviceConfigurationStates = serializer.deserializeObject(json.get("deviceConfigurationStates").toString(), DeviceConfigurationStateCollectionPage.class);
        }

        if (json.has("managedDeviceMobileAppConfigurationStates")) {
            managedDeviceMobileAppConfigurationStates = serializer.deserializeObject(json.get("managedDeviceMobileAppConfigurationStates").toString(), ManagedDeviceMobileAppConfigurationStateCollectionPage.class);
        }

        if (json.has("detectedApps")) {
            detectedApps = serializer.deserializeObject(json.get("detectedApps").toString(), DetectedAppCollectionPage.class);
        }

        if (json.has("logCollectionRequests")) {
            logCollectionRequests = serializer.deserializeObject(json.get("logCollectionRequests").toString(), DeviceLogCollectionResponseCollectionPage.class);
        }

        if (json.has("users")) {
            users = serializer.deserializeObject(json.get("users").toString(), UserCollectionPage.class);
        }
    }
}
