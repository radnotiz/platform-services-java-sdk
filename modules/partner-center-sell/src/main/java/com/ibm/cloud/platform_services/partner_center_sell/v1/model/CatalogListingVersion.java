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
 * The version details of a product.
 */
public class CatalogListingVersion extends GenericModel {

  /**
   * Target kinds.
   */
  public interface KindTarget {
    /** iks. */
    String IKS = "iks";
    /** roks. */
    String ROKS = "roks";
    /** vcenter. */
    String VCENTER = "vcenter";
    /** power-iaas. */
    String POWER_IAAS = "power-iaas";
    /** terraform. */
    String TERRAFORM = "terraform";
  }

  protected DeprecatePending deprecatePending;
  protected String id;
  protected String kindFormat;
  protected String kindId;
  protected String kindTarget;
  protected String packageVersion;
  protected String state;
  protected String stateChangeTime;
  protected String validatedState;
  protected String version;
  protected String versionLocator;
  protected List<String> allowlistedAccounts;

  /**
   * Gets the deprecatePending.
   *
   * The deprecation process of the product is in the pending state.
   *
   * @return the deprecatePending
   */
  public DeprecatePending getDeprecatePending() {
    return deprecatePending;
  }

  /**
   * Gets the id.
   *
   * The version ID of the product. This ID can be found by using the Catalog management API.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the kindFormat.
   *
   * The content kind.
   *
   * @return the kindFormat
   */
  public String getKindFormat() {
    return kindFormat;
  }

  /**
   * Gets the kindId.
   *
   * The unique ID of kind.
   *
   * @return the kindId
   */
  public String getKindId() {
    return kindId;
  }

  /**
   * Gets the kindTarget.
   *
   * Target kinds.
   *
   * @return the kindTarget
   */
  public String getKindTarget() {
    return kindTarget;
  }

  /**
   * Gets the packageVersion.
   *
   * The version of the package.
   *
   * @return the packageVersion
   */
  public String getPackageVersion() {
    return packageVersion;
  }

  /**
   * Gets the state.
   *
   * The state of the version of your product.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the stateChangeTime.
   *
   * The time when the state of the version changed.
   *
   * @return the stateChangeTime
   */
  public String getStateChangeTime() {
    return stateChangeTime;
  }

  /**
   * Gets the validatedState.
   *
   * The validation status of the version of your product.
   *
   * @return the validatedState
   */
  public String getValidatedState() {
    return validatedState;
  }

  /**
   * Gets the version.
   *
   * The version number of the current version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the versionLocator.
   *
   * A dot notation value that uses the format `catalogID.versionID`.
   *
   * @return the versionLocator
   */
  public String getVersionLocator() {
    return versionLocator;
  }

  /**
   * Gets the allowlistedAccounts.
   *
   * The list of allowlisted accounts that have access to the version of your product.
   *
   * @return the allowlistedAccounts
   */
  public List<String> getAllowlistedAccounts() {
    return allowlistedAccounts;
  }
}

