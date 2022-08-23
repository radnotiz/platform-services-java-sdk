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

import com.ibm.cloud.platform_services.partner_center_sell.v1.PartnerCenterSell;
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
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PartnerCenterSell service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class PartnerCenterSellTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected PartnerCenterSell partnerCenterSellService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new PartnerCenterSell(serviceName, null);
  }

  // Test the listProducts operation with a valid options model parameter
  @Test
  public void testListProductsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"errors\": [{\"message\": \"message\", \"extensions\": {\"code\": \"code\", \"serviceName\": \"serviceName\", \"exception\": {\"mapKey\": \"anyValue\"}, \"trid\": \"trid\", \"operationName\": \"operationName\"}}], \"products\": [{\"accountId\": \"accountId\", \"createdAt\": \"createdAt\", \"id\": \"id\", \"materialAgreement\": false, \"productType\": \"SOFTWARE\", \"productName\": \"productName\", \"publishedAt\": \"publishedAt\", \"taxAssessment\": \"SOFTWARE\", \"updatedAt\": \"updatedAt\", \"changeRequests\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}]}";
    String listProductsPath = "/products";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListProductsOptions model
    ListProductsOptions listProductsOptionsModel = new ListProductsOptions();

    // Invoke listProducts() with a valid options model and verify the result
    Response<ListProductsResponse> response = partnerCenterSellService.listProducts(listProductsOptionsModel).execute();
    assertNotNull(response);
    ListProductsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listProductsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listProducts operation with and without retries enabled
  @Test
  public void testListProductsWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testListProductsWOptions();

    partnerCenterSellService.disableRetries();
    testListProductsWOptions();
  }

  // Test the createProduct operation with a valid options model parameter
  @Test
  public void testCreateProductWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"createdAt\": \"createdAt\", \"id\": \"id\", \"materialAgreement\": false, \"productType\": \"SOFTWARE\", \"productName\": \"productName\", \"publishedAt\": \"publishedAt\", \"taxAssessment\": \"SOFTWARE\", \"updatedAt\": \"updatedAt\", \"changeRequests\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}";
    String createProductPath = "/products";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateProductOptions model
    CreateProductOptions createProductOptionsModel = new CreateProductOptions.Builder()
      .productName("testString")
      .taxAssessment("SOFTWARE")
      .productType("SOFTWARE")
      .materialAgreement(true)
      .build();

    // Invoke createProduct() with a valid options model and verify the result
    Response<ProductDetails> response = partnerCenterSellService.createProduct(createProductOptionsModel).execute();
    assertNotNull(response);
    ProductDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createProductPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createProduct operation with and without retries enabled
  @Test
  public void testCreateProductWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testCreateProductWOptions();

    partnerCenterSellService.disableRetries();
    testCreateProductWOptions();
  }

  // Test the createProduct operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateProductNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.createProduct(null).execute();
  }

  // Test the getProduct operation with a valid options model parameter
  @Test
  public void testGetProductWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"createdAt\": \"createdAt\", \"id\": \"id\", \"materialAgreement\": false, \"productType\": \"SOFTWARE\", \"productName\": \"productName\", \"publishedAt\": \"publishedAt\", \"taxAssessment\": \"SOFTWARE\", \"updatedAt\": \"updatedAt\", \"changeRequests\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}";
    String getProductPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetProductOptions model
    GetProductOptions getProductOptionsModel = new GetProductOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke getProduct() with a valid options model and verify the result
    Response<ProductDetails> response = partnerCenterSellService.getProduct(getProductOptionsModel).execute();
    assertNotNull(response);
    ProductDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getProductPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getProduct operation with and without retries enabled
  @Test
  public void testGetProductWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testGetProductWOptions();

    partnerCenterSellService.disableRetries();
    testGetProductWOptions();
  }

  // Test the getProduct operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetProductNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.getProduct(null).execute();
  }

  // Test the updateProduct operation with a valid options model parameter
  @Test
  public void testUpdateProductWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"createdAt\": \"createdAt\", \"id\": \"id\", \"materialAgreement\": false, \"productType\": \"SOFTWARE\", \"productName\": \"productName\", \"publishedAt\": \"publishedAt\", \"taxAssessment\": \"SOFTWARE\", \"updatedAt\": \"updatedAt\", \"changeRequests\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}";
    String updateProductPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateProductOptions model
    UpdateProductOptions updateProductOptionsModel = new UpdateProductOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .materialAgreement(true)
      .productName("testString")
      .taxAssessment("SOFTWARE")
      .build();

    // Invoke updateProduct() with a valid options model and verify the result
    Response<ProductDetails> response = partnerCenterSellService.updateProduct(updateProductOptionsModel).execute();
    assertNotNull(response);
    ProductDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateProductPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateProduct operation with and without retries enabled
  @Test
  public void testUpdateProductWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testUpdateProductWOptions();

    partnerCenterSellService.disableRetries();
    testUpdateProductWOptions();
  }

  // Test the updateProduct operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateProductNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.updateProduct(null).execute();
  }

  // Test the deleteProduct operation with a valid options model parameter
  @Test
  public void testDeleteProductWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "false";
    String deleteProductPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteProductOptions model
    DeleteProductOptions deleteProductOptionsModel = new DeleteProductOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke deleteProduct() with a valid options model and verify the result
    Response<Boolean> response = partnerCenterSellService.deleteProduct(deleteProductOptionsModel).execute();
    assertNotNull(response);
    Boolean responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteProductPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteProduct operation with and without retries enabled
  @Test
  public void testDeleteProductWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testDeleteProductWOptions();

    partnerCenterSellService.disableRetries();
    testDeleteProductWOptions();
  }

  // Test the deleteProduct operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteProductNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.deleteProduct(null).execute();
  }

  // Test the publishProduct operation with a valid options model parameter
  @Test
  public void testPublishProductWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"createdAt\": \"createdAt\", \"id\": \"id\", \"materialAgreement\": false, \"productType\": \"SOFTWARE\", \"productName\": \"productName\", \"publishedAt\": \"publishedAt\", \"taxAssessment\": \"SOFTWARE\", \"updatedAt\": \"updatedAt\", \"changeRequests\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}";
    String publishProductPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/publish";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PublishProductOptions model
    PublishProductOptions publishProductOptionsModel = new PublishProductOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke publishProduct() with a valid options model and verify the result
    Response<ProductDetails> response = partnerCenterSellService.publishProduct(publishProductOptionsModel).execute();
    assertNotNull(response);
    ProductDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, publishProductPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the publishProduct operation with and without retries enabled
  @Test
  public void testPublishProductWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testPublishProductWOptions();

    partnerCenterSellService.disableRetries();
    testPublishProductWOptions();
  }

  // Test the publishProduct operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPublishProductNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.publishProduct(null).execute();
  }

  // Test the suspendProduct operation with a valid options model parameter
  @Test
  public void testSuspendProductWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"createdAt\": \"createdAt\", \"id\": \"id\", \"materialAgreement\": false, \"productType\": \"SOFTWARE\", \"productName\": \"productName\", \"publishedAt\": \"publishedAt\", \"taxAssessment\": \"SOFTWARE\", \"updatedAt\": \"updatedAt\", \"changeRequests\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}";
    String suspendProductPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/suspend";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SuspendProductOptions model
    SuspendProductOptions suspendProductOptionsModel = new SuspendProductOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .reason("testString")
      .build();

    // Invoke suspendProduct() with a valid options model and verify the result
    Response<ProductDetails> response = partnerCenterSellService.suspendProduct(suspendProductOptionsModel).execute();
    assertNotNull(response);
    ProductDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, suspendProductPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the suspendProduct operation with and without retries enabled
  @Test
  public void testSuspendProductWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testSuspendProductWOptions();

    partnerCenterSellService.disableRetries();
    testSuspendProductWOptions();
  }

  // Test the suspendProduct operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSuspendProductNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.suspendProduct(null).execute();
  }

  // Test the deprecateProduct operation with a valid options model parameter
  @Test
  public void testDeprecateProductWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"createdAt\": \"createdAt\", \"id\": \"id\", \"materialAgreement\": false, \"productType\": \"SOFTWARE\", \"productName\": \"productName\", \"publishedAt\": \"publishedAt\", \"taxAssessment\": \"SOFTWARE\", \"updatedAt\": \"updatedAt\", \"changeRequests\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}";
    String deprecateProductPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/deprecate";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeprecateProductOptions model
    DeprecateProductOptions deprecateProductOptionsModel = new DeprecateProductOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .reason("testString")
      .build();

    // Invoke deprecateProduct() with a valid options model and verify the result
    Response<ProductDetails> response = partnerCenterSellService.deprecateProduct(deprecateProductOptionsModel).execute();
    assertNotNull(response);
    ProductDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deprecateProductPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deprecateProduct operation with and without retries enabled
  @Test
  public void testDeprecateProductWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testDeprecateProductWOptions();

    partnerCenterSellService.disableRetries();
    testDeprecateProductWOptions();
  }

  // Test the deprecateProduct operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeprecateProductNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.deprecateProduct(null).execute();
  }

  // Test the restoreProduct operation with a valid options model parameter
  @Test
  public void testRestoreProductWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"createdAt\": \"createdAt\", \"id\": \"id\", \"materialAgreement\": false, \"productType\": \"SOFTWARE\", \"productName\": \"productName\", \"publishedAt\": \"publishedAt\", \"taxAssessment\": \"SOFTWARE\", \"updatedAt\": \"updatedAt\", \"changeRequests\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}";
    String restoreProductPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/restore";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RestoreProductOptions model
    RestoreProductOptions restoreProductOptionsModel = new RestoreProductOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .reason("testString")
      .build();

    // Invoke restoreProduct() with a valid options model and verify the result
    Response<ProductDetails> response = partnerCenterSellService.restoreProduct(restoreProductOptionsModel).execute();
    assertNotNull(response);
    ProductDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, restoreProductPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the restoreProduct operation with and without retries enabled
  @Test
  public void testRestoreProductWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testRestoreProductWOptions();

    partnerCenterSellService.disableRetries();
    testRestoreProductWOptions();
  }

  // Test the restoreProduct operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRestoreProductNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.restoreProduct(null).execute();
  }

  // Test the listBadges operation with a valid options model parameter
  @Test
  public void testListBadgesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"label\": \"label\", \"description\": \"description\", \"learnMoreLinks\": {\"firstParty\": \"firstParty\", \"thirdParty\": \"thirdParty\"}, \"getStartedLink\": \"getStartedLink\", \"tag\": \"tag\"}";
    String listBadgesPath = "/products/badges";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListBadgesOptions model
    ListBadgesOptions listBadgesOptionsModel = new ListBadgesOptions();

    // Invoke listBadges() with a valid options model and verify the result
    Response<CloudBadge> response = partnerCenterSellService.listBadges(listBadgesOptionsModel).execute();
    assertNotNull(response);
    CloudBadge responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listBadgesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listBadges operation with and without retries enabled
  @Test
  public void testListBadgesWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testListBadgesWOptions();

    partnerCenterSellService.disableRetries();
    testListBadgesWOptions();
  }

  // Test the getBadge operation with a valid options model parameter
  @Test
  public void testGetBadgeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"label\": \"label\", \"description\": \"description\", \"learnMoreLinks\": {\"firstParty\": \"firstParty\", \"thirdParty\": \"thirdParty\"}, \"getStartedLink\": \"getStartedLink\", \"tag\": \"tag\"}";
    String getBadgePath = "/products/badges/9fab83da-98cb-4f18-a7ba-b6f0435c9673";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetBadgeOptions model
    GetBadgeOptions getBadgeOptionsModel = new GetBadgeOptions.Builder()
      .badgeId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke getBadge() with a valid options model and verify the result
    Response<CloudBadge> response = partnerCenterSellService.getBadge(getBadgeOptionsModel).execute();
    assertNotNull(response);
    CloudBadge responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getBadgePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getBadge operation with and without retries enabled
  @Test
  public void testGetBadgeWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testGetBadgeWOptions();

    partnerCenterSellService.disableRetries();
    testGetBadgeWOptions();
  }

  // Test the getBadge operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetBadgeNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.getBadge(null).execute();
  }

  // Test the getCatalog operation with a valid options model parameter
  @Test
  public void testGetCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"catalogId\": \"catalogId\", \"deprecatePending\": {\"deprecateDate\": \"deprecateDate\", \"deprecateState\": \"deprecateState\", \"description\": \"description\"}, \"description\": \"description\", \"documentationUrl\": \"documentationUrl\", \"editable\": true, \"highlights\": [{\"description\": \"description\", \"description_i18n\": {\"mapKey\": \"anyValue\"}, \"title\": \"title\", \"title_i18n\": {\"mapKey\": \"anyValue\"}}], \"iconUrl\": \"iconUrl\", \"id\": \"id\", \"keywords\": [\"keywords\"], \"label\": \"label\", \"label_i18n\": {\"mapKey\": \"anyValue\"}, \"longDescription\": \"longDescription\", \"long_description_i18n\": {\"mapKey\": \"anyValue\"}, \"media\": [{\"caption\": \"caption\", \"caption_i18n\": {\"mapKey\": \"anyValue\"}, \"thumbnail\": \"thumbnail\", \"type\": \"image\", \"url\": \"url\"}], \"name\": \"name\", \"pcManaged\": false, \"provider\": \"provider\", \"publishedToAccessList\": false, \"publishedToIBM\": true, \"publishedToPublic\": false, \"short_description_i18n\": {\"mapKey\": \"anyValue\"}, \"tags\": [\"tags\"], \"versions\": [{\"deprecatePending\": {\"deprecateDate\": \"deprecateDate\", \"deprecateState\": \"deprecateState\", \"description\": \"description\"}, \"id\": \"id\", \"kindFormat\": \"Helm chart\", \"kindId\": \"kindId\", \"kindTarget\": \"iks\", \"packageVersion\": \"packageVersion\", \"state\": \"deprecated\", \"stateChangeTime\": \"stateChangeTime\", \"validatedState\": \"validatedState\", \"version\": \"version\", \"versionLocator\": \"versionLocator\", \"allowlistedAccounts\": [\"allowlistedAccounts\"]}]}";
    String getCatalogPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/catalog";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetCatalogOptions model
    GetCatalogOptions getCatalogOptionsModel = new GetCatalogOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke getCatalog() with a valid options model and verify the result
    Response<CatalogListingDetails> response = partnerCenterSellService.getCatalog(getCatalogOptionsModel).execute();
    assertNotNull(response);
    CatalogListingDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getCatalog operation with and without retries enabled
  @Test
  public void testGetCatalogWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testGetCatalogWOptions();

    partnerCenterSellService.disableRetries();
    testGetCatalogWOptions();
  }

  // Test the getCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.getCatalog(null).execute();
  }

  // Test the updateCatalog operation with a valid options model parameter
  @Test
  public void testUpdateCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"catalogId\": \"catalogId\", \"deprecatePending\": {\"deprecateDate\": \"deprecateDate\", \"deprecateState\": \"deprecateState\", \"description\": \"description\"}, \"description\": \"description\", \"documentationUrl\": \"documentationUrl\", \"editable\": true, \"highlights\": [{\"description\": \"description\", \"description_i18n\": {\"mapKey\": \"anyValue\"}, \"title\": \"title\", \"title_i18n\": {\"mapKey\": \"anyValue\"}}], \"iconUrl\": \"iconUrl\", \"id\": \"id\", \"keywords\": [\"keywords\"], \"label\": \"label\", \"label_i18n\": {\"mapKey\": \"anyValue\"}, \"longDescription\": \"longDescription\", \"long_description_i18n\": {\"mapKey\": \"anyValue\"}, \"media\": [{\"caption\": \"caption\", \"caption_i18n\": {\"mapKey\": \"anyValue\"}, \"thumbnail\": \"thumbnail\", \"type\": \"image\", \"url\": \"url\"}], \"name\": \"name\", \"pcManaged\": false, \"provider\": \"provider\", \"publishedToAccessList\": false, \"publishedToIBM\": true, \"publishedToPublic\": false, \"short_description_i18n\": {\"mapKey\": \"anyValue\"}, \"tags\": [\"tags\"], \"versions\": [{\"deprecatePending\": {\"deprecateDate\": \"deprecateDate\", \"deprecateState\": \"deprecateState\", \"description\": \"description\"}, \"id\": \"id\", \"kindFormat\": \"Helm chart\", \"kindId\": \"kindId\", \"kindTarget\": \"iks\", \"packageVersion\": \"packageVersion\", \"state\": \"deprecated\", \"stateChangeTime\": \"stateChangeTime\", \"validatedState\": \"validatedState\", \"version\": \"version\", \"versionLocator\": \"versionLocator\", \"allowlistedAccounts\": [\"allowlistedAccounts\"]}]}";
    String updateCatalogPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/catalog";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the HighlightSectionInput model
    HighlightSectionInput highlightSectionInputModel = new HighlightSectionInput.Builder()
      .description("testString")
      .title("testString")
      .build();

    // Construct an instance of the MediaSectionInput model
    MediaSectionInput mediaSectionInputModel = new MediaSectionInput.Builder()
      .caption("testString")
      .thumbnail("testString")
      .type("image")
      .url("testString")
      .build();

    // Construct an instance of the UpdateCatalogOptions model
    UpdateCatalogOptions updateCatalogOptionsModel = new UpdateCatalogOptions.Builder()
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

    // Invoke updateCatalog() with a valid options model and verify the result
    Response<CatalogListingDetails> response = partnerCenterSellService.updateCatalog(updateCatalogOptionsModel).execute();
    assertNotNull(response);
    CatalogListingDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateCatalog operation with and without retries enabled
  @Test
  public void testUpdateCatalogWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testUpdateCatalogWOptions();

    partnerCenterSellService.disableRetries();
    testUpdateCatalogWOptions();
  }

  // Test the updateCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.updateCatalog(null).execute();
  }

  // Test the requestCatalogApproval operation with a valid options model parameter
  @Test
  public void testRequestCatalogApprovalWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"history\": [{\"at\": \"at\", \"displayName\": \"displayName\", \"event\": \"event\", \"reason\": \"reason\", \"username\": \"username\"}], \"id\": \"id\", \"nextEvents\": [\"nextEvents\"], \"state\": {\"name\": \"waitingForRequestForReview\"}}";
    String requestCatalogApprovalPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/catalog/approvals";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RequestCatalogApprovalOptions model
    RequestCatalogApprovalOptions requestCatalogApprovalOptionsModel = new RequestCatalogApprovalOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke requestCatalogApproval() with a valid options model and verify the result
    Response<Resource> response = partnerCenterSellService.requestCatalogApproval(requestCatalogApprovalOptionsModel).execute();
    assertNotNull(response);
    Resource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, requestCatalogApprovalPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the requestCatalogApproval operation with and without retries enabled
  @Test
  public void testRequestCatalogApprovalWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testRequestCatalogApprovalWOptions();

    partnerCenterSellService.disableRetries();
    testRequestCatalogApprovalWOptions();
  }

  // Test the requestCatalogApproval operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRequestCatalogApprovalNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.requestCatalogApproval(null).execute();
  }

  // Test the listPlans operation with a valid options model parameter
  @Test
  public void testListPlansWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"plans\": [{\"description\": \"description\", \"id\": \"id\", \"label\": \"label\", \"type\": \"byol\", \"url\": \"url\"}]}";
    String listPlansPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/plans";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPlansOptions model
    ListPlansOptions listPlansOptionsModel = new ListPlansOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke listPlans() with a valid options model and verify the result
    Response<ListPlansResponse> response = partnerCenterSellService.listPlans(listPlansOptionsModel).execute();
    assertNotNull(response);
    ListPlansResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPlansPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listPlans operation with and without retries enabled
  @Test
  public void testListPlansWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testListPlansWOptions();

    partnerCenterSellService.disableRetries();
    testListPlansWOptions();
  }

  // Test the listPlans operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPlansNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.listPlans(null).execute();
  }

  // Test the createPlan operation with a valid options model parameter
  @Test
  public void testCreatePlanWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"plans\": [{\"description\": \"description\", \"id\": \"id\", \"label\": \"label\", \"type\": \"byol\", \"url\": \"url\"}]}";
    String createPlanPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/plans";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreatePlanOptions model
    CreatePlanOptions createPlanOptionsModel = new CreatePlanOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .description("testString")
      .label("testString")
      .type("byol")
      .url("testString")
      .build();

    // Invoke createPlan() with a valid options model and verify the result
    Response<CreatePlanResponse> response = partnerCenterSellService.createPlan(createPlanOptionsModel).execute();
    assertNotNull(response);
    CreatePlanResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPlanPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPlan operation with and without retries enabled
  @Test
  public void testCreatePlanWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testCreatePlanWOptions();

    partnerCenterSellService.disableRetries();
    testCreatePlanWOptions();
  }

  // Test the createPlan operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePlanNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.createPlan(null).execute();
  }

  // Test the getPlan operation with a valid options model parameter
  @Test
  public void testGetPlanWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"description\": \"description\", \"id\": \"id\", \"label\": \"label\", \"type\": \"byol\", \"url\": \"url\"}";
    String getPlanPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/plans/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPlanOptions model
    GetPlanOptions getPlanOptionsModel = new GetPlanOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .pricingPlanId("testString")
      .build();

    // Invoke getPlan() with a valid options model and verify the result
    Response<License> response = partnerCenterSellService.getPlan(getPlanOptionsModel).execute();
    assertNotNull(response);
    License responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPlanPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPlan operation with and without retries enabled
  @Test
  public void testGetPlanWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testGetPlanWOptions();

    partnerCenterSellService.disableRetries();
    testGetPlanWOptions();
  }

  // Test the getPlan operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPlanNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.getPlan(null).execute();
  }

  // Test the updatePlan operation with a valid options model parameter
  @Test
  public void testUpdatePlanWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"plans\": [{\"description\": \"description\", \"id\": \"id\", \"label\": \"label\", \"type\": \"byol\", \"url\": \"url\"}]}";
    String updatePlanPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/plans/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdatePlanOptions model
    UpdatePlanOptions updatePlanOptionsModel = new UpdatePlanOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .pricingPlanId("testString")
      .description("testString")
      .label("testString")
      .type("byol")
      .url("testString")
      .build();

    // Invoke updatePlan() with a valid options model and verify the result
    Response<CreatePlanResponse> response = partnerCenterSellService.updatePlan(updatePlanOptionsModel).execute();
    assertNotNull(response);
    CreatePlanResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePlanPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePlan operation with and without retries enabled
  @Test
  public void testUpdatePlanWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testUpdatePlanWOptions();

    partnerCenterSellService.disableRetries();
    testUpdatePlanWOptions();
  }

  // Test the updatePlan operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePlanNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.updatePlan(null).execute();
  }

  // Test the deletePlan operation with a valid options model parameter
  @Test
  public void testDeletePlanWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"plans\": [{\"description\": \"description\", \"id\": \"id\", \"label\": \"label\", \"type\": \"byol\", \"url\": \"url\"}]}";
    String deletePlanPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/plans/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePlanOptions model
    DeletePlanOptions deletePlanOptionsModel = new DeletePlanOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .pricingPlanId("testString")
      .build();

    // Invoke deletePlan() with a valid options model and verify the result
    Response<CreatePlanResponse> response = partnerCenterSellService.deletePlan(deletePlanOptionsModel).execute();
    assertNotNull(response);
    CreatePlanResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePlanPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deletePlan operation with and without retries enabled
  @Test
  public void testDeletePlanWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testDeletePlanWOptions();

    partnerCenterSellService.disableRetries();
    testDeletePlanWOptions();
  }

  // Test the deletePlan operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePlanNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.deletePlan(null).execute();
  }

  // Test the getSupport operation with a valid options model parameter
  @Test
  public void testGetSupportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}";
    String getSupportPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/support";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSupportOptions model
    GetSupportOptions getSupportOptionsModel = new GetSupportOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke getSupport() with a valid options model and verify the result
    Response<Support> response = partnerCenterSellService.getSupport(getSupportOptionsModel).execute();
    assertNotNull(response);
    Support responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSupportPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSupport operation with and without retries enabled
  @Test
  public void testGetSupportWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testGetSupportWOptions();

    partnerCenterSellService.disableRetries();
    testGetSupportWOptions();
  }

  // Test the getSupport operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSupportNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.getSupport(null).execute();
  }

  // Test the updateSupport operation with a valid options model parameter
  @Test
  public void testUpdateSupportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}";
    String updateSupportPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/support";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the EscalationContactsUpdate model
    EscalationContactsUpdate escalationContactsUpdateModel = new EscalationContactsUpdate.Builder()
      .email("testString")
      .name("testString")
      .build();

    // Construct an instance of the SupportDetailsAvailabilityTimes model
    SupportDetailsAvailabilityTimes supportDetailsAvailabilityTimesModel = new SupportDetailsAvailabilityTimes.Builder()
      .day(Long.valueOf("1"))
      .endTime("19:30")
      .startTime("10:30")
      .build();

    // Construct an instance of the SupportDetailsAvailability model
    SupportDetailsAvailability supportDetailsAvailabilityModel = new SupportDetailsAvailability.Builder()
      .alwaysAvailable(true)
      .times(java.util.Arrays.asList(supportDetailsAvailabilityTimesModel))
      .timezone("America/Los_Angeles")
      .build();

    // Construct an instance of the SupportResponseTimes model
    SupportResponseTimes supportResponseTimesModel = new SupportResponseTimes.Builder()
      .type("hour")
      .value(Long.valueOf("2"))
      .build();

    // Construct an instance of the SupportDetails model
    SupportDetails supportDetailsModel = new SupportDetails.Builder()
      .availability(supportDetailsAvailabilityModel)
      .contact("testString")
      .responseWaitTime(supportResponseTimesModel)
      .type("email")
      .build();

    // Construct an instance of the SupportEscalationTimes model
    SupportEscalationTimes supportEscalationTimesModel = new SupportEscalationTimes.Builder()
      .type("hour")
      .value(Long.valueOf("2"))
      .build();

    // Construct an instance of the SupportEscalation model
    SupportEscalation supportEscalationModel = new SupportEscalation.Builder()
      .contact("testString")
      .escalationWaitTime(supportEscalationTimesModel)
      .responseWaitTime(supportResponseTimesModel)
      .build();

    // Construct an instance of the UpdateSupportOptions model
    UpdateSupportOptions updateSupportOptionsModel = new UpdateSupportOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .escalationContacts(java.util.Arrays.asList(escalationContactsUpdateModel))
      .locations(java.util.Arrays.asList("US"))
      .supportDetails(java.util.Arrays.asList(supportDetailsModel))
      .supportEscalation(supportEscalationModel)
      .supportType("third-party")
      .url("https://my-company.com/support")
      .build();

    // Invoke updateSupport() with a valid options model and verify the result
    Response<Support> response = partnerCenterSellService.updateSupport(updateSupportOptionsModel).execute();
    assertNotNull(response);
    Support responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSupportPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSupport operation with and without retries enabled
  @Test
  public void testUpdateSupportWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testUpdateSupportWOptions();

    partnerCenterSellService.disableRetries();
    testUpdateSupportWOptions();
  }

  // Test the updateSupport operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSupportNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.updateSupport(null).execute();
  }

  // Test the listSupportChangeRequests operation with a valid options model parameter
  @Test
  public void testListSupportChangeRequestsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"changes\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}";
    String listSupportChangeRequestsPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/support/changes";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSupportChangeRequestsOptions model
    ListSupportChangeRequestsOptions listSupportChangeRequestsOptionsModel = new ListSupportChangeRequestsOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke listSupportChangeRequests() with a valid options model and verify the result
    Response<ListSupportChangeRequestsResponse> response = partnerCenterSellService.listSupportChangeRequests(listSupportChangeRequestsOptionsModel).execute();
    assertNotNull(response);
    ListSupportChangeRequestsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSupportChangeRequestsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listSupportChangeRequests operation with and without retries enabled
  @Test
  public void testListSupportChangeRequestsWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testListSupportChangeRequestsWOptions();

    partnerCenterSellService.disableRetries();
    testListSupportChangeRequestsWOptions();
  }

  // Test the listSupportChangeRequests operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSupportChangeRequestsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.listSupportChangeRequests(null).execute();
  }

  // Test the createSupportChangeRequest operation with a valid options model parameter
  @Test
  public void testCreateSupportChangeRequestWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"createdAt\": \"createdAt\", \"id\": \"id\", \"materialAgreement\": false, \"productType\": \"SOFTWARE\", \"productName\": \"productName\", \"publishedAt\": \"publishedAt\", \"taxAssessment\": \"SOFTWARE\", \"updatedAt\": \"updatedAt\", \"changeRequests\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}";
    String createSupportChangeRequestPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/support/changes";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SupportDetailsAvailabilityTimes model
    SupportDetailsAvailabilityTimes supportDetailsAvailabilityTimesModel = new SupportDetailsAvailabilityTimes.Builder()
      .day(Long.valueOf("1"))
      .endTime("19:30")
      .startTime("10:30")
      .build();

    // Construct an instance of the SupportDetailsAvailability model
    SupportDetailsAvailability supportDetailsAvailabilityModel = new SupportDetailsAvailability.Builder()
      .alwaysAvailable(true)
      .times(java.util.Arrays.asList(supportDetailsAvailabilityTimesModel))
      .timezone("America/Los_Angeles")
      .build();

    // Construct an instance of the SupportResponseTimes model
    SupportResponseTimes supportResponseTimesModel = new SupportResponseTimes.Builder()
      .type("hour")
      .value(Long.valueOf("2"))
      .build();

    // Construct an instance of the SupportDetails model
    SupportDetails supportDetailsModel = new SupportDetails.Builder()
      .availability(supportDetailsAvailabilityModel)
      .contact("testString")
      .responseWaitTime(supportResponseTimesModel)
      .type("email")
      .build();

    // Construct an instance of the SupportEscalationTimes model
    SupportEscalationTimes supportEscalationTimesModel = new SupportEscalationTimes.Builder()
      .type("hour")
      .value(Long.valueOf("2"))
      .build();

    // Construct an instance of the SupportEscalation model
    SupportEscalation supportEscalationModel = new SupportEscalation.Builder()
      .contact("testString")
      .escalationWaitTime(supportEscalationTimesModel)
      .responseWaitTime(supportResponseTimesModel)
      .build();

    // Construct an instance of the Support model
    Support supportModel = new Support.Builder()
      .locations(java.util.Arrays.asList("US"))
      .process("testString")
      .processI18n(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .supportDetails(java.util.Arrays.asList(supportDetailsModel))
      .supportEscalation(supportEscalationModel)
      .supportType("third-party")
      .url("https://my-company.com/support")
      .build();

    // Construct an instance of the CreateSupportChangeRequestOptions model
    CreateSupportChangeRequestOptions createSupportChangeRequestOptionsModel = new CreateSupportChangeRequestOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .change(supportModel)
      .build();

    // Invoke createSupportChangeRequest() with a valid options model and verify the result
    Response<ProductDetails> response = partnerCenterSellService.createSupportChangeRequest(createSupportChangeRequestOptionsModel).execute();
    assertNotNull(response);
    ProductDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSupportChangeRequestPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSupportChangeRequest operation with and without retries enabled
  @Test
  public void testCreateSupportChangeRequestWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testCreateSupportChangeRequestWOptions();

    partnerCenterSellService.disableRetries();
    testCreateSupportChangeRequestWOptions();
  }

  // Test the createSupportChangeRequest operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSupportChangeRequestNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.createSupportChangeRequest(null).execute();
  }

  // Test the getSupportChangeRequest operation with a valid options model parameter
  @Test
  public void testGetSupportChangeRequestWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}";
    String getSupportChangeRequestPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/support/changes/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSupportChangeRequestOptions model
    GetSupportChangeRequestOptions getSupportChangeRequestOptionsModel = new GetSupportChangeRequestOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .changeRequestId("testString")
      .build();

    // Invoke getSupportChangeRequest() with a valid options model and verify the result
    Response<ChangeRequest> response = partnerCenterSellService.getSupportChangeRequest(getSupportChangeRequestOptionsModel).execute();
    assertNotNull(response);
    ChangeRequest responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSupportChangeRequestPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSupportChangeRequest operation with and without retries enabled
  @Test
  public void testGetSupportChangeRequestWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testGetSupportChangeRequestWOptions();

    partnerCenterSellService.disableRetries();
    testGetSupportChangeRequestWOptions();
  }

  // Test the getSupportChangeRequest operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSupportChangeRequestNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.getSupportChangeRequest(null).execute();
  }

  // Test the updateSupportChangeRequest operation with a valid options model parameter
  @Test
  public void testUpdateSupportChangeRequestWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"createdAt\": \"createdAt\", \"id\": \"id\", \"materialAgreement\": false, \"productType\": \"SOFTWARE\", \"productName\": \"productName\", \"publishedAt\": \"publishedAt\", \"taxAssessment\": \"SOFTWARE\", \"updatedAt\": \"updatedAt\", \"changeRequests\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}";
    String updateSupportChangeRequestPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/support/changes/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SupportDetailsAvailabilityTimes model
    SupportDetailsAvailabilityTimes supportDetailsAvailabilityTimesModel = new SupportDetailsAvailabilityTimes.Builder()
      .day(Long.valueOf("1"))
      .endTime("19:30")
      .startTime("10:30")
      .build();

    // Construct an instance of the SupportDetailsAvailability model
    SupportDetailsAvailability supportDetailsAvailabilityModel = new SupportDetailsAvailability.Builder()
      .alwaysAvailable(true)
      .times(java.util.Arrays.asList(supportDetailsAvailabilityTimesModel))
      .timezone("America/Los_Angeles")
      .build();

    // Construct an instance of the SupportResponseTimes model
    SupportResponseTimes supportResponseTimesModel = new SupportResponseTimes.Builder()
      .type("hour")
      .value(Long.valueOf("2"))
      .build();

    // Construct an instance of the SupportDetails model
    SupportDetails supportDetailsModel = new SupportDetails.Builder()
      .availability(supportDetailsAvailabilityModel)
      .contact("testString")
      .responseWaitTime(supportResponseTimesModel)
      .type("email")
      .build();

    // Construct an instance of the SupportEscalationTimes model
    SupportEscalationTimes supportEscalationTimesModel = new SupportEscalationTimes.Builder()
      .type("hour")
      .value(Long.valueOf("2"))
      .build();

    // Construct an instance of the SupportEscalation model
    SupportEscalation supportEscalationModel = new SupportEscalation.Builder()
      .contact("testString")
      .escalationWaitTime(supportEscalationTimesModel)
      .responseWaitTime(supportResponseTimesModel)
      .build();

    // Construct an instance of the Support model
    Support supportModel = new Support.Builder()
      .locations(java.util.Arrays.asList("US"))
      .process("testString")
      .processI18n(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .supportDetails(java.util.Arrays.asList(supportDetailsModel))
      .supportEscalation(supportEscalationModel)
      .supportType("third-party")
      .url("https://my-company.com/support")
      .build();

    // Construct an instance of the UpdateSupportChangeRequestOptions model
    UpdateSupportChangeRequestOptions updateSupportChangeRequestOptionsModel = new UpdateSupportChangeRequestOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .changeRequestId("testString")
      .change(supportModel)
      .build();

    // Invoke updateSupportChangeRequest() with a valid options model and verify the result
    Response<ProductDetails> response = partnerCenterSellService.updateSupportChangeRequest(updateSupportChangeRequestOptionsModel).execute();
    assertNotNull(response);
    ProductDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSupportChangeRequestPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSupportChangeRequest operation with and without retries enabled
  @Test
  public void testUpdateSupportChangeRequestWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testUpdateSupportChangeRequestWOptions();

    partnerCenterSellService.disableRetries();
    testUpdateSupportChangeRequestWOptions();
  }

  // Test the updateSupportChangeRequest operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSupportChangeRequestNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.updateSupportChangeRequest(null).execute();
  }

  // Test the listSupportChangeRequestReviews operation with a valid options model parameter
  @Test
  public void testListSupportChangeRequestReviewsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"history\": [{\"at\": \"at\", \"displayName\": \"displayName\", \"event\": \"event\", \"reason\": \"reason\", \"username\": \"username\"}], \"id\": \"id\", \"nextEvents\": [\"nextEvents\"], \"state\": {\"name\": \"waitingForRequestForReview\"}}";
    String listSupportChangeRequestReviewsPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/support/changes/testString/reviews";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSupportChangeRequestReviewsOptions model
    ListSupportChangeRequestReviewsOptions listSupportChangeRequestReviewsOptionsModel = new ListSupportChangeRequestReviewsOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .changeRequestId("testString")
      .build();

    // Invoke listSupportChangeRequestReviews() with a valid options model and verify the result
    Response<Resource> response = partnerCenterSellService.listSupportChangeRequestReviews(listSupportChangeRequestReviewsOptionsModel).execute();
    assertNotNull(response);
    Resource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSupportChangeRequestReviewsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listSupportChangeRequestReviews operation with and without retries enabled
  @Test
  public void testListSupportChangeRequestReviewsWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testListSupportChangeRequestReviewsWOptions();

    partnerCenterSellService.disableRetries();
    testListSupportChangeRequestReviewsWOptions();
  }

  // Test the listSupportChangeRequestReviews operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSupportChangeRequestReviewsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.listSupportChangeRequestReviews(null).execute();
  }

  // Test the requestSupportChangeRequestReview operation with a valid options model parameter
  @Test
  public void testRequestSupportChangeRequestReviewWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"history\": [{\"at\": \"at\", \"displayName\": \"displayName\", \"event\": \"event\", \"reason\": \"reason\", \"username\": \"username\"}], \"id\": \"id\", \"nextEvents\": [\"nextEvents\"], \"state\": {\"name\": \"waitingForRequestForReview\"}}";
    String requestSupportChangeRequestReviewPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/support/changes/testString/reviews";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RequestSupportChangeRequestReviewOptions model
    RequestSupportChangeRequestReviewOptions requestSupportChangeRequestReviewOptionsModel = new RequestSupportChangeRequestReviewOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .changeRequestId("testString")
      .build();

    // Invoke requestSupportChangeRequestReview() with a valid options model and verify the result
    Response<Resource> response = partnerCenterSellService.requestSupportChangeRequestReview(requestSupportChangeRequestReviewOptionsModel).execute();
    assertNotNull(response);
    Resource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, requestSupportChangeRequestReviewPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the requestSupportChangeRequestReview operation with and without retries enabled
  @Test
  public void testRequestSupportChangeRequestReviewWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testRequestSupportChangeRequestReviewWOptions();

    partnerCenterSellService.disableRetries();
    testRequestSupportChangeRequestReviewWOptions();
  }

  // Test the requestSupportChangeRequestReview operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRequestSupportChangeRequestReviewNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.requestSupportChangeRequestReview(null).execute();
  }

  // Test the mergeSupportChangeRequest operation with a valid options model parameter
  @Test
  public void testMergeSupportChangeRequestWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"accountId\": \"accountId\", \"createdAt\": \"createdAt\", \"id\": \"id\", \"materialAgreement\": false, \"productType\": \"SOFTWARE\", \"productName\": \"productName\", \"publishedAt\": \"publishedAt\", \"taxAssessment\": \"SOFTWARE\", \"updatedAt\": \"updatedAt\", \"changeRequests\": [{\"id\": \"id\", \"createdAt\": \"createdAt\", \"initiator\": \"initiator\", \"merged\": \"merged\", \"change\": {\"locations\": [\"US\"], \"process\": \"process\", \"process_i18n\": {\"mapKey\": \"anyValue\"}, \"support_details\": [{\"availability\": {\"always_available\": false, \"times\": [{\"day\": 1, \"end_time\": \"19:30\", \"start_time\": \"10:30\"}], \"timezone\": \"America/Los_Angeles\"}, \"contact\": \"contact\", \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"type\": \"email\"}], \"support_escalation\": {\"contact\": \"contact\", \"escalation_wait_time\": {\"type\": \"hour\", \"value\": 2}, \"response_wait_time\": {\"type\": \"hour\", \"value\": 2}}, \"support_type\": \"third-party\", \"url\": \"https://my-company.com/support\"}}]}";
    String mergeSupportChangeRequestPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/support/changes/testString/merge";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the MergeSupportChangeRequestOptions model
    MergeSupportChangeRequestOptions mergeSupportChangeRequestOptionsModel = new MergeSupportChangeRequestOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .changeRequestId("testString")
      .build();

    // Invoke mergeSupportChangeRequest() with a valid options model and verify the result
    Response<ProductDetails> response = partnerCenterSellService.mergeSupportChangeRequest(mergeSupportChangeRequestOptionsModel).execute();
    assertNotNull(response);
    ProductDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, mergeSupportChangeRequestPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the mergeSupportChangeRequest operation with and without retries enabled
  @Test
  public void testMergeSupportChangeRequestWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testMergeSupportChangeRequestWOptions();

    partnerCenterSellService.disableRetries();
    testMergeSupportChangeRequestWOptions();
  }

  // Test the mergeSupportChangeRequest operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testMergeSupportChangeRequestNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.mergeSupportChangeRequest(null).execute();
  }

  // Test the requestSupportApproval operation with a valid options model parameter
  @Test
  public void testRequestSupportApprovalWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"history\": [{\"at\": \"at\", \"displayName\": \"displayName\", \"event\": \"event\", \"reason\": \"reason\", \"username\": \"username\"}], \"id\": \"id\", \"nextEvents\": [\"nextEvents\"], \"state\": {\"name\": \"waitingForRequestForReview\"}}";
    String requestSupportApprovalPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/support/approvals";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RequestSupportApprovalOptions model
    RequestSupportApprovalOptions requestSupportApprovalOptionsModel = new RequestSupportApprovalOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke requestSupportApproval() with a valid options model and verify the result
    Response<Resource> response = partnerCenterSellService.requestSupportApproval(requestSupportApprovalOptionsModel).execute();
    assertNotNull(response);
    Resource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, requestSupportApprovalPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the requestSupportApproval operation with and without retries enabled
  @Test
  public void testRequestSupportApprovalWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testRequestSupportApprovalWOptions();

    partnerCenterSellService.disableRetries();
    testRequestSupportApprovalWOptions();
  }

  // Test the requestSupportApproval operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRequestSupportApprovalNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.requestSupportApproval(null).execute();
  }

  // Test the requestProductApproval operation with a valid options model parameter
  @Test
  public void testRequestProductApprovalWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"history\": [{\"at\": \"at\", \"displayName\": \"displayName\", \"event\": \"event\", \"reason\": \"reason\", \"username\": \"username\"}], \"id\": \"id\", \"nextEvents\": [\"nextEvents\"], \"state\": {\"name\": \"waitingForRequestForReview\"}}";
    String requestProductApprovalPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/approvals";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RequestProductApprovalOptions model
    RequestProductApprovalOptions requestProductApprovalOptionsModel = new RequestProductApprovalOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke requestProductApproval() with a valid options model and verify the result
    Response<Resource> response = partnerCenterSellService.requestProductApproval(requestProductApprovalOptionsModel).execute();
    assertNotNull(response);
    Resource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, requestProductApprovalPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the requestProductApproval operation with and without retries enabled
  @Test
  public void testRequestProductApprovalWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testRequestProductApprovalWOptions();

    partnerCenterSellService.disableRetries();
    testRequestProductApprovalWOptions();
  }

  // Test the requestProductApproval operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRequestProductApprovalNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.requestProductApproval(null).execute();
  }

  // Test the listProductApprovals operation with a valid options model parameter
  @Test
  public void testListProductApprovalsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"approvals\": [{\"history\": [{\"at\": \"at\", \"displayName\": \"displayName\", \"event\": \"event\", \"reason\": \"reason\", \"username\": \"username\"}], \"id\": \"id\", \"nextEvents\": [\"nextEvents\"], \"state\": {\"name\": \"waitingForRequestForReview\"}}]}";
    String listProductApprovalsPath = "/products/9fab83da-98cb-4f18-a7ba-b6f0435c9673/approvals";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListProductApprovalsOptions model
    ListProductApprovalsOptions listProductApprovalsOptionsModel = new ListProductApprovalsOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .build();

    // Invoke listProductApprovals() with a valid options model and verify the result
    Response<ListProductApprovalsResponse> response = partnerCenterSellService.listProductApprovals(listProductApprovalsOptionsModel).execute();
    assertNotNull(response);
    ListProductApprovalsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listProductApprovalsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listProductApprovals operation with and without retries enabled
  @Test
  public void testListProductApprovalsWRetries() throws Throwable {
    partnerCenterSellService.enableRetries(4, 30);
    testListProductApprovalsWOptions();

    partnerCenterSellService.disableRetries();
    testListProductApprovalsWOptions();
  }

  // Test the listProductApprovals operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListProductApprovalsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    partnerCenterSellService.listProductApprovals(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    partnerCenterSellService = null;
  }

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv()
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";

    partnerCenterSellService = PartnerCenterSell.newInstance(serviceName);
    String url = server.url("/").toString();
    partnerCenterSellService.setServiceUrl(url);
  }
}