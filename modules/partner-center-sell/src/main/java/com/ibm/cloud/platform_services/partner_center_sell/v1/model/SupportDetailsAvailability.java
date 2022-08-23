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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The details about the availability of your support service. At minimum, your support service must be available 8
 * hours a day, Monday through Friday.
 */
public class SupportDetailsAvailability extends GenericModel {

  @SerializedName("always_available")
  protected Boolean alwaysAvailable;
  protected List<SupportDetailsAvailabilityTimes> times;
  protected String timezone;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean alwaysAvailable;
    private List<SupportDetailsAvailabilityTimes> times;
    private String timezone;

    private Builder(SupportDetailsAvailability supportDetailsAvailability) {
      this.alwaysAvailable = supportDetailsAvailability.alwaysAvailable;
      this.times = supportDetailsAvailability.times;
      this.timezone = supportDetailsAvailability.timezone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SupportDetailsAvailability.
     *
     * @return the new SupportDetailsAvailability instance
     */
    public SupportDetailsAvailability build() {
      return new SupportDetailsAvailability(this);
    }

    /**
     * Adds an times to times.
     *
     * @param times the new times
     * @return the SupportDetailsAvailability builder
     */
    public Builder addTimes(SupportDetailsAvailabilityTimes times) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(times,
        "times cannot be null");
      if (this.times == null) {
        this.times = new ArrayList<SupportDetailsAvailabilityTimes>();
      }
      this.times.add(times);
      return this;
    }

    /**
     * Set the alwaysAvailable.
     *
     * @param alwaysAvailable the alwaysAvailable
     * @return the SupportDetailsAvailability builder
     */
    public Builder alwaysAvailable(Boolean alwaysAvailable) {
      this.alwaysAvailable = alwaysAvailable;
      return this;
    }

    /**
     * Set the times.
     * Existing times will be replaced.
     *
     * @param times the times
     * @return the SupportDetailsAvailability builder
     */
    public Builder times(List<SupportDetailsAvailabilityTimes> times) {
      this.times = times;
      return this;
    }

    /**
     * Set the timezone.
     *
     * @param timezone the timezone
     * @return the SupportDetailsAvailability builder
     */
    public Builder timezone(String timezone) {
      this.timezone = timezone;
      return this;
    }
  }

  protected SupportDetailsAvailability() { }

  protected SupportDetailsAvailability(Builder builder) {
    alwaysAvailable = builder.alwaysAvailable;
    times = builder.times;
    timezone = builder.timezone;
  }

  /**
   * New builder.
   *
   * @return a SupportDetailsAvailability builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the alwaysAvailable.
   *
   * Support is available at any time.
   *
   * @return the alwaysAvailable
   */
  public Boolean alwaysAvailable() {
    return alwaysAvailable;
  }

  /**
   * Gets the times.
   *
   * The times when your support service is available for your customers.
   *
   * @return the times
   */
  public List<SupportDetailsAvailabilityTimes> times() {
    return times;
  }

  /**
   * Gets the timezone.
   *
   * The timezone in which provided support is available.
   *
   * @return the timezone
   */
  public String timezone() {
    return timezone;
  }
}

