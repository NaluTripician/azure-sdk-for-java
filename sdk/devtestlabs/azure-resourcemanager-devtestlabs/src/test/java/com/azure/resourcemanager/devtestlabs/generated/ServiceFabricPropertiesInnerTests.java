// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.ServiceFabricPropertiesInner;
import org.junit.jupiter.api.Assertions;

public final class ServiceFabricPropertiesInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceFabricPropertiesInner model =
            BinaryData
                .fromString(
                    "{\"externalServiceFabricId\":\"sihclafzvaylp\",\"environmentId\":\"sqqw\",\"applicableSchedule\":{\"properties\":{\"labVmsShutdown\":{\"properties\":{\"status\":\"Enabled\",\"taskType\":\"kchcxwa\",\"weeklyRecurrence\":{\"weekdays\":[\"zjkjexfdeqv\"],\"time\":\"sylkks\"},\"dailyRecurrence\":{\"time\":\"ffmbmxzjrg\"},\"hourlyRecurrence\":{\"minute\":2102626781},\"timeZoneId\":\"jx\",\"notificationSettings\":{\"status\":\"Enabled\",\"timeInMinutes\":277669482,\"webhookUrl\":\"gicgaaoepttaq\",\"emailRecipient\":\"dewemxswv\",\"notificationLocale\":\"unzzjgehk\"},\"createdDate\":\"2021-10-15T08:21:58Z\",\"targetResourceId\":\"rtixokff\",\"provisioningState\":\"inljqepqwhixmo\",\"uniqueIdentifier\":\"tshi\"},\"location\":\"xgvelfclduccbird\",\"tags\":{\"stmninwjizcilng\":\"wcobie\"},\"id\":\"gshejjtbxqmulux\",\"name\":\"xqzv\",\"type\":\"ers\"},\"labVmsStartup\":{\"properties\":{\"status\":\"Enabled\",\"taskType\":\"rwnamikzeb\",\"weeklyRecurrence\":{\"weekdays\":[\"mswziq\",\"fuhok\",\"ruswhv\"],\"time\":\"zznvfbyc\"},\"dailyRecurrence\":{\"time\":\"jww\"},\"hourlyRecurrence\":{\"minute\":2058612555},\"timeZoneId\":\"mwmxqhndvnoamld\",\"notificationSettings\":{\"status\":\"Enabled\",\"timeInMinutes\":1954364961,\"webhookUrl\":\"jhhflzokxcoxpel\",\"emailRecipient\":\"eta\",\"notificationLocale\":\"tsxoatftgz\"},\"createdDate\":\"2021-01-18T18:05:03Z\",\"targetResourceId\":\"swvefloccsrmoz\",\"provisioningState\":\"m\",\"uniqueIdentifier\":\"g\"},\"location\":\"wtxxpkyjcx\",\"tags\":{\"rmcaykgg\":\"grytfmpcyci\",\"pndfcpfnznt\":\"oxuztrksx\"},\"id\":\"jtwkjaos\",\"name\":\"xuzvoamktcqi\",\"type\":\"smgbzahgxqdl\"}},\"location\":\"rtltla\",\"tags\":{\"atbhjmznn\":\"tz\",\"qeqala\":\"s\",\"tgfebwln\":\"vlagun\",\"av\":\"mhyreeudz\"},\"id\":\"pdqmjxlyyzglgouw\",\"name\":\"lmjjyuo\",\"type\":\"qtobaxkjeyt\"},\"provisioningState\":\"lbfjkwr\",\"uniqueIdentifier\":\"nkqbhsyrq\"}")
                .toObject(ServiceFabricPropertiesInner.class);
        Assertions.assertEquals("sihclafzvaylp", model.externalServiceFabricId());
        Assertions.assertEquals("sqqw", model.environmentId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceFabricPropertiesInner model =
            new ServiceFabricPropertiesInner().withExternalServiceFabricId("sihclafzvaylp").withEnvironmentId("sqqw");
        model = BinaryData.fromObject(model).toObject(ServiceFabricPropertiesInner.class);
        Assertions.assertEquals("sihclafzvaylp", model.externalServiceFabricId());
        Assertions.assertEquals("sqqw", model.environmentId());
    }
}
