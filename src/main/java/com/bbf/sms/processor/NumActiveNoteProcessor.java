package com.bbf.sms.processor;

public class NumActiveNoteProcessor extends DefaultNoteProcessor {  
    protected void proceed() {  
        System.out.println("NumActiveNoteProcessor短信已处理！" + "send sms... to:"+this.getMsisdn());  
    }  
}  