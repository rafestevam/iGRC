package br.com.reliabletech.igrc.utils;

import javax.servlet.ServletContext;

import org.springframework.http.MediaType;

public class MediaTypeUtils {
	
	public static MediaType getMediaTypeForFileName(ServletContext context, String fileName) {
		String mimeType = context.getMimeType(fileName);
		try {
			MediaType mediaType = MediaType.parseMediaType(mimeType);
			return mediaType;
		}catch(Exception e) {
			return MediaType.APPLICATION_OCTET_STREAM;
		}
	}

}
