package com.dome.covid.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    @JsonProperty("Confirmed")
    private int confirmed;
    @JsonProperty("Recovered")
    private int recovered;
    @JsonProperty("Hospitalized")
    private int hospitalized;
    @JsonProperty("Deaths")
    private int deaths;
    @JsonProperty("NewConfirmed")
    private int newconfirmed;
    @JsonProperty("NewRecovered")
    private int newrecovered;
    @JsonProperty("NewHospitalized")
    private int newhospitalized;
    @JsonProperty("NewDeaths")
    private int newdeaths;
    @JsonProperty("UpdateDate")
    private String updatedate;
    @JsonProperty("Source")
    private String source;
    @JsonProperty("DevBy")
    private String devby;
    @JsonProperty("SeverBy")
    private String severby;

    @Override
    public String toString() {
        return "Data{" +
                "confirmed=" + confirmed +
                ", recovered=" + recovered +
                ", hospitalized=" + hospitalized +
                ", deaths=" + deaths +
                ", newconfirmed=" + newconfirmed +
                ", newrecovered=" + newrecovered +
                ", newhospitalized=" + newhospitalized +
                ", newdeaths=" + newdeaths +
                ", updatedate='" + updatedate + '\'' +
                ", source='" + source + '\'' +
                ", devby='" + devby + '\'' +
                ", severby='" + severby + '\'' +
                '}';
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getHospitalized() {
        return hospitalized;
    }

    public void setHospitalized(int hospitalized) {
        this.hospitalized = hospitalized;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getNewconfirmed() {
        return newconfirmed;
    }

    public void setNewconfirmed(int newconfirmed) {
        this.newconfirmed = newconfirmed;
    }

    public int getNewrecovered() {
        return newrecovered;
    }

    public void setNewrecovered(int newrecovered) {
        this.newrecovered = newrecovered;
    }

    public int getNewhospitalized() {
        return newhospitalized;
    }

    public void setNewhospitalized(int newhospitalized) {
        this.newhospitalized = newhospitalized;
    }

    public int getNewdeaths() {
        return newdeaths;
    }

    public void setNewdeaths(int newdeaths) {
        this.newdeaths = newdeaths;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDevby() {
        return devby;
    }

    public void setDevby(String devby) {
        this.devby = devby;
    }

    public String getSeverby() {
        return severby;
    }

    public void setSeverby(String severby) {
        this.severby = severby;
    }
}
