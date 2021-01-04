package com.zhongger.utils;

import com.zhongger.solution.CityInfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CityInfoUtil {
    /**
     * 获取城市节点信息
     * @return
     * @throws IOException
     */
    public static List<CityInfo>  getCityInfo() throws IOException {
        String filename = "src/com/zhongger/file/bier127.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        List<CityInfo> list = new ArrayList<>();
        String line = "";
        while ((line=bufferedReader.readLine())!=null){
            CityInfo cityInfo = new CityInfo();
            String[] arr = line.split(",");
            if (arr[0].equals("")){
                break;
            }
            cityInfo.setId(Integer.parseInt(arr[0]));
            cityInfo.setX(Integer.parseInt(arr[1]));
            cityInfo.setY(Integer.parseInt(arr[2]));
            list.add(cityInfo);
        }
        return list;
    }
}
