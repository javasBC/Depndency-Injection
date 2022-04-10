package com.example.DIExm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hodi")
public class BinarySorting implements SortingAlg {

    public void sort(int[] arr){
        //sorting
        System.out.println("Binary");
    }

}
