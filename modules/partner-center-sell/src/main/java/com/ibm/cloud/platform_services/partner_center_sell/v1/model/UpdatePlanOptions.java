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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updatePlan options.
 */
public class UpdatePlanOptions extends GenericModel {

  /**
   * The type of the pricing plan.
   */
  public interface Type {
    /** byol. */
    String BYOL = "byol";
  }

  protected String productId;
  protected String pricingPlanId;
  protected String description;
  protected String label;
  protected String type;
  protected String url;

  /**
   * Builder.
   */
  public static class Builder {
    private String productId;
    private String pricingPlanId;
    private String description;
    private String label;
    private String type;
    private String url;

    private Builder(UpdatePlanOptions updatePlanOptions) {
      this.productId = updatePlanOptions.productId;
      this.pricingPlanId = updatePlanOptions.pricingPlanId;
      this.description = updatePlanOptions.description;
      this.label = updatePlanOptions.label;
      this.type = updatePlanOptions.type;
      this.url = updatePlanOptions.url;
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
     * @param pricingPlanId the pricingPlanId
     * @param description the description
     * @param label the label
     * @param type the type
     * @param url the url
     */
    public Builder(String productId, String pricingPlanId, String description, String label, String type, String url) {
      this.productId = productId;
      this.pricingPlanId = pricingPlanId;
      this.description = description;
      this.label = label;
      this.type = type;
      this.url = url;
    }

    /**
     * Builds a UpdatePlanOptions.
     *
     * @return the new UpdatePlanOptions instance
     */
    public UpdatePlanOptions build() {
      return new UpdatePlanOptions(this);
    }

    /**
     * Set the productId.
     *
     * @param productId the productId
     * @return the UpdatePlanOptions builder
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Set the pricingPlanId.
     *
     * @param pricingPlanId the pricingPlanId
     * @return the UpdatePlanOptions builder
     */
    public Builder pricingPlanId(String pricingPlanId) {
      this.pricingPlanId = pricingPlanId;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdatePlanOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the UpdatePlanOptions builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UpdatePlanOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the UpdatePlanOptions builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected UpdatePlanOptions() { }

  protected UpdatePlanOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.productId,
      "productId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pricingPlanId,
      "pricingPlanId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    productId = builder.productId;
    pricingPlanId = builder.pricingPlanId;
    description = builder.description;
    label = builder.label;
    type = builder.type;
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a UpdatePlanOptions builder
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
   * Gets the pricingPlanId.
   *
   * The resource ID of the pricing plan. This ID can be obtained by listing pricing plans.
   *
   * @return the pricingPlanId
   */
  public String pricingPlanId() {
    return pricingPlanId;
  }

  /**
   * Gets the description.
   *
   * The description of the pricing model.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the label.
   *
   * The name of the pricing plan.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the type.
   *
   * The type of the pricing plan.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the url.
   *
   * The URL to where your customers can purchase the license that is required to use your product.
   *
   * @return the url
   */
  public String url() {
    return url;
  }
}

