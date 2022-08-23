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
 * CloudBadge.
 */
public class CloudBadge extends GenericModel {

  protected String id;
  protected String label;
  protected String description;
  protected CloudBadgeLearnMoreLinks learnMoreLinks;
  protected String getStartedLink;
  protected String tag;

  /**
   * Gets the id.
   *
   * The ID of the badge.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the label.
   *
   * The name of the badge.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Gets the description.
   *
   * The description of the badge.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the learnMoreLinks.
   *
   * @return the learnMoreLinks
   */
  public CloudBadgeLearnMoreLinks getLearnMoreLinks() {
    return learnMoreLinks;
  }

  /**
   * Gets the getStartedLink.
   *
   * An url to get started with the validation against this certification.
   *
   * @return the getStartedLink
   */
  public String getGetStartedLink() {
    return getStartedLink;
  }

  /**
   * Gets the tag.
   *
   * Deprecated, will be removed.
   *
   * @return the tag
   */
  public String getTag() {
    return tag;
  }
}

