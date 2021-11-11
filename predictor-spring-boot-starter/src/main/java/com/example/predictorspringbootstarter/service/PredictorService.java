package com.example.predictorspringbootstarter.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PredictorService {
    List<String> pullPrediction = new ArrayList<>(Arrays.asList("everything will be fine","turn around!","you can all!",
            "unfortunately nothing will work","you will become rich"));

    public String getCurrentPrediction(){
        int rnd = rnd(0, pullPrediction.size());
        return pullPrediction.get(rnd);
    }
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
