package com.spring.boot.rest.client.SpringRESTClient.utils;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public abstract class RestUtils {
	
	@Value("${spring.rest.requestMethod}")
	protected String requestMethod;
	protected URL url;
	protected HttpURLConnection httpURLConnection;
	protected int connectionTimeout;
	protected int readTimeout;
	protected String setRequestProperty;
	
	public RestUtils()
	{
		
	}
	
	public RestUtils(URL url,HttpURLConnection httpURLConnection)
	{
	
	this.url=url;	
	this.httpURLConnection=httpURLConnection;
	init();
	}
	
	private void init()
	{
		
	}
	
	
	public abstract void convertXMLToJSON(String input);
	public abstract HttpURLConnection getConnection(URL url);
	public abstract InputStream getInputStream (HttpURLConnection httpURLConnection);

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public HttpURLConnection getHttpURLConnection() {
		return httpURLConnection;
	}

	public void setHttpURLConnection(HttpURLConnection httpURLConnection) {
		this.httpURLConnection = httpURLConnection;
	}

	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	public int getReadTimeout() {
		return readTimeout;
	}

	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}

	public String getSetRequestProperty() {
		return setRequestProperty;
	}

	public void setSetRequestProperty(String setRequestProperty) {
		this.setRequestProperty = setRequestProperty;
	}
	
	
	

}
