
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
    "seasonStageId",
    "seasonYear",
    "leagueName",
    "gameId",
    "arena",
    "isGameActivated",
    "statusNum",
    "extendedStatusNum",
    "startTimeEastern",
    "startTimeUTC",
    "endTimeUTC",
    "startDateEastern",
    "homeStartDate",
    "homeStartTime",
    "visitorStartDate",
    "visitorStartTime",
    "gameUrlCode",
    "clock",
    "isBuzzerBeater",
    "isPreviewArticleAvail",
    "isRecapArticleAvail",
    "nugget",
    "attendance",
    "tickets",
    "hasGameBookPdf",
    "isStartTimeTBD",
    "gameDuration",
    "period",
    "vTeam",
    "hTeam",
    "watch"
})
public class Game {

    @JsonProperty("seasonStageId")
    private Integer seasonStageId;
    @JsonProperty("seasonYear")
    private String seasonYear;
    @JsonProperty("leagueName")
    private String leagueName;
    @JsonProperty("gameId")
    private String gameId;
    @JsonProperty("arena")
    private Arena arena;
    @JsonProperty("isGameActivated")
    private Boolean isGameActivated;
    @JsonProperty("statusNum")
    private Integer statusNum;
    @JsonProperty("extendedStatusNum")
    private Integer extendedStatusNum;
    @JsonProperty("startTimeEastern")
    private String startTimeEastern;
    @JsonProperty("startTimeUTC")
    private String startTimeUTC;
    @JsonProperty("endTimeUTC")
    private String endTimeUTC;
    @JsonProperty("startDateEastern")
    private String startDateEastern;
    @JsonProperty("homeStartDate")
    private String homeStartDate;
    @JsonProperty("homeStartTime")
    private String homeStartTime;
    @JsonProperty("visitorStartDate")
    private String visitorStartDate;
    @JsonProperty("visitorStartTime")
    private String visitorStartTime;
    @JsonProperty("gameUrlCode")
    private String gameUrlCode;
    @JsonProperty("clock")
    private String clock;
    @JsonProperty("isBuzzerBeater")
    private Boolean isBuzzerBeater;
    @JsonProperty("isPreviewArticleAvail")
    private Boolean isPreviewArticleAvail;
    @JsonProperty("isRecapArticleAvail")
    private Boolean isRecapArticleAvail;
    @JsonProperty("nugget")
    private Nugget nugget;
    @JsonProperty("attendance")
    private String attendance;
    @JsonProperty("tickets")
    private Tickets tickets;
    @JsonProperty("hasGameBookPdf")
    private Boolean hasGameBookPdf;
    @JsonProperty("isStartTimeTBD")
    private Boolean isStartTimeTBD;
    @JsonProperty("gameDuration")
    private GameDuration gameDuration;
    @JsonProperty("period")
    private Period period;
    @JsonProperty("vTeam")
    private VTeam vTeam;
    @JsonProperty("hTeam")
    private HTeam hTeam;
    @JsonProperty("watch")
    private Watch watch;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("seasonStageId")
    public Integer getSeasonStageId() {
        return seasonStageId;
    }

    @JsonProperty("seasonStageId")
    public void setSeasonStageId(Integer seasonStageId) {
        this.seasonStageId = seasonStageId;
    }

    @JsonProperty("seasonYear")
    public String getSeasonYear() {
        return seasonYear;
    }

    @JsonProperty("seasonYear")
    public void setSeasonYear(String seasonYear) {
        this.seasonYear = seasonYear;
    }

    @JsonProperty("leagueName")
    public String getLeagueName() {
        return leagueName;
    }

    @JsonProperty("leagueName")
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    @JsonProperty("gameId")
    public String getGameId() {
        return gameId;
    }

    @JsonProperty("gameId")
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    @JsonProperty("arena")
    public Arena getArena() {
        return arena;
    }

    @JsonProperty("arena")
    public void setArena(Arena arena) {
        this.arena = arena;
    }

    @JsonProperty("isGameActivated")
    public Boolean getIsGameActivated() {
        return isGameActivated;
    }

    @JsonProperty("isGameActivated")
    public void setIsGameActivated(Boolean isGameActivated) {
        this.isGameActivated = isGameActivated;
    }

    @JsonProperty("statusNum")
    public Integer getStatusNum() {
        return statusNum;
    }

    @JsonProperty("statusNum")
    public void setStatusNum(Integer statusNum) {
        this.statusNum = statusNum;
    }

    @JsonProperty("extendedStatusNum")
    public Integer getExtendedStatusNum() {
        return extendedStatusNum;
    }

    @JsonProperty("extendedStatusNum")
    public void setExtendedStatusNum(Integer extendedStatusNum) {
        this.extendedStatusNum = extendedStatusNum;
    }

    @JsonProperty("startTimeEastern")
    public String getStartTimeEastern() {
        return startTimeEastern;
    }

    @JsonProperty("startTimeEastern")
    public void setStartTimeEastern(String startTimeEastern) {
        this.startTimeEastern = startTimeEastern;
    }

    @JsonProperty("startTimeUTC")
    public String getStartTimeUTC() {
        return startTimeUTC;
    }

    @JsonProperty("startTimeUTC")
    public void setStartTimeUTC(String startTimeUTC) {
        this.startTimeUTC = startTimeUTC;
    }

    @JsonProperty("endTimeUTC")
    public String getEndTimeUTC() {
        return endTimeUTC;
    }

    @JsonProperty("endTimeUTC")
    public void setEndTimeUTC(String endTimeUTC) {
        this.endTimeUTC = endTimeUTC;
    }

    @JsonProperty("startDateEastern")
    public String getStartDateEastern() {
        return startDateEastern;
    }

    @JsonProperty("startDateEastern")
    public void setStartDateEastern(String startDateEastern) {
        this.startDateEastern = startDateEastern;
    }

    @JsonProperty("homeStartDate")
    public String getHomeStartDate() {
        return homeStartDate;
    }

    @JsonProperty("homeStartDate")
    public void setHomeStartDate(String homeStartDate) {
        this.homeStartDate = homeStartDate;
    }

    @JsonProperty("homeStartTime")
    public String getHomeStartTime() {
        return homeStartTime;
    }

    @JsonProperty("homeStartTime")
    public void setHomeStartTime(String homeStartTime) {
        this.homeStartTime = homeStartTime;
    }

    @JsonProperty("visitorStartDate")
    public String getVisitorStartDate() {
        return visitorStartDate;
    }

    @JsonProperty("visitorStartDate")
    public void setVisitorStartDate(String visitorStartDate) {
        this.visitorStartDate = visitorStartDate;
    }

    @JsonProperty("visitorStartTime")
    public String getVisitorStartTime() {
        return visitorStartTime;
    }

    @JsonProperty("visitorStartTime")
    public void setVisitorStartTime(String visitorStartTime) {
        this.visitorStartTime = visitorStartTime;
    }

    @JsonProperty("gameUrlCode")
    public String getGameUrlCode() {
        return gameUrlCode;
    }

    @JsonProperty("gameUrlCode")
    public void setGameUrlCode(String gameUrlCode) {
        this.gameUrlCode = gameUrlCode;
    }

    @JsonProperty("clock")
    public String getClock() {
        return clock;
    }

    @JsonProperty("clock")
    public void setClock(String clock) {
        this.clock = clock;
    }

    @JsonProperty("isBuzzerBeater")
    public Boolean getIsBuzzerBeater() {
        return isBuzzerBeater;
    }

    @JsonProperty("isBuzzerBeater")
    public void setIsBuzzerBeater(Boolean isBuzzerBeater) {
        this.isBuzzerBeater = isBuzzerBeater;
    }

    @JsonProperty("isPreviewArticleAvail")
    public Boolean getIsPreviewArticleAvail() {
        return isPreviewArticleAvail;
    }

    @JsonProperty("isPreviewArticleAvail")
    public void setIsPreviewArticleAvail(Boolean isPreviewArticleAvail) {
        this.isPreviewArticleAvail = isPreviewArticleAvail;
    }

    @JsonProperty("isRecapArticleAvail")
    public Boolean getIsRecapArticleAvail() {
        return isRecapArticleAvail;
    }

    @JsonProperty("isRecapArticleAvail")
    public void setIsRecapArticleAvail(Boolean isRecapArticleAvail) {
        this.isRecapArticleAvail = isRecapArticleAvail;
    }

    @JsonProperty("nugget")
    public Nugget getNugget() {
        return nugget;
    }

    @JsonProperty("nugget")
    public void setNugget(Nugget nugget) {
        this.nugget = nugget;
    }

    @JsonProperty("attendance")
    public String getAttendance() {
        return attendance;
    }

    @JsonProperty("attendance")
    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    @JsonProperty("tickets")
    public Tickets getTickets() {
        return tickets;
    }

    @JsonProperty("tickets")
    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    @JsonProperty("hasGameBookPdf")
    public Boolean getHasGameBookPdf() {
        return hasGameBookPdf;
    }

    @JsonProperty("hasGameBookPdf")
    public void setHasGameBookPdf(Boolean hasGameBookPdf) {
        this.hasGameBookPdf = hasGameBookPdf;
    }

    @JsonProperty("isStartTimeTBD")
    public Boolean getIsStartTimeTBD() {
        return isStartTimeTBD;
    }

    @JsonProperty("isStartTimeTBD")
    public void setIsStartTimeTBD(Boolean isStartTimeTBD) {
        this.isStartTimeTBD = isStartTimeTBD;
    }

    @JsonProperty("gameDuration")
    public GameDuration getGameDuration() {
        return gameDuration;
    }

    @JsonProperty("gameDuration")
    public void setGameDuration(GameDuration gameDuration) {
        this.gameDuration = gameDuration;
    }

    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    @JsonProperty("vTeam")
    public VTeam getVTeam() {
        return vTeam;
    }

    @JsonProperty("vTeam")
    public void setVTeam(VTeam vTeam) {
        this.vTeam = vTeam;
    }

    @JsonProperty("hTeam")
    public HTeam getHTeam() {
        return hTeam;
    }

    @JsonProperty("hTeam")
    public void setHTeam(HTeam hTeam) {
        this.hTeam = hTeam;
    }

    @JsonProperty("watch")
    public Watch getWatch() {
        return watch;
    }

    @JsonProperty("watch")
    public void setWatch(Watch watch) {
        this.watch = watch;
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
