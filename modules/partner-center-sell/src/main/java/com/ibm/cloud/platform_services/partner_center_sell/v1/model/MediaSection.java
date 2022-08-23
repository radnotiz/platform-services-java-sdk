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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * MediaSection.
 */
public class MediaSection extends GenericModel {

  /**
   * The type of the media.
   */
  public interface Type {
    /** image. */
    String IMAGE = "image";
    /** youtube. */
    String YOUTUBE = "youtube";
    /** video/mp4. */
    String VIDEO_MP4 = "video/mp4";
    /** video/webm. */
    String VIDEO_WEBM = "video/webm";
  }

  protected String caption;
  @SerializedName("caption_i18n")
  protected Map<String, Object> captionI18n;
  protected String thumbnail;
  protected String type;
  protected String url;

  /**
   * Gets the caption.
   *
   * Provide a brief explanation that indicates what the media illustrates. This caption is displayed in the catalog.
   *
   * @return the caption
   */
  public String getCaption() {
    return caption;
  }

  /**
   * Gets the captionI18n.
   *
   * The brief explanation for your images and videos in translation.
   *
   * @return the captionI18n
   */
  public Map<String, Object> getCaptionI18n() {
    return captionI18n;
  }

  /**
   * Gets the thumbnail.
   *
   * The reduced-size version of your images and videos.
   *
   * @return the thumbnail
   */
  public String getThumbnail() {
    return thumbnail;
  }

  /**
   * Gets the type.
   *
   * The type of the media.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the url.
   *
   * The URL that links to the media that shows off the product.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }
}

