package com.monocept.read;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReadTest {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Windows\\System32");
		List<File> fileSize = (List<File>) Files.list(path)
				.map(x ->  new File(x.toString()))
				.sorted((p1, p2) -> (int) (p2.length()-p1.length()))
				.limit(5)
				.collect(Collectors.toList());

		for (File p : fileSize)
			System.out.println(p+"======="+p.length());

	}
}
