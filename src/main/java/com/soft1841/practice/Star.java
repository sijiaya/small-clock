package com.soft1841.practice;

public class Star {
    private String players;
    private String nickname;
    private Double score;
    private Double rebounds;
    private Double assists;

    public Star(){
    }


    public Star(String players, String nickname, Double score, Double rebounds, Double assists) {
        this.players = players;
        this.nickname = nickname;
        this.score = score;
        this.rebounds = rebounds;
        this.assists = assists;
    }

    public String getPlayers() {
        return players;
    }

    public String getNickname() {
        return nickname;
    }

    public Double getScore() {
        return score;
    }

    public Double getRebounds() {
        return rebounds;
    }

    public Double getAssists() {
        return assists;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setRebounds(Double rebounds) {
        this.rebounds = rebounds;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    @Override
    public String toString() {
        return "Star{" +
                "players='" + players + '\'' +
                ", nickname='" + nickname + '\'' +
                ", score=" + score +
                ", rebounds=" + rebounds +
                ", assists=" + assists +
                '}';
    }
}
