// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanProperties;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingHostPoolReference;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingHostPoolType;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingSchedule;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingScheduleDaysOfWeekItem;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostLoadBalancingAlgorithm;
import com.azure.resourcemanager.desktopvirtualization.models.StopHostsWhen;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScalingPlanPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScalingPlanProperties model =
            BinaryData
                .fromString(
                    "{\"objectId\":\"aos\",\"description\":\"xc\",\"friendlyName\":\"npc\",\"timeZone\":\"hocohslkev\",\"hostPoolType\":\"Pooled\",\"exclusionTag\":\"zfbuhf\",\"schedules\":[{\"name\":\"x\",\"daysOfWeek\":[\"Sunday\",\"Saturday\",\"Wednesday\"],\"rampUpStartTime\":{\"hour\":378191098,\"minute\":1914432251},\"rampUpLoadBalancingAlgorithm\":\"BreadthFirst\",\"rampUpMinimumHostsPct\":511745945,\"rampUpCapacityThresholdPct\":72720177,\"peakStartTime\":{\"hour\":1090911341,\"minute\":516508763},\"peakLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownStartTime\":{\"hour\":2099560460,\"minute\":63743502},\"rampDownLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownMinimumHostsPct\":852408036,\"rampDownCapacityThresholdPct\":1533389693,\"rampDownForceLogoffUsers\":true,\"rampDownStopHostsWhen\":\"ZeroActiveSessions\",\"rampDownWaitTimeMinutes\":849896725,\"rampDownNotificationMessage\":\"jx\",\"offPeakStartTime\":{\"hour\":2030028307,\"minute\":953955678},\"offPeakLoadBalancingAlgorithm\":\"BreadthFirst\"},{\"name\":\"ptkoenkoukn\",\"daysOfWeek\":[\"Monday\",\"Saturday\",\"Thursday\",\"Saturday\"],\"rampUpStartTime\":{\"hour\":133898645,\"minute\":45967354},\"rampUpLoadBalancingAlgorithm\":\"DepthFirst\",\"rampUpMinimumHostsPct\":969530861,\"rampUpCapacityThresholdPct\":626726522,\"peakStartTime\":{\"hour\":1997522468,\"minute\":655680628},\"peakLoadBalancingAlgorithm\":\"BreadthFirst\",\"rampDownStartTime\":{\"hour\":1866473569,\"minute\":212177726},\"rampDownLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownMinimumHostsPct\":862594448,\"rampDownCapacityThresholdPct\":157234884,\"rampDownForceLogoffUsers\":false,\"rampDownStopHostsWhen\":\"ZeroActiveSessions\",\"rampDownWaitTimeMinutes\":1142457061,\"rampDownNotificationMessage\":\"gevqznty\",\"offPeakStartTime\":{\"hour\":1534766868,\"minute\":1785806943},\"offPeakLoadBalancingAlgorithm\":\"DepthFirst\"},{\"name\":\"c\",\"daysOfWeek\":[\"Tuesday\",\"Wednesday\",\"Friday\",\"Friday\"],\"rampUpStartTime\":{\"hour\":2075884745,\"minute\":1295210131},\"rampUpLoadBalancingAlgorithm\":\"DepthFirst\",\"rampUpMinimumHostsPct\":229483686,\"rampUpCapacityThresholdPct\":1665159346,\"peakStartTime\":{\"hour\":856772857,\"minute\":403055260},\"peakLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownStartTime\":{\"hour\":170373532,\"minute\":1718564660},\"rampDownLoadBalancingAlgorithm\":\"DepthFirst\",\"rampDownMinimumHostsPct\":1909902819,\"rampDownCapacityThresholdPct\":362966046,\"rampDownForceLogoffUsers\":true,\"rampDownStopHostsWhen\":\"ZeroSessions\",\"rampDownWaitTimeMinutes\":22083476,\"rampDownNotificationMessage\":\"bkh\",\"offPeakStartTime\":{\"hour\":2127806039,\"minute\":1192393079},\"offPeakLoadBalancingAlgorithm\":\"BreadthFirst\"}],\"hostPoolReferences\":[{\"hostPoolArmPath\":\"p\",\"scalingPlanEnabled\":false}]}")
                .toObject(ScalingPlanProperties.class);
        Assertions.assertEquals("xc", model.description());
        Assertions.assertEquals("npc", model.friendlyName());
        Assertions.assertEquals("hocohslkev", model.timeZone());
        Assertions.assertEquals(ScalingHostPoolType.POOLED, model.hostPoolType());
        Assertions.assertEquals("zfbuhf", model.exclusionTag());
        Assertions.assertEquals("x", model.schedules().get(0).name());
        Assertions.assertEquals(ScalingScheduleDaysOfWeekItem.SUNDAY, model.schedules().get(0).daysOfWeek().get(0));
        Assertions.assertEquals(378191098, model.schedules().get(0).rampUpStartTime().hour());
        Assertions.assertEquals(1914432251, model.schedules().get(0).rampUpStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.BREADTH_FIRST,
                model.schedules().get(0).rampUpLoadBalancingAlgorithm());
        Assertions.assertEquals(511745945, model.schedules().get(0).rampUpMinimumHostsPct());
        Assertions.assertEquals(72720177, model.schedules().get(0).rampUpCapacityThresholdPct());
        Assertions.assertEquals(1090911341, model.schedules().get(0).peakStartTime().hour());
        Assertions.assertEquals(516508763, model.schedules().get(0).peakStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.schedules().get(0).peakLoadBalancingAlgorithm());
        Assertions.assertEquals(2099560460, model.schedules().get(0).rampDownStartTime().hour());
        Assertions.assertEquals(63743502, model.schedules().get(0).rampDownStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.DEPTH_FIRST,
                model.schedules().get(0).rampDownLoadBalancingAlgorithm());
        Assertions.assertEquals(852408036, model.schedules().get(0).rampDownMinimumHostsPct());
        Assertions.assertEquals(1533389693, model.schedules().get(0).rampDownCapacityThresholdPct());
        Assertions.assertEquals(true, model.schedules().get(0).rampDownForceLogoffUsers());
        Assertions.assertEquals(StopHostsWhen.ZERO_ACTIVE_SESSIONS, model.schedules().get(0).rampDownStopHostsWhen());
        Assertions.assertEquals(849896725, model.schedules().get(0).rampDownWaitTimeMinutes());
        Assertions.assertEquals("jx", model.schedules().get(0).rampDownNotificationMessage());
        Assertions.assertEquals(2030028307, model.schedules().get(0).offPeakStartTime().hour());
        Assertions.assertEquals(953955678, model.schedules().get(0).offPeakStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.BREADTH_FIRST,
                model.schedules().get(0).offPeakLoadBalancingAlgorithm());
        Assertions.assertEquals("p", model.hostPoolReferences().get(0).hostPoolArmPath());
        Assertions.assertEquals(false, model.hostPoolReferences().get(0).scalingPlanEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScalingPlanProperties model =
            new ScalingPlanProperties()
                .withDescription("xc")
                .withFriendlyName("npc")
                .withTimeZone("hocohslkev")
                .withHostPoolType(ScalingHostPoolType.POOLED)
                .withExclusionTag("zfbuhf")
                .withSchedules(
                    Arrays
                        .asList(
                            new ScalingSchedule()
                                .withName("x")
                                .withDaysOfWeek(
                                    Arrays
                                        .asList(
                                            ScalingScheduleDaysOfWeekItem.SUNDAY,
                                            ScalingScheduleDaysOfWeekItem.SATURDAY,
                                            ScalingScheduleDaysOfWeekItem.WEDNESDAY))
                                .withRampUpStartTime(new Time().withHour(378191098).withMinute(1914432251))
                                .withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST)
                                .withRampUpMinimumHostsPct(511745945)
                                .withRampUpCapacityThresholdPct(72720177)
                                .withPeakStartTime(new Time().withHour(1090911341).withMinute(516508763))
                                .withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampDownStartTime(new Time().withHour(2099560460).withMinute(63743502))
                                .withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampDownMinimumHostsPct(852408036)
                                .withRampDownCapacityThresholdPct(1533389693)
                                .withRampDownForceLogoffUsers(true)
                                .withRampDownStopHostsWhen(StopHostsWhen.ZERO_ACTIVE_SESSIONS)
                                .withRampDownWaitTimeMinutes(849896725)
                                .withRampDownNotificationMessage("jx")
                                .withOffPeakStartTime(new Time().withHour(2030028307).withMinute(953955678))
                                .withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST),
                            new ScalingSchedule()
                                .withName("ptkoenkoukn")
                                .withDaysOfWeek(
                                    Arrays
                                        .asList(
                                            ScalingScheduleDaysOfWeekItem.MONDAY,
                                            ScalingScheduleDaysOfWeekItem.SATURDAY,
                                            ScalingScheduleDaysOfWeekItem.THURSDAY,
                                            ScalingScheduleDaysOfWeekItem.SATURDAY))
                                .withRampUpStartTime(new Time().withHour(133898645).withMinute(45967354))
                                .withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampUpMinimumHostsPct(969530861)
                                .withRampUpCapacityThresholdPct(626726522)
                                .withPeakStartTime(new Time().withHour(1997522468).withMinute(655680628))
                                .withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST)
                                .withRampDownStartTime(new Time().withHour(1866473569).withMinute(212177726))
                                .withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampDownMinimumHostsPct(862594448)
                                .withRampDownCapacityThresholdPct(157234884)
                                .withRampDownForceLogoffUsers(false)
                                .withRampDownStopHostsWhen(StopHostsWhen.ZERO_ACTIVE_SESSIONS)
                                .withRampDownWaitTimeMinutes(1142457061)
                                .withRampDownNotificationMessage("gevqznty")
                                .withOffPeakStartTime(new Time().withHour(1534766868).withMinute(1785806943))
                                .withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST),
                            new ScalingSchedule()
                                .withName("c")
                                .withDaysOfWeek(
                                    Arrays
                                        .asList(
                                            ScalingScheduleDaysOfWeekItem.TUESDAY,
                                            ScalingScheduleDaysOfWeekItem.WEDNESDAY,
                                            ScalingScheduleDaysOfWeekItem.FRIDAY,
                                            ScalingScheduleDaysOfWeekItem.FRIDAY))
                                .withRampUpStartTime(new Time().withHour(2075884745).withMinute(1295210131))
                                .withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampUpMinimumHostsPct(229483686)
                                .withRampUpCapacityThresholdPct(1665159346)
                                .withPeakStartTime(new Time().withHour(856772857).withMinute(403055260))
                                .withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampDownStartTime(new Time().withHour(170373532).withMinute(1718564660))
                                .withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                                .withRampDownMinimumHostsPct(1909902819)
                                .withRampDownCapacityThresholdPct(362966046)
                                .withRampDownForceLogoffUsers(true)
                                .withRampDownStopHostsWhen(StopHostsWhen.ZERO_SESSIONS)
                                .withRampDownWaitTimeMinutes(22083476)
                                .withRampDownNotificationMessage("bkh")
                                .withOffPeakStartTime(new Time().withHour(2127806039).withMinute(1192393079))
                                .withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST)))
                .withHostPoolReferences(
                    Arrays
                        .asList(new ScalingHostPoolReference().withHostPoolArmPath("p").withScalingPlanEnabled(false)));
        model = BinaryData.fromObject(model).toObject(ScalingPlanProperties.class);
        Assertions.assertEquals("xc", model.description());
        Assertions.assertEquals("npc", model.friendlyName());
        Assertions.assertEquals("hocohslkev", model.timeZone());
        Assertions.assertEquals(ScalingHostPoolType.POOLED, model.hostPoolType());
        Assertions.assertEquals("zfbuhf", model.exclusionTag());
        Assertions.assertEquals("x", model.schedules().get(0).name());
        Assertions.assertEquals(ScalingScheduleDaysOfWeekItem.SUNDAY, model.schedules().get(0).daysOfWeek().get(0));
        Assertions.assertEquals(378191098, model.schedules().get(0).rampUpStartTime().hour());
        Assertions.assertEquals(1914432251, model.schedules().get(0).rampUpStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.BREADTH_FIRST,
                model.schedules().get(0).rampUpLoadBalancingAlgorithm());
        Assertions.assertEquals(511745945, model.schedules().get(0).rampUpMinimumHostsPct());
        Assertions.assertEquals(72720177, model.schedules().get(0).rampUpCapacityThresholdPct());
        Assertions.assertEquals(1090911341, model.schedules().get(0).peakStartTime().hour());
        Assertions.assertEquals(516508763, model.schedules().get(0).peakStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.DEPTH_FIRST, model.schedules().get(0).peakLoadBalancingAlgorithm());
        Assertions.assertEquals(2099560460, model.schedules().get(0).rampDownStartTime().hour());
        Assertions.assertEquals(63743502, model.schedules().get(0).rampDownStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.DEPTH_FIRST,
                model.schedules().get(0).rampDownLoadBalancingAlgorithm());
        Assertions.assertEquals(852408036, model.schedules().get(0).rampDownMinimumHostsPct());
        Assertions.assertEquals(1533389693, model.schedules().get(0).rampDownCapacityThresholdPct());
        Assertions.assertEquals(true, model.schedules().get(0).rampDownForceLogoffUsers());
        Assertions.assertEquals(StopHostsWhen.ZERO_ACTIVE_SESSIONS, model.schedules().get(0).rampDownStopHostsWhen());
        Assertions.assertEquals(849896725, model.schedules().get(0).rampDownWaitTimeMinutes());
        Assertions.assertEquals("jx", model.schedules().get(0).rampDownNotificationMessage());
        Assertions.assertEquals(2030028307, model.schedules().get(0).offPeakStartTime().hour());
        Assertions.assertEquals(953955678, model.schedules().get(0).offPeakStartTime().minute());
        Assertions
            .assertEquals(
                SessionHostLoadBalancingAlgorithm.BREADTH_FIRST,
                model.schedules().get(0).offPeakLoadBalancingAlgorithm());
        Assertions.assertEquals("p", model.hostPoolReferences().get(0).hostPoolArmPath());
        Assertions.assertEquals(false, model.hostPoolReferences().get(0).scalingPlanEnabled());
    }
}
