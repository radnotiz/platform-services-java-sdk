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

import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ChangeRequest;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.ProductDetails;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.Support;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportDetails;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportDetailsAvailability;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportDetailsAvailabilityTimes;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportEscalation;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportEscalationTimes;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportResponseTimes;
import com.ibm.cloud.platform_services.partner_center_sell.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ProductDetails model.
 */
public class ProductDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testProductDetails() throws Throwable {
    ProductDetails productDetailsModel = new ProductDetails();
    assertNull(productDetailsModel.getAccountId());
    assertNull(productDetailsModel.getCreatedAt());
    assertNull(productDetailsModel.getId());
    assertNull(productDetailsModel.isMaterialAgreement());
    assertNull(productDetailsModel.getProductType());
    assertNull(productDetailsModel.getProductName());
    assertNull(productDetailsModel.getPublishedAt());
    assertNull(productDetailsModel.getTaxAssessment());
    assertNull(productDetailsModel.getUpdatedAt());
    assertNull(productDetailsModel.getChangeRequests());
  }
}