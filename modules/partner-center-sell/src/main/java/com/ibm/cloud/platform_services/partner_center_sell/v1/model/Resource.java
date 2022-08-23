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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The details of the catalog listing approval request.
 */
public class Resource extends GenericModel {

  protected List<HistoryItem> history;
  protected String id;
  protected List<String> nextEvents;
  protected State state;

  /**
   * Gets the history.
   *
   * Shows the details of the approval.
   *
   * @return the history
   */
  public List<HistoryItem> getHistory() {
    return history;
  }

  /**
   * Gets the id.
   *
   * The ID that uniquely identifies the product in Partner Center. This ID can be found on the Dashboard tab in Partner
   * Center.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the nextEvents.
   *
   * The events after requesting an approval.
   *
   * @return the nextEvents
   */
  public List<String> getNextEvents() {
    return nextEvents;
  }

  /**
   * Gets the state.
   *
   * The state of the approval.
   *
   * @return the state
   */
  public State getState() {
    return state;
  }
}

