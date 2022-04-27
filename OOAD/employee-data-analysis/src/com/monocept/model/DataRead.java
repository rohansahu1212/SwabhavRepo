package com.monocept.model;

import java.io.IOException;
import java.util.HashSet;

public interface DataRead {
	public HashSet<Employee> readContent() throws IOException;
}
