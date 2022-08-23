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

import com.ibm.cloud.platform_services.partner_center_sell.v1.model.HighlightSectionInput;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.MediaSectionInput;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdateCatalogOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateCatalogOptions model.
 */
public class UpdateCatalogOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateCatalogOptions() throws Throwable {
    HighlightSectionInput highlightSectionInputModel = new HighlightSectionInput.Builder()
      .description("testString")
      .title("testString")
      .build();
    assertEquals(highlightSectionInputModel.description(), "testString");
    assertEquals(highlightSectionInputModel.title(), "testString");

    MediaSectionInput mediaSectionInputModel = new MediaSectionInput.Builder()
      .caption("testString")
      .thumbnail("testString")
      .type("image")
      .url("testString")
      .build();
    assertEquals(mediaSectionInputModel.caption(), "testString");
    assertEquals(mediaSectionInputModel.thumbnail(), "testString");
    assertEquals(mediaSectionInputModel.type(), "image");
    assertEquals(mediaSectionInputModel.url(), "testString");

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
    assertEquals(updateCatalogOptionsModel.productId(), "9fab83da-98cb-4f18-a7ba-b6f0435c9673");
    assertEquals(updateCatalogOptionsModel.catalogId(), "testString");
    assertEquals(updateCatalogOptionsModel.description(), "testString");
    assertEquals(updateCatalogOptionsModel.iconUrl(), "testString");
    assertEquals(updateCatalogOptionsModel.keywords(), java.util.Arrays.asList("testString"));
    assertEquals(updateCatalogOptionsModel.pricingModel(), "free");
    assertEquals(updateCatalogOptionsModel.category(), "testString");
    assertEquals(updateCatalogOptionsModel.providerType(), java.util.Arrays.asList("ibm_community"));
    assertEquals(updateCatalogOptionsModel.label(), "testString");
    assertEquals(updateCatalogOptionsModel.name(), "testString");
    assertEquals(updateCatalogOptionsModel.provider(), "testString");
    assertEquals(updateCatalogOptionsModel.tags(), java.util.Arrays.asList("testString"));
    assertEquals(updateCatalogOptionsModel.documentationUrl(), "testString");
    assertEquals(updateCatalogOptionsModel.highlights(), java.util.Arrays.asList(highlightSectionInputModel));
    assertEquals(updateCatalogOptionsModel.longDescription(), "testString");
    assertEquals(updateCatalogOptionsModel.media(), java.util.Arrays.asList(mediaSectionInputModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCatalogOptionsError() throws Throwable {
    new UpdateCatalogOptions.Builder().build();
  }

}