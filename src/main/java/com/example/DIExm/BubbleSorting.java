package com.example.DIExm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSorting implements SortingAlg {

    public void sort(int[] arr){
        //sorting
        System.out.println("Bubble");
    }
}
