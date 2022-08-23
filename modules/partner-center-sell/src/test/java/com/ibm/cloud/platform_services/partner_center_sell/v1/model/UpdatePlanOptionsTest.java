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

import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdatePlanOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdatePlanOptions model.
 */
public class UpdatePlanOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdatePlanOptions() throws Throwable {
    UpdatePlanOptions updatePlanOptionsModel = new UpdatePlanOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .pricingPlanId("testString")
      .description("testString")
      .label("testString")
      .type("byol")
      .url("testString")
      .build();
    assertEquals(updatePlanOptionsModel.productId(), "9fab83da-98cb-4f18-a7ba-b6f0435c9673");
    assertEquals(updatePlanOptionsModel.pricingPlanId(), "testString");
    assertEquals(updatePlanOptionsModel.description(), "testString");
    assertEquals(updatePlanOptionsModel.label(), "testString");
    assertEquals(updatePlanOptionsModel.type(), "byol");
    assertEquals(updatePlanOptionsModel.url(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePlanOptionsError() throws Throwable {
    new UpdatePlanOptions.Builder().build();
  }

}