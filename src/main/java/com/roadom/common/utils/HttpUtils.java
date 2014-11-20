package com.roadom.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class HttpUtils {

	/**
	 * 
	 * @param requestUrl
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static String get(String requestUrl) throws ClientProtocolException, IOException {
		String result = "";
		HttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(requestUrl);
		HttpResponse response = client.execute(get);
		if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			InputStream is = response.getEntity().getContent();
			result = Utils.inStream2String(is);
		}
		return result;
	}


	
	
	private static class Utils {
		public static String inStream2String(InputStream is) throws IOException {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			int len = -1;
			while ((len = is.read(buf)) != -1) {
				baos.write(buf, 0, len);
			}
			return new String(baos.toByteArray());
		}
	}
}
