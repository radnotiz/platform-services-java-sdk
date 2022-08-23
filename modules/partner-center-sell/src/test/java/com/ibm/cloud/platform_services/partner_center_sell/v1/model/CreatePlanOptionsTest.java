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

import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CreatePlanOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePlanOptions model.
 */
public class CreatePlanOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePlanOptions() throws Throwable {
    CreatePlanOptions createPlanOptionsModel = new CreatePlanOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .description("testString")
      .label("testString")
      .type("byol")
      .url("testString")
      .build();
    assertEquals(createPlanOptionsModel.productId(), "9fab83da-98cb-4f18-a7ba-b6f0435c9673");
    assertEquals(createPlanOptionsModel.description(), "testString");
    assertEquals(createPlanOptionsModel.label(), "testString");
    assertEquals(createPlanOptionsModel.type(), "byol");
    assertEquals(createPlanOptionsModel.url(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePlanOptionsError() throws Throwable {
    new CreatePlanOptions.Builder().build();
  }

}