package com.cifpcarballeira.katas.FizzBuzz.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam205
 */
public class TestFizzBuzz {
    
    @Test
    public void TestRetorna_1() {
    
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(1);
        assertEquals("1",result);
    }
    
    @Test
    public void TestRetorna_2(){
    
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz(2);
        assertEquals("2",result);
    }
    @Test
    public void TestRetorna_3(){
    
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizz(6);
        assertEquals("Fizz",result);
    }
    
    @Test
    public void TestRetorna_div5(){
    
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getBuzz(10);
        assertEquals("Buzz",result);
    }
    
    @Test
    public void TestRetorna_FizzBuzz(){
    
        FizzBuzz fb = new FizzBuzz();
        String result = fb.getFizzBuzz_1(90);
        assertEquals("FizzBuzz",result);
    }
    
    
    
    

}
