
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
    "streamType",
    "isOnAir",
    "doesArchiveExist",
    "isArchiveAvailToWatch",
    "streamId",
    "duration"
})
public class Stream {

    @JsonProperty("streamType")
    private String streamType;
    @JsonProperty("isOnAir")
    private Boolean isOnAir;
    @JsonProperty("doesArchiveExist")
    private Boolean doesArchiveExist;
    @JsonProperty("isArchiveAvailToWatch")
    private Boolean isArchiveAvailToWatch;
    @JsonProperty("streamId")
    private String streamId;
    @JsonProperty("duration")
    private Integer duration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("streamType")
    public String getStreamType() {
        return streamType;
    }

    @JsonProperty("streamType")
    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    @JsonProperty("isOnAir")
    public Boolean getIsOnAir() {
        return isOnAir;
    }

    @JsonProperty("isOnAir")
    public void setIsOnAir(Boolean isOnAir) {
        this.isOnAir = isOnAir;
    }

    @JsonProperty("doesArchiveExist")
    public Boolean getDoesArchiveExist() {
        return doesArchiveExist;
    }

    @JsonProperty("doesArchiveExist")
    public void setDoesArchiveExist(Boolean doesArchiveExist) {
        this.doesArchiveExist = doesArchiveExist;
    }

    @JsonProperty("isArchiveAvailToWatch")
    public Boolean getIsArchiveAvailToWatch() {
        return isArchiveAvailToWatch;
    }

    @JsonProperty("isArchiveAvailToWatch")
    public void setIsArchiveAvailToWatch(Boolean isArchiveAvailToWatch) {
        this.isArchiveAvailToWatch = isArchiveAvailToWatch;
    }

    @JsonProperty("streamId")
    public String getStreamId() {
        return streamId;
    }

    @JsonProperty("streamId")
    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
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
