// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The HostCore model.
 */
@Immutable
public final class HostCore {

    /*
     * The host property.
     */
    @Generated
    @JsonProperty(value = "host")
    private String host;

    /*
     * The domain property.
     */
    @Generated
    @JsonProperty(value = "domain")
    private String domain;

    /*
     * The firstSeen property.
     */
    @Generated
    @JsonProperty(value = "firstSeen")
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    @JsonProperty(value = "lastSeen")
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    @JsonProperty(value = "count")
    private Long count;

    /*
     * The blacklistCauseFirstSeen property.
     */
    @Generated
    @JsonProperty(value = "blacklistCauseFirstSeen")
    private OffsetDateTime blacklistCauseFirstSeen;

    /*
     * The blacklistCauseLastSeen property.
     */
    @Generated
    @JsonProperty(value = "blacklistCauseLastSeen")
    private OffsetDateTime blacklistCauseLastSeen;

    /*
     * The blacklistCauseCount property.
     */
    @Generated
    @JsonProperty(value = "blacklistCauseCount")
    private Long blacklistCauseCount;

    /*
     * The blacklistResourceFirstSeen property.
     */
    @Generated
    @JsonProperty(value = "blacklistResourceFirstSeen")
    private OffsetDateTime blacklistResourceFirstSeen;

    /*
     * The blacklistResourceLastSeen property.
     */
    @Generated
    @JsonProperty(value = "blacklistResourceLastSeen")
    private OffsetDateTime blacklistResourceLastSeen;

    /*
     * The blacklistResourceCount property.
     */
    @Generated
    @JsonProperty(value = "blacklistResourceCount")
    private Long blacklistResourceCount;

    /*
     * The blacklistSequenceFirstSeen property.
     */
    @Generated
    @JsonProperty(value = "blacklistSequenceFirstSeen")
    private OffsetDateTime blacklistSequenceFirstSeen;

    /*
     * The blacklistSequenceLastSeen property.
     */
    @Generated
    @JsonProperty(value = "blacklistSequenceLastSeen")
    private OffsetDateTime blacklistSequenceLastSeen;

    /*
     * The blacklistSequenceCount property.
     */
    @Generated
    @JsonProperty(value = "blacklistSequenceCount")
    private Long blacklistSequenceCount;

    /*
     * The phishCauseCount property.
     */
    @Generated
    @JsonProperty(value = "phishCauseCount")
    private Long phishCauseCount;

    /*
     * The malwareCauseCount property.
     */
    @Generated
    @JsonProperty(value = "malwareCauseCount")
    private Long malwareCauseCount;

    /*
     * The spamCauseCount property.
     */
    @Generated
    @JsonProperty(value = "spamCauseCount")
    private Long spamCauseCount;

    /*
     * The scamCauseCount property.
     */
    @Generated
    @JsonProperty(value = "scamCauseCount")
    private Long scamCauseCount;

    /*
     * The phishResourceCount property.
     */
    @Generated
    @JsonProperty(value = "phishResourceCount")
    private Long phishResourceCount;

    /*
     * The malwareResourceCount property.
     */
    @Generated
    @JsonProperty(value = "malwareResourceCount")
    private Long malwareResourceCount;

    /*
     * The spamResourceCount property.
     */
    @Generated
    @JsonProperty(value = "spamResourceCount")
    private Long spamResourceCount;

    /*
     * The scamResourceCount property.
     */
    @Generated
    @JsonProperty(value = "scamResourceCount")
    private Long scamResourceCount;

    /*
     * The phishSequenceCount property.
     */
    @Generated
    @JsonProperty(value = "phishSequenceCount")
    private Long phishSequenceCount;

    /*
     * The malwareSequenceCount property.
     */
    @Generated
    @JsonProperty(value = "malwareSequenceCount")
    private Long malwareSequenceCount;

    /*
     * The spamSequenceCount property.
     */
    @Generated
    @JsonProperty(value = "spamSequenceCount")
    private Long spamSequenceCount;

    /*
     * The scamSequenceCount property.
     */
    @Generated
    @JsonProperty(value = "scamSequenceCount")
    private Long scamSequenceCount;

    /*
     * The alexaRank property.
     */
    @Generated
    @JsonProperty(value = "alexaRank")
    private Integer alexaRank;

    /*
     * The hostReputationScore property.
     */
    @Generated
    @JsonProperty(value = "hostReputationScore")
    private Integer hostReputationScore;

    /*
     * The hostPhishReputationScore property.
     */
    @Generated
    @JsonProperty(value = "hostPhishReputationScore")
    private Integer hostPhishReputationScore;

    /*
     * The hostMalwareReputationScore property.
     */
    @Generated
    @JsonProperty(value = "hostMalwareReputationScore")
    private Integer hostMalwareReputationScore;

    /*
     * The hostSpamReputationScore property.
     */
    @Generated
    @JsonProperty(value = "hostSpamReputationScore")
    private Integer hostSpamReputationScore;

    /*
     * The hostScamReputationScore property.
     */
    @Generated
    @JsonProperty(value = "hostScamReputationScore")
    private Integer hostScamReputationScore;

    /*
     * The domainReputationScore property.
     */
    @Generated
    @JsonProperty(value = "domainReputationScore")
    private Integer domainReputationScore;

    /*
     * The domainPhishReputationScore property.
     */
    @Generated
    @JsonProperty(value = "domainPhishReputationScore")
    private Integer domainPhishReputationScore;

    /*
     * The domainMalwareReputationScore property.
     */
    @Generated
    @JsonProperty(value = "domainMalwareReputationScore")
    private Integer domainMalwareReputationScore;

    /*
     * The domainSpamReputationScore property.
     */
    @Generated
    @JsonProperty(value = "domainSpamReputationScore")
    private Integer domainSpamReputationScore;

    /*
     * The domainScamReputationScore property.
     */
    @Generated
    @JsonProperty(value = "domainScamReputationScore")
    private Integer domainScamReputationScore;

    /*
     * The uuid property.
     */
    @Generated
    @JsonProperty(value = "uuid")
    private String uuid;

    /**
     * Creates an instance of HostCore class.
     */
    @Generated
    private HostCore() {
    }

    /**
     * Get the host property: The host property.
     *
     * @return the host value.
     */
    @Generated
    public String getHost() {
        return this.host;
    }

    /**
     * Get the domain property: The domain property.
     *
     * @return the domain value.
     */
    @Generated
    public String getDomain() {
        return this.domain;
    }

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the blacklistCauseFirstSeen property: The blacklistCauseFirstSeen property.
     *
     * @return the blacklistCauseFirstSeen value.
     */
    @Generated
    public OffsetDateTime getBlacklistCauseFirstSeen() {
        return this.blacklistCauseFirstSeen;
    }

    /**
     * Get the blacklistCauseLastSeen property: The blacklistCauseLastSeen property.
     *
     * @return the blacklistCauseLastSeen value.
     */
    @Generated
    public OffsetDateTime getBlacklistCauseLastSeen() {
        return this.blacklistCauseLastSeen;
    }

    /**
     * Get the blacklistCauseCount property: The blacklistCauseCount property.
     *
     * @return the blacklistCauseCount value.
     */
    @Generated
    public Long getBlacklistCauseCount() {
        return this.blacklistCauseCount;
    }

    /**
     * Get the blacklistResourceFirstSeen property: The blacklistResourceFirstSeen property.
     *
     * @return the blacklistResourceFirstSeen value.
     */
    @Generated
    public OffsetDateTime getBlacklistResourceFirstSeen() {
        return this.blacklistResourceFirstSeen;
    }

    /**
     * Get the blacklistResourceLastSeen property: The blacklistResourceLastSeen property.
     *
     * @return the blacklistResourceLastSeen value.
     */
    @Generated
    public OffsetDateTime getBlacklistResourceLastSeen() {
        return this.blacklistResourceLastSeen;
    }

    /**
     * Get the blacklistResourceCount property: The blacklistResourceCount property.
     *
     * @return the blacklistResourceCount value.
     */
    @Generated
    public Long getBlacklistResourceCount() {
        return this.blacklistResourceCount;
    }

    /**
     * Get the blacklistSequenceFirstSeen property: The blacklistSequenceFirstSeen property.
     *
     * @return the blacklistSequenceFirstSeen value.
     */
    @Generated
    public OffsetDateTime getBlacklistSequenceFirstSeen() {
        return this.blacklistSequenceFirstSeen;
    }

    /**
     * Get the blacklistSequenceLastSeen property: The blacklistSequenceLastSeen property.
     *
     * @return the blacklistSequenceLastSeen value.
     */
    @Generated
    public OffsetDateTime getBlacklistSequenceLastSeen() {
        return this.blacklistSequenceLastSeen;
    }

    /**
     * Get the blacklistSequenceCount property: The blacklistSequenceCount property.
     *
     * @return the blacklistSequenceCount value.
     */
    @Generated
    public Long getBlacklistSequenceCount() {
        return this.blacklistSequenceCount;
    }

    /**
     * Get the phishCauseCount property: The phishCauseCount property.
     *
     * @return the phishCauseCount value.
     */
    @Generated
    public Long getPhishCauseCount() {
        return this.phishCauseCount;
    }

    /**
     * Get the malwareCauseCount property: The malwareCauseCount property.
     *
     * @return the malwareCauseCount value.
     */
    @Generated
    public Long getMalwareCauseCount() {
        return this.malwareCauseCount;
    }

    /**
     * Get the spamCauseCount property: The spamCauseCount property.
     *
     * @return the spamCauseCount value.
     */
    @Generated
    public Long getSpamCauseCount() {
        return this.spamCauseCount;
    }

    /**
     * Get the scamCauseCount property: The scamCauseCount property.
     *
     * @return the scamCauseCount value.
     */
    @Generated
    public Long getScamCauseCount() {
        return this.scamCauseCount;
    }

    /**
     * Get the phishResourceCount property: The phishResourceCount property.
     *
     * @return the phishResourceCount value.
     */
    @Generated
    public Long getPhishResourceCount() {
        return this.phishResourceCount;
    }

    /**
     * Get the malwareResourceCount property: The malwareResourceCount property.
     *
     * @return the malwareResourceCount value.
     */
    @Generated
    public Long getMalwareResourceCount() {
        return this.malwareResourceCount;
    }

    /**
     * Get the spamResourceCount property: The spamResourceCount property.
     *
     * @return the spamResourceCount value.
     */
    @Generated
    public Long getSpamResourceCount() {
        return this.spamResourceCount;
    }

    /**
     * Get the scamResourceCount property: The scamResourceCount property.
     *
     * @return the scamResourceCount value.
     */
    @Generated
    public Long getScamResourceCount() {
        return this.scamResourceCount;
    }

    /**
     * Get the phishSequenceCount property: The phishSequenceCount property.
     *
     * @return the phishSequenceCount value.
     */
    @Generated
    public Long getPhishSequenceCount() {
        return this.phishSequenceCount;
    }

    /**
     * Get the malwareSequenceCount property: The malwareSequenceCount property.
     *
     * @return the malwareSequenceCount value.
     */
    @Generated
    public Long getMalwareSequenceCount() {
        return this.malwareSequenceCount;
    }

    /**
     * Get the spamSequenceCount property: The spamSequenceCount property.
     *
     * @return the spamSequenceCount value.
     */
    @Generated
    public Long getSpamSequenceCount() {
        return this.spamSequenceCount;
    }

    /**
     * Get the scamSequenceCount property: The scamSequenceCount property.
     *
     * @return the scamSequenceCount value.
     */
    @Generated
    public Long getScamSequenceCount() {
        return this.scamSequenceCount;
    }

    /**
     * Get the alexaRank property: The alexaRank property.
     *
     * @return the alexaRank value.
     */
    @Generated
    public Integer getAlexaRank() {
        return this.alexaRank;
    }

    /**
     * Get the hostReputationScore property: The hostReputationScore property.
     *
     * @return the hostReputationScore value.
     */
    @Generated
    public Integer getHostReputationScore() {
        return this.hostReputationScore;
    }

    /**
     * Get the hostPhishReputationScore property: The hostPhishReputationScore property.
     *
     * @return the hostPhishReputationScore value.
     */
    @Generated
    public Integer getHostPhishReputationScore() {
        return this.hostPhishReputationScore;
    }

    /**
     * Get the hostMalwareReputationScore property: The hostMalwareReputationScore property.
     *
     * @return the hostMalwareReputationScore value.
     */
    @Generated
    public Integer getHostMalwareReputationScore() {
        return this.hostMalwareReputationScore;
    }

    /**
     * Get the hostSpamReputationScore property: The hostSpamReputationScore property.
     *
     * @return the hostSpamReputationScore value.
     */
    @Generated
    public Integer getHostSpamReputationScore() {
        return this.hostSpamReputationScore;
    }

    /**
     * Get the hostScamReputationScore property: The hostScamReputationScore property.
     *
     * @return the hostScamReputationScore value.
     */
    @Generated
    public Integer getHostScamReputationScore() {
        return this.hostScamReputationScore;
    }

    /**
     * Get the domainReputationScore property: The domainReputationScore property.
     *
     * @return the domainReputationScore value.
     */
    @Generated
    public Integer getDomainReputationScore() {
        return this.domainReputationScore;
    }

    /**
     * Get the domainPhishReputationScore property: The domainPhishReputationScore property.
     *
     * @return the domainPhishReputationScore value.
     */
    @Generated
    public Integer getDomainPhishReputationScore() {
        return this.domainPhishReputationScore;
    }

    /**
     * Get the domainMalwareReputationScore property: The domainMalwareReputationScore property.
     *
     * @return the domainMalwareReputationScore value.
     */
    @Generated
    public Integer getDomainMalwareReputationScore() {
        return this.domainMalwareReputationScore;
    }

    /**
     * Get the domainSpamReputationScore property: The domainSpamReputationScore property.
     *
     * @return the domainSpamReputationScore value.
     */
    @Generated
    public Integer getDomainSpamReputationScore() {
        return this.domainSpamReputationScore;
    }

    /**
     * Get the domainScamReputationScore property: The domainScamReputationScore property.
     *
     * @return the domainScamReputationScore value.
     */
    @Generated
    public Integer getDomainScamReputationScore() {
        return this.domainScamReputationScore;
    }

    /**
     * Get the uuid property: The uuid property.
     *
     * @return the uuid value.
     */
    @Generated
    public String getUuid() {
        return this.uuid;
    }
}
