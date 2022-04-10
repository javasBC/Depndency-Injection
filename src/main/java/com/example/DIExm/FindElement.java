package com.example.DIExm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class FindElement {

    //private BubbleSorting bubbleSorting;
    //private BinarySorting binarySorting;

    @Autowired
    @Qualifier("hodi")
    private SortingAlg sortingAlg ;



    public int findElm(int[] array , int number ){
        // sorting the array
        // find the element
        // return the elm index

        sortingAlg.sort(array);
        return 3;
    }


}
