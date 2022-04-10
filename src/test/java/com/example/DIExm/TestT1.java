package com.example.DIExm;

import org.junit.*;
import org.junit.jupiter.api.Test;

public class TestT1 {

    //TDD

   // @Test
   // public void test1(){
   //     Assert.assertEquals(value, value); /// pri -> ==  ,  ref .equals
   //     Assert.assertTrue(condi); // checks of the condi is true
   //     Assert.assertFalse(condi); ///
   //     Assert.assertNotNull(obj); // if the ob is not null
   //     Assert.assertArrayEquals([],[]); // cpmapre 2 arrays
   // }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before the class ");
    }

                @Before
                public void before(){
                    System.out.println("before");
                        }

                         @Test
                        public void test1(){
                             System.out.println("test");
                         }

                 @After
                public void after(){
                     System.out.println(10/0);
                 }
                @Before
                public void before2(){
                    System.out.println("before");
                }

                        @Test
                        public void test2(){
                            System.out.println("test");
                        }

                @After
                public void after2(){
                    System.out.println(10/0);
                }
    @AfterClass
    public void afterClass(){
        System.out.println("after the class ");
    }
}
