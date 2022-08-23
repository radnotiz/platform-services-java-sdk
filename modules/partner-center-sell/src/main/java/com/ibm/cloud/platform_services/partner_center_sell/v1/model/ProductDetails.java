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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The details of the product.
 */
public class ProductDetails extends GenericModel {

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
    /** SERVICE. */
    String SERVICE = "SERVICE";
  }

  /**
   * The tax assessment for your product.
   */
  public interface TaxAssessment {
    /** SOFTWARE. */
    String SOFTWARE = "SOFTWARE";
    /** SAAS. */
    String SAAS = "SAAS";
    /** IAAS. */
    String IAAS = "IAAS";
    /** PAAS. */
    String PAAS = "PAAS";
  }

  protected String accountId;
  protected String createdAt;
  protected String id;
  protected Boolean materialAgreement;
  protected String productType;
  protected String productName;
  protected String publishedAt;
  protected String taxAssessment;
  protected String updatedAt;
  protected List<ChangeRequest> changeRequests;

  /**
   * Gets the accountId.
   *
   * The unique ID for the account in which the product is being onboarded.
   *
   * @return the accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the createdAt.
   *
   * The time when the new product was created in standard ISO 8601 format.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the id.
   *
   * The ID that uniquely identifies the product in Partner Center. This ID can be found on the Dashboard tab in Partner
   * Center.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the materialAgreement.
   *
   * The confirmation that your company is authorized to use all materials.
   *
   * @return the materialAgreement
   */
  public Boolean isMaterialAgreement() {
    return materialAgreement;
  }

  /**
   * Gets the productType.
   *
   * The type of the product that you want to onboard to IBM Cloud.
   *
   * @return the productType
   */
  public String getProductType() {
    return productType;
  }

  /**
   * Gets the productName.
   *
   * The name of the product that you are onboarding. This name is displayed to users when you publish your product in
   * the catalog.
   *
   * @return the productName
   */
  public String getProductName() {
    return productName;
  }

  /**
   * Gets the publishedAt.
   *
   * The time when the new product was published to the IBM Cloud catalog in standard ISO 8601 format.
   *
   * @return the publishedAt
   */
  public String getPublishedAt() {
    return publishedAt;
  }

  /**
   * Gets the taxAssessment.
   *
   * The tax assessment for your product.
   *
   * @return the taxAssessment
   */
  public String getTaxAssessment() {
    return taxAssessment;
  }

  /**
   * Gets the updatedAt.
   *
   * The time when the product was updated in standard ISO 8601 format.
   *
   * @return the updatedAt
   */
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the changeRequests.
   *
   * @return the changeRequests
   */
  public List<ChangeRequest> getChangeRequests() {
    return changeRequests;
  }
}

