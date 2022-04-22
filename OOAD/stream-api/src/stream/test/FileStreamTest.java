package stream.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FileStreamTest {
	public static void main(String[] args) throws IOException {
		caseStudy1();
	}

	private static void caseStudy1() throws IOException {
   Path filepath= Paths.get("reference\\name.txt");
   Files.lines(filepath)
      	.forEach(FileStreamTest::printDetails);
   
   
   
   Path filepath1= Paths.get("reference\\name.txt");
	//Files.lines(filepath1);
	
   Pattern regex = Pattern.compile("a-z");
   Matcher matcher = regex.matcher("Content goes here");
   
   
    List<String> uniqueList = Files.lines(filepath1)
            .distinct()
            .filter(n->{
            	Matcher m=Pattern.compile("[a-zA-z]")
                .matcher(n);
                return m.find();
            			})// distinct method removes duplicates
            .collect(Collectors.toList()); // distinct elements stored to new list
    
    System.out.println("unique list-------------------");
	
    uniqueList.forEach(uniqueStudent -> System.out.println(uniqueStudent));
    
	};
	
	
	
	
	
	
	
//	List<String> employeesDistinctByName =//
//			Files.lin
//            .filter(e -> nameSet.add(e.getName()))
//            .collect(Collectors.toList());
	
	private static void printDetails(String line) {
		System.out.println(line);
	}
}
