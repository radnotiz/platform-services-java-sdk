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
 * The createProduct options.
 */
public class CreateProductOptions extends GenericModel {

  /**
   * The tax assessment for your product.
   */
  public interface TaxAssessment {
    /** SOFTWARE. */
    String SOFTWARE = "SOFTWARE";
  }

  /**
   * The type of the product that you want to onboard to IBM Cloud.
   */
  public interface ProductType {
    /** SOFTWARE. */
    String SOFTWARE = "SOFTWARE";
    /** SOLUTION. */
    String SOLUTION = "SOLUTION";
    /** MODULE. */
    String MODULE = "MODULE";
  }

  protected String productName;
  protected String taxAssessment;
  protected String productType;
  protected Boolean materialAgreement;

  /**
   * Builder.
   */
  public static class Builder {
    private String productName;
    private String taxAssessment;
    private String productType;
    private Boolean materialAgreement;

    private Builder(CreateProductOptions createProductOptions) {
      this.productName = createProductOptions.productName;
      this.taxAssessment = createProductOptions.taxAssessment;
      this.productType = createProductOptions.productType;
      this.materialAgreement = createProductOptions.materialAgreement;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param productName the productName
     * @param taxAssessment the taxAssessment
     * @param productType the productType
     */
    public Builder(String productName, String taxAssessment, String productType) {
      this.productName = productName;
      this.taxAssessment = taxAssessment;
      this.productType = productType;
    }

    /**
     * Builds a CreateProductOptions.
     *
     * @return the new CreateProductOptions instance
     */
    public CreateProductOptions build() {
      return new CreateProductOptions(this);
    }

    /**
     * Set the productName.
     *
     * @param productName the productName
     * @return the CreateProductOptions builder
     */
    public Builder productName(String productName) {
      this.productName = productName;
      return this;
    }

    /**
     * Set the taxAssessment.
     *
     * @param taxAssessment the taxAssessment
     * @return the CreateProductOptions builder
     */
    public Builder taxAssessment(String taxAssessment) {
      this.taxAssessment = taxAssessment;
      return this;
    }

    /**
     * Set the productType.
     *
     * @param productType the productType
     * @return the CreateProductOptions builder
     */
    public Builder productType(String productType) {
      this.productType = productType;
      return this;
    }

    /**
     * Set the materialAgreement.
     *
     * @param materialAgreement the materialAgreement
     * @return the CreateProductOptions builder
     */
    public Builder materialAgreement(Boolean materialAgreement) {
      this.materialAgreement = materialAgreement;
      return this;
    }
  }

  protected CreateProductOptions() { }

  protected CreateProductOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.productName,
      "productName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.taxAssessment,
      "taxAssessment cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.productType,
      "productType cannot be null");
    productName = builder.productName;
    taxAssessment = builder.taxAssessment;
    productType = builder.productType;
    materialAgreement = builder.materialAgreement;
  }

  /**
   * New builder.
   *
   * @return a CreateProductOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the productType.
   *
   * The type of the product that you want to onboard to IBM Cloud.
   *
   * @return the productType
   */
  public String productType() {
    return productType;
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
}

