// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Deleted;
import com.microsoft.graph.models.extensions.Root;
import com.microsoft.graph.models.extensions.SharepointIds;
import com.microsoft.graph.models.extensions.SiteCollection;
import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.models.extensions.ColumnDefinition;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.BaseItem;
import com.microsoft.graph.models.extensions.List;
import com.microsoft.graph.models.extensions.SitePage;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionPage;
import com.microsoft.graph.requests.extensions.DriveCollectionPage;
import com.microsoft.graph.requests.extensions.BaseItemCollectionPage;
import com.microsoft.graph.requests.extensions.ListCollectionPage;
import com.microsoft.graph.requests.extensions.SitePageCollectionPage;
import com.microsoft.graph.requests.extensions.SiteCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site.
 */
public class Site extends BaseItem implements IJsonBackedObject {


    /**
     * The Deleted.
     * 
     */
    @SerializedName(value = "deleted", alternate = {"Deleted"})
    @Expose
    public Deleted deleted;

    /**
     * The Display Name.
     * The full title for the site. Read-only.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Root.
     * If present, indicates that this is the root site in the site collection. Read-only.
     */
    @SerializedName(value = "root", alternate = {"Root"})
    @Expose
    public Root root;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName(value = "sharepointIds", alternate = {"SharepointIds"})
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The Site Collection.
     * Provides details about the site's site collection. Available only on the root site. Read-only.
     */
    @SerializedName(value = "siteCollection", alternate = {"SiteCollection"})
    @Expose
    public SiteCollection siteCollection;

    /**
     * The Analytics.
     * Analytics about the view activities that took place in this site.
     */
    @SerializedName(value = "analytics", alternate = {"Analytics"})
    @Expose
    public ItemAnalytics analytics;

    /**
     * The Columns.
     * The collection of column definitions reusable across lists under this site.
     */
    @SerializedName(value = "columns", alternate = {"Columns"})
    @Expose
    public ColumnDefinitionCollectionPage columns;

    /**
     * The Content Types.
     * The collection of content types defined for this site.
     */
    @SerializedName(value = "contentTypes", alternate = {"ContentTypes"})
    @Expose
    public ContentTypeCollectionPage contentTypes;

    /**
     * The Drive.
     * The default drive (document library) for this site.
     */
    @SerializedName(value = "drive", alternate = {"Drive"})
    @Expose
    public Drive drive;

    /**
     * The Drives.
     * The collection of drives (document libraries) under this site.
     */
    @SerializedName(value = "drives", alternate = {"Drives"})
    @Expose
    public DriveCollectionPage drives;

    /**
     * The Items.
     * Used to address any item contained in this site. This collection cannot be enumerated.
     */
    @SerializedName(value = "items", alternate = {"Items"})
    @Expose
    public BaseItemCollectionPage items;

    /**
     * The Lists.
     * The collection of lists under this site.
     */
    @SerializedName(value = "lists", alternate = {"Lists"})
    @Expose
    public ListCollectionPage lists;

    /**
     * The Pages.
     * The collection of pages in the SitePages list in this site.
     */
    @SerializedName(value = "pages", alternate = {"Pages"})
    @Expose
    public SitePageCollectionPage pages;

    /**
     * The Sites.
     * The collection of the sub-sites under this site.
     */
    @SerializedName(value = "sites", alternate = {"Sites"})
    @Expose
    public SiteCollectionPage sites;

    /**
     * The Onenote.
     * Calls the OneNote service for notebook related operations.
     */
    @SerializedName(value = "onenote", alternate = {"Onenote"})
    @Expose
    public Onenote onenote;


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


        if (json.has("columns")) {
            columns = serializer.deserializeObject(json.get("columns").toString(), ColumnDefinitionCollectionPage.class);
        }

        if (json.has("contentTypes")) {
            contentTypes = serializer.deserializeObject(json.get("contentTypes").toString(), ContentTypeCollectionPage.class);
        }

        if (json.has("drives")) {
            drives = serializer.deserializeObject(json.get("drives").toString(), DriveCollectionPage.class);
        }

        if (json.has("items")) {
            items = serializer.deserializeObject(json.get("items").toString(), BaseItemCollectionPage.class);
        }

        if (json.has("lists")) {
            lists = serializer.deserializeObject(json.get("lists").toString(), ListCollectionPage.class);
        }

        if (json.has("pages")) {
            pages = serializer.deserializeObject(json.get("pages").toString(), SitePageCollectionPage.class);
        }

        if (json.has("sites")) {
            sites = serializer.deserializeObject(json.get("sites").toString(), SiteCollectionPage.class);
        }
    }
}
