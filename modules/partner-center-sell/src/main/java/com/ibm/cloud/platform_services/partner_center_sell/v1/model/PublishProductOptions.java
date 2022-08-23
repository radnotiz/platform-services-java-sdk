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
 * The publishProduct options.
 */
public class PublishProductOptions extends GenericModel {

  protected String productId;

  /**
   * Builder.
   */
  public static class Builder {
    private String productId;

    private Builder(PublishProductOptions publishProductOptions) {
      this.productId = publishProductOptions.productId;
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
     * Builds a PublishProductOptions.
     *
     * @return the new PublishProductOptions instance
     */
    public PublishProductOptions build() {
      return new PublishProductOptions(this);
    }

    /**
     * Set the productId.
     *
     * @param productId the productId
     * @return the PublishProductOptions builder
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }
  }

  protected PublishProductOptions() { }

  protected PublishProductOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.productId,
      "productId cannot be empty");
    productId = builder.productId;
  }

  /**
   * New builder.
   *
   * @return a PublishProductOptions builder
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
}

