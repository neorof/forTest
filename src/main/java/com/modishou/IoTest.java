package com.modishou;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IoTest {

    public static void main(String[] args) throws Exception{
        List<String> tmp = getParamFromTxt("D:/type_enum.uid.uniq");
        System.out.println(tmp.size());
    }

    private static List<String> getParamFromTxt(String filePath) throws IOException {
        List<String> list = new ArrayList<String>();
        InputStreamReader read = new InputStreamReader(new FileInputStream(filePath), "UTF-8");//考虑到编码格式
        BufferedReader bufferedReader = new BufferedReader(read);

        String lineTxt;
        while ((lineTxt = bufferedReader.readLine()) != null) {
            list.add(lineTxt);
        }
        read.close();
        return list;
    }
}
