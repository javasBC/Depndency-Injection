package com.example.DIExm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiExmApplication {

	public static void main(String[] args) {
		var context =
				SpringApplication.run(DiExmApplication.class, args);

		//BinarySorting binarySorting =context.getBean(BinarySorting.class);
		//BubbleSorting bubbleSorting =context.getBean(BubbleSorting.class);
		FindElement find1 =context.getBean(FindElement.class);
		FindElement find2 =context.getBean(FindElement.class);

		System.out.println(find1);
		System.out.println(find2);

		//int[] arr ={3,4,8};
		//find.findElm(arr,8);

	}

}
