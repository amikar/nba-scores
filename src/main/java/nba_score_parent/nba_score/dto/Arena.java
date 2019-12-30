
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
    "name",
    "isDomestic",
    "city",
    "stateAbbr",
    "country"
})
public class Arena {

    @JsonProperty("name")
    private String name;
    @JsonProperty("isDomestic")
    private Boolean isDomestic;
    @JsonProperty("city")
    private String city;
    @JsonProperty("stateAbbr")
    private String stateAbbr;
    @JsonProperty("country")
    private String country;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("isDomestic")
    public Boolean getIsDomestic() {
        return isDomestic;
    }

    @JsonProperty("isDomestic")
    public void setIsDomestic(Boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("stateAbbr")
    public String getStateAbbr() {
        return stateAbbr;
    }

    @JsonProperty("stateAbbr")
    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
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
