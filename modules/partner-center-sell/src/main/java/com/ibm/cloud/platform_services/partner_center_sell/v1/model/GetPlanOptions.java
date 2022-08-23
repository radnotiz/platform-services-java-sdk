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
 * The getPlan options.
 */
public class GetPlanOptions extends GenericModel {

  protected String productId;
  protected String pricingPlanId;

  /**
   * Builder.
   */
  public static class Builder {
    private String productId;
    private String pricingPlanId;

    private Builder(GetPlanOptions getPlanOptions) {
      this.productId = getPlanOptions.productId;
      this.pricingPlanId = getPlanOptions.pricingPlanId;
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
     */
    public Builder(String productId, String pricingPlanId) {
      this.productId = productId;
      this.pricingPlanId = pricingPlanId;
    }

    /**
     * Builds a GetPlanOptions.
     *
     * @return the new GetPlanOptions instance
     */
    public GetPlanOptions build() {
      return new GetPlanOptions(this);
    }

    /**
     * Set the productId.
     *
     * @param productId the productId
     * @return the GetPlanOptions builder
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Set the pricingPlanId.
     *
     * @param pricingPlanId the pricingPlanId
     * @return the GetPlanOptions builder
     */
    public Builder pricingPlanId(String pricingPlanId) {
      this.pricingPlanId = pricingPlanId;
      return this;
    }
  }

  protected GetPlanOptions() { }

  protected GetPlanOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.productId,
      "productId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.pricingPlanId,
      "pricingPlanId cannot be empty");
    productId = builder.productId;
    pricingPlanId = builder.pricingPlanId;
  }

  /**
   * New builder.
   *
   * @return a GetPlanOptions builder
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
}

