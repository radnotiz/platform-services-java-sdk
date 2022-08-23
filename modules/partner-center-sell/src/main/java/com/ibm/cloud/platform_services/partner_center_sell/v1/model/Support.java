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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Provide details about how customers can get help when they are using your product.
 */
public class Support extends GenericModel {

  /**
   * The provider type for support of your product.
   */
  public interface SupportType {
    /** third-party. */
    String THIRD_PARTY = "third-party";
    /** community. */
    String COMMUNITY = "community";
  }

  protected List<String> locations;
  protected String process;
  @SerializedName("process_i18n")
  protected Map<String, Object> processI18n;
  @SerializedName("support_details")
  protected List<SupportDetails> supportDetails;
  @SerializedName("support_escalation")
  protected SupportEscalation supportEscalation;
  @SerializedName("support_type")
  protected String supportType;
  protected String url;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> locations;
    private String process;
    private Map<String, Object> processI18n;
    private List<SupportDetails> supportDetails;
    private SupportEscalation supportEscalation;
    private String supportType;
    private String url;

    private Builder(Support support) {
      this.locations = support.locations;
      this.process = support.process;
      this.processI18n = support.processI18n;
      this.supportDetails = support.supportDetails;
      this.supportEscalation = support.supportEscalation;
      this.supportType = support.supportType;
      this.url = support.url;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Support.
     *
     * @return the new Support instance
     */
    public Support build() {
      return new Support(this);
    }

    /**
     * Adds an locations to locations.
     *
     * @param locations the new locations
     * @return the Support builder
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
     * @return the Support builder
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
     * Set the locations.
     * Existing locations will be replaced.
     *
     * @param locations the locations
     * @return the Support builder
     */
    public Builder locations(List<String> locations) {
      this.locations = locations;
      return this;
    }

    /**
     * Set the process.
     *
     * @param process the process
     * @return the Support builder
     */
    public Builder process(String process) {
      this.process = process;
      return this;
    }

    /**
     * Set the processI18n.
     *
     * @param processI18n the processI18n
     * @return the Support builder
     */
    public Builder processI18n(Map<String, Object> processI18n) {
      this.processI18n = processI18n;
      return this;
    }

    /**
     * Set the supportDetails.
     * Existing supportDetails will be replaced.
     *
     * @param supportDetails the supportDetails
     * @return the Support builder
     */
    public Builder supportDetails(List<SupportDetails> supportDetails) {
      this.supportDetails = supportDetails;
      return this;
    }

    /**
     * Set the supportEscalation.
     *
     * @param supportEscalation the supportEscalation
     * @return the Support builder
     */
    public Builder supportEscalation(SupportEscalation supportEscalation) {
      this.supportEscalation = supportEscalation;
      return this;
    }

    /**
     * Set the supportType.
     *
     * @param supportType the supportType
     * @return the Support builder
     */
    public Builder supportType(String supportType) {
      this.supportType = supportType;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the Support builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected Support() { }

  protected Support(Builder builder) {
    locations = builder.locations;
    process = builder.process;
    processI18n = builder.processI18n;
    supportDetails = builder.supportDetails;
    supportEscalation = builder.supportEscalation;
    supportType = builder.supportType;
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a Support builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the locations.
   *
   * The locations where your support team is providing support from.
   *
   * @return the locations
   */
  public List<String> locations() {
    return locations;
  }

  /**
   * Gets the process.
   *
   * Provide details about how and when customers can get in touch with your support team.
   *
   * @return the process
   */
  public String process() {
    return process;
  }

  /**
   * Gets the processI18n.
   *
   * Translated strings for the support process describing how and when customers can get in touch with your support
   * team.
   *
   * @return the processI18n
   */
  public Map<String, Object> processI18n() {
    return processI18n;
  }

  /**
   * Gets the supportDetails.
   *
   * Provide details for the available options for getting support. The details that you provide are displayed on your
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

