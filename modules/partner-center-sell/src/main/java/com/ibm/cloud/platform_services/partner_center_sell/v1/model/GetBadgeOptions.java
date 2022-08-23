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
 * The getBadge options.
 */
public class GetBadgeOptions extends GenericModel {

  protected String badgeId;

  /**
   * Builder.
   */
  public static class Builder {
    private String badgeId;

    private Builder(GetBadgeOptions getBadgeOptions) {
      this.badgeId = getBadgeOptions.badgeId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param badgeId the badgeId
     */
    public Builder(String badgeId) {
      this.badgeId = badgeId;
    }

    /**
     * Builds a GetBadgeOptions.
     *
     * @return the new GetBadgeOptions instance
     */
    public GetBadgeOptions build() {
      return new GetBadgeOptions(this);
    }

    /**
     * Set the badgeId.
     *
     * @param badgeId the badgeId
     * @return the GetBadgeOptions builder
     */
    public Builder badgeId(String badgeId) {
      this.badgeId = badgeId;
      return this;
    }
  }

  protected GetBadgeOptions() { }

  protected GetBadgeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.badgeId,
      "badgeId cannot be empty");
    badgeId = builder.badgeId;
  }

  /**
   * New builder.
   *
   * @return a GetBadgeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the badgeId.
   *
   * The unique ID of the badge. This ID can be obtained by calling the list badges method.
   *
   * @return the badgeId
   */
  public String badgeId() {
    return badgeId;
  }
}

