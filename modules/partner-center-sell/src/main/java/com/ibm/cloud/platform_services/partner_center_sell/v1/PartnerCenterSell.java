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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.54.1-1d9808a7-20220817-143039
 */

package com.ibm.cloud.platform_services.partner_center_sell.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.platform_services.common.SdkCommon;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CatalogListingDetails;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ChangeRequest;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CloudBadge;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CreatePlanOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CreatePlanResponse;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CreateProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CreateSupportChangeRequestOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.DeletePlanOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.DeleteProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.DeprecateProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetBadgeOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetCatalogOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetPlanOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetSupportChangeRequestOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetSupportOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.License;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ListBadgesOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ListPlansOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ListPlansResponse;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ListProductApprovalsOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ListProductApprovalsResponse;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ListProductsOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ListProductsResponse;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ListSupportChangeRequestReviewsOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ListSupportChangeRequestsOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ListSupportChangeRequestsResponse;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.MergeSupportChangeRequestOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ProductDetails;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.PublishProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.RequestCatalogApprovalOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.RequestProductApprovalOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.RequestSupportApprovalOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.RequestSupportChangeRequestReviewOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.Resource;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.RestoreProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.Support;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SuspendProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdateCatalogOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdatePlanOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdateProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdateSupportChangeRequestOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdateSupportOptions;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator).
 *
 * API Version: 1.1.2
 */
public class PartnerCenterSell extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "partner_center_sell";

  public static final String DEFAULT_SERVICE_URL = "https://product-lifecycle.api.cloud.ibm.com/openapi/v1";

 /**
   * Class method which constructs an instance of the `PartnerCenterSell` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `PartnerCenterSell` client using external configuration
   */
  public static PartnerCenterSell newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `PartnerCenterSell` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `PartnerCenterSell` client using external configuration
   */
  public static PartnerCenterSell newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    PartnerCenterSell service = new PartnerCenterSell(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `PartnerCenterSell` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public PartnerCenterSell(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * List products.
   *
   * List all available products that are onboarded to Partner Center Sell.
   *
   * @param listProductsOptions the {@link ListProductsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListProductsResponse}
   */
  public ServiceCall<ListProductsResponse> listProducts(ListProductsOptions listProductsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "listProducts");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListProductsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListProductsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List products.
   *
   * List all available products that are onboarded to Partner Center Sell.
   *
   * @return a {@link ServiceCall} with a result of type {@link ListProductsResponse}
   */
  public ServiceCall<ListProductsResponse> listProducts() {
    return listProducts(null);
  }

  /**
   * Create product.
   *
   * Start to onboard a new product to Partner Center Sell.
   *
   * @param createProductOptions the {@link CreateProductOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProductDetails}
   */
  public ServiceCall<ProductDetails> createProduct(CreateProductOptions createProductOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createProductOptions,
      "createProductOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "createProduct");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("productName", createProductOptions.productName());
    contentJson.addProperty("taxAssessment", createProductOptions.taxAssessment());
    contentJson.addProperty("productType", createProductOptions.productType());
    if (createProductOptions.materialAgreement() != null) {
      contentJson.addProperty("materialAgreement", createProductOptions.materialAgreement());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ProductDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProductDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get product details.
   *
   * Retrieve available details of a product. Details include contact information, product type, and private catalog ID.
   *
   * @param getProductOptions the {@link GetProductOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProductDetails}
   */
  public ServiceCall<ProductDetails> getProduct(GetProductOptions getProductOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getProductOptions,
      "getProductOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", getProductOptions.productId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "getProduct");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ProductDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProductDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update product details.
   *
   * Update a product's name, tax assessment, and material agreement.
   *
   * @param updateProductOptions the {@link UpdateProductOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProductDetails}
   */
  public ServiceCall<ProductDetails> updateProduct(UpdateProductOptions updateProductOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateProductOptions,
      "updateProductOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", updateProductOptions.productId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "updateProduct");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateProductOptions.materialAgreement() != null) {
      contentJson.addProperty("materialAgreement", updateProductOptions.materialAgreement());
    }
    if (updateProductOptions.productName() != null) {
      contentJson.addProperty("productName", updateProductOptions.productName());
    }
    if (updateProductOptions.taxAssessment() != null) {
      contentJson.addProperty("taxAssessment", updateProductOptions.taxAssessment());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ProductDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProductDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a draft product.
   *
   * Delete a product that is not published to the IBM Cloud catalog or shared with other accounts. To remove a
   * published or shared product from your account, you must first deprecate the product.
   *
   * @param deleteProductOptions the {@link DeleteProductOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Boolean}
   */
  public ServiceCall<Boolean> deleteProduct(DeleteProductOptions deleteProductOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteProductOptions,
      "deleteProductOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", deleteProductOptions.productId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "deleteProduct");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Boolean> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Boolean>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Publish an approved product.
   *
   * To publish a product to the IBM Cloud catalog, you must submit for approval. After you receive approval, you can
   * publish to the catalog.
   *
   * @param publishProductOptions the {@link PublishProductOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProductDetails}
   */
  public ServiceCall<ProductDetails> publishProduct(PublishProductOptions publishProductOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(publishProductOptions,
      "publishProductOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", publishProductOptions.productId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/publish", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "publishProduct");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ProductDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProductDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Suspend a published product.
   *
   * You can remove a product from the IBM Cloud catalog without permanently deleting or deprecating it for up to 7
   * days. You might want to suspend a product if you discover a bug or vulnerability that must be investigated and
   * fixed.
   *
   * @param suspendProductOptions the {@link SuspendProductOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProductDetails}
   */
  public ServiceCall<ProductDetails> suspendProduct(SuspendProductOptions suspendProductOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(suspendProductOptions,
      "suspendProductOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", suspendProductOptions.productId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/suspend", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "suspendProduct");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("reason", suspendProductOptions.reason());
    builder.bodyJson(contentJson);
    ResponseConverter<ProductDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProductDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Deprecate a published product.
   *
   * If you need to permanently delete your product or a version from the IBM Cloud catalog, deprecate it first. Your
   * product remains available for use during a 90-day deprecation period, and is removed after 90 days.
   *
   * @param deprecateProductOptions the {@link DeprecateProductOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProductDetails}
   */
  public ServiceCall<ProductDetails> deprecateProduct(DeprecateProductOptions deprecateProductOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deprecateProductOptions,
      "deprecateProductOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", deprecateProductOptions.productId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/deprecate", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "deprecateProduct");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("reason", deprecateProductOptions.reason());
    builder.bodyJson(contentJson);
    ResponseConverter<ProductDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProductDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Restore a deprecated product.
   *
   * If your product is deprecated, you have 90 days to restore it to keep it in the catalog.
   *
   * @param restoreProductOptions the {@link RestoreProductOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProductDetails}
   */
  public ServiceCall<ProductDetails> restoreProduct(RestoreProductOptions restoreProductOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(restoreProductOptions,
      "restoreProductOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", restoreProductOptions.productId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/restore", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "restoreProduct");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("reason", restoreProductOptions.reason());
    builder.bodyJson(contentJson);
    ResponseConverter<ProductDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProductDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List badges.
   *
   * List all available badges a product can be validated against.
   *
   * @param listBadgesOptions the {@link ListBadgesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CloudBadge}
   */
  public ServiceCall<CloudBadge> listBadges(ListBadgesOptions listBadgesOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/badges"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "listBadges");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CloudBadge> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CloudBadge>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List badges.
   *
   * List all available badges a product can be validated against.
   *
   * @return a {@link ServiceCall} with a result of type {@link CloudBadge}
   */
  public ServiceCall<CloudBadge> listBadges() {
    return listBadges(null);
  }

  /**
   * Get badge.
   *
   * Get a badge by id.
   *
   * @param getBadgeOptions the {@link GetBadgeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CloudBadge}
   */
  public ServiceCall<CloudBadge> getBadge(GetBadgeOptions getBadgeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBadgeOptions,
      "getBadgeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("badgeId", getBadgeOptions.badgeId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/badges/{badgeId}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "getBadge");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CloudBadge> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CloudBadge>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * View a product's catalog data.
   *
   * View the catalog entry details and other data that is stored for your product.
   *
   * @param getCatalogOptions the {@link GetCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogListingDetails}
   */
  public ServiceCall<CatalogListingDetails> getCatalog(GetCatalogOptions getCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCatalogOptions,
      "getCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", getCatalogOptions.productId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/catalog", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "getCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CatalogListingDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogListingDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a product's catalog data.
   *
   * Update the catalog entry details and other data that is stored for your product.
   *
   * @param updateCatalogOptions the {@link UpdateCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CatalogListingDetails}
   */
  public ServiceCall<CatalogListingDetails> updateCatalog(UpdateCatalogOptions updateCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateCatalogOptions,
      "updateCatalogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", updateCatalogOptions.productId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/catalog", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "updateCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateCatalogOptions.catalogId() != null) {
      contentJson.addProperty("catalogId", updateCatalogOptions.catalogId());
    }
    if (updateCatalogOptions.description() != null) {
      contentJson.addProperty("description", updateCatalogOptions.description());
    }
    if (updateCatalogOptions.iconUrl() != null) {
      contentJson.addProperty("iconUrl", updateCatalogOptions.iconUrl());
    }
    if (updateCatalogOptions.keywords() != null) {
      contentJson.add("keywords", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCatalogOptions.keywords()));
    }
    if (updateCatalogOptions.pricingModel() != null) {
      contentJson.addProperty("pricingModel", updateCatalogOptions.pricingModel());
    }
    if (updateCatalogOptions.category() != null) {
      contentJson.addProperty("category", updateCatalogOptions.category());
    }
    if (updateCatalogOptions.providerType() != null) {
      contentJson.add("providerType", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCatalogOptions.providerType()));
    }
    if (updateCatalogOptions.label() != null) {
      contentJson.addProperty("label", updateCatalogOptions.label());
    }
    if (updateCatalogOptions.name() != null) {
      contentJson.addProperty("name", updateCatalogOptions.name());
    }
    if (updateCatalogOptions.provider() != null) {
      contentJson.addProperty("provider", updateCatalogOptions.provider());
    }
    if (updateCatalogOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCatalogOptions.tags()));
    }
    if (updateCatalogOptions.documentationUrl() != null) {
      contentJson.addProperty("documentationUrl", updateCatalogOptions.documentationUrl());
    }
    if (updateCatalogOptions.highlights() != null) {
      contentJson.add("highlights", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCatalogOptions.highlights()));
    }
    if (updateCatalogOptions.longDescription() != null) {
      contentJson.addProperty("longDescription", updateCatalogOptions.longDescription());
    }
    if (updateCatalogOptions.media() != null) {
      contentJson.add("media", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCatalogOptions.media()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CatalogListingDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CatalogListingDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Request a catalog listing approval.
   *
   * If a catalog listing was not approved for publishing during the initial product approval process, you can request
   * approval again.
   *
   * @param requestCatalogApprovalOptions the {@link RequestCatalogApprovalOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Resource}
   */
  public ServiceCall<Resource> requestCatalogApproval(RequestCatalogApprovalOptions requestCatalogApprovalOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(requestCatalogApprovalOptions,
      "requestCatalogApprovalOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", requestCatalogApprovalOptions.productId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/catalog/approvals", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "requestCatalogApproval");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Resource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Resource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List pricing plans that are connected to a product.
   *
   * List pricing plans that are connected to a product.
   *
   * @param listPlansOptions the {@link ListPlansOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListPlansResponse}
   */
  public ServiceCall<ListPlansResponse> listPlans(ListPlansOptions listPlansOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listPlansOptions,
      "listPlansOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", listPlansOptions.productId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/plans", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "listPlans");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListPlansResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListPlansResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a pricing plan.
   *
   * Define how you want to charge users for your product. If you aren't sure how you want charge users, you can start
   * by using a free plan.
   *
   * @param createPlanOptions the {@link CreatePlanOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreatePlanResponse}
   */
  public ServiceCall<CreatePlanResponse> createPlan(CreatePlanOptions createPlanOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPlanOptions,
      "createPlanOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", createPlanOptions.productId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/plans", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "createPlan");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("description", createPlanOptions.description());
    contentJson.addProperty("label", createPlanOptions.label());
    contentJson.addProperty("type", createPlanOptions.type());
    contentJson.addProperty("url", createPlanOptions.url());
    builder.bodyJson(contentJson);
    ResponseConverter<CreatePlanResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreatePlanResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get pricing plan by ID.
   *
   * Use the pricing plan ID to retrieve its details.
   *
   * @param getPlanOptions the {@link GetPlanOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link License}
   */
  public ServiceCall<License> getPlan(GetPlanOptions getPlanOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPlanOptions,
      "getPlanOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", getPlanOptions.productId());
    pathParamsMap.put("pricingPlanId", getPlanOptions.pricingPlanId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/plans/{pricingPlanId}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "getPlan");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<License> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<License>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a pricing plan.
   *
   * If you need to change details of a pricing plan, such as the name, description, URL, or type, you can update the
   * pricing plan. After your changes are submitted for a published product, the changes are displayed in the catalog.
   *
   * @param updatePlanOptions the {@link UpdatePlanOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreatePlanResponse}
   */
  public ServiceCall<CreatePlanResponse> updatePlan(UpdatePlanOptions updatePlanOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePlanOptions,
      "updatePlanOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", updatePlanOptions.productId());
    pathParamsMap.put("pricingPlanId", updatePlanOptions.pricingPlanId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/plans/{pricingPlanId}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "updatePlan");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("description", updatePlanOptions.description());
    contentJson.addProperty("label", updatePlanOptions.label());
    contentJson.addProperty("type", updatePlanOptions.type());
    contentJson.addProperty("url", updatePlanOptions.url());
    builder.bodyJson(contentJson);
    ResponseConverter<CreatePlanResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreatePlanResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a pricing plan.
   *
   * If you need to remove a pricing plan for a product, you can delete it.
   *
   * @param deletePlanOptions the {@link DeletePlanOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreatePlanResponse}
   */
  public ServiceCall<CreatePlanResponse> deletePlan(DeletePlanOptions deletePlanOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePlanOptions,
      "deletePlanOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", deletePlanOptions.productId());
    pathParamsMap.put("pricingPlanId", deletePlanOptions.pricingPlanId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/plans/{pricingPlanId}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "deletePlan");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CreatePlanResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreatePlanResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get product support details.
   *
   * View the product support details, including the contacts and the escalation process.
   *
   * @param getSupportOptions the {@link GetSupportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Support}
   */
  public ServiceCall<Support> getSupport(GetSupportOptions getSupportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSupportOptions,
      "getSupportOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", getSupportOptions.productId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/support", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "getSupport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Support> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Support>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update product support details.
   *
   * Update the product support details, including the contacts and the escalation process.
   *
   * @param updateSupportOptions the {@link UpdateSupportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Support}
   */
  public ServiceCall<Support> updateSupport(UpdateSupportOptions updateSupportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSupportOptions,
      "updateSupportOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", updateSupportOptions.productId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/support", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "updateSupport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateSupportOptions.escalationContacts() != null) {
      contentJson.add("escalationContacts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSupportOptions.escalationContacts()));
    }
    if (updateSupportOptions.locations() != null) {
      contentJson.add("locations", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSupportOptions.locations()));
    }
    if (updateSupportOptions.supportDetails() != null) {
      contentJson.add("support_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSupportOptions.supportDetails()));
    }
    if (updateSupportOptions.supportEscalation() != null) {
      contentJson.add("support_escalation", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSupportOptions.supportEscalation()));
    }
    if (updateSupportOptions.supportType() != null) {
      contentJson.addProperty("support_type", updateSupportOptions.supportType());
    }
    if (updateSupportOptions.url() != null) {
      contentJson.addProperty("url", updateSupportOptions.url());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Support> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Support>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all change requests related to a given product.
   *
   * List all change requests related to a given product.
   *
   * @param listSupportChangeRequestsOptions the {@link ListSupportChangeRequestsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListSupportChangeRequestsResponse}
   */
  public ServiceCall<ListSupportChangeRequestsResponse> listSupportChangeRequests(ListSupportChangeRequestsOptions listSupportChangeRequestsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSupportChangeRequestsOptions,
      "listSupportChangeRequestsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", listSupportChangeRequestsOptions.productId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/support/changes", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "listSupportChangeRequests");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListSupportChangeRequestsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListSupportChangeRequestsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update support data of an already approved or published product.
   *
   * To update the support data of an already approved or published product, your changes will be required to be
   * reviewed and approved. To do updates on a published product, you have to open a change request, add your changes to
   * it, then request a review for your changes. Once the changes are approved, you can merge these updates to your
   * published product.
   *
   * @param createSupportChangeRequestOptions the {@link CreateSupportChangeRequestOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProductDetails}
   */
  public ServiceCall<ProductDetails> createSupportChangeRequest(CreateSupportChangeRequestOptions createSupportChangeRequestOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSupportChangeRequestOptions,
      "createSupportChangeRequestOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", createSupportChangeRequestOptions.productId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/support/changes", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "createSupportChangeRequest");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.add("change", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createSupportChangeRequestOptions.change()));
    builder.bodyJson(contentJson);
    ResponseConverter<ProductDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProductDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a change request related to a given product by id.
   *
   * Get a change request related to a given product by id.
   *
   * @param getSupportChangeRequestOptions the {@link GetSupportChangeRequestOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ChangeRequest}
   */
  public ServiceCall<ChangeRequest> getSupportChangeRequest(GetSupportChangeRequestOptions getSupportChangeRequestOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSupportChangeRequestOptions,
      "getSupportChangeRequestOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", getSupportChangeRequestOptions.productId());
    pathParamsMap.put("changeRequestId", getSupportChangeRequestOptions.changeRequestId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/support/changes/{changeRequestId}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "getSupportChangeRequest");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ChangeRequest> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ChangeRequest>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an already created change request.
   *
   * Update a change request that was created earlier.
   *
   * @param updateSupportChangeRequestOptions the {@link UpdateSupportChangeRequestOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProductDetails}
   */
  public ServiceCall<ProductDetails> updateSupportChangeRequest(UpdateSupportChangeRequestOptions updateSupportChangeRequestOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSupportChangeRequestOptions,
      "updateSupportChangeRequestOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", updateSupportChangeRequestOptions.productId());
    pathParamsMap.put("changeRequestId", updateSupportChangeRequestOptions.changeRequestId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/support/changes/{changeRequestId}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "updateSupportChangeRequest");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.add("change", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSupportChangeRequestOptions.change()));
    builder.bodyJson(contentJson);
    ResponseConverter<ProductDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProductDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List review events related to a change request.
   *
   * List review events related to a change request.
   *
   * @param listSupportChangeRequestReviewsOptions the {@link ListSupportChangeRequestReviewsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Resource}
   */
  public ServiceCall<Resource> listSupportChangeRequestReviews(ListSupportChangeRequestReviewsOptions listSupportChangeRequestReviewsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listSupportChangeRequestReviewsOptions,
      "listSupportChangeRequestReviewsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", listSupportChangeRequestReviewsOptions.productId());
    pathParamsMap.put("changeRequestId", listSupportChangeRequestReviewsOptions.changeRequestId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/support/changes/{changeRequestId}/reviews", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "listSupportChangeRequestReviews");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Resource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Resource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an already created change request.
   *
   * Update a change request that was created earlier.
   *
   * @param requestSupportChangeRequestReviewOptions the {@link RequestSupportChangeRequestReviewOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Resource}
   */
  public ServiceCall<Resource> requestSupportChangeRequestReview(RequestSupportChangeRequestReviewOptions requestSupportChangeRequestReviewOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(requestSupportChangeRequestReviewOptions,
      "requestSupportChangeRequestReviewOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", requestSupportChangeRequestReviewOptions.productId());
    pathParamsMap.put("changeRequestId", requestSupportChangeRequestReviewOptions.changeRequestId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/support/changes/{changeRequestId}/reviews", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "requestSupportChangeRequestReview");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Resource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Resource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Merge the approved changeset to the published product.
   *
   * Merge the approved change request back to the published product to make the changes available publicly.
   *
   * @param mergeSupportChangeRequestOptions the {@link MergeSupportChangeRequestOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProductDetails}
   */
  public ServiceCall<ProductDetails> mergeSupportChangeRequest(MergeSupportChangeRequestOptions mergeSupportChangeRequestOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(mergeSupportChangeRequestOptions,
      "mergeSupportChangeRequestOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", mergeSupportChangeRequestOptions.productId());
    pathParamsMap.put("changeRequestId", mergeSupportChangeRequestOptions.changeRequestId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/support/changes/{changeRequestId}/merge", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "mergeSupportChangeRequest");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ProductDetails> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProductDetails>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Request approval of support information.
   *
   * If the support information for your product is not approved, you can use this method to request approval of your
   * product's support information again.
   *
   * @param requestSupportApprovalOptions the {@link RequestSupportApprovalOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Resource}
   */
  public ServiceCall<Resource> requestSupportApproval(RequestSupportApprovalOptions requestSupportApprovalOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(requestSupportApprovalOptions,
      "requestSupportApprovalOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", requestSupportApprovalOptions.productId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/support/approvals", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "requestSupportApproval");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Resource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Resource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Request approval to publish.
   *
   * After you complete the requirements for onboarding a product, you can request approval to publish to the IBM Cloud
   * catalog.
   *
   * @param requestProductApprovalOptions the {@link RequestProductApprovalOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Resource}
   */
  public ServiceCall<Resource> requestProductApproval(RequestProductApprovalOptions requestProductApprovalOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(requestProductApprovalOptions,
      "requestProductApprovalOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", requestProductApprovalOptions.productId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/approvals", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "requestProductApproval");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Resource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Resource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List approvals.
   *
   * By using the product ID, you can get the current state and history of all approvals. Approvals are required to
   * publish your product to the catalog.
   *
   * @param listProductApprovalsOptions the {@link ListProductApprovalsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ListProductApprovalsResponse}
   */
  public ServiceCall<ListProductApprovalsResponse> listProductApprovals(ListProductApprovalsOptions listProductApprovalsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listProductApprovalsOptions,
      "listProductApprovalsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("productId", listProductApprovalsOptions.productId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/products/{productId}/approvals", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("partner_center_sell", "v1", "listProductApprovals");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ListProductApprovalsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ListProductApprovalsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
