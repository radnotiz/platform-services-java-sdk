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
 * The direct contact for IBM Cloud Support leaders to communicate with the support leader of your product. This contact
 * information is not displayed on the product detail page in the catalog.
 */
public class EscalationContactsUpdate extends GenericModel {

  protected String email;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String email;
    private String name;

    private Builder(EscalationContactsUpdate escalationContactsUpdate) {
      this.email = escalationContactsUpdate.email;
      this.name = escalationContactsUpdate.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EscalationContactsUpdate.
     *
     * @return the new EscalationContactsUpdate instance
     */
    public EscalationContactsUpdate build() {
      return new EscalationContactsUpdate(this);
    }

    /**
     * Set the email.
     *
     * @param email the email
     * @return the EscalationContactsUpdate builder
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the EscalationContactsUpdate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected EscalationContactsUpdate() { }

  protected EscalationContactsUpdate(Builder builder) {
    email = builder.email;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a EscalationContactsUpdate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the email.
   *
   * The email address of the support leader.
   *
   * @return the email
   */
  public String email() {
    return email;
  }

  /**
   * Gets the name.
   *
   * The name of the support leader.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

