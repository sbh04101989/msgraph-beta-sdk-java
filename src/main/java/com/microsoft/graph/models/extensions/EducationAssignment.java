// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EducationAddedStudentAction;
import com.microsoft.graph.models.extensions.EducationAssignmentRecipient;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.EducationAssignmentGradeType;
import com.microsoft.graph.models.extensions.EducationItemBody;
import com.microsoft.graph.models.generated.EducationAssignmentStatus;
import com.microsoft.graph.models.extensions.EducationCategory;
import com.microsoft.graph.models.extensions.EducationAssignmentResource;
import com.microsoft.graph.models.extensions.EducationRubric;
import com.microsoft.graph.models.extensions.EducationSubmission;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EducationCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.EducationAssignmentResourceCollectionPage;
import com.microsoft.graph.requests.extensions.EducationSubmissionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment.
 */
public class EducationAssignment extends Entity implements IJsonBackedObject {


    /**
     * The Added Student Action.
     * Optional field to control the assignment behavior for students who are added after the assignment is published. If not specified, defaults to none value. Currently supports only two values: none or assignIfOpen.
     */
    @SerializedName(value = "addedStudentAction", alternate = {"AddedStudentAction"})
    @Expose
    public EducationAddedStudentAction addedStudentAction;

    /**
     * The Allow Late Submissions.
     * Identifies whether students can submit after the due date. If this property is not specified during create, it defaults to true.
     */
    @SerializedName(value = "allowLateSubmissions", alternate = {"AllowLateSubmissions"})
    @Expose
    public Boolean allowLateSubmissions;

    /**
     * The Allow Students To Add Resources To Submission.
     * Identifies whether students can add their own resources to a submission or if they can only modify resources added by the teacher.
     */
    @SerializedName(value = "allowStudentsToAddResourcesToSubmission", alternate = {"AllowStudentsToAddResourcesToSubmission"})
    @Expose
    public Boolean allowStudentsToAddResourcesToSubmission;

    /**
     * The Assign Date Time.
     * The date when the assignment should become active.  If in the future, the assignment is not shown to the student until this date.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "assignDateTime", alternate = {"AssignDateTime"})
    @Expose
    public java.util.Calendar assignDateTime;

    /**
     * The Assigned Date Time.
     * The moment that the assignment was published to students and the assignment shows up on the students timeline.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "assignedDateTime", alternate = {"AssignedDateTime"})
    @Expose
    public java.util.Calendar assignedDateTime;

    /**
     * The Assign To.
     * Which users, or whole class should receive a submission object once the assignment is published.
     */
    @SerializedName(value = "assignTo", alternate = {"AssignTo"})
    @Expose
    public EducationAssignmentRecipient assignTo;

    /**
     * The Class Id.
     * Class which this assignment belongs.
     */
    @SerializedName(value = "classId", alternate = {"ClassId"})
    @Expose
    public String classId;

    /**
     * The Close Date Time.
     * Date when the assignment will be closed for submissions. This is an optional field that can be null if the assignment does not allowLateSubmissions or when the closeDateTime is the same as the dueDateTime. But if specified, then the closeDateTime must be greater than or equal to the dueDateTime. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "closeDateTime", alternate = {"CloseDateTime"})
    @Expose
    public java.util.Calendar closeDateTime;

    /**
     * The Created By.
     * Who created the assignment.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * Moment when the assignment was created.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Display Name.
     * Name of the assignment.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Due Date Time.
     * Date when the students assignment is due.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "dueDateTime", alternate = {"DueDateTime"})
    @Expose
    public java.util.Calendar dueDateTime;

    /**
     * The Grading.
     * How the assignment will be graded.
     */
    @SerializedName(value = "grading", alternate = {"Grading"})
    @Expose
    public EducationAssignmentGradeType grading;

    /**
     * The Instructions.
     * Instructions for the assignment.  This along with the display name tell the student what to do.
     */
    @SerializedName(value = "instructions", alternate = {"Instructions"})
    @Expose
    public EducationItemBody instructions;

    /**
     * The Last Modified By.
     * Who last modified the assignment.
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
    public IdentitySet lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * Moment when the assignment was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Notification Channel Url.
     * Optional field to specify the URL of the channel to post the assignment publish notification. If not specified or null, defaults to the General channel. This field only applies to assignments where the assignTo value is educationAssignmentClassRecipient. Updating the notificationChannelUrl is not allowed after the assignment has been published.
     */
    @SerializedName(value = "notificationChannelUrl", alternate = {"NotificationChannelUrl"})
    @Expose
    public String notificationChannelUrl;

    /**
     * The Status.
     * Status of the Assignment.  You can not PATCH this value.  Possible values are: draft, scheduled, published, assigned.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public EducationAssignmentStatus status;

    /**
     * The Categories.
     * When set, enables users to easily find assignments of a given type.  Read-only. Nullable.
     */
    @SerializedName(value = "categories", alternate = {"Categories"})
    @Expose
    public EducationCategoryCollectionPage categories;

    /**
     * The Resources.
     * Learning objects that are associated with this assignment.  Only teachers can modify this list. Nullable.
     */
    @SerializedName(value = "resources", alternate = {"Resources"})
    @Expose
    public EducationAssignmentResourceCollectionPage resources;

    /**
     * The Rubric.
     * When set, the grading rubric attached to this assignment.
     */
    @SerializedName(value = "rubric", alternate = {"Rubric"})
    @Expose
    public EducationRubric rubric;

    /**
     * The Submissions.
     * Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable.
     */
    @SerializedName(value = "submissions", alternate = {"Submissions"})
    @Expose
    public EducationSubmissionCollectionPage submissions;


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


        if (json.has("categories")) {
            categories = serializer.deserializeObject(json.get("categories").toString(), EducationCategoryCollectionPage.class);
        }

        if (json.has("resources")) {
            resources = serializer.deserializeObject(json.get("resources").toString(), EducationAssignmentResourceCollectionPage.class);
        }

        if (json.has("submissions")) {
            submissions = serializer.deserializeObject(json.get("submissions").toString(), EducationSubmissionCollectionPage.class);
        }
    }
}
