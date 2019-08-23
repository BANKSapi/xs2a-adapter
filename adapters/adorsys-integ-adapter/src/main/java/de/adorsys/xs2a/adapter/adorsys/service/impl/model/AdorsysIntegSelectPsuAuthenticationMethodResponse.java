package de.adorsys.xs2a.adapter.adorsys.service.impl.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.adorsys.xs2a.adapter.service.AuthenticationObject;
import de.adorsys.xs2a.adapter.service.ScaStatus;
import de.adorsys.xs2a.adapter.service.model.Link;

import java.util.Map;

public class AdorsysIntegSelectPsuAuthenticationMethodResponse {
    private ScaStatus scaStatus;
    private AuthenticationObject chosenScaMethod;
    private AdorsysIntegChallengeData challengeData;
    @JsonProperty("_links")
    private Map<String, Link> links;
    private String psuMessage;

    public ScaStatus getScaStatus() {
        return scaStatus;
    }

    public void setScaStatus(ScaStatus scaStatus) {
        this.scaStatus = scaStatus;
    }

    public AuthenticationObject getChosenScaMethod() {
        return chosenScaMethod;
    }

    public void setChosenScaMethod(AuthenticationObject chosenScaMethod) {
        this.chosenScaMethod = chosenScaMethod;
    }

    public AdorsysIntegChallengeData getChallengeData() {
        return challengeData;
    }

    public void setChallengeData(AdorsysIntegChallengeData challengeData) {
        this.challengeData = challengeData;
    }

    public Map<String, Link> getLinks() {
        return links;
    }

    public void setLinks(Map<String, Link> links) {
        this.links = links;
    }

    public String getPsuMessage() {
        return psuMessage;
    }

    public void setPsuMessage(String psuMessage) {
        this.psuMessage = psuMessage;
    }
}