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
 * ListProductsResponse.
 */
public class ListProductsResponse extends GenericModel {

  protected List<Error> errors;
  protected List<ProductDetails> products;

  /**
   * Gets the errors.
   *
   * @return the errors
   */
  public List<Error> getErrors() {
    return errors;
  }

  /**
   * Gets the products.
   *
   * @return the products
   */
  public List<ProductDetails> getProducts() {
    return products;
  }
}

