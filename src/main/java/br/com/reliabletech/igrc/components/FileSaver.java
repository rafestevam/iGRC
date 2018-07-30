package br.com.reliabletech.igrc.components;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileSaver {

//	@Autowired
//	private HttpServletRequest request;
	
//	@Value("${upload.path}")
//	private String realPath;
	
	private final Path rootLocation = Paths.get("filestorage");
	

	public String write(String baseFolder, MultipartFile file) {
		
		try {
//			String realPath = request.getServletContext().getRealPath("/" + baseFolder);
//			String path = realPath + "/" + file.getOriginalFilename();
//			file.transferTo(new File(path));
//			return baseFolder + "/" + file.getOriginalFilename();
			Files.copy(file.getInputStream(), rootLocation.resolve(file.getOriginalFilename()));
			return "filestorage/" + file.getOriginalFilename();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
		
	}
	
}
