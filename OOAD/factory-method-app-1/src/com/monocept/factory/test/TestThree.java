package com.monocept.factory.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.monocept.product.factory.AudiFactory;
import com.monocept.product.factory.Auto;
import com.monocept.product.factory.AutoFactory;
import com.monocept.product.factory.TeslaFactory;

public class TestThree {
	public static void main(String[] args)
			throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		AutoFactory factory;
		factory = loadInstanceFromPropFile();
		Auto auto = factory.make();
		auto.start();
	}

	private static AutoFactory loadInstanceFromPropFile()
			throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));
		String path = prop.getProperty("name");
	//	System.out.println(path+"---");
		return  (AutoFactory) Class.forName(path).getMethod("getInstance",null).invoke(null,null);
	

	}

}
