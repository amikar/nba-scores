
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
    "teamId",
    "triCode",
    "win",
    "loss",
    "seriesWin",
    "seriesLoss",
    "score",
    "linescore"
})
public class HTeam {

    @JsonProperty("teamId")
    private String teamId;
    @JsonProperty("triCode")
    private String triCode;
    @JsonProperty("win")
    private String win;
    @JsonProperty("loss")
    private String loss;
    @JsonProperty("seriesWin")
    private String seriesWin;
    @JsonProperty("seriesLoss")
    private String seriesLoss;
    @JsonProperty("score")
    private String score;
    @JsonProperty("linescore")
    private List<Linescore_> linescore = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("teamId")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("teamId")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("triCode")
    public String getTriCode() {
        return triCode;
    }

    @JsonProperty("triCode")
    public void setTriCode(String triCode) {
        this.triCode = triCode;
    }

    @JsonProperty("win")
    public String getWin() {
        return win;
    }

    @JsonProperty("win")
    public void setWin(String win) {
        this.win = win;
    }

    @JsonProperty("loss")
    public String getLoss() {
        return loss;
    }

    @JsonProperty("loss")
    public void setLoss(String loss) {
        this.loss = loss;
    }

    @JsonProperty("seriesWin")
    public String getSeriesWin() {
        return seriesWin;
    }

    @JsonProperty("seriesWin")
    public void setSeriesWin(String seriesWin) {
        this.seriesWin = seriesWin;
    }

    @JsonProperty("seriesLoss")
    public String getSeriesLoss() {
        return seriesLoss;
    }

    @JsonProperty("seriesLoss")
    public void setSeriesLoss(String seriesLoss) {
        this.seriesLoss = seriesLoss;
    }

    @JsonProperty("score")
    public String getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(String score) {
        this.score = score;
    }

    @JsonProperty("linescore")
    public List<Linescore_> getLinescore() {
        return linescore;
    }

    @JsonProperty("linescore")
    public void setLinescore(List<Linescore_> linescore) {
        this.linescore = linescore;
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
