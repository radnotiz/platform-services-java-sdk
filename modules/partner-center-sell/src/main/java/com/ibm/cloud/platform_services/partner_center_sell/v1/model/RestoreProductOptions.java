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
 * The restoreProduct options.
 */
public class RestoreProductOptions extends GenericModel {

  protected String productId;
  protected String reason;

  /**
   * Builder.
   */
  public static class Builder {
    private String productId;
    private String reason;

    private Builder(RestoreProductOptions restoreProductOptions) {
      this.productId = restoreProductOptions.productId;
      this.reason = restoreProductOptions.reason;
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
     * @param reason the reason
     */
    public Builder(String productId, String reason) {
      this.productId = productId;
      this.reason = reason;
    }

    /**
     * Builds a RestoreProductOptions.
     *
     * @return the new RestoreProductOptions instance
     */
    public RestoreProductOptions build() {
      return new RestoreProductOptions(this);
    }

    /**
     * Set the productId.
     *
     * @param productId the productId
     * @return the RestoreProductOptions builder
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Set the reason.
     *
     * @param reason the reason
     * @return the RestoreProductOptions builder
     */
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }
  }

  protected RestoreProductOptions() { }

  protected RestoreProductOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.productId,
      "productId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.reason,
      "reason cannot be null");
    productId = builder.productId;
    reason = builder.reason;
  }

  /**
   * New builder.
   *
   * @return a RestoreProductOptions builder
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
   * Gets the reason.
   *
   * The reason why you want to restore your deprecated product.
   *
   * @return the reason
   */
  public String reason() {
    return reason;
  }
}

