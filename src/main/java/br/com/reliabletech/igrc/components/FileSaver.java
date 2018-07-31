package br.com.reliabletech.igrc.components;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileSaver {

//	@Autowired
//	private HttpServletRequest request;
	
//	@Value("${upload.path}")
//	private String realPath;
	
	private final Path rootLocation = Paths.get("filestorage");
	
	public Map<String, String> write(String baseFolder, MultipartFile[] files) {
		
		Map<String, String> returnMap = new HashMap<>();
		
		try {
//			String realPath = request.getServletContext().getRealPath("/" + baseFolder);
//			String path = realPath + "/" + file.getOriginalFilename();
//			file.transferTo(new File(path));
//			return baseFolder + "/" + file.getOriginalFilename();
			
			Arrays.asList(files)
				.stream()
				.forEach(file -> {
					try {
						Files.copy(file.getInputStream(), rootLocation.resolve(file.getOriginalFilename()));
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
					returnMap.put(file.getOriginalFilename(), "filestorage/" + file.getOriginalFilename());
				});
//			Files.copy(file.getInputStream(), rootLocation.resolve(file.getOriginalFilename()));
//			returnMap.put(file.getOriginalFilename(), "filestorage/" + file.getOriginalFilename());
			return returnMap;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
		
	}
	
}
