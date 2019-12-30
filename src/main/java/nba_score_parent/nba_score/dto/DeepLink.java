
package nba_score_parent.nba_score.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "broadcaster",
    "regionalMarketCodes",
    "iosApp",
    "androidApp",
    "desktopWeb",
    "mobileWeb"
})
public class DeepLink {

    @JsonProperty("broadcaster")
    private String broadcaster;
    @JsonProperty("regionalMarketCodes")
    private String regionalMarketCodes;
    @JsonProperty("iosApp")
    private String iosApp;
    @JsonProperty("androidApp")
    private String androidApp;
    @JsonProperty("desktopWeb")
    private String desktopWeb;
    @JsonProperty("mobileWeb")
    private String mobileWeb;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("broadcaster")
    public String getBroadcaster() {
        return broadcaster;
    }

    @JsonProperty("broadcaster")
    public void setBroadcaster(String broadcaster) {
        this.broadcaster = broadcaster;
    }

    @JsonProperty("regionalMarketCodes")
    public String getRegionalMarketCodes() {
        return regionalMarketCodes;
    }

    @JsonProperty("regionalMarketCodes")
    public void setRegionalMarketCodes(String regionalMarketCodes) {
        this.regionalMarketCodes = regionalMarketCodes;
    }

    @JsonProperty("iosApp")
    public String getIosApp() {
        return iosApp;
    }

    @JsonProperty("iosApp")
    public void setIosApp(String iosApp) {
        this.iosApp = iosApp;
    }

    @JsonProperty("androidApp")
    public String getAndroidApp() {
        return androidApp;
    }

    @JsonProperty("androidApp")
    public void setAndroidApp(String androidApp) {
        this.androidApp = androidApp;
    }

    @JsonProperty("desktopWeb")
    public String getDesktopWeb() {
        return desktopWeb;
    }

    @JsonProperty("desktopWeb")
    public void setDesktopWeb(String desktopWeb) {
        this.desktopWeb = desktopWeb;
    }

    @JsonProperty("mobileWeb")
    public String getMobileWeb() {
        return mobileWeb;
    }

    @JsonProperty("mobileWeb")
    public void setMobileWeb(String mobileWeb) {
        this.mobileWeb = mobileWeb;
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
