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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The details about your support escalation process. The details that you provide are displayed on your product details
 * page in the catalog.
 */
public class SupportEscalation extends GenericModel {

  protected String contact;
  @SerializedName("escalation_wait_time")
  protected SupportEscalationTimes escalationWaitTime;
  @SerializedName("response_wait_time")
  protected SupportResponseTimes responseWaitTime;

  /**
   * Builder.
   */
  public static class Builder {
    private String contact;
    private SupportEscalationTimes escalationWaitTime;
    private SupportResponseTimes responseWaitTime;

    private Builder(SupportEscalation supportEscalation) {
      this.contact = supportEscalation.contact;
      this.escalationWaitTime = supportEscalation.escalationWaitTime;
      this.responseWaitTime = supportEscalation.responseWaitTime;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SupportEscalation.
     *
     * @return the new SupportEscalation instance
     */
    public SupportEscalation build() {
      return new SupportEscalation(this);
    }

    /**
     * Set the contact.
     *
     * @param contact the contact
     * @return the SupportEscalation builder
     */
    public Builder contact(String contact) {
      this.contact = contact;
      return this;
    }

    /**
     * Set the escalationWaitTime.
     *
     * @param escalationWaitTime the escalationWaitTime
     * @return the SupportEscalation builder
     */
    public Builder escalationWaitTime(SupportEscalationTimes escalationWaitTime) {
      this.escalationWaitTime = escalationWaitTime;
      return this;
    }

    /**
     * Set the responseWaitTime.
     *
     * @param responseWaitTime the responseWaitTime
     * @return the SupportEscalation builder
     */
    public Builder responseWaitTime(SupportResponseTimes responseWaitTime) {
      this.responseWaitTime = responseWaitTime;
      return this;
    }
  }

  protected SupportEscalation() { }

  protected SupportEscalation(Builder builder) {
    contact = builder.contact;
    escalationWaitTime = builder.escalationWaitTime;
    responseWaitTime = builder.responseWaitTime;
  }

  /**
   * New builder.
   *
   * @return a SupportEscalation builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the contact.
   *
   * The direct contact for IBM Cloud Support leaders to communicate with the support leaders of your product. This
   * contact information is not displayed on the product details page in the catalog.
   *
   * @return the contact
   */
  public String contact() {
    return contact;
  }

  /**
   * Gets the escalationWaitTime.
   *
   * The number of hours that your customers need to wait before escalating a case.
   *
   * @return the escalationWaitTime
   */
  public SupportEscalationTimes escalationWaitTime() {
    return escalationWaitTime;
  }

  /**
   * Gets the responseWaitTime.
   *
   * The minimum number of hours that it takes to update your customers about a support case.
   *
   * @return the responseWaitTime
   */
  public SupportResponseTimes responseWaitTime() {
    return responseWaitTime;
  }
}

