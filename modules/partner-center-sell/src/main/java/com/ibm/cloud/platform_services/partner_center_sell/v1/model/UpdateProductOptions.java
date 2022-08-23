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
 * The updateProduct options.
 */
public class UpdateProductOptions extends GenericModel {

  /**
   * The tax assessment for your product.
   */
  public interface TaxAssessment {
    /** SOFTWARE. */
    String SOFTWARE = "SOFTWARE";
  }

  protected String productId;
  protected Boolean materialAgreement;
  protected String productName;
  protected String taxAssessment;

  /**
   * Builder.
   */
  public static class Builder {
    private String productId;
    private Boolean materialAgreement;
    private String productName;
    private String taxAssessment;

    private Builder(UpdateProductOptions updateProductOptions) {
      this.productId = updateProductOptions.productId;
      this.materialAgreement = updateProductOptions.materialAgreement;
      this.productName = updateProductOptions.productName;
      this.taxAssessment = updateProductOptions.taxAssessment;
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
     * Builds a UpdateProductOptions.
     *
     * @return the new UpdateProductOptions instance
     */
    public UpdateProductOptions build() {
      return new UpdateProductOptions(this);
    }

    /**
     * Set the productId.
     *
     * @param productId the productId
     * @return the UpdateProductOptions builder
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * Set the materialAgreement.
     *
     * @param materialAgreement the materialAgreement
     * @return the UpdateProductOptions builder
     */
    public Builder materialAgreement(Boolean materialAgreement) {
      this.materialAgreement = materialAgreement;
      return this;
    }

    /**
     * Set the productName.
     *
     * @param productName the productName
     * @return the UpdateProductOptions builder
     */
    public Builder productName(String productName) {
      this.productName = productName;
      return this;
    }

    /**
     * Set the taxAssessment.
     *
     * @param taxAssessment the taxAssessment
     * @return the UpdateProductOptions builder
     */
    public Builder taxAssessment(String taxAssessment) {
      this.taxAssessment = taxAssessment;
      return this;
    }
  }

  protected UpdateProductOptions() { }

  protected UpdateProductOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.productId,
      "productId cannot be empty");
    productId = builder.productId;
    materialAgreement = builder.materialAgreement;
    productName = builder.productName;
    taxAssessment = builder.taxAssessment;
  }

  /**
   * New builder.
   *
   * @return a UpdateProductOptions builder
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
   * Gets the materialAgreement.
   *
   * The confirmation that your company is authorized to use all materials.
   *
   * @return the materialAgreement
   */
  public Boolean materialAgreement() {
    return materialAgreement;
  }

  /**
   * Gets the productName.
   *
   * The name of the product that you are onboarding. This name is displayed to users when you publish your product in
   * the catalog.
   *
   * @return the productName
   */
  public String productName() {
    return productName;
  }

  /**
   * Gets the taxAssessment.
   *
   * The tax assessment for your product.
   *
   * @return the taxAssessment
   */
  public String taxAssessment() {
    return taxAssessment;
  }
}

