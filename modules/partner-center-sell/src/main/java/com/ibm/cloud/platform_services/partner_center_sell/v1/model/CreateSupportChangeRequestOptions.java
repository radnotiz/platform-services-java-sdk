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
 * The createSupportChangeRequest options.
 */
public class CreateSupportChangeRequestOptions extends GenericModel {

  protected String productId;
  protected Support change;

  /**
   * Builder.
   */
  public static class Builder {
    private String productId;
    private Support change;

    private Builder(CreateSupportChangeRequestOptions createSupportChangeRequestOptions) {
      this.productId = createSupportChangeRequestOptions.productId;
      this.change = createSupportChangeRequestOptions.change;
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
     * @param change the change
     */
    public Builder(String productId, Support change) {
      this.productId = productId;
      this.change = change;
    }

    /**
     * Builds a CreateSupportChangeRequestOptions.
     *
     * @return the new CreateSupportChangeRequestOptions instance
     */
    public CreateSupportChangeRequestOptions build() {
      return new CreateSupportChangeRequestOptions(this);
    }

    /**
     * Set the productId.
     *
     * @param productId the productId
     * @return the CreateSupportChangeRequestOptions builder
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Set the change.
     *
     * @param change the change
     * @return the CreateSupportChangeRequestOptions builder
     */
    public Builder change(Support change) {
      this.change = change;
      return this;
    }
  }

  protected CreateSupportChangeRequestOptions() { }

  protected CreateSupportChangeRequestOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.productId,
      "productId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.change,
      "change cannot be null");
    productId = builder.productId;
    change = builder.change;
  }

  /**
   * New builder.
   *
   * @return a CreateSupportChangeRequestOptions builder
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

