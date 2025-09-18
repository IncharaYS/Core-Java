package com.xworkz.designerapp;

import com.xworkz.designerapp.designer.Designer;
import com.xworkz.designerapp.impl.InteriorDesignerImpl;

public class DesignerRunner {
    public static void main(String[] args) {
        Designer designer=new InteriorDesignerImpl();
        designer.design();
        designer.revise();
        designer.present();
    }
}
