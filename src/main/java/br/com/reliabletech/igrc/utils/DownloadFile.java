package br.com.reliabletech.igrc.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

public class DownloadFile {
	
	public static StreamingResponseBody downloadFile(String filename, HttpServletResponse response, ServletContext servletContext) {
		MediaType mediaTypeForFileName = MediaTypeUtils.getMediaTypeForFileName(servletContext, filename);
		response.setContentType(mediaTypeForFileName.getType());
		response.setHeader("Content-Disposition", "attatchment; filename = \"" + filename + "\"" );
		File file = new File(filename);
		try {
			InputStream inputStream = new FileInputStream(file);
			
			return outputStream -> {
				int nRead;
				byte[] data = new byte[1024];
				while((nRead = inputStream.read(data, 0, data.length)) != -1) {
					outputStream.write(data, 0, nRead);
				}
				inputStream.close();
			};
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	

}
