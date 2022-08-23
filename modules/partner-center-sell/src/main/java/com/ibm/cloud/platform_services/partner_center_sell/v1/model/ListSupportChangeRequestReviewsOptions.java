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
 * The listSupportChangeRequestReviews options.
 */
public class ListSupportChangeRequestReviewsOptions extends GenericModel {

  protected String productId;
  protected String changeRequestId;

  /**
   * Builder.
   */
  public static class Builder {
    private String productId;
    private String changeRequestId;

    private Builder(ListSupportChangeRequestReviewsOptions listSupportChangeRequestReviewsOptions) {
      this.productId = listSupportChangeRequestReviewsOptions.productId;
      this.changeRequestId = listSupportChangeRequestReviewsOptions.changeRequestId;
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
     * @param changeRequestId the changeRequestId
     */
    public Builder(String productId, String changeRequestId) {
      this.productId = productId;
      this.changeRequestId = changeRequestId;
    }

    /**
     * Builds a ListSupportChangeRequestReviewsOptions.
     *
     * @return the new ListSupportChangeRequestReviewsOptions instance
     */
    public ListSupportChangeRequestReviewsOptions build() {
      return new ListSupportChangeRequestReviewsOptions(this);
    }

    /**
     * Set the productId.
     *
     * @param productId the productId
     * @return the ListSupportChangeRequestReviewsOptions builder
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Set the changeRequestId.
     *
     * @param changeRequestId the changeRequestId
     * @return the ListSupportChangeRequestReviewsOptions builder
     */
    public Builder changeRequestId(String changeRequestId) {
      this.changeRequestId = changeRequestId;
      return this;
    }
  }

  protected ListSupportChangeRequestReviewsOptions() { }

  protected ListSupportChangeRequestReviewsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.productId,
      "productId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.changeRequestId,
      "changeRequestId cannot be empty");
    productId = builder.productId;
    changeRequestId = builder.changeRequestId;
  }

  /**
   * New builder.
   *
   * @return a ListSupportChangeRequestReviewsOptions builder
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
   * Gets the changeRequestId.
   *
   * The resource ID of the change request. This ID can be obtained by getting the offering and finding the current
   * change request on it.
   *
   * @return the changeRequestId
   */
  public String changeRequestId() {
    return changeRequestId;
  }
}

