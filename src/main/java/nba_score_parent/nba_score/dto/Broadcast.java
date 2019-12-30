
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
    "broadcasters",
    "video",
    "audio"
})
public class Broadcast {

    @JsonProperty("broadcasters")
    private Broadcasters broadcasters;
    @JsonProperty("video")
    private Video video;
    @JsonProperty("audio")
    private Audio audio;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("broadcasters")
    public Broadcasters getBroadcasters() {
        return broadcasters;
    }

    @JsonProperty("broadcasters")
    public void setBroadcasters(Broadcasters broadcasters) {
        this.broadcasters = broadcasters;
    }

    @JsonProperty("video")
    public Video getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(Video video) {
        this.video = video;
    }

    @JsonProperty("audio")
    public Audio getAudio() {
        return audio;
    }

    @JsonProperty("audio")
    public void setAudio(Audio audio) {
        this.audio = audio;
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
