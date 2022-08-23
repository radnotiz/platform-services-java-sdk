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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateCatalog options.
 */
public class UpdateCatalogOptions extends GenericModel {

  /**
   * The pricing model for your product.
   */
  public interface PricingModel {
    /** free. */
    String FREE = "free";
    /** byol. */
    String BYOL = "byol";
  }

  public interface ProviderType {
    /** ibm_community. */
    String IBM_COMMUNITY = "ibm_community";
    /** ibm_third_party. */
    String IBM_THIRD_PARTY = "ibm_third_party";
  }

  protected String productId;
  protected String catalogId;
  protected String description;
  protected String iconUrl;
  protected List<String> keywords;
  protected String pricingModel;
  protected String category;
  protected List<String> providerType;
  protected String label;
  protected String name;
  protected String provider;
  protected List<String> tags;
  protected String documentationUrl;
  protected List<HighlightSectionInput> highlights;
  protected String longDescription;
  protected List<MediaSectionInput> media;

  /**
   * Builder.
   */
  public static class Builder {
    private String productId;
    private String catalogId;
    private String description;
    private String iconUrl;
    private List<String> keywords;
    private String pricingModel;
    private String category;
    private List<String> providerType;
    private String label;
    private String name;
    private String provider;
    private List<String> tags;
    private String documentationUrl;
    private List<HighlightSectionInput> highlights;
    private String longDescription;
    private List<MediaSectionInput> media;

    private Builder(UpdateCatalogOptions updateCatalogOptions) {
      this.productId = updateCatalogOptions.productId;
      this.catalogId = updateCatalogOptions.catalogId;
      this.description = updateCatalogOptions.description;
      this.iconUrl = updateCatalogOptions.iconUrl;
      this.keywords = updateCatalogOptions.keywords;
      this.pricingModel = updateCatalogOptions.pricingModel;
      this.category = updateCatalogOptions.category;
      this.providerType = updateCatalogOptions.providerType;
      this.label = updateCatalogOptions.label;
      this.name = updateCatalogOptions.name;
      this.provider = updateCatalogOptions.provider;
      this.tags = updateCatalogOptions.tags;
      this.documentationUrl = updateCatalogOptions.documentationUrl;
      this.highlights = updateCatalogOptions.highlights;
      this.longDescription = updateCatalogOptions.longDescription;
      this.media = updateCatalogOptions.media;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param productId the productId
     */
    public Builder(String productId) {
      this.productId = productId;
    }

    /**
     * Builds a UpdateCatalogOptions.
     *
     * @return the new UpdateCatalogOptions instance
     */
    public UpdateCatalogOptions build() {
      return new UpdateCatalogOptions(this);
    }

    /**
     * Adds an keywords to keywords.
     *
     * @param keywords the new keywords
     * @return the UpdateCatalogOptions builder
     */
    public Builder addKeywords(String keywords) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(keywords,
        "keywords cannot be null");
      if (this.keywords == null) {
        this.keywords = new ArrayList<String>();
      }
      this.keywords.add(keywords);
      return this;
    }

    /**
     * Adds an providerType to providerType.
     *
     * @param providerType the new providerType
     * @return the UpdateCatalogOptions builder
     */
    public Builder addProviderType(String providerType) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(providerType,
        "providerType cannot be null");
      if (this.providerType == null) {
        this.providerType = new ArrayList<String>();
      }
      this.providerType.add(providerType);
      return this;
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the UpdateCatalogOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds an highlights to highlights.
     *
     * @param highlights the new highlights
     * @return the UpdateCatalogOptions builder
     */
    public Builder addHighlights(HighlightSectionInput highlights) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(highlights,
        "highlights cannot be null");
      if (this.highlights == null) {
        this.highlights = new ArrayList<HighlightSectionInput>();
      }
      this.highlights.add(highlights);
      return this;
    }

    /**
     * Adds an media to media.
     *
     * @param media the new media
     * @return the UpdateCatalogOptions builder
     */
    public Builder addMedia(MediaSectionInput media) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(media,
        "media cannot be null");
      if (this.media == null) {
        this.media = new ArrayList<MediaSectionInput>();
      }
      this.media.add(media);
      return this;
    }

    /**
     * Set the productId.
     *
     * @param productId the productId
     * @return the UpdateCatalogOptions builder
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the UpdateCatalogOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateCatalogOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the iconUrl.
     *
     * @param iconUrl the iconUrl
     * @return the UpdateCatalogOptions builder
     */
    public Builder iconUrl(String iconUrl) {
      this.iconUrl = iconUrl;
      return this;
    }

    /**
     * Set the keywords.
     * Existing keywords will be replaced.
     *
     * @param keywords the keywords
     * @return the UpdateCatalogOptions builder
     */
    public Builder keywords(List<String> keywords) {
      this.keywords = keywords;
      return this;
    }

    /**
     * Set the pricingModel.
     *
     * @param pricingModel the pricingModel
     * @return the UpdateCatalogOptions builder
     */
    public Builder pricingModel(String pricingModel) {
      this.pricingModel = pricingModel;
      return this;
    }

    /**
     * Set the category.
     *
     * @param category the category
     * @return the UpdateCatalogOptions builder
     */
    public Builder category(String category) {
      this.category = category;
      return this;
    }

    /**
     * Set the providerType.
     * Existing providerType will be replaced.
     *
     * @param providerType the providerType
     * @return the UpdateCatalogOptions builder
     */
    public Builder providerType(List<String> providerType) {
      this.providerType = providerType;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the UpdateCatalogOptions builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateCatalogOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the provider.
     *
     * @param provider the provider
     * @return the UpdateCatalogOptions builder
     */
    public Builder provider(String provider) {
      this.provider = provider;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the UpdateCatalogOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the documentationUrl.
     *
     * @param documentationUrl the documentationUrl
     * @return the UpdateCatalogOptions builder
     */
    public Builder documentationUrl(String documentationUrl) {
      this.documentationUrl = documentationUrl;
      return this;
    }

    /**
     * Set the highlights.
     * Existing highlights will be replaced.
     *
     * @param highlights the highlights
     * @return the UpdateCatalogOptions builder
     */
    public Builder highlights(List<HighlightSectionInput> highlights) {
      this.highlights = highlights;
      return this;
    }

    /**
     * Set the longDescription.
     *
     * @param longDescription the longDescription
     * @return the UpdateCatalogOptions builder
     */
    public Builder longDescription(String longDescription) {
      this.longDescription = longDescription;
      return this;
    }

    /**
     * Set the media.
     * Existing media will be replaced.
     *
     * @param media the media
     * @return the UpdateCatalogOptions builder
     */
    public Builder media(List<MediaSectionInput> media) {
      this.media = media;
      return this;
    }
  }

  protected UpdateCatalogOptions() { }

  protected UpdateCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.productId,
      "productId cannot be empty");
    productId = builder.productId;
    catalogId = builder.catalogId;
    description = builder.description;
    iconUrl = builder.iconUrl;
    keywords = builder.keywords;
    pricingModel = builder.pricingModel;
    category = builder.category;
    providerType = builder.providerType;
    label = builder.label;
    name = builder.name;
    provider = builder.provider;
    tags = builder.tags;
    documentationUrl = builder.documentationUrl;
    highlights = builder.highlights;
    longDescription = builder.longDescription;
    media = builder.media;
  }

  /**
   * New builder.
   *
   * @return a UpdateCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the productId.
   *
   * The unique ID of the product. This ID can be obtained by calling the list products method and also can be found in
   * Partner Center.
   *
   * @return the productId
   */
  public String productId() {
    return productId;
  }

  /**
   * Gets the catalogId.
   *
   * The ID of the private catalog where your products are created.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the description.
   *
   * The description of the product.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the iconUrl.
   *
   * The URL for your company or product logo.
   *
   * @return the iconUrl
   */
  public String iconUrl() {
    return iconUrl;
  }

  /**
   * Gets the keywords.
   *
   * The key search terms that are associated with your product.
   *
   * @return the keywords
   */
  public List<String> keywords() {
    return keywords;
  }

  /**
   * Gets the pricingModel.
   *
   * The pricing model for your product.
   *
   * @return the pricingModel
   */
  public String pricingModel() {
    return pricingModel;
  }

  /**
   * Gets the category.
   *
   * A list of values that are used to categorize products in the catalog. By using the Catalogs management CLI plug-in,
   * run the `ibmcloud catalog offering category-options` CLI command to list all possible values.
   *
   * @return the category
   */
  public String category() {
    return category;
  }

  /**
   * Gets the providerType.
   *
   * @return the providerType
   */
  public List<String> providerType() {
    return providerType;
  }

  /**
   * Gets the label.
   *
   * The name of the product.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the name.
   *
   * The name of the product.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the provider.
   *
   * The name of your company.
   *
   * @return the provider
   */
  public String provider() {
    return provider;
  }

  /**
   * Gets the tags.
   *
   * The keywords and phrases that are associated with your product.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the documentationUrl.
   *
   * The link to the warranted product documentation.
   *
   * @return the documentationUrl
   */
  public String documentationUrl() {
    return documentationUrl;
  }

  /**
   * Gets the highlights.
   *
   * The attributes of the product that differentiate it in the market.
   *
   * @return the highlights
   */
  public List<HighlightSectionInput> highlights() {
    return highlights;
  }

  /**
   * Gets the longDescription.
   *
   * The description about the details of the product. You can use markdown syntax to provide this description.
   *
   * @return the longDescription
   */
  public String longDescription() {
    return longDescription;
  }

  /**
   * Gets the media.
   *
   * The images or videos that show off the product.
   *
   * @return the media
   */
  public List<MediaSectionInput> media() {
    return media;
  }
}

