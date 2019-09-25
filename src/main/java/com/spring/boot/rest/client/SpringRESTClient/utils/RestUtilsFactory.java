package com.spring.boot.rest.client.SpringRESTClient.utils;

public class RestUtilsFactory {

         
	 public RestUtilsFactory() {
		// TODO Auto-generated constructor stub
	}
	
	 public static RestUtils getRestUtils(Object client)
	 {
		RestUtils restutil = null;
		 if(client instanceof RestClientXML)
			 restutil= new RestClientXML();
		
		 return restutil;
		
		 
	 }

}
