package com.example.demo.test;

/**
 * this is just a pattern for java language;
 */
public class JustForPattern {
    //the url needn't to initialize
    String url;
    public String getUrl(){
        // there is many symbol
        return this.url != null && !this.url.isEmpty() ? this.url:null;
    }


    //the return is still boolean,static method;
    String false_s = Boolean.FALSE.toString();

}
