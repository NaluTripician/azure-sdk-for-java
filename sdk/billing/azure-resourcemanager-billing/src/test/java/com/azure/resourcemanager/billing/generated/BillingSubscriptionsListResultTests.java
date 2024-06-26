// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.BillingSubscriptionsListResult;

public final class BillingSubscriptionsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingSubscriptionsListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"displayName\":\"ck\",\"subscriptionId\":\"57d84afc-8b50-4f1e-81a9-e9cf06197dda\",\"subscriptionBillingStatus\":\"Warning\",\"billingProfileId\":\"bkyvp\",\"billingProfileDisplayName\":\"anuzbpzkafkuw\",\"costCenter\":\"rnwb\",\"customerId\":\"hhseyv\",\"customerDisplayName\":\"srtslhspkdeem\",\"invoiceSectionId\":\"fm\",\"invoiceSectionDisplayName\":\"gkvtmelmqkrhah\",\"skuId\":\"uahaquhcdhmd\",\"skuDescription\":\"laexqp\",\"suspensionReasons\":[]},\"id\":\"adm\",\"name\":\"sr\",\"type\":\"r\"},{\"properties\":{\"displayName\":\"pv\",\"subscriptionId\":\"bf8b6a2e-e5b5-4b61-aff8-d9ee31509c78\",\"subscriptionBillingStatus\":\"Warning\",\"billingProfileId\":\"isgwbnbbeldawkz\",\"billingProfileDisplayName\":\"liourqhak\",\"costCenter\":\"hashsfwxosow\",\"customerId\":\"cugicjoox\",\"customerDisplayName\":\"ebwpucwwfvo\",\"invoiceSectionId\":\"vmeueci\",\"invoiceSectionDisplayName\":\"hzceuojgjrwjue\",\"skuId\":\"wmcdytdxwi\",\"skuDescription\":\"nrjawgqwg\",\"suspensionReasons\":[]},\"id\":\"ni\",\"name\":\"kxfbkpycgklwndn\",\"type\":\"jdauwhvy\"},{\"properties\":{\"displayName\":\"btdhxujznbm\",\"subscriptionId\":\"ea622ed2-d4f9-469e-9daf-f1e91e5801ed\",\"subscriptionBillingStatus\":\"Abandoned\",\"billingProfileId\":\"zqlveualupjmkhf\",\"billingProfileDisplayName\":\"bbcswsrtjri\",\"costCenter\":\"rbpbewtghfgblcg\",\"customerId\":\"zvlvqhjkbegib\",\"customerDisplayName\":\"mxiebw\",\"invoiceSectionId\":\"loayqcgw\",\"invoiceSectionDisplayName\":\"zjuzgwyz\",\"skuId\":\"xongmtsavjcbpwxq\",\"skuDescription\":\"rknftguvriuhprwm\",\"suspensionReasons\":[]},\"id\":\"vxqtayriwwroyqbe\",\"name\":\"rmcqiby\",\"type\":\"nojvknmefqsg\"}],\"totalCount\":488274582,\"nextLink\":\"apj\"}")
                .toObject(BillingSubscriptionsListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingSubscriptionsListResult model = new BillingSubscriptionsListResult();
        model = BinaryData.fromObject(model).toObject(BillingSubscriptionsListResult.class);
    }
}
