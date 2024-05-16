// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devhub.fluent.models.GitHubOAuthListResponseInner;
import com.azure.resourcemanager.devhub.fluent.models.GitHubOAuthResponseInner;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GitHubOAuthListResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitHubOAuthListResponseInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"username\":\"cs\"},\"id\":\"s\",\"name\":\"cnyejhkryhtnapcz\",\"type\":\"lokjyemkk\"},{\"properties\":{\"username\":\"pjoxzjnch\"},\"id\":\"jspodmailzyde\",\"name\":\"o\",\"type\":\"wyahuxinpmqnja\"},{\"properties\":{\"username\":\"xj\"},\"id\":\"r\",\"name\":\"zvcputegjvwmfda\",\"type\":\"scmdvpjhulsuu\"}]}")
                .toObject(GitHubOAuthListResponseInner.class);
        Assertions.assertEquals("cs", model.value().get(0).username());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitHubOAuthListResponseInner model =
            new GitHubOAuthListResponseInner()
                .withValue(
                    Arrays
                        .asList(
                            new GitHubOAuthResponseInner().withUsername("cs"),
                            new GitHubOAuthResponseInner().withUsername("pjoxzjnch"),
                            new GitHubOAuthResponseInner().withUsername("xj")));
        model = BinaryData.fromObject(model).toObject(GitHubOAuthListResponseInner.class);
        Assertions.assertEquals("cs", model.value().get(0).username());
    }
}
