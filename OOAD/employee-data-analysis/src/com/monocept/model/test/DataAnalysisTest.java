package com.monocept.model.test;

import java.io.IOException;

import com.monocept.model.DataAnalysis;
import com.monocept.model.ReadDataFromUrl;

public class DataAnalysisTest {
	public static void main(String[] args) throws IOException {

		DataAnalysis dat= new DataAnalysis(new ReadDataFromUrl());
		dat.findCeo();
		dat.jobWiseCount();
	}
}
