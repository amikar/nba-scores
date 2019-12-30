
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
    "streams",
    "broadcasters"
})
public class National_ {

    @JsonProperty("streams")
    private List<Stream_> streams = null;
    @JsonProperty("broadcasters")
    private List<Object> broadcasters = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("streams")
    public List<Stream_> getStreams() {
        return streams;
    }

    @JsonProperty("streams")
    public void setStreams(List<Stream_> streams) {
        this.streams = streams;
    }

    @JsonProperty("broadcasters")
    public List<Object> getBroadcasters() {
        return broadcasters;
    }

    @JsonProperty("broadcasters")
    public void setBroadcasters(List<Object> broadcasters) {
        this.broadcasters = broadcasters;
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
