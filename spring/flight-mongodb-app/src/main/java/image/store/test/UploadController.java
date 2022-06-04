package image.store.test;

import java.awt.PageAttributes.MediaType;
import java.util.Date;

import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {
	@Autowired
	private MongoTemplate mongoTemplate;

	@PostMapping("file/uploadImage")
	@ResponseBody
	public ResponseEntity<?> uploadImage(@RequestParam(value = "image") MultipartFile file) {
		if (file.isEmpty())
			return ResponseEntity.badRequest().build();
		String fileName = file.getOriginalFilename();
		try {
			UploadFile uploadFile = new UploadFile();
			uploadFile.setName(fileName);
			uploadFile.setCreatedTime(new Date());
			uploadFile.setContent(new Binary(file.getBytes()));
			uploadFile.setContentype(file.getContentType());
			uploadFile.setSize(file.getSize());

			UploadFile savedfile = mongoTemplate.save(uploadFile);

			String url = "http://localhost:8080/file/image/" + savedfile.getId();
			return ResponseEntity.ok("image uploaded " + url);

		} catch (Exception e) {
			return ResponseEntity.ok("image uploaded failed");
		}
	}

	@GetMapping(value = "file/image/{id}", produces = { org.springframework.http.MediaType.IMAGE_JPEG_VALUE, org.springframework.http.MediaType.IMAGE_JPEG_VALUE })
	@ResponseBody
	public byte[] getImage(@PathVariable String id) {
		byte[] data = null;
		UploadFile file = mongoTemplate.findById(id, UploadFile.class);
		if (file != null) {
			data = file.getContent().getData();
		}
		return data;

	}
}
