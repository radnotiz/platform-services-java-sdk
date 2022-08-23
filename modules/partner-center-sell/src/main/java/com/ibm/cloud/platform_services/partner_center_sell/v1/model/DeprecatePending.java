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
 * The deprecation process of the product is in the pending state.
 */
public class DeprecatePending extends GenericModel {

  protected String deprecateDate;
  protected String deprecateState;
  protected String description;

  /**
   * Gets the deprecateDate.
   *
   * The time when the product was deprecated in standard ISO 8601 format.
   *
   * @return the deprecateDate
   */
  public String getDeprecateDate() {
    return deprecateDate;
  }

  /**
   * Gets the deprecateState.
   *
   * The deprecation state of the product.
   *
   * @return the deprecateState
   */
  public String getDeprecateState() {
    return deprecateState;
  }

  /**
   * Gets the description.
   *
   * The reason why the product is getting deprecated.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }
}

