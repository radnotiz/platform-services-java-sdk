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
 * The updateSupportChangeRequest options.
 */
public class UpdateSupportChangeRequestOptions extends GenericModel {

  protected String productId;
  protected String changeRequestId;
  protected Support change;

  /**
   * Builder.
   */
  public static class Builder {
    private String productId;
    private String changeRequestId;
    private Support change;

    private Builder(UpdateSupportChangeRequestOptions updateSupportChangeRequestOptions) {
      this.productId = updateSupportChangeRequestOptions.productId;
      this.changeRequestId = updateSupportChangeRequestOptions.changeRequestId;
      this.change = updateSupportChangeRequestOptions.change;
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
     * @param change the change
     */
    public Builder(String productId, String changeRequestId, Support change) {
      this.productId = productId;
      this.changeRequestId = changeRequestId;
      this.change = change;
    }

    /**
     * Builds a UpdateSupportChangeRequestOptions.
     *
     * @return the new UpdateSupportChangeRequestOptions instance
     */
    public UpdateSupportChangeRequestOptions build() {
      return new UpdateSupportChangeRequestOptions(this);
    }

    /**
     * Set the productId.
     *
     * @param productId the productId
     * @return the UpdateSupportChangeRequestOptions builder
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Set the changeRequestId.
     *
     * @param changeRequestId the changeRequestId
     * @return the UpdateSupportChangeRequestOptions builder
     */
    public Builder changeRequestId(String changeRequestId) {
      this.changeRequestId = changeRequestId;
      return this;
    }

    /**
     * Set the change.
     *
     * @param change the change
     * @return the UpdateSupportChangeRequestOptions builder
     */
    public Builder change(Support change) {
      this.change = change;
      return this;
    }
  }

  protected UpdateSupportChangeRequestOptions() { }

  protected UpdateSupportChangeRequestOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.productId,
      "productId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.changeRequestId,
      "changeRequestId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.change,
      "change cannot be null");
    productId = builder.productId;
    changeRequestId = builder.changeRequestId;
    change = builder.change;
  }

  /**
   * New builder.
   *
   * @return a UpdateSupportChangeRequestOptions builder
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

  /**
   * Gets the change.
   *
   * Provide details about how customers can get help when they are using your product.
   *
   * @return the change
   */
  public Support change() {
    return change;
  }
}

