
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
    "mobileApp",
    "desktopWeb",
    "mobileWeb",
    "leagGameInfo",
    "leagTix"
})
public class Tickets {

    @JsonProperty("mobileApp")
    private String mobileApp;
    @JsonProperty("desktopWeb")
    private String desktopWeb;
    @JsonProperty("mobileWeb")
    private String mobileWeb;
    @JsonProperty("leagGameInfo")
    private String leagGameInfo;
    @JsonProperty("leagTix")
    private String leagTix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mobileApp")
    public String getMobileApp() {
        return mobileApp;
    }

    @JsonProperty("mobileApp")
    public void setMobileApp(String mobileApp) {
        this.mobileApp = mobileApp;
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

    @JsonProperty("leagGameInfo")
    public String getLeagGameInfo() {
        return leagGameInfo;
    }

    @JsonProperty("leagGameInfo")
    public void setLeagGameInfo(String leagGameInfo) {
        this.leagGameInfo = leagGameInfo;
    }

    @JsonProperty("leagTix")
    public String getLeagTix() {
        return leagTix;
    }

    @JsonProperty("leagTix")
    public void setLeagTix(String leagTix) {
        this.leagTix = leagTix;
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
