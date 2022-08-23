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

import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportDetailsAvailability;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportDetailsAvailabilityTimes;
import com.ibm.cloud.platform_services.partner_center_sell.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SupportDetailsAvailability model.
 */
public class SupportDetailsAvailabilityTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSupportDetailsAvailability() throws Throwable {
    SupportDetailsAvailabilityTimes supportDetailsAvailabilityTimesModel = new SupportDetailsAvailabilityTimes.Builder()
      .day(Long.valueOf("1"))
      .endTime("19:30")
      .startTime("10:30")
      .build();
    assertEquals(supportDetailsAvailabilityTimesModel.day(), Long.valueOf("1"));
    assertEquals(supportDetailsAvailabilityTimesModel.endTime(), "19:30");
    assertEquals(supportDetailsAvailabilityTimesModel.startTime(), "10:30");

    SupportDetailsAvailability supportDetailsAvailabilityModel = new SupportDetailsAvailability.Builder()
      .alwaysAvailable(true)
      .times(java.util.Arrays.asList(supportDetailsAvailabilityTimesModel))
      .timezone("America/Los_Angeles")
      .build();
    assertEquals(supportDetailsAvailabilityModel.alwaysAvailable(), Boolean.valueOf(true));
    assertEquals(supportDetailsAvailabilityModel.times(), java.util.Arrays.asList(supportDetailsAvailabilityTimesModel));
    assertEquals(supportDetailsAvailabilityModel.timezone(), "America/Los_Angeles");

    String json = TestUtilities.serialize(supportDetailsAvailabilityModel);

    SupportDetailsAvailability supportDetailsAvailabilityModelNew = TestUtilities.deserialize(json, SupportDetailsAvailability.class);
    assertTrue(supportDetailsAvailabilityModelNew instanceof SupportDetailsAvailability);
    assertEquals(supportDetailsAvailabilityModelNew.alwaysAvailable(), Boolean.valueOf(true));
    assertEquals(supportDetailsAvailabilityModelNew.timezone(), "America/Los_Angeles");
  }
}