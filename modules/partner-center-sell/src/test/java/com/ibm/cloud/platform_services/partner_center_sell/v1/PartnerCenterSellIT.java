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

package com.ibm.cloud.platform_services.partner_center_sell.v1;

import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CatalogListingDetails;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CatalogListingVersion;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ChangeRequest;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CloudBadge;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CloudBadgeLearnMoreLinks;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CreatePlanOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CreatePlanResponse;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CreateProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CreateSupportChangeRequestOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.DeletePlanOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.DeleteProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.DeprecatePending;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.DeprecateProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.Error;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ErrorExtensions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.EscalationContactsUpdate;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetBadgeOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetCatalogOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetPlanOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetSupportChangeRequestOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.GetSupportOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.HighlightSection;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.HighlightSectionInput;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.HistoryItem;
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
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.MediaSection;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.MediaSectionInput;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.MergeSupportChangeRequestOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ProductDetails;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.PublishProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.RequestCatalogApprovalOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.RequestProductApprovalOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.RequestSupportApprovalOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.RequestSupportChangeRequestReviewOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.Resource;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.RestoreProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.State;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.Support;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportDetails;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportDetailsAvailability;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportDetailsAvailabilityTimes;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportEscalation;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportEscalationTimes;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportResponseTimes;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SuspendProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdateCatalogOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdatePlanOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdateProductOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdateSupportChangeRequestOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdateSupportOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.utils.TestUtilities;
import com.ibm.cloud.platform_services.test.SdkIntegrationTestBase;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the PartnerCenterSell service.
 */
public class PartnerCenterSellIT extends SdkIntegrationTestBase {
  public PartnerCenterSell service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../partner_center_sell_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = PartnerCenterSell.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(PartnerCenterSell.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testListProducts() throws Exception {
    try {
      ListProductsOptions listProductsOptions = new ListProductsOptions();

      // Invoke operation
      Response<ListProductsResponse> response = service.listProducts(listProductsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListProductsResponse listProductsResponseResult = response.getResult();

      assertNotNull(listProductsResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateProduct() throws Exception {
    try {
      CreateProductOptions createProductOptions = new CreateProductOptions.Builder()
        .productName("testString")
        .taxAssessment("SOFTWARE")
        .productType("SOFTWARE")
        .materialAgreement(true)
        .build();

      // Invoke operation
      Response<ProductDetails> response = service.createProduct(createProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProductDetails productDetailsResult = response.getResult();

      assertNotNull(productDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetProduct() throws Exception {
    try {
      GetProductOptions getProductOptions = new GetProductOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<ProductDetails> response = service.getProduct(getProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProductDetails productDetailsResult = response.getResult();

      assertNotNull(productDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateProduct() throws Exception {
    try {
      UpdateProductOptions updateProductOptions = new UpdateProductOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .materialAgreement(true)
        .productName("testString")
        .taxAssessment("SOFTWARE")
        .build();

      // Invoke operation
      Response<ProductDetails> response = service.updateProduct(updateProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProductDetails productDetailsResult = response.getResult();

      assertNotNull(productDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPublishProduct() throws Exception {
    try {
      PublishProductOptions publishProductOptions = new PublishProductOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<ProductDetails> response = service.publishProduct(publishProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProductDetails productDetailsResult = response.getResult();

      assertNotNull(productDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testSuspendProduct() throws Exception {
    try {
      SuspendProductOptions suspendProductOptions = new SuspendProductOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .reason("testString")
        .build();

      // Invoke operation
      Response<ProductDetails> response = service.suspendProduct(suspendProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProductDetails productDetailsResult = response.getResult();

      assertNotNull(productDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeprecateProduct() throws Exception {
    try {
      DeprecateProductOptions deprecateProductOptions = new DeprecateProductOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .reason("testString")
        .build();

      // Invoke operation
      Response<ProductDetails> response = service.deprecateProduct(deprecateProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProductDetails productDetailsResult = response.getResult();

      assertNotNull(productDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRestoreProduct() throws Exception {
    try {
      RestoreProductOptions restoreProductOptions = new RestoreProductOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .reason("testString")
        .build();

      // Invoke operation
      Response<ProductDetails> response = service.restoreProduct(restoreProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProductDetails productDetailsResult = response.getResult();

      assertNotNull(productDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListBadges() throws Exception {
    try {
      ListBadgesOptions listBadgesOptions = new ListBadgesOptions();

      // Invoke operation
      Response<CloudBadge> response = service.listBadges(listBadgesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CloudBadge cloudBadgeResult = response.getResult();

      assertNotNull(cloudBadgeResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetBadge() throws Exception {
    try {
      GetBadgeOptions getBadgeOptions = new GetBadgeOptions.Builder()
        .badgeId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<CloudBadge> response = service.getBadge(getBadgeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CloudBadge cloudBadgeResult = response.getResult();

      assertNotNull(cloudBadgeResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetCatalog() throws Exception {
    try {
      GetCatalogOptions getCatalogOptions = new GetCatalogOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<CatalogListingDetails> response = service.getCatalog(getCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CatalogListingDetails catalogListingDetailsResult = response.getResult();

      assertNotNull(catalogListingDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateCatalog() throws Exception {
    try {
      HighlightSectionInput highlightSectionInputModel = new HighlightSectionInput.Builder()
        .description("testString")
        .title("testString")
        .build();

      MediaSectionInput mediaSectionInputModel = new MediaSectionInput.Builder()
        .caption("testString")
        .thumbnail("testString")
        .type("image")
        .url("testString")
        .build();

      UpdateCatalogOptions updateCatalogOptions = new UpdateCatalogOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .catalogId("testString")
        .description("testString")
        .iconUrl("testString")
        .keywords(java.util.Arrays.asList("testString"))
        .pricingModel("free")
        .category("testString")
        .providerType(java.util.Arrays.asList("ibm_community"))
        .label("testString")
        .name("testString")
        .provider("testString")
        .tags(java.util.Arrays.asList("testString"))
        .documentationUrl("testString")
        .highlights(java.util.Arrays.asList(highlightSectionInputModel))
        .longDescription("testString")
        .media(java.util.Arrays.asList(mediaSectionInputModel))
        .build();

      // Invoke operation
      Response<CatalogListingDetails> response = service.updateCatalog(updateCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CatalogListingDetails catalogListingDetailsResult = response.getResult();

      assertNotNull(catalogListingDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRequestCatalogApproval() throws Exception {
    try {
      RequestCatalogApprovalOptions requestCatalogApprovalOptions = new RequestCatalogApprovalOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<Resource> response = service.requestCatalogApproval(requestCatalogApprovalOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Resource resourceResult = response.getResult();

      assertNotNull(resourceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListPlans() throws Exception {
    try {
      ListPlansOptions listPlansOptions = new ListPlansOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<ListPlansResponse> response = service.listPlans(listPlansOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListPlansResponse listPlansResponseResult = response.getResult();

      assertNotNull(listPlansResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreatePlan() throws Exception {
    try {
      CreatePlanOptions createPlanOptions = new CreatePlanOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .description("testString")
        .label("testString")
        .type("byol")
        .url("testString")
        .build();

      // Invoke operation
      Response<CreatePlanResponse> response = service.createPlan(createPlanOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CreatePlanResponse createPlanResponseResult = response.getResult();

      assertNotNull(createPlanResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetPlan() throws Exception {
    try {
      GetPlanOptions getPlanOptions = new GetPlanOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .pricingPlanId("testString")
        .build();

      // Invoke operation
      Response<License> response = service.getPlan(getPlanOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      License licenseResult = response.getResult();

      assertNotNull(licenseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdatePlan() throws Exception {
    try {
      UpdatePlanOptions updatePlanOptions = new UpdatePlanOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .pricingPlanId("testString")
        .description("testString")
        .label("testString")
        .type("byol")
        .url("testString")
        .build();

      // Invoke operation
      Response<CreatePlanResponse> response = service.updatePlan(updatePlanOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CreatePlanResponse createPlanResponseResult = response.getResult();

      assertNotNull(createPlanResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSupport() throws Exception {
    try {
      GetSupportOptions getSupportOptions = new GetSupportOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<Support> response = service.getSupport(getSupportOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Support supportResult = response.getResult();

      assertNotNull(supportResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateSupport() throws Exception {
    try {
      EscalationContactsUpdate escalationContactsUpdateModel = new EscalationContactsUpdate.Builder()
        .email("testString")
        .name("testString")
        .build();

      SupportDetailsAvailabilityTimes supportDetailsAvailabilityTimesModel = new SupportDetailsAvailabilityTimes.Builder()
        .day(Long.valueOf("1"))
        .endTime("19:30")
        .startTime("10:30")
        .build();

      SupportDetailsAvailability supportDetailsAvailabilityModel = new SupportDetailsAvailability.Builder()
        .alwaysAvailable(true)
        .times(java.util.Arrays.asList(supportDetailsAvailabilityTimesModel))
        .timezone("America/Los_Angeles")
        .build();

      SupportResponseTimes supportResponseTimesModel = new SupportResponseTimes.Builder()
        .type("hour")
        .value(Long.valueOf("2"))
        .build();

      SupportDetails supportDetailsModel = new SupportDetails.Builder()
        .availability(supportDetailsAvailabilityModel)
        .contact("testString")
        .responseWaitTime(supportResponseTimesModel)
        .type("email")
        .build();

      SupportEscalationTimes supportEscalationTimesModel = new SupportEscalationTimes.Builder()
        .type("hour")
        .value(Long.valueOf("2"))
        .build();

      SupportEscalation supportEscalationModel = new SupportEscalation.Builder()
        .contact("testString")
        .escalationWaitTime(supportEscalationTimesModel)
        .responseWaitTime(supportResponseTimesModel)
        .build();

      UpdateSupportOptions updateSupportOptions = new UpdateSupportOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .escalationContacts(java.util.Arrays.asList(escalationContactsUpdateModel))
        .locations(java.util.Arrays.asList("US"))
        .supportDetails(java.util.Arrays.asList(supportDetailsModel))
        .supportEscalation(supportEscalationModel)
        .supportType("third-party")
        .url("https://my-company.com/support")
        .build();

      // Invoke operation
      Response<Support> response = service.updateSupport(updateSupportOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Support supportResult = response.getResult();

      assertNotNull(supportResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListSupportChangeRequests() throws Exception {
    try {
      ListSupportChangeRequestsOptions listSupportChangeRequestsOptions = new ListSupportChangeRequestsOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<ListSupportChangeRequestsResponse> response = service.listSupportChangeRequests(listSupportChangeRequestsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListSupportChangeRequestsResponse listSupportChangeRequestsResponseResult = response.getResult();

      assertNotNull(listSupportChangeRequestsResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateSupportChangeRequest() throws Exception {
    try {
      SupportDetailsAvailabilityTimes supportDetailsAvailabilityTimesModel = new SupportDetailsAvailabilityTimes.Builder()
        .day(Long.valueOf("1"))
        .endTime("19:30")
        .startTime("10:30")
        .build();

      SupportDetailsAvailability supportDetailsAvailabilityModel = new SupportDetailsAvailability.Builder()
        .alwaysAvailable(true)
        .times(java.util.Arrays.asList(supportDetailsAvailabilityTimesModel))
        .timezone("America/Los_Angeles")
        .build();

      SupportResponseTimes supportResponseTimesModel = new SupportResponseTimes.Builder()
        .type("hour")
        .value(Long.valueOf("2"))
        .build();

      SupportDetails supportDetailsModel = new SupportDetails.Builder()
        .availability(supportDetailsAvailabilityModel)
        .contact("testString")
        .responseWaitTime(supportResponseTimesModel)
        .type("email")
        .build();

      SupportEscalationTimes supportEscalationTimesModel = new SupportEscalationTimes.Builder()
        .type("hour")
        .value(Long.valueOf("2"))
        .build();

      SupportEscalation supportEscalationModel = new SupportEscalation.Builder()
        .contact("testString")
        .escalationWaitTime(supportEscalationTimesModel)
        .responseWaitTime(supportResponseTimesModel)
        .build();

      Support supportModel = new Support.Builder()
        .locations(java.util.Arrays.asList("US"))
        .process("testString")
        .processI18n(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
        .supportDetails(java.util.Arrays.asList(supportDetailsModel))
        .supportEscalation(supportEscalationModel)
        .supportType("third-party")
        .url("https://my-company.com/support")
        .build();

      CreateSupportChangeRequestOptions createSupportChangeRequestOptions = new CreateSupportChangeRequestOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .change(supportModel)
        .build();

      // Invoke operation
      Response<ProductDetails> response = service.createSupportChangeRequest(createSupportChangeRequestOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProductDetails productDetailsResult = response.getResult();

      assertNotNull(productDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSupportChangeRequest() throws Exception {
    try {
      GetSupportChangeRequestOptions getSupportChangeRequestOptions = new GetSupportChangeRequestOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .changeRequestId("testString")
        .build();

      // Invoke operation
      Response<ChangeRequest> response = service.getSupportChangeRequest(getSupportChangeRequestOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ChangeRequest changeRequestResult = response.getResult();

      assertNotNull(changeRequestResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateSupportChangeRequest() throws Exception {
    try {
      SupportDetailsAvailabilityTimes supportDetailsAvailabilityTimesModel = new SupportDetailsAvailabilityTimes.Builder()
        .day(Long.valueOf("1"))
        .endTime("19:30")
        .startTime("10:30")
        .build();

      SupportDetailsAvailability supportDetailsAvailabilityModel = new SupportDetailsAvailability.Builder()
        .alwaysAvailable(true)
        .times(java.util.Arrays.asList(supportDetailsAvailabilityTimesModel))
        .timezone("America/Los_Angeles")
        .build();

      SupportResponseTimes supportResponseTimesModel = new SupportResponseTimes.Builder()
        .type("hour")
        .value(Long.valueOf("2"))
        .build();

      SupportDetails supportDetailsModel = new SupportDetails.Builder()
        .availability(supportDetailsAvailabilityModel)
        .contact("testString")
        .responseWaitTime(supportResponseTimesModel)
        .type("email")
        .build();

      SupportEscalationTimes supportEscalationTimesModel = new SupportEscalationTimes.Builder()
        .type("hour")
        .value(Long.valueOf("2"))
        .build();

      SupportEscalation supportEscalationModel = new SupportEscalation.Builder()
        .contact("testString")
        .escalationWaitTime(supportEscalationTimesModel)
        .responseWaitTime(supportResponseTimesModel)
        .build();

      Support supportModel = new Support.Builder()
        .locations(java.util.Arrays.asList("US"))
        .process("testString")
        .processI18n(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
        .supportDetails(java.util.Arrays.asList(supportDetailsModel))
        .supportEscalation(supportEscalationModel)
        .supportType("third-party")
        .url("https://my-company.com/support")
        .build();

      UpdateSupportChangeRequestOptions updateSupportChangeRequestOptions = new UpdateSupportChangeRequestOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .changeRequestId("testString")
        .change(supportModel)
        .build();

      // Invoke operation
      Response<ProductDetails> response = service.updateSupportChangeRequest(updateSupportChangeRequestOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProductDetails productDetailsResult = response.getResult();

      assertNotNull(productDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListSupportChangeRequestReviews() throws Exception {
    try {
      ListSupportChangeRequestReviewsOptions listSupportChangeRequestReviewsOptions = new ListSupportChangeRequestReviewsOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .changeRequestId("testString")
        .build();

      // Invoke operation
      Response<Resource> response = service.listSupportChangeRequestReviews(listSupportChangeRequestReviewsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Resource resourceResult = response.getResult();

      assertNotNull(resourceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRequestSupportChangeRequestReview() throws Exception {
    try {
      RequestSupportChangeRequestReviewOptions requestSupportChangeRequestReviewOptions = new RequestSupportChangeRequestReviewOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .changeRequestId("testString")
        .build();

      // Invoke operation
      Response<Resource> response = service.requestSupportChangeRequestReview(requestSupportChangeRequestReviewOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Resource resourceResult = response.getResult();

      assertNotNull(resourceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testMergeSupportChangeRequest() throws Exception {
    try {
      MergeSupportChangeRequestOptions mergeSupportChangeRequestOptions = new MergeSupportChangeRequestOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .changeRequestId("testString")
        .build();

      // Invoke operation
      Response<ProductDetails> response = service.mergeSupportChangeRequest(mergeSupportChangeRequestOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProductDetails productDetailsResult = response.getResult();

      assertNotNull(productDetailsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRequestSupportApproval() throws Exception {
    try {
      RequestSupportApprovalOptions requestSupportApprovalOptions = new RequestSupportApprovalOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<Resource> response = service.requestSupportApproval(requestSupportApprovalOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Resource resourceResult = response.getResult();

      assertNotNull(resourceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRequestProductApproval() throws Exception {
    try {
      RequestProductApprovalOptions requestProductApprovalOptions = new RequestProductApprovalOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<Resource> response = service.requestProductApproval(requestProductApprovalOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Resource resourceResult = response.getResult();

      assertNotNull(resourceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListProductApprovals() throws Exception {
    try {
      ListProductApprovalsOptions listProductApprovalsOptions = new ListProductApprovalsOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<ListProductApprovalsResponse> response = service.listProductApprovals(listProductApprovalsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListProductApprovalsResponse listProductApprovalsResponseResult = response.getResult();

      assertNotNull(listProductApprovalsResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteProduct() throws Exception {
    try {
      DeleteProductOptions deleteProductOptions = new DeleteProductOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .build();

      // Invoke operation
      Response<Boolean> response = service.deleteProduct(deleteProductOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Boolean resultResult = response.getResult();

      assertNotNull(resultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeletePlan() throws Exception {
    try {
      DeletePlanOptions deletePlanOptions = new DeletePlanOptions.Builder()
        .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
        .pricingPlanId("testString")
        .build();

      // Invoke operation
      Response<CreatePlanResponse> response = service.deletePlan(deletePlanOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CreatePlanResponse createPlanResponseResult = response.getResult();

      assertNotNull(createPlanResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
