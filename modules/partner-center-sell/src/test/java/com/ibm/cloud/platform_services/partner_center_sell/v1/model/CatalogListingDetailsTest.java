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

import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CatalogListingDetails;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.CatalogListingVersion;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.DeprecatePending;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.HighlightSection;
import com.ibm.cloud.platform_services.partner_center_sell.v1.model.MediaSection;
import com.ibm.cloud.platform_services.partner_center_sell.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CatalogListingDetails model.
 */
public class CatalogListingDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCatalogListingDetails() throws Throwable {
    CatalogListingDetails catalogListingDetailsModel = new CatalogListingDetails();
    assertNull(catalogListingDetailsModel.getAccountId());
    assertNull(catalogListingDetailsModel.getCatalogId());
    assertNull(catalogListingDetailsModel.getDeprecatePending());
    assertNull(catalogListingDetailsModel.getDescription());
    assertNull(catalogListingDetailsModel.getDocumentationUrl());
    assertNull(catalogListingDetailsModel.isEditable());
    assertNull(catalogListingDetailsModel.getHighlights());
    assertNull(catalogListingDetailsModel.getIconUrl());
    assertNull(catalogListingDetailsModel.getId());
    assertNull(catalogListingDetailsModel.getKeywords());
    assertNull(catalogListingDetailsModel.getLabel());
    assertNull(catalogListingDetailsModel.getLabelI18n());
    assertNull(catalogListingDetailsModel.getLongDescription());
    assertNull(catalogListingDetailsModel.getLongDescriptionI18n());
    assertNull(catalogListingDetailsModel.getMedia());
    assertNull(catalogListingDetailsModel.getName());
    assertNull(catalogListingDetailsModel.isPcManaged());
    assertNull(catalogListingDetailsModel.getProvider());
    assertNull(catalogListingDetailsModel.isPublishedToAccessList());
    assertNull(catalogListingDetailsModel.isPublishedToIbm());
    assertNull(catalogListingDetailsModel.isPublishedToPublic());
    assertNull(catalogListingDetailsModel.getShortDescriptionI18n());
    assertNull(catalogListingDetailsModel.getTags());
    assertNull(catalogListingDetailsModel.getVersions());
  }
}