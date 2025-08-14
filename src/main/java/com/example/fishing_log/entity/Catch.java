package com.example.fishing_log.entity;

import java.time.LocalDate;

// 釣果フォームと一覧表示で扱うデータモデル
public class Catch {

    // 日付
    private LocalDate date;

    // 魚の種類
    private String species;

    // サイズ (cm)
    private Integer size;

    // メモ欄
    private String memo;

    // 場所
    private String location;

    // 重さ (g)
    private Integer weight;

    // 引数なしのコンストラクタ
    public Catch() {
    }

    // ──────────────────────────────────
    // 以下、ゲッターとセッター

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

