/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dam205
 */
public class FizzBuzz {
    
    public String getFizzBuzz(int i){
    
        return i+"";
    }
    
    public String getFizz(int i){
    
        if(i%3 == 0 || ValNum(i+""))
        return "Fizz";
        else return i+"";
    }
    
    public String getBuzz(int i){
    
        if(i%5 == 0 || ValNum(i+""))
        return "Buzz";
        else return i+"";
    }
    
    public String getFizzBuzz_1(int i){
    
        if(i%5 == 0 && i%3 == 0)
        return "FizzBuzz";
        else return i+"";
    }
    
    public String getFizzBuzz_All(int num){
    
        FizzBuzz fb = new FizzBuzz();
        if("Fizz".equals(fb.getFizz(num)) && "Buzz".equals(fb.getBuzz(num))) return "FizzBuzz";
        else return num+"";
    }
      
    public boolean ValNum( String s )
    {
    Pattern p = Pattern.compile( "3" );
    Matcher m = p.matcher( s );

    return m.find();
    }
}
