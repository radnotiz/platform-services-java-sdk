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
 * The details about the availability of product support. At minimum, your support service must be available 8 hours a
 * day, Monday through Friday.
 */
public class SupportDetailsAvailabilityTimes extends GenericModel {

  protected Long day;
  @SerializedName("end_time")
  protected String endTime;
  @SerializedName("start_time")
  protected String startTime;

  /**
   * Builder.
   */
  public static class Builder {
    private Long day;
    private String endTime;
    private String startTime;

    private Builder(SupportDetailsAvailabilityTimes supportDetailsAvailabilityTimes) {
      this.day = supportDetailsAvailabilityTimes.day;
      this.endTime = supportDetailsAvailabilityTimes.endTime;
      this.startTime = supportDetailsAvailabilityTimes.startTime;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SupportDetailsAvailabilityTimes.
     *
     * @return the new SupportDetailsAvailabilityTimes instance
     */
    public SupportDetailsAvailabilityTimes build() {
      return new SupportDetailsAvailabilityTimes(this);
    }

    /**
     * Set the day.
     *
     * @param day the day
     * @return the SupportDetailsAvailabilityTimes builder
     */
    public Builder day(long day) {
      this.day = day;
      return this;
    }

    /**
     * Set the endTime.
     *
     * @param endTime the endTime
     * @return the SupportDetailsAvailabilityTimes builder
     */
    public Builder endTime(String endTime) {
      this.endTime = endTime;
      return this;
    }

    /**
     * Set the startTime.
     *
     * @param startTime the startTime
     * @return the SupportDetailsAvailabilityTimes builder
     */
    public Builder startTime(String startTime) {
      this.startTime = startTime;
      return this;
    }
  }

  protected SupportDetailsAvailabilityTimes() { }

  protected SupportDetailsAvailabilityTimes(Builder builder) {
    day = builder.day;
    endTime = builder.endTime;
    startTime = builder.startTime;
  }

  /**
   * New builder.
   *
   * @return a SupportDetailsAvailabilityTimes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the day.
   *
   * The days when your support service is available throughout the week. The seven days of the week are defined as
   * numbers from 1 to 7. If your support service is available on Mondays and Wednesdays, enter numbers 1 and 3.
   *
   * @return the day
   */
  public Long day() {
    return day;
  }

  /**
   * Gets the endTime.
   *
   * The time in `hh:mm` format when support ends each day when your support coverage is listed as available.
   *
   * @return the endTime
   */
  public String endTime() {
    return endTime;
  }

  /**
   * Gets the startTime.
   *
   * The time in `hh:mm` format when support starts each day when your support coverage is listed as available.
   *
   * @return the startTime
   */
  public String startTime() {
    return startTime;
  }
}

