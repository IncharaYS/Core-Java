package com.xworkz.designerapp.impl;

import com.xworkz.designerapp.designer.Designer;

public class InteriorDesignerImpl implements Designer {
    @Override
    public void design() {
        System.out.println("Design interior");
    }

    @Override
    public void revise() {
        System.out.println("Revise design");
    }

    @Override
    public void present() {
        System.out.println("Present the interior");
    }
}
