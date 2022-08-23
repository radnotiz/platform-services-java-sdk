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
 * The updateSupport options.
 */
public class UpdateSupportOptions extends GenericModel {

  /**
   * The provider type for support of your product.
   */
  public interface SupportType {
    /** third-party. */
    String THIRD_PARTY = "third-party";
    /** community. */
    String COMMUNITY = "community";
  }

  protected String productId;
  protected List<EscalationContactsUpdate> escalationContacts;
  protected List<String> locations;
  protected List<SupportDetails> supportDetails;
  protected SupportEscalation supportEscalation;
  protected String supportType;
  protected String url;

  /**
   * Builder.
   */
  public static class Builder {
    private String productId;
    private List<EscalationContactsUpdate> escalationContacts;
    private List<String> locations;
    private List<SupportDetails> supportDetails;
    private SupportEscalation supportEscalation;
    private String supportType;
    private String url;

    private Builder(UpdateSupportOptions updateSupportOptions) {
      this.productId = updateSupportOptions.productId;
      this.escalationContacts = updateSupportOptions.escalationContacts;
      this.locations = updateSupportOptions.locations;
      this.supportDetails = updateSupportOptions.supportDetails;
      this.supportEscalation = updateSupportOptions.supportEscalation;
      this.supportType = updateSupportOptions.supportType;
      this.url = updateSupportOptions.url;
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
     * Builds a UpdateSupportOptions.
     *
     * @return the new UpdateSupportOptions instance
     */
    public UpdateSupportOptions build() {
      return new UpdateSupportOptions(this);
    }

    /**
     * Adds an escalationContacts to escalationContacts.
     *
     * @param escalationContacts the new escalationContacts
     * @return the UpdateSupportOptions builder
     */
    public Builder addEscalationContacts(EscalationContactsUpdate escalationContacts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(escalationContacts,
        "escalationContacts cannot be null");
      if (this.escalationContacts == null) {
        this.escalationContacts = new ArrayList<EscalationContactsUpdate>();
      }
      this.escalationContacts.add(escalationContacts);
      return this;
    }

    /**
     * Adds an locations to locations.
     *
     * @param locations the new locations
     * @return the UpdateSupportOptions builder
     */
    public Builder addLocations(String locations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(locations,
        "locations cannot be null");
      if (this.locations == null) {
        this.locations = new ArrayList<String>();
      }
      this.locations.add(locations);
      return this;
    }

    /**
     * Adds an supportDetails to supportDetails.
     *
     * @param supportDetails the new supportDetails
     * @return the UpdateSupportOptions builder
     */
    public Builder addSupportDetails(SupportDetails supportDetails) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(supportDetails,
        "supportDetails cannot be null");
      if (this.supportDetails == null) {
        this.supportDetails = new ArrayList<SupportDetails>();
      }
      this.supportDetails.add(supportDetails);
      return this;
    }

    /**
     * Set the productId.
     *
     * @param productId the productId
     * @return the UpdateSupportOptions builder
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Set the escalationContacts.
     * Existing escalationContacts will be replaced.
     *
     * @param escalationContacts the escalationContacts
     * @return the UpdateSupportOptions builder
     */
    public Builder escalationContacts(List<EscalationContactsUpdate> escalationContacts) {
      this.escalationContacts = escalationContacts;
      return this;
    }

    /**
     * Set the locations.
     * Existing locations will be replaced.
     *
     * @param locations the locations
     * @return the UpdateSupportOptions builder
     */
    public Builder locations(List<String> locations) {
      this.locations = locations;
      return this;
    }

    /**
     * Set the supportDetails.
     * Existing supportDetails will be replaced.
     *
     * @param supportDetails the supportDetails
     * @return the UpdateSupportOptions builder
     */
    public Builder supportDetails(List<SupportDetails> supportDetails) {
      this.supportDetails = supportDetails;
      return this;
    }

    /**
     * Set the supportEscalation.
     *
     * @param supportEscalation the supportEscalation
     * @return the UpdateSupportOptions builder
     */
    public Builder supportEscalation(SupportEscalation supportEscalation) {
      this.supportEscalation = supportEscalation;
      return this;
    }

    /**
     * Set the supportType.
     *
     * @param supportType the supportType
     * @return the UpdateSupportOptions builder
     */
    public Builder supportType(String supportType) {
      this.supportType = supportType;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the UpdateSupportOptions builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected UpdateSupportOptions() { }

  protected UpdateSupportOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.productId,
      "productId cannot be empty");
    productId = builder.productId;
    escalationContacts = builder.escalationContacts;
    locations = builder.locations;
    supportDetails = builder.supportDetails;
    supportEscalation = builder.supportEscalation;
    supportType = builder.supportType;
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a UpdateSupportOptions builder
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
   * Gets the escalationContacts.
   *
   * The direct contact for IBM Cloud Support leaders to communicate with the support leader of your product. This
   * contact information is not displayed on the product detail page in the catalog.
   *
   * @return the escalationContacts
   */
  public List<EscalationContactsUpdate> escalationContacts() {
    return escalationContacts;
  }

  /**
   * Gets the locations.
   *
   * The locations where support is provided from.
   *
   * @return the locations
   */
  public List<String> locations() {
    return locations;
  }

  /**
   * Gets the supportDetails.
   *
   * Provide details about the available options for getting support. The details that you provide are displayed on your
   * product details page in the catalog.
   *
   * @return the supportDetails
   */
  public List<SupportDetails> supportDetails() {
    return supportDetails;
  }

  /**
   * Gets the supportEscalation.
   *
   * The details about your support escalation process. The details that you provide are displayed on your product
   * details page in the catalog.
   *
   * @return the supportEscalation
   */
  public SupportEscalation supportEscalation() {
    return supportEscalation;
  }

  /**
   * Gets the supportType.
   *
   * The provider type for support of your product.
   *
   * @return the supportType
   */
  public String supportType() {
    return supportType;
  }

  /**
   * Gets the url.
   *
   * The support site URL where users can go to get help, answer their questions, or ask experts and the community for
   * help.
   *
   * @return the url
   */
  public String url() {
    return url;
  }
}

