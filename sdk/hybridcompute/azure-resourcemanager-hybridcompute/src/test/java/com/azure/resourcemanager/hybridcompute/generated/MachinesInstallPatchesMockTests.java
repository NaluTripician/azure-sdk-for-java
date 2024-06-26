// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.LinuxParameters;
import com.azure.resourcemanager.hybridcompute.models.MachineInstallPatchesParameters;
import com.azure.resourcemanager.hybridcompute.models.MachineInstallPatchesResult;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchClassificationLinux;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchClassificationWindows;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchRebootSetting;
import com.azure.resourcemanager.hybridcompute.models.WindowsParameters;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class MachinesInstallPatchesMockTests {
    @Test
    public void testInstallPatches() throws Exception {
        String responseStr
            = "{\"status\":\"Succeeded\",\"installationActivityId\":\"vutpthjoxo\",\"rebootStatus\":\"Failed\",\"maintenanceWindowExceeded\":true,\"excludedPatchCount\":1976615224,\"notSelectedPatchCount\":791689891,\"pendingPatchCount\":1015646968,\"installedPatchCount\":2072188488,\"failedPatchCount\":1062811723,\"startDateTime\":\"2021-01-28T22:40:19Z\",\"lastModifiedDateTime\":\"2021-11-12T05:30:54Z\",\"startedBy\":\"User\",\"patchServiceUsed\":\"YUM\",\"osType\":\"Linux\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridComputeManager manager = HybridComputeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        MachineInstallPatchesResult response = manager.machines()
            .installPatches("rk", "alywjhhgdn",
                new MachineInstallPatchesParameters().withMaximumDuration(Duration.parse("PT175H6M53S"))
                    .withRebootSetting(VMGuestPatchRebootSetting.ALWAYS)
                    .withWindowsParameters(new WindowsParameters()
                        .withClassificationsToInclude(Arrays.asList(VMGuestPatchClassificationWindows.SERVICE_PACK))
                        .withKbNumbersToInclude(Arrays.asList("iloxggdufiq", "dieuzaofj", "hvcyyysfg", "otcubi"))
                        .withKbNumbersToExclude(Arrays.asList("ipwoqonmacjek", "izsh", "vcimpev", "gmblrri"))
                        .withExcludeKbsRequiringReboot(false)
                        .withMaxPatchPublishDate(OffsetDateTime.parse("2021-02-03T11:24:04Z")))
                    .withLinuxParameters(new LinuxParameters()
                        .withClassificationsToInclude(Arrays.asList(VMGuestPatchClassificationLinux.OTHER,
                            VMGuestPatchClassificationLinux.CRITICAL, VMGuestPatchClassificationLinux.CRITICAL,
                            VMGuestPatchClassificationLinux.CRITICAL))
                        .withPackageNameMasksToInclude(Arrays.asList("fscjfnynszquji", "dvoqyt"))
                        .withPackageNameMasksToExclude(Arrays.asList("owbb"))),
                com.azure.core.util.Context.NONE);

    }
}
