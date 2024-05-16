// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MetricRulesInner;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MonitoredSubscriptionInner;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MonitoredSubscriptionPropertiesInner;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MonitoringTagRulesPropertiesInner;
import com.azure.resourcemanager.newrelicobservability.models.FilteringTag;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.azure.resourcemanager.newrelicobservability.models.PatchOperation;
import com.azure.resourcemanager.newrelicobservability.models.SendAadLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendActivityLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendMetricsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendSubscriptionLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.Status;
import com.azure.resourcemanager.newrelicobservability.models.SubscriptionList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonitoredSubscriptionPropertiesInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonitoredSubscriptionPropertiesInner model = BinaryData.fromString(
            "{\"properties\":{\"patchOperation\":\"AddComplete\",\"monitoredSubscriptionList\":[{\"subscriptionId\":\"ywpmueefjzwfqkq\",\"status\":\"InProgress\",\"error\":\"suyonobglaocq\",\"tagRules\":{\"provisioningState\":\"Failed\",\"logRules\":{\"sendAadLogs\":\"Disabled\",\"sendSubscriptionLogs\":\"Enabled\",\"sendActivityLogs\":\"Disabled\",\"filteringTags\":[{},{}]},\"metricRules\":{\"sendMetrics\":\"Disabled\",\"filteringTags\":[{}],\"userEmail\":\"wfudwpzntxhdzhl\"}}},{\"subscriptionId\":\"jbhckfrlhr\",\"status\":\"Active\",\"error\":\"yvpycanuzbpzk\",\"tagRules\":{\"provisioningState\":\"Accepted\",\"logRules\":{\"sendAadLogs\":\"Enabled\",\"sendSubscriptionLogs\":\"Enabled\",\"sendActivityLogs\":\"Enabled\",\"filteringTags\":[{},{},{},{}]},\"metricRules\":{\"sendMetrics\":\"Enabled\",\"filteringTags\":[{},{},{}],\"userEmail\":\"jusrtslhspk\"}}}],\"provisioningState\":\"Updating\"},\"id\":\"maofmxagkv\",\"name\":\"melmqkrha\",\"type\":\"vljua\"}")
            .toObject(MonitoredSubscriptionPropertiesInner.class);
        Assertions.assertEquals(PatchOperation.ADD_COMPLETE, model.properties().patchOperation());
        Assertions.assertEquals("ywpmueefjzwfqkq",
            model.properties().monitoredSubscriptionList().get(0).subscriptionId());
        Assertions.assertEquals(Status.IN_PROGRESS, model.properties().monitoredSubscriptionList().get(0).status());
        Assertions.assertEquals("suyonobglaocq", model.properties().monitoredSubscriptionList().get(0).error());
        Assertions.assertEquals(SendAadLogsStatus.DISABLED,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.ENABLED,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendActivityLogs());
        Assertions.assertEquals(SendMetricsStatus.DISABLED,
            model.properties().monitoredSubscriptionList().get(0).tagRules().metricRules().sendMetrics());
        Assertions.assertEquals("wfudwpzntxhdzhl",
            model.properties().monitoredSubscriptionList().get(0).tagRules().metricRules().userEmail());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonitoredSubscriptionPropertiesInner model
            = new MonitoredSubscriptionPropertiesInner()
                .withProperties(
                    new SubscriptionList()
                        .withPatchOperation(
                            PatchOperation.ADD_COMPLETE)
                        .withMonitoredSubscriptionList(
                            Arrays
                                .asList(
                                    new MonitoredSubscriptionInner().withSubscriptionId("ywpmueefjzwfqkq")
                                        .withStatus(
                                            Status.IN_PROGRESS)
                                        .withError("suyonobglaocq")
                                        .withTagRules(new MonitoringTagRulesPropertiesInner()
                                            .withLogRules(new LogRules().withSendAadLogs(SendAadLogsStatus.DISABLED)
                                                .withSendSubscriptionLogs(SendSubscriptionLogsStatus.ENABLED)
                                                .withSendActivityLogs(SendActivityLogsStatus.DISABLED)
                                                .withFilteringTags(
                                                    Arrays.asList(new FilteringTag(), new FilteringTag())))
                                            .withMetricRules(new MetricRulesInner()
                                                .withSendMetrics(SendMetricsStatus.DISABLED)
                                                .withFilteringTags(Arrays.asList(new FilteringTag()))
                                                .withUserEmail("wfudwpzntxhdzhl"))),
                                    new MonitoredSubscriptionInner().withSubscriptionId("jbhckfrlhr")
                                        .withStatus(Status.ACTIVE).withError("yvpycanuzbpzk")
                                        .withTagRules(new MonitoringTagRulesPropertiesInner()
                                            .withLogRules(new LogRules().withSendAadLogs(SendAadLogsStatus.ENABLED)
                                                .withSendSubscriptionLogs(SendSubscriptionLogsStatus.ENABLED)
                                                .withSendActivityLogs(SendActivityLogsStatus.ENABLED)
                                                .withFilteringTags(Arrays.asList(new FilteringTag(), new FilteringTag(),
                                                    new FilteringTag(), new FilteringTag())))
                                            .withMetricRules(new MetricRulesInner()
                                                .withSendMetrics(SendMetricsStatus.ENABLED).withFilteringTags(Arrays
                                                    .asList(new FilteringTag(), new FilteringTag(), new FilteringTag()))
                                                .withUserEmail("jusrtslhspk"))))));
        model = BinaryData.fromObject(model).toObject(MonitoredSubscriptionPropertiesInner.class);
        Assertions.assertEquals(PatchOperation.ADD_COMPLETE, model.properties().patchOperation());
        Assertions.assertEquals("ywpmueefjzwfqkq",
            model.properties().monitoredSubscriptionList().get(0).subscriptionId());
        Assertions.assertEquals(Status.IN_PROGRESS, model.properties().monitoredSubscriptionList().get(0).status());
        Assertions.assertEquals("suyonobglaocq", model.properties().monitoredSubscriptionList().get(0).error());
        Assertions.assertEquals(SendAadLogsStatus.DISABLED,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.ENABLED,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED,
            model.properties().monitoredSubscriptionList().get(0).tagRules().logRules().sendActivityLogs());
        Assertions.assertEquals(SendMetricsStatus.DISABLED,
            model.properties().monitoredSubscriptionList().get(0).tagRules().metricRules().sendMetrics());
        Assertions.assertEquals("wfudwpzntxhdzhl",
            model.properties().monitoredSubscriptionList().get(0).tagRules().metricRules().userEmail());
    }
}
