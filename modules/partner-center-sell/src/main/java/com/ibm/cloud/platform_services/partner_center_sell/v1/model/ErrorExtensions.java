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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * These details are used to help the support engineer troubleshoot any occurring issues.
 */
public class ErrorExtensions extends GenericModel {

  protected String code;
  protected String serviceName;
  protected Map<String, Object> exception;
  protected String trid;
  protected String operationName;

  /**
   * Gets the code.
   *
   * The code that identifies the error.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the serviceName.
   *
   * The programmatic name of the product. This is the unique ID of the product that is used within all IBM services and
   * tools.
   *
   * @return the serviceName
   */
  public String getServiceName() {
    return serviceName;
  }

  /**
   * Gets the exception.
   *
   * The occurring error.
   *
   * @return the exception
   */
  public Map<String, Object> getException() {
    return exception;
  }

  /**
   * Gets the trid.
   *
   * The transaction ID. This ID can be used for identifying errors.
   *
   * @return the trid
   */
  public String getTrid() {
    return trid;
  }

  /**
   * Gets the operationName.
   *
   * The opreation when the error occurred.
   *
   * @return the operationName
   */
  public String getOperationName() {
    return operationName;
  }
}

