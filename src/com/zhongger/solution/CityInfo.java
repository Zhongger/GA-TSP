package com.zhongger.solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CityInfo {
    private Integer id;
    private Integer x;
    private Integer y;

    public CityInfo() {
    }

    public CityInfo(Integer id, Integer x, Integer y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }



    @Override
    public String toString() {
        return "CityInfo{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
