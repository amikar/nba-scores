
package nba_score_parent.nba_score.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "regionalBlackoutCodes",
    "canPurchase",
    "isLeaguePass",
    "isNationalBlackout",
    "isTNTOT",
    "isVR",
    "tntotIsOnAir",
    "isNextVR",
    "isNBAOnTNTVR",
    "isMagicLeap",
    "isOculusVenues",
    "streams",
    "deepLink"
})
public class Video {

    @JsonProperty("regionalBlackoutCodes")
    private String regionalBlackoutCodes;
    @JsonProperty("canPurchase")
    private Boolean canPurchase;
    @JsonProperty("isLeaguePass")
    private Boolean isLeaguePass;
    @JsonProperty("isNationalBlackout")
    private Boolean isNationalBlackout;
    @JsonProperty("isTNTOT")
    private Boolean isTNTOT;
    @JsonProperty("isVR")
    private Boolean isVR;
    @JsonProperty("tntotIsOnAir")
    private Boolean tntotIsOnAir;
    @JsonProperty("isNextVR")
    private Boolean isNextVR;
    @JsonProperty("isNBAOnTNTVR")
    private Boolean isNBAOnTNTVR;
    @JsonProperty("isMagicLeap")
    private Boolean isMagicLeap;
    @JsonProperty("isOculusVenues")
    private Boolean isOculusVenues;
    @JsonProperty("streams")
    private List<Stream> streams = null;
    @JsonProperty("deepLink")
    private List<DeepLink> deepLink = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("regionalBlackoutCodes")
    public String getRegionalBlackoutCodes() {
        return regionalBlackoutCodes;
    }

    @JsonProperty("regionalBlackoutCodes")
    public void setRegionalBlackoutCodes(String regionalBlackoutCodes) {
        this.regionalBlackoutCodes = regionalBlackoutCodes;
    }

    @JsonProperty("canPurchase")
    public Boolean getCanPurchase() {
        return canPurchase;
    }

    @JsonProperty("canPurchase")
    public void setCanPurchase(Boolean canPurchase) {
        this.canPurchase = canPurchase;
    }

    @JsonProperty("isLeaguePass")
    public Boolean getIsLeaguePass() {
        return isLeaguePass;
    }

    @JsonProperty("isLeaguePass")
    public void setIsLeaguePass(Boolean isLeaguePass) {
        this.isLeaguePass = isLeaguePass;
    }

    @JsonProperty("isNationalBlackout")
    public Boolean getIsNationalBlackout() {
        return isNationalBlackout;
    }

    @JsonProperty("isNationalBlackout")
    public void setIsNationalBlackout(Boolean isNationalBlackout) {
        this.isNationalBlackout = isNationalBlackout;
    }

    @JsonProperty("isTNTOT")
    public Boolean getIsTNTOT() {
        return isTNTOT;
    }

    @JsonProperty("isTNTOT")
    public void setIsTNTOT(Boolean isTNTOT) {
        this.isTNTOT = isTNTOT;
    }

    @JsonProperty("isVR")
    public Boolean getIsVR() {
        return isVR;
    }

    @JsonProperty("isVR")
    public void setIsVR(Boolean isVR) {
        this.isVR = isVR;
    }

    @JsonProperty("tntotIsOnAir")
    public Boolean getTntotIsOnAir() {
        return tntotIsOnAir;
    }

    @JsonProperty("tntotIsOnAir")
    public void setTntotIsOnAir(Boolean tntotIsOnAir) {
        this.tntotIsOnAir = tntotIsOnAir;
    }

    @JsonProperty("isNextVR")
    public Boolean getIsNextVR() {
        return isNextVR;
    }

    @JsonProperty("isNextVR")
    public void setIsNextVR(Boolean isNextVR) {
        this.isNextVR = isNextVR;
    }

    @JsonProperty("isNBAOnTNTVR")
    public Boolean getIsNBAOnTNTVR() {
        return isNBAOnTNTVR;
    }

    @JsonProperty("isNBAOnTNTVR")
    public void setIsNBAOnTNTVR(Boolean isNBAOnTNTVR) {
        this.isNBAOnTNTVR = isNBAOnTNTVR;
    }

    @JsonProperty("isMagicLeap")
    public Boolean getIsMagicLeap() {
        return isMagicLeap;
    }

    @JsonProperty("isMagicLeap")
    public void setIsMagicLeap(Boolean isMagicLeap) {
        this.isMagicLeap = isMagicLeap;
    }

    @JsonProperty("isOculusVenues")
    public Boolean getIsOculusVenues() {
        return isOculusVenues;
    }

    @JsonProperty("isOculusVenues")
    public void setIsOculusVenues(Boolean isOculusVenues) {
        this.isOculusVenues = isOculusVenues;
    }

    @JsonProperty("streams")
    public List<Stream> getStreams() {
        return streams;
    }

    @JsonProperty("streams")
    public void setStreams(List<Stream> streams) {
        this.streams = streams;
    }

    @JsonProperty("deepLink")
    public List<DeepLink> getDeepLink() {
        return deepLink;
    }

    @JsonProperty("deepLink")
    public void setDeepLink(List<DeepLink> deepLink) {
        this.deepLink = deepLink;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
