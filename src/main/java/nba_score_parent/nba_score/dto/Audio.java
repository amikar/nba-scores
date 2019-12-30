
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
    "national",
    "vTeam",
    "hTeam"
})
public class Audio {

    @JsonProperty("national")
    private National_ national;
    @JsonProperty("vTeam")
    private VTeam__ vTeam;
    @JsonProperty("hTeam")
    private HTeam__ hTeam;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("national")
    public National_ getNational() {
        return national;
    }

    @JsonProperty("national")
    public void setNational(National_ national) {
        this.national = national;
    }

    @JsonProperty("vTeam")
    public VTeam__ getVTeam() {
        return vTeam;
    }

    @JsonProperty("vTeam")
    public void setVTeam(VTeam__ vTeam) {
        this.vTeam = vTeam;
    }

    @JsonProperty("hTeam")
    public HTeam__ getHTeam() {
        return hTeam;
    }

    @JsonProperty("hTeam")
    public void setHTeam(HTeam__ hTeam) {
        this.hTeam = hTeam;
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
