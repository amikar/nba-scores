
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
    "language",
    "isOnAir",
    "streamId"
})
public class Stream___ {

    @JsonProperty("language")
    private String language;
    @JsonProperty("isOnAir")
    private Boolean isOnAir;
    @JsonProperty("streamId")
    private String streamId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("isOnAir")
    public Boolean getIsOnAir() {
        return isOnAir;
    }

    @JsonProperty("isOnAir")
    public void setIsOnAir(Boolean isOnAir) {
        this.isOnAir = isOnAir;
    }

    @JsonProperty("streamId")
    public String getStreamId() {
        return streamId;
    }

    @JsonProperty("streamId")
    public void setStreamId(String streamId) {
        this.streamId = streamId;
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
