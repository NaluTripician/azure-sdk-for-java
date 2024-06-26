// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Set of URLs to the video content. */
@Fluent
public final class VideoContentUrls {
    /*
     * Video file download URL. This URL can be used in conjunction with the
     * video content authorization token to download the video MP4 file. The
     * resulting MP4 file can be played on any standard media player. It is
     * available when the video type is 'file' and video file is available for
     * consumption.
     */
    @JsonProperty(value = "downloadUrl")
    private String downloadUrl;

    /*
     * Video archive streaming base URL. The archived content can be
     * automatically played by the Azure Video Analyzer player widget.
     * Alternatively, this URL can be used in conjunction with the video
     * content authorization token on any compatible DASH or HLS players by
     * appending the following to the base URL:
     *
     * - HLSv4:     /manifest(format=m3u8-aapl).m3u8
     * - HLS CMAF:  /manifest(format=m3u8-cmaf)
     * - DASH CMAF: /manifest(format=mpd-time-cmaf)
     *
     * Moreover, an ongoing video recording can be played in "live mode" with
     * latencies which are approximately double of the chosen video segment
     * length. It is available when the video type is 'archive' and video
     * archiving is enabled.
     */
    @JsonProperty(value = "archiveBaseUrl")
    private String archiveBaseUrl;

    /*
     * Video low-latency streaming URL. The live content can be automatically
     * played by the Azure Video Analyzer player widget. Alternatively, this
     * URL can be used in conjunction with the video content authorization
     * token to expose a WebSocket tunneled RTSP stream. It is available when
     * the video type is 'archive' and a live, low-latency feed is available
     * from the source.
     */
    @JsonProperty(value = "rtspTunnelUrl")
    private String rtspTunnelUrl;

    /*
     * Video preview image URLs. These URLs can be used in conjunction with the
     * video content authorization token to download the most recent still
     * image from the video archive in different resolutions. They are
     * available when the video type is 'archive' and preview images are
     * enabled.
     */
    @JsonProperty(value = "previewImageUrls")
    private VideoPreviewImageUrls previewImageUrls;

    /**
     * Get the downloadUrl property: Video file download URL. This URL can be used in conjunction with the video content
     * authorization token to download the video MP4 file. The resulting MP4 file can be played on any standard media
     * player. It is available when the video type is 'file' and video file is available for consumption.
     *
     * @return the downloadUrl value.
     */
    public String downloadUrl() {
        return this.downloadUrl;
    }

    /**
     * Set the downloadUrl property: Video file download URL. This URL can be used in conjunction with the video content
     * authorization token to download the video MP4 file. The resulting MP4 file can be played on any standard media
     * player. It is available when the video type is 'file' and video file is available for consumption.
     *
     * @param downloadUrl the downloadUrl value to set.
     * @return the VideoContentUrls object itself.
     */
    public VideoContentUrls withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Get the archiveBaseUrl property: Video archive streaming base URL. The archived content can be automatically
     * played by the Azure Video Analyzer player widget. Alternatively, this URL can be used in conjunction with the
     * video content authorization token on any compatible DASH or HLS players by appending the following to the base
     * URL:
     *
     * <p>- HLSv4: /manifest(format=m3u8-aapl).m3u8 - HLS CMAF: /manifest(format=m3u8-cmaf) - DASH CMAF:
     * /manifest(format=mpd-time-cmaf)
     *
     * <p>Moreover, an ongoing video recording can be played in "live mode" with latencies which are approximately
     * double of the chosen video segment length. It is available when the video type is 'archive' and video archiving
     * is enabled.
     *
     * @return the archiveBaseUrl value.
     */
    public String archiveBaseUrl() {
        return this.archiveBaseUrl;
    }

    /**
     * Set the archiveBaseUrl property: Video archive streaming base URL. The archived content can be automatically
     * played by the Azure Video Analyzer player widget. Alternatively, this URL can be used in conjunction with the
     * video content authorization token on any compatible DASH or HLS players by appending the following to the base
     * URL:
     *
     * <p>- HLSv4: /manifest(format=m3u8-aapl).m3u8 - HLS CMAF: /manifest(format=m3u8-cmaf) - DASH CMAF:
     * /manifest(format=mpd-time-cmaf)
     *
     * <p>Moreover, an ongoing video recording can be played in "live mode" with latencies which are approximately
     * double of the chosen video segment length. It is available when the video type is 'archive' and video archiving
     * is enabled.
     *
     * @param archiveBaseUrl the archiveBaseUrl value to set.
     * @return the VideoContentUrls object itself.
     */
    public VideoContentUrls withArchiveBaseUrl(String archiveBaseUrl) {
        this.archiveBaseUrl = archiveBaseUrl;
        return this;
    }

    /**
     * Get the rtspTunnelUrl property: Video low-latency streaming URL. The live content can be automatically played by
     * the Azure Video Analyzer player widget. Alternatively, this URL can be used in conjunction with the video content
     * authorization token to expose a WebSocket tunneled RTSP stream. It is available when the video type is 'archive'
     * and a live, low-latency feed is available from the source.
     *
     * @return the rtspTunnelUrl value.
     */
    public String rtspTunnelUrl() {
        return this.rtspTunnelUrl;
    }

    /**
     * Set the rtspTunnelUrl property: Video low-latency streaming URL. The live content can be automatically played by
     * the Azure Video Analyzer player widget. Alternatively, this URL can be used in conjunction with the video content
     * authorization token to expose a WebSocket tunneled RTSP stream. It is available when the video type is 'archive'
     * and a live, low-latency feed is available from the source.
     *
     * @param rtspTunnelUrl the rtspTunnelUrl value to set.
     * @return the VideoContentUrls object itself.
     */
    public VideoContentUrls withRtspTunnelUrl(String rtspTunnelUrl) {
        this.rtspTunnelUrl = rtspTunnelUrl;
        return this;
    }

    /**
     * Get the previewImageUrls property: Video preview image URLs. These URLs can be used in conjunction with the video
     * content authorization token to download the most recent still image from the video archive in different
     * resolutions. They are available when the video type is 'archive' and preview images are enabled.
     *
     * @return the previewImageUrls value.
     */
    public VideoPreviewImageUrls previewImageUrls() {
        return this.previewImageUrls;
    }

    /**
     * Set the previewImageUrls property: Video preview image URLs. These URLs can be used in conjunction with the video
     * content authorization token to download the most recent still image from the video archive in different
     * resolutions. They are available when the video type is 'archive' and preview images are enabled.
     *
     * @param previewImageUrls the previewImageUrls value to set.
     * @return the VideoContentUrls object itself.
     */
    public VideoContentUrls withPreviewImageUrls(VideoPreviewImageUrls previewImageUrls) {
        this.previewImageUrls = previewImageUrls;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (previewImageUrls() != null) {
            previewImageUrls().validate();
        }
    }
}
