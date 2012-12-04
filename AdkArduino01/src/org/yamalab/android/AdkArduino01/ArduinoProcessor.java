package org.yamalab.android.AdkArduino01;

import java.util.Date;

import android.util.Log;

public class ArduinoProcessor {
   private static final String TAG = "AdkService";
   private AdkService adkService;
   private long lastTime;
   public ArduinoProcessor(AdkService s){
	   adkService=s;
   }
   public void setAdkService(AdkService as){
	   adkService=as;
   }
   public void test(){ // PC debugging
		this.processAnalogInput(0, 0); 
		wait(10000);
		this.processAnalogInput(0, 50);
		wait(10000);
   }
   public void processDigitalInput(int vals){
	// ADK Accessory からデジタル入力, vals には、Arduino のポート 0-7 の 1 byte の値が入る
	//	Log.d(TAG,"processDigitalInput-"+vals);
	   
   }
   public void processAnalogInput(int port, int val){ // ADK Accessory からアナログ入力
	//	Log.d(TAG,"processAnalogInput-port="+port+" val="+val);
	   if(adkService==null) return;
	   if(port==0){
		   if(val<=10){
//	this.adkService.parseSetCommand("out-d-8=1");
		
		   }
		   else{
		   }
	   }
   }
   public void wait(int t){
	   try{
		   Thread.sleep((long)t);
	   }
	   catch(InterruptedException e){
		   
	   }
   }
}