// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logz.fluent.models.LogzMonitorResourceInner;
import com.azure.resourcemanager.logz.models.IdentityProperties;
import com.azure.resourcemanager.logz.models.LogzMonitorResourceListResponse;
import com.azure.resourcemanager.logz.models.ManagedIdentityTypes;
import com.azure.resourcemanager.logz.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.logz.models.MonitorProperties;
import com.azure.resourcemanager.logz.models.MonitoringStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LogzMonitorResourceListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogzMonitorResourceListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Creating\",\"monitoringStatus\":\"Disabled\",\"marketplaceSubscriptionStatus\":\"Active\",\"liftrResourceCategory\":\"Unknown\",\"liftrResourcePreference\":271346012},\"identity\":{\"principalId\":\"cs\",\"tenantId\":\"s\",\"type\":\"UserAssigned\"},\"location\":\"yejhk\",\"tags\":{\"ni\":\"tnapczwlokjyemkk\",\"ilzyd\":\"joxzjnchgejspodm\",\"jwyahuxinpmqnja\":\"h\",\"tegjvwmf\":\"wixjsprozvcp\"},\"id\":\"atscmd\",\"name\":\"pjhulsuuvmkj\",\"type\":\"zkrwfn\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"monitoringStatus\":\"Disabled\",\"marketplaceSubscriptionStatus\":\"Active\",\"liftrResourceCategory\":\"MonitorLogs\",\"liftrResourcePreference\":672653689},\"identity\":{\"principalId\":\"qpsoacctazak\",\"tenantId\":\"lahbcryff\",\"type\":\"SystemAssigned\"},\"location\":\"osygex\",\"tags\":{\"rzevdphlxaol\":\"jakhmsbzjh\",\"fsinzgvfcjrwzoxx\":\"hqtrgqjbpf\",\"wfzitonpeqfpjk\":\"tfell\",\"nmayhuybb\":\"lxofpdvhpfxxypin\"},\"id\":\"podepoo\",\"name\":\"inuvamiheogn\",\"type\":\"rxzxtheo\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"monitoringStatus\":\"Disabled\",\"marketplaceSubscriptionStatus\":\"Suspended\",\"liftrResourceCategory\":\"Unknown\",\"liftrResourcePreference\":720964194},\"identity\":{\"principalId\":\"gbwjzrnf\",\"tenantId\":\"xgispemvtzfkufu\",\"type\":\"SystemAssigned\"},\"location\":\"ofx\",\"tags\":{\"hqjbasvmsmj\":\"fjaeq\",\"ybkzgcwr\":\"ulngsntn\",\"skcqvkocrcjd\":\"clxxwrljdo\"},\"id\":\"wtnhxbnjbiksqr\",\"name\":\"lssai\",\"type\":\"qpjwnzlljfm\"}],\"nextLink\":\"eebvmgxsab\"}")
                .toObject(LogzMonitorResourceListResponse.class);
        Assertions.assertEquals("yejhk", model.value().get(0).location());
        Assertions.assertEquals("tnapczwlokjyemkk", model.value().get(0).tags().get("ni"));
        Assertions.assertEquals(MonitoringStatus.DISABLED, model.value().get(0).properties().monitoringStatus());
        Assertions
            .assertEquals(
                MarketplaceSubscriptionStatus.ACTIVE,
                model.value().get(0).properties().marketplaceSubscriptionStatus());
        Assertions.assertEquals(ManagedIdentityTypes.USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("eebvmgxsab", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogzMonitorResourceListResponse model =
            new LogzMonitorResourceListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new LogzMonitorResourceInner()
                                .withLocation("yejhk")
                                .withTags(
                                    mapOf(
                                        "ni",
                                        "tnapczwlokjyemkk",
                                        "ilzyd",
                                        "joxzjnchgejspodm",
                                        "jwyahuxinpmqnja",
                                        "h",
                                        "tegjvwmf",
                                        "wixjsprozvcp"))
                                .withProperties(
                                    new MonitorProperties()
                                        .withMonitoringStatus(MonitoringStatus.DISABLED)
                                        .withMarketplaceSubscriptionStatus(MarketplaceSubscriptionStatus.ACTIVE))
                                .withIdentity(new IdentityProperties().withType(ManagedIdentityTypes.USER_ASSIGNED)),
                            new LogzMonitorResourceInner()
                                .withLocation("osygex")
                                .withTags(
                                    mapOf(
                                        "rzevdphlxaol",
                                        "jakhmsbzjh",
                                        "fsinzgvfcjrwzoxx",
                                        "hqtrgqjbpf",
                                        "wfzitonpeqfpjk",
                                        "tfell",
                                        "nmayhuybb",
                                        "lxofpdvhpfxxypin"))
                                .withProperties(
                                    new MonitorProperties()
                                        .withMonitoringStatus(MonitoringStatus.DISABLED)
                                        .withMarketplaceSubscriptionStatus(MarketplaceSubscriptionStatus.ACTIVE))
                                .withIdentity(new IdentityProperties().withType(ManagedIdentityTypes.SYSTEM_ASSIGNED)),
                            new LogzMonitorResourceInner()
                                .withLocation("ofx")
                                .withTags(
                                    mapOf("hqjbasvmsmj", "fjaeq", "ybkzgcwr", "ulngsntn", "skcqvkocrcjd", "clxxwrljdo"))
                                .withProperties(
                                    new MonitorProperties()
                                        .withMonitoringStatus(MonitoringStatus.DISABLED)
                                        .withMarketplaceSubscriptionStatus(MarketplaceSubscriptionStatus.SUSPENDED))
                                .withIdentity(new IdentityProperties().withType(ManagedIdentityTypes.SYSTEM_ASSIGNED))))
                .withNextLink("eebvmgxsab");
        model = BinaryData.fromObject(model).toObject(LogzMonitorResourceListResponse.class);
        Assertions.assertEquals("yejhk", model.value().get(0).location());
        Assertions.assertEquals("tnapczwlokjyemkk", model.value().get(0).tags().get("ni"));
        Assertions.assertEquals(MonitoringStatus.DISABLED, model.value().get(0).properties().monitoringStatus());
        Assertions
            .assertEquals(
                MarketplaceSubscriptionStatus.ACTIVE,
                model.value().get(0).properties().marketplaceSubscriptionStatus());
        Assertions.assertEquals(ManagedIdentityTypes.USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("eebvmgxsab", model.nextLink());
    }

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
