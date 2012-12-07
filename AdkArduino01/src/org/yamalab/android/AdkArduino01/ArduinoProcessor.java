package org.yamalab.android.AdkArduino01;

import java.util.Date;

import android.util.Log;

public class ArduinoProcessor {
   private static final String TAG = "ArduinoProcessor";
   private AdkService adkService;
   private long lastTime;
   public ArduinoProcessor(AdkService s){
	   adkService=s;
   }
   public void setAdkService(AdkService as){
	   adkService=as;
   }

   public void processDigitalInput(int vals){
	// ADK Accessory ����f�W�^������, vals �ɂ́AArduino �̃|�[�g 0-7 �� 1 byte �̒l������
	//	Log.d(TAG,"processDigitalInput-"+vals);
	   
   }
   public void processAnalogInput(int port, int val){ // ADK Accessory ����A�i���O����
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