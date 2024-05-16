// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render;

import java.io.OutputStream;
import java.util.Objects;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.StreamResponse;
import com.azure.core.models.GeoBoundingBox;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.FluxUtil;
import com.azure.maps.render.models.Copyright;
import com.azure.maps.render.models.CopyrightCaption;
import com.azure.maps.render.implementation.models.ErrorResponseException;
import com.azure.maps.render.models.MapAttribution;
import com.azure.maps.render.models.MapStaticImageOptions;
import com.azure.maps.render.models.MapTileOptions;
import com.azure.maps.render.models.MapTileset;
import com.azure.maps.render.models.TileIndex;
import com.azure.maps.render.models.TilesetId;

/** Initializes a new instance of the synchronous RenderClient type.
 * {@link MapsRenderClient} instances are created via the {@link MapsRenderClientBuilder}, as shown below.
 * Creating a sync client using a {@link com.azure.core.credential.AzureKeyCredential}:
 * <!-- src_embed com.azure.maps.render.sync.builder.key.instantiation -->
 * <pre>
 * &#47;&#47; Authenticates using subscription key
 * AzureKeyCredential keyCredential = new AzureKeyCredential&#40;System.getenv&#40;&quot;SUBSCRIPTION_KEY&quot;&#41;&#41;;
 *
 * &#47;&#47; Creates a builder
 * MapsRenderClientBuilder builder = new MapsRenderClientBuilder&#40;&#41;;
 * builder.credential&#40;keyCredential&#41;;
 * builder.httpLogOptions&#40;new HttpLogOptions&#40;&#41;.setLogLevel&#40;HttpLogDetailLevel.BODY_AND_HEADERS&#41;&#41;;
 *
 * &#47;&#47; Builds the client
 * MapsRenderClient client = builder.buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.maps.render.sync.builder.ad.instantiation -->
 */
@ServiceClient(builder = MapsRenderClientBuilder.class)
public final class MapsRenderClient {

    /**
     * Initializes an instance of RenderClient client.
     *
     * @param serviceClient the service client implementation.
     */
    private final MapsRenderAsyncClient asyncClient;

    private static final ClientLogger LOGGER = new ClientLogger(MapsRenderClient.class);

    /**
     * Initializes an instance of Render client.
     *
     * @param asyncClient the service client implementation.
     */
    MapsRenderClient(MapsRenderAsyncClient asyncClient) {
        this.asyncClient = asyncClient;
    }

    /**
     * Get Map Tile
     *
     * <!-- src_embed com.azure.maps.render.sync.get_map_tile -->
     * <pre>
     * System.out.println&#40;&quot;Get Map Tile&quot;&#41;;
     * MapTileOptions mapTileOptions = new MapTileOptions&#40;&#41;;
     * mapTileOptions.setTilesetId&#40;TilesetId.MICROSOFT_BASE_ROAD&#41;;
     * mapTileOptions.setTileIndex&#40;new TileIndex&#40;&#41;.setX&#40;10&#41;.setY&#40;22&#41;.setZ&#40;6&#41;&#41;;
     * client.getMapTile&#40;mapTileOptions&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_map_tile -->
     *
     * The Get Map Tiles API allows users to request map tiles in vector or raster formats typically to be integrated
     * into a map control or SDK.
     * @param options the {@code MapTileOptions} to control the API behavior.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return BinaryData
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BinaryData getMapTile(MapTileOptions options) {
        return this.asyncClient.getMapTile(options).block();
    }

    /**
     * Get Map Tile
     *
     * <!-- src_embed com.azure.maps.render.sync.get_map_tile -->
     * <pre>
     * System.out.println&#40;&quot;Get Map Tile&quot;&#41;;
     * MapTileOptions mapTileOptions = new MapTileOptions&#40;&#41;;
     * mapTileOptions.setTilesetId&#40;TilesetId.MICROSOFT_BASE_ROAD&#41;;
     * mapTileOptions.setTileIndex&#40;new TileIndex&#40;&#41;.setX&#40;10&#41;.setY&#40;22&#41;.setZ&#40;6&#41;&#41;;
     * client.getMapTile&#40;mapTileOptions&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_map_tile -->
     *
     * The Get Map Tiles API allows users to request map tiles in vector or raster formats typically to be integrated
     * into a map control or SDK.
     * @param options the {@code MapTileOptions} to control the API behavior.
     * @param context the context associated with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getMapTileWithResponse(MapTileOptions options, Context context) {
        StreamResponse response = this.asyncClient.getMapTileWithResponse(options, context).block();
        if (response != null) {
            return new SimpleResponse<BinaryData>(response.getRequest(), response.getStatusCode(), response.getHeaders(), BinaryData.fromFlux(response.getValue()).block());
        } else {
            throw LOGGER.logExceptionAsError(new NullPointerException("Response is null"));
        }
    }

    /**
     * Get Map Tileset
     *
     * <!-- src_embed com.azure.maps.render.sync.get_map_tileset -->
     * <pre>
     * System.out.println&#40;&quot;Get Map Tileset&quot;&#41;;
     * new TilesetId&#40;&#41;;
     * client.getMapTileset&#40;TilesetId.MICROSOFT_BASE&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_map_tileset -->
     *
     * The Get Map Tileset API allows users to request metadata for a tileset.
     *
     * @param tilesetId the tileset id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata for a tileset in the TileJSON format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MapTileset getMapTileset(TilesetId tilesetId) {
        return this.asyncClient.getMapTileset(tilesetId).block();
    }

    /**
     * Get Map Tileset
     *
     * The Get Map Tileset API allows users to request metadata for a tileset.
     *
     * <!-- src_embed com.azure.maps.render.sync.get_map_tileset -->
     * <pre>
     * System.out.println&#40;&quot;Get Map Tileset&quot;&#41;;
     * new TilesetId&#40;&#41;;
     * client.getMapTileset&#40;TilesetId.MICROSOFT_BASE&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_map_tileset -->
     *
     * @param tilesetId the tileset id.
     * @param context the context associated with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata for a tileset in the TileJSON format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MapTileset> getMapTilesetWithResponse(TilesetId tilesetId, Context context) {
        return this.asyncClient.getMapTilesetWithResponse(tilesetId, context).block();
    }

    /**
     * Get Map Attribution
     *
     * <!-- src_embed com.azure.maps.render.sync.get_map_attribution -->
     * <pre>
     * System.out.println&#40;&quot;Get Map Attribution&quot;&#41;;
     * GeoBoundingBox bounds = new GeoBoundingBox&#40;-122.414162, 47.57949, -122.247157, 47.668372&#41;;
     * new TilesetId&#40;&#41;;
     * client.getMapAttribution&#40;TilesetId.MICROSOFT_BASE, 6, bounds&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_map_attribution -->
     *
     * @param tilesetId the tileset id.
     * @param zoom Zoom level for the desired map attribution.
     * @param bounds the {@code GeoBoundingBox} surrounding the area for which attribution is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return copyright attribution for the requested section of a tileset.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MapAttribution getMapAttribution(TilesetId tilesetId, int zoom, GeoBoundingBox bounds) {
        return this.asyncClient.getMapAttribution(tilesetId, zoom, bounds).block();
    }

    /**
     * Get Map Attribution
     *
     * The Get Map Attribution With Response API allows users to request map copyright attribution information for a section of a
     * tileset with response
     *
     * <!-- src_embed com.azure.maps.render.sync.get_map_attribution -->
     * <pre>
     * System.out.println&#40;&quot;Get Map Attribution&quot;&#41;;
     * GeoBoundingBox bounds = new GeoBoundingBox&#40;-122.414162, 47.57949, -122.247157, 47.668372&#41;;
     * new TilesetId&#40;&#41;;
     * client.getMapAttribution&#40;TilesetId.MICROSOFT_BASE, 6, bounds&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_map_attribution -->
     *
     * @param tilesetId the tileset id.
     * @param zoom Zoom level for the desired map attribution.
     * @param bounds the {@code GeoBoundingBox} surrounding the area for which attribution is needed.
     * @param context the context associated with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return copyright attribution for the requested section of a tileset.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MapAttribution> getMapAttributionWithResponse(TilesetId tilesetId, int zoom, GeoBoundingBox bounds, Context context) {
        return this.asyncClient.getMapAttributionWithResponse(tilesetId, zoom, bounds, context).block();
    }

    /**
     * Download Map State Tile
     *
     * Fetches state tiles in vector format typically to be integrated into indoor maps module of map control or SDK.
     * The map control will call this API after user turns on dynamic styling (see [Zoom Levels and Tile
     * Grid](https://docs.microsoft.com/azure/location-based-services/zoom-levels-and-tile-grid)).
     *
     * @param stream The output stream to which the tile is written to.
     * @param statesetId The stateset id.
     * @param tileIndex Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void downloadMapStateTile(OutputStream stream, String statesetId, TileIndex tileIndex) {
        downloadMapStateTileWithResponse(stream, statesetId, tileIndex, Context.NONE);
    }

    /**
     * Download Map State Tile
     *
     * @param stream The output stream to which the tile is written to.
     * @param statesetId The stateset id
     * @param tileIndex Parameter group
     * @param context the context associated with this operation
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the map tile
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> downloadMapStateTileWithResponse(OutputStream stream, String statesetId, TileIndex tileIndex, Context context) {
        Objects.requireNonNull(stream);
        StreamResponse response = this.asyncClient.downloadMapStateTileWithResponse(statesetId, tileIndex, context)
            .flatMap(resp -> FluxUtil.writeToOutputStream(resp.getValue(), stream).thenReturn(resp)).block();
        if (response != null) {
            return new SimpleResponse<Void>(response.getRequest(), response.getStatusCode(), response.getHeaders(), null);
        } else {
            throw LOGGER.logExceptionAsError(new NullPointerException("Response is null"));
        }
    }

    /**
     * Get Copyright Caption
     *
     * Copyrights API is designed to serve copyright information for Render Tile service. In addition to basic
     * copyright for the whole map, API is serving specific groups of copyrights for some countries.
     *
     * As an alternative to copyrights for map request, one can receive captions for displaying the map provider
     * information on the map.
     *
     * <!-- src_embed com.azure.maps.render.sync.get_copyright_caption -->
     * <pre>
     * System.out.println&#40;&quot;Get Copyright Caption&quot;&#41;;
     * client.getCopyrightCaption&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_copyright_caption -->
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful copyright call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CopyrightCaption getCopyrightCaption() {
        return this.asyncClient.getCopyrightCaption().block();
    }

    /**
     * Get Copyright Caption
     *
     * Copyrights API is designed to serve copyright information for Render Tile service. In addition to basic
     * copyright for the whole map, API is serving specific groups of copyrights for some countries.
     *
     * As an alternative to copyrights for map request, one can receive captions for displaying the map provider
     * information on the map.
     *
     * <!-- src_embed com.azure.maps.render.sync.get_copyright_caption -->
     * <pre>
     * System.out.println&#40;&quot;Get Copyright Caption&quot;&#41;;
     * client.getCopyrightCaption&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_copyright_caption -->
     *
     * @param context the context associated with this operation
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful copyright call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CopyrightCaption> getCopyrightCaptionWithResponse(Context context) {
        return this.asyncClient.getCopyrightCaptionWithResponse(context).block();
    }

    /**
     * Get Map Static Image
     *
     * The static image service renders a user-defined, rectangular image containing a map section using a zoom level
     * from 0 to 20. The static image service renders a user-defined, rectangular image containing a map section using a
     * zoom level from 0 to 20. The supported resolution range for the map image is from 1x1 to 8192x8192. If you are
     * deciding when to use the static image service over the map tile service, you may want to consider how you would
     * like to interact with the rendered map. If the map contents will be relatively unchanging, a static map is a good
     * choice. If you want to support a lot of zooming, panning and changing of the map content, the map tile service
     * would be a better choice.
     *
     * <!-- src_embed com.azure.maps.render.sync.get_map_static_image -->
     * <pre>
     * System.out.println&#40;&quot;Get Map Static Image&quot;&#41;;
     * GeoBoundingBox bbox = new GeoBoundingBox&#40;1.355233, 42.982261, 24.980233, 56.526017&#41;;
     * new StaticMapLayer&#40;&#41;;
     * new RasterTileFormat&#40;&#41;;
     * MapStaticImageOptions mapStaticImageOptions = new MapStaticImageOptions&#40;&#41;.setStaticMapLayer&#40;StaticMapLayer.BASIC&#41;
     *     .setMapImageStyle&#40;MapImageStyle.MAIN&#41;.setZoom&#40;2&#41;
     *     .setBoundingBox&#40;bbox&#41;.setRasterTileFormat&#40;RasterTileFormat.PNG&#41;;
     * client.getMapStaticImage&#40;mapStaticImageOptions&#41;.toStream&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_map_static_image -->
     *
     * @param options the {@code MapStaticImageOptions} used in the call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return BinaryData
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BinaryData getMapStaticImage(MapStaticImageOptions options) {
        return this.asyncClient.getMapStaticImage(options).block();
    }

    /**
     * Get Map Static Image
     *
     * The static image service renders a user-defined, rectangular image containing a map section using a zoom level
     * from 0 to 20. The static image service renders a user-defined, rectangular image containing a map section using a
     * zoom level from 0 to 20. The supported resolution range for the map image is from 1x1 to 8192x8192. If you are
     * deciding when to use the static image service over the map tile service, you may want to consider how you would
     * like to interact with the rendered map. If the map contents will be relatively unchanging, a static map is a good
     * choice. If you want to support a lot of zooming, panning and changing of the map content, the map tile service
     * would be a better choice.
     *
     * <!-- src_embed com.azure.maps.render.sync.get_map_static_image -->
     * <pre>
     * System.out.println&#40;&quot;Get Map Static Image&quot;&#41;;
     * GeoBoundingBox bbox = new GeoBoundingBox&#40;1.355233, 42.982261, 24.980233, 56.526017&#41;;
     * new StaticMapLayer&#40;&#41;;
     * new RasterTileFormat&#40;&#41;;
     * MapStaticImageOptions mapStaticImageOptions = new MapStaticImageOptions&#40;&#41;.setStaticMapLayer&#40;StaticMapLayer.BASIC&#41;
     *     .setMapImageStyle&#40;MapImageStyle.MAIN&#41;.setZoom&#40;2&#41;
     *     .setBoundingBox&#40;bbox&#41;.setRasterTileFormat&#40;RasterTileFormat.PNG&#41;;
     * client.getMapStaticImage&#40;mapStaticImageOptions&#41;.toStream&#40;&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_map_static_image -->
     *
     * @param options the {@code MapStaticImageOptions} used in the call.
     * @param context the context associated with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getMapStaticImageWithResponse(MapStaticImageOptions options, Context context) {
        StreamResponse response = this.asyncClient.getMapStaticImageWithResponse(options, context).block();
        if (response != null) {
            return new SimpleResponse<BinaryData>(response.getRequest(), response.getStatusCode(), response.getHeaders(), BinaryData.fromFlux(response.getValue()).block());
        } else {
            throw LOGGER.logExceptionAsError(new NullPointerException("Response is null"));
        }
    }

    /**
     * Get Copyright From Bounding Box
     *
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * Returns copyright information for a given bounding box. Bounding-box requests should specify the minimum and
     * maximum longitude and latitude (EPSG-3857) coordinates.
     *
     * <!-- src_embed com.azure.maps.render.sync.get_copyright_from_bounding_box -->
     * <pre>
     * GeoBoundingBox boundingBox = new GeoBoundingBox&#40;52.41064, 4.84228, 52.41072, 4.84239&#41;;
     * client.getCopyrightFromBoundingBox&#40;boundingBox, true&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_copyright_from_bounding_box -->
     *
     * @param boundingBox the {@code GeoBoundingBox} for which copyright information is needed.
     * @param includeText Yes/no value to exclude textual data from response. Only images and country names will be in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful copyright request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Copyright getCopyrightFromBoundingBox(GeoBoundingBox boundingBox, boolean includeText) {
        return this.asyncClient.getCopyrightFromBoundingBox(boundingBox, includeText).block();
    }

    /**
     * Get Copyright From Bounding Box
     *
     * Returns copyright information for a given bounding box with response. Bounding-box requests should specify the minimum and
     * maximum longitude and latitude (EPSG-3857) coordinates.
     *
     * <!-- src_embed com.azure.maps.render.sync.get_copyright_from_bounding_box -->
     * <pre>
     * GeoBoundingBox boundingBox = new GeoBoundingBox&#40;52.41064, 4.84228, 52.41072, 4.84239&#41;;
     * client.getCopyrightFromBoundingBox&#40;boundingBox, true&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_copyright_from_bounding_box -->
     *
     * @param boundingBox the {@code GeoBoundingBox} for which copyright information is needed.
     * @param includeText Yes/no value to exclude textual data from response. Only images and country names will be in
     *     response.
     * @param context the context associated with this operation.
     * @return the copyright information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Copyright> getCopyrightFromBoundingBoxWithResponse(GeoBoundingBox boundingBox, boolean includeText, Context context) {
        return this.asyncClient.getCopyrightFromBoundingBoxWithResponse(boundingBox, includeText, context).block();
    }

    /**
     * Get Copyright For Tile
     *
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * Copyrights API is designed to serve copyright information for Render Tile service. In addition to basic
     * copyright for the whole map, API is serving specific groups of copyrights for some countries. Returns the
     * copyright information for a given tile. To obtain the copyright information for a particular tile, the request
     * should specify the tile's zoom level and x and y coordinates (see: Zoom Levels and Tile Grid).
     *
     * <!-- src_embed com.azure.maps.render.sync.get_copyright_for_tile -->
     * <pre>
     * client.getCopyrightForTile&#40;new TileIndex&#40;&#41;.setX&#40;9&#41;.setY&#40;22&#41;.setZ&#40;6&#41;, true&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_copyright_for_tile -->
     *
     * @param tileIndex Parameter group.
     * @param includeText Yes/no value to exclude textual data from response. Only images and country names will be in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful copyright request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Copyright getCopyrightForTile(TileIndex tileIndex, boolean includeText) {
        return this.asyncClient.getCopyrightForTile(tileIndex, includeText).block();
    }

    /**
     * Get Copyright For Tile
     *
     * Copyrights With Response API is designed to serve copyright information for Render Tile service with response. In addition to basic
     * copyright for the whole map, API is serving specific groups of copyrights for some countries. Returns the
     * copyright information for a given tile. To obtain the copyright information for a particular tile, the request
     * should specify the tile's zoom level and x and y coordinates (see: Zoom Levels and Tile Grid)
     *
     * <!-- src_embed com.azure.maps.render.sync.get_copyright_for_tile -->
     * <pre>
     * client.getCopyrightForTile&#40;new TileIndex&#40;&#41;.setX&#40;9&#41;.setY&#40;22&#41;.setZ&#40;6&#41;, true&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_copyright_for_tile -->
     *
     * @param tileIndex Parameter group
     * @param includeText Yes/no value to exclude textual data from response. Only images and country names will be in
     *     response.
     * @param context the context associated with this operation.
     * @return the copyright for the tile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Copyright> getCopyrightForTileWithResponse(TileIndex tileIndex, boolean includeText, Context context) {
        return this.asyncClient.getCopyrightForTileWithResponse(tileIndex, includeText).block();
    }

    /**
     * Get Copyright For World
     *
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * Copyrights API is designed to serve copyright information for Render Tile service. In addition to basic
     * copyright for the whole map, API is serving specific groups of copyrights for some countries. Returns the
     * copyright information for the world. To obtain the default copyright information for the whole world, do not
     * specify a tile or bounding box.
     *
     * <!-- src_embed com.azure.maps.render.sync.get_copyright_for_world -->
     * <pre>
     * client.getCopyrightForWorld&#40;true&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_copyright_for_world -->
     *
     * @param includeText Yes/no value to exclude textual data from response. Only images and country names will be in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful copyright request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Copyright getCopyrightForWorld(boolean includeText) {
        return this.asyncClient.getCopyrightForWorld(includeText).block();
    }

    /**
     * Get Copyright For World
     *
     * Copyrights with response API is designed to serve copyright information with response for Render Tile service. In addition to basic
     * copyright for the whole map, API is serving specific groups of copyrights for some countries. Returns the
     * copyright information for the world. To obtain the default copyright information for the whole world, do not
     * specify a tile or bounding box.
     *
     * <!-- src_embed com.azure.maps.render.sync.get_copyright_for_world -->
     * <pre>
     * client.getCopyrightForWorld&#40;true&#41;;
     * </pre>
     * <!-- end com.azure.maps.render.sync.get_copyright_for_world -->
     *
     * @param includeText Yes/no value to exclude textual data from response. Only images and country names will be in
     *     response.
     * @param context the context associated with this operation.
     * @return the copyright response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Copyright> getCopyrightForWorldWithResponse(boolean includeText, Context context) {
        return this.asyncClient.getCopyrightForWorldWithResponse(includeText, context).block();
    }
}
