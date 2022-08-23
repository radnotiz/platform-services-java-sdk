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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The attributes of the product that differentiate it in the market.
 */
public class HighlightSection extends GenericModel {

  protected String description;
  @SerializedName("description_i18n")
  protected Map<String, Object> descriptionI18n;
  protected String title;
  @SerializedName("title_i18n")
  protected Map<String, Object> titleI18n;

  /**
   * Gets the description.
   *
   * The description about the features of the product.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the descriptionI18n.
   *
   * The description about the features of the product in translation.
   *
   * @return the descriptionI18n
   */
  public Map<String, Object> getDescriptionI18n() {
    return descriptionI18n;
  }

  /**
   * Gets the title.
   *
   * The descriptive title for the feature.
   *
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Gets the titleI18n.
   *
   * The descriptive title for the feature in translation.
   *
   * @return the titleI18n
   */
  public Map<String, Object> getTitleI18n() {
    return titleI18n;
  }
}

