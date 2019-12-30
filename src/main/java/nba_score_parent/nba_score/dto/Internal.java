
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
    "pubDateTime",
    "igorPath",
    "routeName",
    "routeValue",
    "xslt",
    "xsltForceRecompile",
    "xsltInCache",
    "xsltCompileTimeMillis",
    "xsltTransformTimeMillis",
    "consolidatedDomKey",
    "endToEndTimeMillis"
})
public class Internal {

    @JsonProperty("pubDateTime")
    private String pubDateTime;
    @JsonProperty("igorPath")
    private String igorPath;
    @JsonProperty("routeName")
    private String routeName;
    @JsonProperty("routeValue")
    private String routeValue;
    @JsonProperty("xslt")
    private String xslt;
    @JsonProperty("xsltForceRecompile")
    private String xsltForceRecompile;
    @JsonProperty("xsltInCache")
    private String xsltInCache;
    @JsonProperty("xsltCompileTimeMillis")
    private String xsltCompileTimeMillis;
    @JsonProperty("xsltTransformTimeMillis")
    private String xsltTransformTimeMillis;
    @JsonProperty("consolidatedDomKey")
    private String consolidatedDomKey;
    @JsonProperty("endToEndTimeMillis")
    private String endToEndTimeMillis;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pubDateTime")
    public String getPubDateTime() {
        return pubDateTime;
    }

    @JsonProperty("pubDateTime")
    public void setPubDateTime(String pubDateTime) {
        this.pubDateTime = pubDateTime;
    }

    @JsonProperty("igorPath")
    public String getIgorPath() {
        return igorPath;
    }

    @JsonProperty("igorPath")
    public void setIgorPath(String igorPath) {
        this.igorPath = igorPath;
    }

    @JsonProperty("routeName")
    public String getRouteName() {
        return routeName;
    }

    @JsonProperty("routeName")
    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    @JsonProperty("routeValue")
    public String getRouteValue() {
        return routeValue;
    }

    @JsonProperty("routeValue")
    public void setRouteValue(String routeValue) {
        this.routeValue = routeValue;
    }

    @JsonProperty("xslt")
    public String getXslt() {
        return xslt;
    }

    @JsonProperty("xslt")
    public void setXslt(String xslt) {
        this.xslt = xslt;
    }

    @JsonProperty("xsltForceRecompile")
    public String getXsltForceRecompile() {
        return xsltForceRecompile;
    }

    @JsonProperty("xsltForceRecompile")
    public void setXsltForceRecompile(String xsltForceRecompile) {
        this.xsltForceRecompile = xsltForceRecompile;
    }

    @JsonProperty("xsltInCache")
    public String getXsltInCache() {
        return xsltInCache;
    }

    @JsonProperty("xsltInCache")
    public void setXsltInCache(String xsltInCache) {
        this.xsltInCache = xsltInCache;
    }

    @JsonProperty("xsltCompileTimeMillis")
    public String getXsltCompileTimeMillis() {
        return xsltCompileTimeMillis;
    }

    @JsonProperty("xsltCompileTimeMillis")
    public void setXsltCompileTimeMillis(String xsltCompileTimeMillis) {
        this.xsltCompileTimeMillis = xsltCompileTimeMillis;
    }

    @JsonProperty("xsltTransformTimeMillis")
    public String getXsltTransformTimeMillis() {
        return xsltTransformTimeMillis;
    }

    @JsonProperty("xsltTransformTimeMillis")
    public void setXsltTransformTimeMillis(String xsltTransformTimeMillis) {
        this.xsltTransformTimeMillis = xsltTransformTimeMillis;
    }

    @JsonProperty("consolidatedDomKey")
    public String getConsolidatedDomKey() {
        return consolidatedDomKey;
    }

    @JsonProperty("consolidatedDomKey")
    public void setConsolidatedDomKey(String consolidatedDomKey) {
        this.consolidatedDomKey = consolidatedDomKey;
    }

    @JsonProperty("endToEndTimeMillis")
    public String getEndToEndTimeMillis() {
        return endToEndTimeMillis;
    }

    @JsonProperty("endToEndTimeMillis")
    public void setEndToEndTimeMillis(String endToEndTimeMillis) {
        this.endToEndTimeMillis = endToEndTimeMillis;
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
