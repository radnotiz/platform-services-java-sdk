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
 * HistoryItem.
 */
public class HistoryItem extends GenericModel {

  protected String at;
  protected String displayName;
  protected String event;
  protected String reason;
  protected String username;

  /**
   * Gets the at.
   *
   * The time when you requested approval.
   *
   * @return the at
   */
  public String getAt() {
    return at;
  }

  /**
   * Gets the displayName.
   *
   * The name of the user, who managed the approval request.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the event.
   *
   * The event that happened during the approval request.
   *
   * @return the event
   */
  public String getEvent() {
    return event;
  }

  /**
   * Gets the reason.
   *
   * The message from IBM Cloud approvers about the state of the approval request.
   *
   * @return the reason
   */
  public String getReason() {
    return reason;
  }

  /**
   * Gets the username.
   *
   * The email address of the user.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }
}

