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
 * A change request that was opened to change the support properties of a published product.
 */
public class ChangeRequest extends GenericModel {

  protected String id;
  protected String createdAt;
  protected String initiator;
  protected String merged;
  protected Support change;

  /**
   * Gets the id.
   *
   * A unique id that identifies the change request.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the createdAt.
   *
   * The time when the change request was created in standard ISO 8601 format.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the initiator.
   *
   * The user ID of the user who initiated this change request.
   *
   * @return the initiator
   */
  public String getInitiator() {
    return initiator;
  }

  /**
   * Gets the merged.
   *
   * The time when the change request was merged back to the published product in standard ISO 8601 format.
   *
   * @return the merged
   */
  public String getMerged() {
    return merged;
  }

  /**
   * Gets the change.
   *
   * Provide details about how customers can get help when they are using your product.
   *
   * @return the change
   */
  public Support getChange() {
    return change;
  }
}

