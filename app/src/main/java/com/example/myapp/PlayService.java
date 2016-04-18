package com.example.myapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class PlayService extends Service
{
	GlobalMedia gm;
	@Override
	public int onStartCommand(Intent intent,int flags,int startId)
	{
	  gm=(GlobalMedia)getApplicationContext();
	  gm.mp.start();
	  return Service.START_NOT_STICKY;
	};
	
	
	@Override
	public IBinder onBind(Intent intent)
	{
		return null;
	}

}
