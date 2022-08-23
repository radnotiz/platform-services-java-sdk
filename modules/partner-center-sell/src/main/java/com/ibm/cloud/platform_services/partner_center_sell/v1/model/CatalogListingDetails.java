/*
 * (C) Copyright IBM Corp. 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.platform_services.partner_center_sell.v1.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * CatalogListingDetails.
 */
public class CatalogListingDetails extends GenericModel {

  protected String accountId;
  protected String catalogId;
  protected DeprecatePending deprecatePending;
  protected String description;
  protected String documentationUrl;
  protected Boolean editable;
  protected List<HighlightSection> highlights;
  protected String iconUrl;
  protected String id;
  protected List<String> keywords;
  protected String label;
  @SerializedName("label_i18n")
  protected Map<String, Object> labelI18n;
  protected String longDescription;
  @SerializedName("long_description_i18n")
  protected Map<String, Object> longDescriptionI18n;
  protected List<MediaSection> media;
  protected String name;
  protected Boolean pcManaged;
  protected String provider;
  protected Boolean publishedToAccessList;
  @SerializedName("publishedToIBM")
  protected Boolean publishedToIbm;
  protected Boolean publishedToPublic;
  @SerializedName("short_description_i18n")
  protected Map<String, Object> shortDescriptionI18n;
  protected List<String> tags;
  protected List<CatalogListingVersion> versions;

  /**
   * Gets the accountId.
   *
   * The unique ID for the account in which the product is being onboarded.
   *
   * @return the accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the catalogId.
   *
   * The ID of the private catalog where your products are created.
   *
   * @return the catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Gets the deprecatePending.
   *
   * The deprecation process of the product is in the pending state.
   *
   * @return the deprecatePending
   */
  public DeprecatePending getDeprecatePending() {
    return deprecatePending;
  }

  /**
   * Gets the description.
   *
   * The description of the product.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the documentationUrl.
   *
   * The link to the warranted product documentation.
   *
   * @return the documentationUrl
   */
  public String getDocumentationUrl() {
    return documentationUrl;
  }

  /**
   * Gets the editable.
   *
   * The product can be edited.
   *
   * @return the editable
   */
  public Boolean isEditable() {
    return editable;
  }

  /**
   * Gets the highlights.
   *
   * The attributes of the product that differentiate it in the market.
   *
   * @return the highlights
   */
  public List<HighlightSection> getHighlights() {
    return highlights;
  }

  /**
   * Gets the iconUrl.
   *
   * The URL for your company or product logo.
   *
   * @return the iconUrl
   */
  public String getIconUrl() {
    return iconUrl;
  }

  /**
   * Gets the id.
   *
   * The ID that uniquely identifies the product in Partner Center. This ID can be found on the Dashboard tab in Partner
   * Center.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the keywords.
   *
   * The key search terms that are associated with your product.
   *
   * @return the keywords
   */
  public List<String> getKeywords() {
    return keywords;
  }

  /**
   * Gets the label.
   *
   * The name of the product.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Gets the labelI18n.
   *
   * Translated strings for the name of the product.
   *
   * @return the labelI18n
   */
  public Map<String, Object> getLabelI18n() {
    return labelI18n;
  }

  /**
   * Gets the longDescription.
   *
   * The description about the details of the product. You can use markdown syntax to provide this description.
   *
   * @return the longDescription
   */
  public String getLongDescription() {
    return longDescription;
  }

  /**
   * Gets the longDescriptionI18n.
   *
   * Translated strings for describing the details of the product. You can use markdown syntax to provide this
   * description.
   *
   * @return the longDescriptionI18n
   */
  public Map<String, Object> getLongDescriptionI18n() {
    return longDescriptionI18n;
  }

  /**
   * Gets the media.
   *
   * The images or videos that show off the product.
   *
   * @return the media
   */
  public List<MediaSection> getMedia() {
    return media;
  }

  /**
   * Gets the name.
   *
   * The name of the product.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the pcManaged.
   *
   * The product was created in Partner Center.
   *
   * @return the pcManaged
   */
  public Boolean isPcManaged() {
    return pcManaged;
  }

  /**
   * Gets the provider.
   *
   * The name of your company.
   *
   * @return the provider
   */
  public String getProvider() {
    return provider;
  }

  /**
   * Gets the publishedToAccessList.
   *
   * The product is published to an access list. An access list is a list of accounts that your product is potentially
   * shared with.
   *
   * @return the publishedToAccessList
   */
  public Boolean isPublishedToAccessList() {
    return publishedToAccessList;
  }

  /**
   * Gets the publishedToIbm.
   *
   * The product is available to all IBMers.
   *
   * @return the publishedToIbm
   */
  public Boolean isPublishedToIbm() {
    return publishedToIbm;
  }

  /**
   * Gets the publishedToPublic.
   *
   * The product is published to the IBM Cloud catalog.
   *
   * @return the publishedToPublic
   */
  public Boolean isPublishedToPublic() {
    return publishedToPublic;
  }

  /**
   * Gets the shortDescriptionI18n.
   *
   * Translated strings for the description of the product.
   *
   * @return the shortDescriptionI18n
   */
  public Map<String, Object> getShortDescriptionI18n() {
    return shortDescriptionI18n;
  }

  /**
   * Gets the tags.
   *
   * The keywords and phrases that are associated with your product.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the versions.
   *
   * The version details of a product.
   *
   * @return the versions
   */
  public List<CatalogListingVersion> getVersions() {
    return versions;
  }
}

