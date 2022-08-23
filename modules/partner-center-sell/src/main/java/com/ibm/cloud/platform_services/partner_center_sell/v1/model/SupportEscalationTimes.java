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
 * The number of hours that your customers need to wait before escalating a case.
 */
public class SupportEscalationTimes extends GenericModel {

  public interface Type {
    /** hour. */
    String HOUR = "hour";
  }

  protected String type;
  protected Long value;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private Long value;

    private Builder(SupportEscalationTimes supportEscalationTimes) {
      this.type = supportEscalationTimes.type;
      this.value = supportEscalationTimes.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SupportEscalationTimes.
     *
     * @return the new SupportEscalationTimes instance
     */
    public SupportEscalationTimes build() {
      return new SupportEscalationTimes(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the SupportEscalationTimes builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the SupportEscalationTimes builder
     */
    public Builder value(long value) {
      this.value = value;
      return this;
    }
  }

  protected SupportEscalationTimes() { }

  protected SupportEscalationTimes(Builder builder) {
    type = builder.type;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a SupportEscalationTimes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the value.
   *
   * The amount of hours.
   *
   * @return the value
   */
  public Long value() {
    return value;
  }
}

