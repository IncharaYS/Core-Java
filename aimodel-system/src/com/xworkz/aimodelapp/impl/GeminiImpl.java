package com.xworkz.aimodelapp.impl;

import com.xworkz.aimodelapp.aimodel.AiModel;

public class GeminiImpl implements AiModel {
    @Override
    public void train() {
        System.out.println("Training gemini model");
    }

    @Override
    public void predict() {
        System.out.println("predicting using gemini model");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating Gemini model");
    }
}
