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
 * The attributes of the product that differentiate it in the market.
 */
public class HighlightSectionInput extends GenericModel {

  protected String description;
  protected String title;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String title;

    private Builder(HighlightSectionInput highlightSectionInput) {
      this.description = highlightSectionInput.description;
      this.title = highlightSectionInput.title;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a HighlightSectionInput.
     *
     * @return the new HighlightSectionInput instance
     */
    public HighlightSectionInput build() {
      return new HighlightSectionInput(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the HighlightSectionInput builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the title.
     *
     * @param title the title
     * @return the HighlightSectionInput builder
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }

  protected HighlightSectionInput() { }

  protected HighlightSectionInput(Builder builder) {
    description = builder.description;
    title = builder.title;
  }

  /**
   * New builder.
   *
   * @return a HighlightSectionInput builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * The description about the features of the product.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the title.
   *
   * The descriptive title for the feature.
   *
   * @return the title
   */
  public String title() {
    return title;
  }
}

