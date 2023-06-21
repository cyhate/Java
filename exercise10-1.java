package uni.nup;

import java.io.*;
import java.util.Arraylist;
import java.util.Comparator;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {
 Scanner inputFromUser = new Scanner(System.in);
 System.out.print("Give us the input file name:");
 String inputFileName = inputFromUser.nextline();

 System.out.print("Give us the output file name:");
 String outputFileNane = inputFronUser.nextLine();

 Arraylistestring> myWords = new ArrayList();

 try {
 FileInputStrean inputStream = new FileInputStream(inputFileNane);
 Scanner FileReader = new Scanner inputStream);

 while (FileReader.hasNextLine()) {
 	String contents = FileReader.nextline();
	 String[] Words = contents.split("");
 	for (int i = 0; i < Words.length; iss) {
 		myWords.add(
 			Words[i]
 				.tolowerCase()
		);
	}
 }

 myWords.sort (Comparator.comparingInt(String::Length).reversed());

 FileOutputStrean outFile = new FileOutputStrean(outputFileNane);
 Printiiriter writer = new PrintWriter(outFile);
 for (String word: myWords) {
 writer.println(word);
 }

 writer.close();

} catch (FileNotFoundexception e) {
 System.out.println("File Not Found");
 System.exit(-1);

  }
 }
}


