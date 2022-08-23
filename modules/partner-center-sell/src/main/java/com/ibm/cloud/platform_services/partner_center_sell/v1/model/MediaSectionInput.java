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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * MediaSectionInput.
 */
public class MediaSectionInput extends GenericModel {

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
  protected String thumbnail;
  protected String type;
  protected String url;

  /**
   * Builder.
   */
  public static class Builder {
    private String caption;
    private String thumbnail;
    private String type;
    private String url;

    private Builder(MediaSectionInput mediaSectionInput) {
      this.caption = mediaSectionInput.caption;
      this.thumbnail = mediaSectionInput.thumbnail;
      this.type = mediaSectionInput.type;
      this.url = mediaSectionInput.url;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param caption the caption
     * @param type the type
     * @param url the url
     */
    public Builder(String caption, String type, String url) {
      this.caption = caption;
      this.type = type;
      this.url = url;
    }

    /**
     * Builds a MediaSectionInput.
     *
     * @return the new MediaSectionInput instance
     */
    public MediaSectionInput build() {
      return new MediaSectionInput(this);
    }

    /**
     * Set the caption.
     *
     * @param caption the caption
     * @return the MediaSectionInput builder
     */
    public Builder caption(String caption) {
      this.caption = caption;
      return this;
    }

    /**
     * Set the thumbnail.
     *
     * @param thumbnail the thumbnail
     * @return the MediaSectionInput builder
     */
    public Builder thumbnail(String thumbnail) {
      this.thumbnail = thumbnail;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the MediaSectionInput builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the MediaSectionInput builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected MediaSectionInput() { }

  protected MediaSectionInput(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.caption,
      "caption cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.url,
      "url cannot be null");
    caption = builder.caption;
    thumbnail = builder.thumbnail;
    type = builder.type;
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a MediaSectionInput builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the caption.
   *
   * Provide a brief explanation that indicates what the media illustrates. This caption is displayed in the catalog.
   *
   * @return the caption
   */
  public String caption() {
    return caption;
  }

  /**
   * Gets the thumbnail.
   *
   * The reduced-size version of your images and videos.
   *
   * @return the thumbnail
   */
  public String thumbnail() {
    return thumbnail;
  }

  /**
   * Gets the type.
   *
   * The type of the media.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the url.
   *
   * The URL that links to the media that shows off the product.
   *
   * @return the url
   */
  public String url() {
    return url;
  }
}

