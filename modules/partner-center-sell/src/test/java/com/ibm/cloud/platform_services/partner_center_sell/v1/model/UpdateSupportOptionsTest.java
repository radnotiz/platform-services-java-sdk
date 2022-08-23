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

import com.ibm.cloud.platform_services.partner_center_sell.v1.model.EscalationContactsUpdate;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportDetails;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportDetailsAvailability;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportDetailsAvailabilityTimes;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportEscalation;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportEscalationTimes;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.SupportResponseTimes;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.UpdateSupportOptions;
import com.ibm.cloud.platform_services.partner_center_sell.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateSupportOptions model.
 */
public class UpdateSupportOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateSupportOptions() throws Throwable {
    EscalationContactsUpdate escalationContactsUpdateModel = new EscalationContactsUpdate.Builder()
      .email("testString")
      .name("testString")
      .build();
    assertEquals(escalationContactsUpdateModel.email(), "testString");
    assertEquals(escalationContactsUpdateModel.name(), "testString");

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

    SupportResponseTimes supportResponseTimesModel = new SupportResponseTimes.Builder()
      .type("hour")
      .value(Long.valueOf("2"))
      .build();
    assertEquals(supportResponseTimesModel.type(), "hour");
    assertEquals(supportResponseTimesModel.value(), Long.valueOf("2"));

    SupportDetails supportDetailsModel = new SupportDetails.Builder()
      .availability(supportDetailsAvailabilityModel)
      .contact("testString")
      .responseWaitTime(supportResponseTimesModel)
      .type("email")
      .build();
    assertEquals(supportDetailsModel.availability(), supportDetailsAvailabilityModel);
    assertEquals(supportDetailsModel.contact(), "testString");
    assertEquals(supportDetailsModel.responseWaitTime(), supportResponseTimesModel);
    assertEquals(supportDetailsModel.type(), "email");

    SupportEscalationTimes supportEscalationTimesModel = new SupportEscalationTimes.Builder()
      .type("hour")
      .value(Long.valueOf("2"))
      .build();
    assertEquals(supportEscalationTimesModel.type(), "hour");
    assertEquals(supportEscalationTimesModel.value(), Long.valueOf("2"));

    SupportEscalation supportEscalationModel = new SupportEscalation.Builder()
      .contact("testString")
      .escalationWaitTime(supportEscalationTimesModel)
      .responseWaitTime(supportResponseTimesModel)
      .build();
    assertEquals(supportEscalationModel.contact(), "testString");
    assertEquals(supportEscalationModel.escalationWaitTime(), supportEscalationTimesModel);
    assertEquals(supportEscalationModel.responseWaitTime(), supportResponseTimesModel);

    UpdateSupportOptions updateSupportOptionsModel = new UpdateSupportOptions.Builder()
      .productId("9fab83da-98cb-4f18-a7ba-b6f0435c9673")
      .escalationContacts(java.util.Arrays.asList(escalationContactsUpdateModel))
      .locations(java.util.Arrays.asList("US"))
      .supportDetails(java.util.Arrays.asList(supportDetailsModel))
      .supportEscalation(supportEscalationModel)
      .supportType("third-party")
      .url("https://my-company.com/support")
      .build();
    assertEquals(updateSupportOptionsModel.productId(), "9fab83da-98cb-4f18-a7ba-b6f0435c9673");
    assertEquals(updateSupportOptionsModel.escalationContacts(), java.util.Arrays.asList(escalationContactsUpdateModel));
    assertEquals(updateSupportOptionsModel.locations(), java.util.Arrays.asList("US"));
    assertEquals(updateSupportOptionsModel.supportDetails(), java.util.Arrays.asList(supportDetailsModel));
    assertEquals(updateSupportOptionsModel.supportEscalation(), supportEscalationModel);
    assertEquals(updateSupportOptionsModel.supportType(), "third-party");
    assertEquals(updateSupportOptionsModel.url(), "https://my-company.com/support");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSupportOptionsError() throws Throwable {
    new UpdateSupportOptions.Builder().build();
  }

}