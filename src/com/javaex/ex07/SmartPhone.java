package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        

        if("앱".equals(str)){
        	play();
        }else if("음악".equals(str)){
            music();
        }else {
        	super.execute(str);
        }
        
    }
    protected void play() {
    	System.out.println("앱실행");
    }
    protected void music() {
    	System.out.println("다운로드해서 음악재생");
    }
 
  
    
    
    
}
