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

}
