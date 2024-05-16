// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loganalytics.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.loganalytics.models.CapacityReservationLevel;
import com.azure.resourcemanager.loganalytics.models.Identity;
import com.azure.resourcemanager.loganalytics.models.IdentityType;
import com.azure.resourcemanager.loganalytics.models.PublicNetworkAccessType;
import com.azure.resourcemanager.loganalytics.models.UserIdentityProperties;
import com.azure.resourcemanager.loganalytics.models.WorkspaceCapping;
import com.azure.resourcemanager.loganalytics.models.WorkspaceFeatures;
import com.azure.resourcemanager.loganalytics.models.WorkspaceListResult;
import com.azure.resourcemanager.loganalytics.models.WorkspaceSku;
import com.azure.resourcemanager.loganalytics.models.WorkspaceSkuNameEnum;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WorkspaceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleting\",\"customerId\":\"hejhzisx\",\"sku\":{\"name\":\"Premium\",\"capacityReservationLevel\":200,\"lastSkuUpdate\":\"lppvksrpq\"},\"retentionInDays\":900186733,\"workspaceCapping\":{\"dailyQuotaGb\":33.19401521907267,\"quotaNextResetTime\":\"twdw\",\"dataIngestionStatus\":\"ApproachingQuota\"},\"createdDate\":\"wib\",\"modifiedDate\":\"cdl\",\"publicNetworkAccessForIngestion\":\"Disabled\",\"publicNetworkAccessForQuery\":\"Disabled\",\"forceCmkForQuery\":false,\"privateLinkScopedResources\":[{\"resourceId\":\"stwit\",\"scopeId\":\"hevxcced\"},{\"resourceId\":\"nmdyodnwzxl\",\"scopeId\":\"cvnhltiugc\"},{\"resourceId\":\"avvwxqi\",\"scopeId\":\"qunyowxwlmdjr\"}],\"features\":{\"enableDataExport\":false,\"immediatePurgeDataOn30Days\":true,\"enableLogAccessUsingOnlyResourcePermissions\":true,\"clusterResourceId\":\"dbodacizsjqlhkrr\",\"disableLocalAuth\":false,\"\":{\"ipqkghvxndzwm\":\"datab\",\"b\":\"datarefajpjorwkqnyh\"}},\"defaultDataCollectionRuleResourceId\":\"tjivfxzsjabib\"},\"identity\":{\"principalId\":\"tawfsdjpvkvp\",\"tenantId\":\"xbkzbzkdvncj\",\"type\":\"key\",\"userAssignedIdentities\":{\"hmouwqlgzrfze\":{\"principalId\":\"r\",\"clientId\":\"akmokzhjjklf\"},\"wrv\":{\"principalId\":\"ebizikayuh\",\"clientId\":\"bjbsybb\"},\"wutwbdsre\":{\"principalId\":\"dgmfpgvmpipasl\",\"clientId\":\"aqfxss\"}}},\"systemData\":{\"createdBy\":\"rhneuyowq\",\"createdByType\":\"User\",\"createdAt\":\"2021-09-27T03:48:20Z\",\"lastModifiedBy\":\"sibircgpi\",\"lastModifiedByType\":\"ManagedIdentity\",\"lastModifiedAt\":\"2020-12-22T19:47:50Z\"},\"etag\":\"j\",\"location\":\"anlfzxiavrmbz\",\"tags\":{\"cirgzp\":\"kixrj\",\"iin\":\"rlazszrnw\",\"h\":\"fpwpjylwbt\"},\"id\":\"lsj\",\"name\":\"dhszfjv\",\"type\":\"bgofeljag\"}]}")
                .toObject(WorkspaceListResult.class);
        Assertions.assertEquals("anlfzxiavrmbz", model.value().get(0).location());
        Assertions.assertEquals("kixrj", model.value().get(0).tags().get("cirgzp"));
        Assertions.assertEquals(IdentityType.KEY, model.value().get(0).identity().type());
        Assertions.assertEquals("j", model.value().get(0).etag());
        Assertions.assertEquals(WorkspaceSkuNameEnum.PREMIUM, model.value().get(0).sku().name());
        Assertions
            .assertEquals(
                CapacityReservationLevel.TWO_ZERO_ZERO, model.value().get(0).sku().capacityReservationLevel());
        Assertions.assertEquals(900186733, model.value().get(0).retentionInDays());
        Assertions.assertEquals(33.19401521907267D, model.value().get(0).workspaceCapping().dailyQuotaGb());
        Assertions
            .assertEquals(PublicNetworkAccessType.DISABLED, model.value().get(0).publicNetworkAccessForIngestion());
        Assertions.assertEquals(PublicNetworkAccessType.DISABLED, model.value().get(0).publicNetworkAccessForQuery());
        Assertions.assertEquals(false, model.value().get(0).forceCmkForQuery());
        Assertions.assertEquals(false, model.value().get(0).features().enableDataExport());
        Assertions.assertEquals(true, model.value().get(0).features().immediatePurgeDataOn30Days());
        Assertions.assertEquals(true, model.value().get(0).features().enableLogAccessUsingOnlyResourcePermissions());
        Assertions.assertEquals("dbodacizsjqlhkrr", model.value().get(0).features().clusterResourceId());
        Assertions.assertEquals(false, model.value().get(0).features().disableLocalAuth());
        Assertions.assertEquals("tjivfxzsjabib", model.value().get(0).defaultDataCollectionRuleResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceListResult model =
            new WorkspaceListResult()
                .withValue(
                    Arrays
                        .asList(
                            new WorkspaceInner()
                                .withLocation("anlfzxiavrmbz")
                                .withTags(mapOf("cirgzp", "kixrj", "iin", "rlazszrnw", "h", "fpwpjylwbt"))
                                .withIdentity(
                                    new Identity()
                                        .withType(IdentityType.KEY)
                                        .withUserAssignedIdentities(
                                            mapOf(
                                                "hmouwqlgzrfze",
                                                new UserIdentityProperties(),
                                                "wrv",
                                                new UserIdentityProperties(),
                                                "wutwbdsre",
                                                new UserIdentityProperties())))
                                .withEtag("j")
                                .withSku(
                                    new WorkspaceSku()
                                        .withName(WorkspaceSkuNameEnum.PREMIUM)
                                        .withCapacityReservationLevel(CapacityReservationLevel.TWO_ZERO_ZERO))
                                .withRetentionInDays(900186733)
                                .withWorkspaceCapping(new WorkspaceCapping().withDailyQuotaGb(33.19401521907267D))
                                .withPublicNetworkAccessForIngestion(PublicNetworkAccessType.DISABLED)
                                .withPublicNetworkAccessForQuery(PublicNetworkAccessType.DISABLED)
                                .withForceCmkForQuery(false)
                                .withFeatures(
                                    new WorkspaceFeatures()
                                        .withEnableDataExport(false)
                                        .withImmediatePurgeDataOn30Days(true)
                                        .withEnableLogAccessUsingOnlyResourcePermissions(true)
                                        .withClusterResourceId("dbodacizsjqlhkrr")
                                        .withDisableLocalAuth(false)
                                        .withAdditionalProperties(mapOf()))
                                .withDefaultDataCollectionRuleResourceId("tjivfxzsjabib")));
        model = BinaryData.fromObject(model).toObject(WorkspaceListResult.class);
        Assertions.assertEquals("anlfzxiavrmbz", model.value().get(0).location());
        Assertions.assertEquals("kixrj", model.value().get(0).tags().get("cirgzp"));
        Assertions.assertEquals(IdentityType.KEY, model.value().get(0).identity().type());
        Assertions.assertEquals("j", model.value().get(0).etag());
        Assertions.assertEquals(WorkspaceSkuNameEnum.PREMIUM, model.value().get(0).sku().name());
        Assertions
            .assertEquals(
                CapacityReservationLevel.TWO_ZERO_ZERO, model.value().get(0).sku().capacityReservationLevel());
        Assertions.assertEquals(900186733, model.value().get(0).retentionInDays());
        Assertions.assertEquals(33.19401521907267D, model.value().get(0).workspaceCapping().dailyQuotaGb());
        Assertions
            .assertEquals(PublicNetworkAccessType.DISABLED, model.value().get(0).publicNetworkAccessForIngestion());
        Assertions.assertEquals(PublicNetworkAccessType.DISABLED, model.value().get(0).publicNetworkAccessForQuery());
        Assertions.assertEquals(false, model.value().get(0).forceCmkForQuery());
        Assertions.assertEquals(false, model.value().get(0).features().enableDataExport());
        Assertions.assertEquals(true, model.value().get(0).features().immediatePurgeDataOn30Days());
        Assertions.assertEquals(true, model.value().get(0).features().enableLogAccessUsingOnlyResourcePermissions());
        Assertions.assertEquals("dbodacizsjqlhkrr", model.value().get(0).features().clusterResourceId());
        Assertions.assertEquals(false, model.value().get(0).features().disableLocalAuth());
        Assertions.assertEquals("tjivfxzsjabib", model.value().get(0).defaultDataCollectionRuleResourceId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
