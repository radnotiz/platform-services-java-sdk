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
 * Provide details about the available options for getting support. The details that you provide are displayed on your
 * product details page in the catalog.
 */
public class SupportDetails extends GenericModel {

  /**
   * Provide information about how your customers can get support.
   */
  public interface Type {
    /** email. */
    String EMAIL = "email";
    /** chat. */
    String CHAT = "chat";
    /** slack. */
    String SLACK = "slack";
    /** phone. */
    String PHONE = "phone";
    /** other. */
    String OTHER = "other";
  }

  protected SupportDetailsAvailability availability;
  protected String contact;
  @SerializedName("response_wait_time")
  protected SupportResponseTimes responseWaitTime;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private SupportDetailsAvailability availability;
    private String contact;
    private SupportResponseTimes responseWaitTime;
    private String type;

    private Builder(SupportDetails supportDetails) {
      this.availability = supportDetails.availability;
      this.contact = supportDetails.contact;
      this.responseWaitTime = supportDetails.responseWaitTime;
      this.type = supportDetails.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SupportDetails.
     *
     * @return the new SupportDetails instance
     */
    public SupportDetails build() {
      return new SupportDetails(this);
    }

    /**
     * Set the availability.
     *
     * @param availability the availability
     * @return the SupportDetails builder
     */
    public Builder availability(SupportDetailsAvailability availability) {
      this.availability = availability;
      return this;
    }

    /**
     * Set the contact.
     *
     * @param contact the contact
     * @return the SupportDetails builder
     */
    public Builder contact(String contact) {
      this.contact = contact;
      return this;
    }

    /**
     * Set the responseWaitTime.
     *
     * @param responseWaitTime the responseWaitTime
     * @return the SupportDetails builder
     */
    public Builder responseWaitTime(SupportResponseTimes responseWaitTime) {
      this.responseWaitTime = responseWaitTime;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the SupportDetails builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected SupportDetails() { }

  protected SupportDetails(Builder builder) {
    availability = builder.availability;
    contact = builder.contact;
    responseWaitTime = builder.responseWaitTime;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a SupportDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the availability.
   *
   * The details about the availability of your support service. At minimum, your support service must be available 8
   * hours a day, Monday through Friday.
   *
   * @return the availability
   */
  public SupportDetailsAvailability availability() {
    return availability;
  }

  /**
   * Gets the contact.
   *
   * Provide your support contact information. Don't include details with personal information, for example personal
   * emails.
   *
   * @return the contact
   */
  public String contact() {
    return contact;
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

  /**
   * Gets the type.
   *
   * Provide information about how your customers can get support.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

