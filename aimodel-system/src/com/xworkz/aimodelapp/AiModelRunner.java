package com.xworkz.aimodelapp;

import com.xworkz.aimodelapp.aimodel.AiModel;
import com.xworkz.aimodelapp.impl.GeminiImpl;

public class AiModelRunner {
    public static void main(String[] args) {
        AiModel aiModel=new GeminiImpl();
        aiModel.train();
        aiModel.evaluate();
        aiModel.predict();
    }
}
