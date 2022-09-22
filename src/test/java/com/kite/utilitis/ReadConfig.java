package com.kite.utilitis;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	public static Properties pro;
	
	public ReadConfig()
	{
		File src = new File ("./Configuration/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		    }
		catch (Exception e)
		{
			System.out.println("Exception e is : " + e.getMessage());
		}
	}
		public static String getApllicationURL ()
		{
			String URL = pro.getProperty("baseURL");
			return URL;
		}
		
		public String getusername ()
		{
			String username = pro.getProperty("username");
			return username;
		}
		
		public String getpassword()
		{
			String password = pro.getProperty("password");
			return password;
		}
		
		public String getpin()
		{
			String pin = pro.getProperty("pin");
			return pin;
		}
		
		public String getchromepath()
		{
			String chromepath = pro.getProperty("chromepath");
			return chromepath;
		}
		
		public String getedgepath()
		{
			String edgepath = pro.getProperty("edgepath");
			return edgepath;
		}
	
		public String getfirefoxpath()
		{
			String firefoxpath = pro.getProperty("firefoxpath");
			return firefoxpath;
		}
	
	
	
}
