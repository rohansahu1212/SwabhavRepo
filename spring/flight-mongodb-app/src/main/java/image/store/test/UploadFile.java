package image.store.test;

import java.util.Date;

import javax.xml.crypto.Data;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("CustomerDocuments")
public class UploadFile {

	@Id
	private String id;
	private String name;
	private Date createdTime;
	private Binary content;
	private String contentype;
	private long size;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public Binary getContent() {
		return content;
	}

	public String getContentype() {
		return contentype;
	}

	public long getSize() {
		return size;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public void setContent(Binary content) {
		this.content = content;
	}

	public void setContentype(String contentype) {
		this.contentype = contentype;
	}

	public void setSize(long size) {
		this.size = size;
	}

}
