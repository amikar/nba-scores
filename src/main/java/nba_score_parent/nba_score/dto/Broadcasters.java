
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
    "national",
    "canadian",
    "vTeam",
    "hTeam",
    "spanish_hTeam",
    "spanish_vTeam",
    "spanish_national"
})
public class Broadcasters {

    @JsonProperty("national")
    private List<National> national = null;
    @JsonProperty("canadian")
    private List<Canadian> canadian = null;
    @JsonProperty("vTeam")
    private List<VTeam_> vTeam = null;
    @JsonProperty("hTeam")
    private List<HTeam_> hTeam = null;
    @JsonProperty("spanish_hTeam")
    private List<Object> spanishHTeam = null;
    @JsonProperty("spanish_vTeam")
    private List<Object> spanishVTeam = null;
    @JsonProperty("spanish_national")
    private List<Object> spanishNational = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("national")
    public List<National> getNational() {
        return national;
    }

    @JsonProperty("national")
    public void setNational(List<National> national) {
        this.national = national;
    }

    @JsonProperty("canadian")
    public List<Canadian> getCanadian() {
        return canadian;
    }

    @JsonProperty("canadian")
    public void setCanadian(List<Canadian> canadian) {
        this.canadian = canadian;
    }

    @JsonProperty("vTeam")
    public List<VTeam_> getVTeam() {
        return vTeam;
    }

    @JsonProperty("vTeam")
    public void setVTeam(List<VTeam_> vTeam) {
        this.vTeam = vTeam;
    }

    @JsonProperty("hTeam")
    public List<HTeam_> getHTeam() {
        return hTeam;
    }

    @JsonProperty("hTeam")
    public void setHTeam(List<HTeam_> hTeam) {
        this.hTeam = hTeam;
    }

    @JsonProperty("spanish_hTeam")
    public List<Object> getSpanishHTeam() {
        return spanishHTeam;
    }

    @JsonProperty("spanish_hTeam")
    public void setSpanishHTeam(List<Object> spanishHTeam) {
        this.spanishHTeam = spanishHTeam;
    }

    @JsonProperty("spanish_vTeam")
    public List<Object> getSpanishVTeam() {
        return spanishVTeam;
    }

    @JsonProperty("spanish_vTeam")
    public void setSpanishVTeam(List<Object> spanishVTeam) {
        this.spanishVTeam = spanishVTeam;
    }

    @JsonProperty("spanish_national")
    public List<Object> getSpanishNational() {
        return spanishNational;
    }

    @JsonProperty("spanish_national")
    public void setSpanishNational(List<Object> spanishNational) {
        this.spanishNational = spanishNational;
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
