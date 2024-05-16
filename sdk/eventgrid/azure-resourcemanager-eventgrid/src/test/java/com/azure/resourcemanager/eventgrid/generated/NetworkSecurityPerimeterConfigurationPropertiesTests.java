// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.NetworkSecurityPerimeterConfigurationProperties;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterAssociationAccessMode;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigProvisioningState;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationIssues;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationIssueSeverity;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationIssueType;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationProfile;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterInfo;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterProfileAccessRule;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterProfileAccessRuleDirection;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterSubscription;
import com.azure.resourcemanager.eventgrid.models.ResourceAssociation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkSecurityPerimeterConfigurationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkSecurityPerimeterConfigurationProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Creating\",\"provisioningIssues\":[{\"name\":\"pdwrpqafgfugsn\",\"properties\":{\"issueType\":\"MissingIdentityConfiguration\",\"severity\":\"Error\",\"description\":\"fypococtfjgti\",\"suggestedResourceIds\":[\"vzuyturmlmu\",\"wolba\"],\"suggestedAccessRules\":[\"opionszon\",\"pngajin\"]}},{\"name\":\"xjawrt\",\"properties\":{\"issueType\":\"Other\",\"severity\":\"Error\",\"description\":\"cxlzhcoxovnekh\",\"suggestedResourceIds\":[\"usfnr\",\"tjxtxr\",\"cq\",\"jvidttge\"],\"suggestedAccessRules\":[\"lvyjtcvuwkas\",\"zies\",\"uughtuqfecjxeyg\",\"uhxu\"]}},{\"name\":\"buew\",\"properties\":{\"issueType\":\"MissingIdentityConfiguration\",\"severity\":\"Warning\",\"description\":\"xuzrhwpusxjba\",\"suggestedResourceIds\":[\"gpdohzj\",\"atucoigebxncn\"],\"suggestedAccessRules\":[\"pbnwgfmxjgcg\",\"jbgdlfgtdysnaquf\"]}}],\"networkSecurityPerimeter\":{\"id\":\"ctqhamzjrwdk\",\"perimeterGuid\":\"eqyj\",\"location\":\"zi\"},\"resourceAssociation\":{\"name\":\"xdfzantkw\",\"accessMode\":\"Audit\"},\"profile\":{\"name\":\"mlbnseq\",\"accessRulesVersion\":\"jjvpilguooqja\",\"accessRules\":[{\"fullyQualifiedArmId\":\"tg\",\"name\":\"iookjbsah\",\"type\":\"dt\",\"properties\":{\"direction\":\"Inbound\",\"addressPrefixes\":[\"cslmotoebnfxo\"],\"subscriptions\":[{},{},{},{}],\"networkSecurityPerimeters\":[{}],\"fullyQualifiedDomainNames\":[\"irazftxejwabmd\",\"jtmvc\"],\"emailAddresses\":[\"xcmjurbu\",\"hlkyqltqsrog\",\"uwkffdjktsysid\"],\"phoneNumbers\":[\"lglxnfui\"]}}],\"diagnosticSettingsVersion\":\"kbusqo\",\"enabledLogCategories\":[\"ikayiansharuj\",\"ji\",\"xfz\",\"j\"]}}")
            .toObject(NetworkSecurityPerimeterConfigurationProperties.class);
        Assertions.assertEquals(NetworkSecurityPerimeterConfigProvisioningState.CREATING, model.provisioningState());
        Assertions.assertEquals("pdwrpqafgfugsn", model.provisioningIssues().get(0).name());
        Assertions.assertEquals(NetworkSecurityPerimeterConfigurationIssueType.MISSING_IDENTITY_CONFIGURATION,
            model.provisioningIssues().get(0).issueType());
        Assertions.assertEquals(NetworkSecurityPerimeterConfigurationIssueSeverity.ERROR,
            model.provisioningIssues().get(0).severity());
        Assertions.assertEquals("fypococtfjgti", model.provisioningIssues().get(0).description());
        Assertions.assertEquals("vzuyturmlmu", model.provisioningIssues().get(0).suggestedResourceIds().get(0));
        Assertions.assertEquals("opionszon", model.provisioningIssues().get(0).suggestedAccessRules().get(0));
        Assertions.assertEquals("ctqhamzjrwdk", model.networkSecurityPerimeter().id());
        Assertions.assertEquals("eqyj", model.networkSecurityPerimeter().perimeterGuid());
        Assertions.assertEquals("zi", model.networkSecurityPerimeter().location());
        Assertions.assertEquals("xdfzantkw", model.resourceAssociation().name());
        Assertions.assertEquals(NetworkSecurityPerimeterAssociationAccessMode.AUDIT,
            model.resourceAssociation().accessMode());
        Assertions.assertEquals("mlbnseq", model.profile().name());
        Assertions.assertEquals("jjvpilguooqja", model.profile().accessRulesVersion());
        Assertions.assertEquals("tg", model.profile().accessRules().get(0).fullyQualifiedArmId());
        Assertions.assertEquals("iookjbsah", model.profile().accessRules().get(0).name());
        Assertions.assertEquals("dt", model.profile().accessRules().get(0).type());
        Assertions.assertEquals(NetworkSecurityPerimeterProfileAccessRuleDirection.INBOUND,
            model.profile().accessRules().get(0).direction());
        Assertions.assertEquals("cslmotoebnfxo", model.profile().accessRules().get(0).addressPrefixes().get(0));
        Assertions.assertEquals("irazftxejwabmd",
            model.profile().accessRules().get(0).fullyQualifiedDomainNames().get(0));
        Assertions.assertEquals("xcmjurbu", model.profile().accessRules().get(0).emailAddresses().get(0));
        Assertions.assertEquals("lglxnfui", model.profile().accessRules().get(0).phoneNumbers().get(0));
        Assertions.assertEquals("kbusqo", model.profile().diagnosticSettingsVersion());
        Assertions.assertEquals("ikayiansharuj", model.profile().enabledLogCategories().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkSecurityPerimeterConfigurationProperties model
            = new NetworkSecurityPerimeterConfigurationProperties()
                .withProvisioningState(NetworkSecurityPerimeterConfigProvisioningState.CREATING)
                .withProvisioningIssues(
                    Arrays.asList(
                        new NetworkSecurityPerimeterConfigurationIssues().withName("pdwrpqafgfugsn")
                            .withIssueType(
                                NetworkSecurityPerimeterConfigurationIssueType.MISSING_IDENTITY_CONFIGURATION)
                            .withSeverity(NetworkSecurityPerimeterConfigurationIssueSeverity.ERROR)
                            .withDescription("fypococtfjgti")
                            .withSuggestedResourceIds(Arrays.asList("vzuyturmlmu", "wolba"))
                            .withSuggestedAccessRules(Arrays.asList("opionszon", "pngajin")),
                        new NetworkSecurityPerimeterConfigurationIssues().withName("xjawrt")
                            .withIssueType(NetworkSecurityPerimeterConfigurationIssueType.OTHER)
                            .withSeverity(NetworkSecurityPerimeterConfigurationIssueSeverity.ERROR)
                            .withDescription("cxlzhcoxovnekh")
                            .withSuggestedResourceIds(Arrays.asList("usfnr", "tjxtxr", "cq", "jvidttge"))
                            .withSuggestedAccessRules(Arrays.asList("lvyjtcvuwkas", "zies", "uughtuqfecjxeyg", "uhxu")),
                        new NetworkSecurityPerimeterConfigurationIssues().withName("buew")
                            .withIssueType(
                                NetworkSecurityPerimeterConfigurationIssueType.MISSING_IDENTITY_CONFIGURATION)
                            .withSeverity(NetworkSecurityPerimeterConfigurationIssueSeverity.WARNING)
                            .withDescription("xuzrhwpusxjba")
                            .withSuggestedResourceIds(Arrays.asList("gpdohzj", "atucoigebxncn"))
                            .withSuggestedAccessRules(Arrays.asList("pbnwgfmxjgcg", "jbgdlfgtdysnaquf"))))
                .withNetworkSecurityPerimeter(new NetworkSecurityPerimeterInfo().withId("ctqhamzjrwdk")
                    .withPerimeterGuid("eqyj")
                    .withLocation("zi"))
                .withResourceAssociation(new ResourceAssociation().withName("xdfzantkw")
                    .withAccessMode(NetworkSecurityPerimeterAssociationAccessMode.AUDIT))
                .withProfile(
                    new NetworkSecurityPerimeterConfigurationProfile().withName("mlbnseq")
                        .withAccessRulesVersion("jjvpilguooqja")
                        .withAccessRules(Arrays.asList(new NetworkSecurityPerimeterProfileAccessRule()
                            .withFullyQualifiedArmId("tg")
                            .withName("iookjbsah")
                            .withType("dt")
                            .withDirection(NetworkSecurityPerimeterProfileAccessRuleDirection.INBOUND)
                            .withAddressPrefixes(Arrays.asList("cslmotoebnfxo"))
                            .withSubscriptions(Arrays.asList(new NetworkSecurityPerimeterSubscription(),
                                new NetworkSecurityPerimeterSubscription(), new NetworkSecurityPerimeterSubscription(),
                                new NetworkSecurityPerimeterSubscription()))
                            .withNetworkSecurityPerimeters(Arrays.asList(new NetworkSecurityPerimeterInfo()))
                            .withFullyQualifiedDomainNames(Arrays.asList("irazftxejwabmd", "jtmvc"))
                            .withEmailAddresses(Arrays.asList("xcmjurbu", "hlkyqltqsrog", "uwkffdjktsysid"))
                            .withPhoneNumbers(Arrays.asList("lglxnfui"))))
                        .withDiagnosticSettingsVersion("kbusqo")
                        .withEnabledLogCategories(Arrays.asList("ikayiansharuj", "ji", "xfz", "j")));
        model = BinaryData.fromObject(model).toObject(NetworkSecurityPerimeterConfigurationProperties.class);
        Assertions.assertEquals(NetworkSecurityPerimeterConfigProvisioningState.CREATING, model.provisioningState());
        Assertions.assertEquals("pdwrpqafgfugsn", model.provisioningIssues().get(0).name());
        Assertions.assertEquals(NetworkSecurityPerimeterConfigurationIssueType.MISSING_IDENTITY_CONFIGURATION,
            model.provisioningIssues().get(0).issueType());
        Assertions.assertEquals(NetworkSecurityPerimeterConfigurationIssueSeverity.ERROR,
            model.provisioningIssues().get(0).severity());
        Assertions.assertEquals("fypococtfjgti", model.provisioningIssues().get(0).description());
        Assertions.assertEquals("vzuyturmlmu", model.provisioningIssues().get(0).suggestedResourceIds().get(0));
        Assertions.assertEquals("opionszon", model.provisioningIssues().get(0).suggestedAccessRules().get(0));
        Assertions.assertEquals("ctqhamzjrwdk", model.networkSecurityPerimeter().id());
        Assertions.assertEquals("eqyj", model.networkSecurityPerimeter().perimeterGuid());
        Assertions.assertEquals("zi", model.networkSecurityPerimeter().location());
        Assertions.assertEquals("xdfzantkw", model.resourceAssociation().name());
        Assertions.assertEquals(NetworkSecurityPerimeterAssociationAccessMode.AUDIT,
            model.resourceAssociation().accessMode());
        Assertions.assertEquals("mlbnseq", model.profile().name());
        Assertions.assertEquals("jjvpilguooqja", model.profile().accessRulesVersion());
        Assertions.assertEquals("tg", model.profile().accessRules().get(0).fullyQualifiedArmId());
        Assertions.assertEquals("iookjbsah", model.profile().accessRules().get(0).name());
        Assertions.assertEquals("dt", model.profile().accessRules().get(0).type());
        Assertions.assertEquals(NetworkSecurityPerimeterProfileAccessRuleDirection.INBOUND,
            model.profile().accessRules().get(0).direction());
        Assertions.assertEquals("cslmotoebnfxo", model.profile().accessRules().get(0).addressPrefixes().get(0));
        Assertions.assertEquals("irazftxejwabmd",
            model.profile().accessRules().get(0).fullyQualifiedDomainNames().get(0));
        Assertions.assertEquals("xcmjurbu", model.profile().accessRules().get(0).emailAddresses().get(0));
        Assertions.assertEquals("lglxnfui", model.profile().accessRules().get(0).phoneNumbers().get(0));
        Assertions.assertEquals("kbusqo", model.profile().diagnosticSettingsVersion());
        Assertions.assertEquals("ikayiansharuj", model.profile().enabledLogCategories().get(0));
    }
}
