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
 * The pricing model for your product.
 */
public class License extends GenericModel {

  /**
   * The type of the pricing plan.
   */
  public interface Type {
    /** byol. */
    String BYOL = "byol";
  }

  protected String description;
  protected String id;
  protected String label;
  protected String type;
  protected String url;

  /**
   * Gets the description.
   *
   * The description of the pricing model.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the id.
   *
   * The ID of the pricing plan. This ID can be used for further pricing plan updates.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the label.
   *
   * The name of the pricing plan.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Gets the type.
   *
   * The type of the pricing plan.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the url.
   *
   * The URL to where your customers can purchase the license that is required to use your product.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }
}

