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

import com.ibm.cloud.platform_services.partner_center_sell.v1.model.MediaSectionInput;
import com.ibm.cloud.platform_services.partner_center_sell.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the MediaSectionInput model.
 */
public class MediaSectionInputTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMediaSectionInput() throws Throwable {
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

    String json = TestUtilities.serialize(mediaSectionInputModel);

    MediaSectionInput mediaSectionInputModelNew = TestUtilities.deserialize(json, MediaSectionInput.class);
    assertTrue(mediaSectionInputModelNew instanceof MediaSectionInput);
    assertEquals(mediaSectionInputModelNew.caption(), "testString");
    assertEquals(mediaSectionInputModelNew.thumbnail(), "testString");
    assertEquals(mediaSectionInputModelNew.type(), "image");
    assertEquals(mediaSectionInputModelNew.url(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testMediaSectionInputError() throws Throwable {
    new MediaSectionInput.Builder().build();
  }

}