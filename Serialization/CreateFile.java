import java.io.*;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) throws Exception {

		File file = new File("D:\\example.txt");
		// System.out.println(file.delete());
		if (file.exists()) {

			System.out.println(" File created: " + file.getName());
			System.out.println("File location : " + file.getAbsolutePath());
			
		} else
			System.out.println("File Already Exist..");

		FileWriter fw = new FileWriter("D:\\example.txt",true);
		fw.write("\nthird Java File");

		fw.close();
		System.out.println("File Size: " + file.length());

		
		Scanner sc=new Scanner(file);
		System.out.println("📖 Reading data from file:");
        // Traversing File Data line by line
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
        }
		sc.close();
//		
//		BufferedReader br = new BufferedReader(new FileReader(file));
//		System.out.println(" Reading file contents:");
//		System.out.println(br.readLine());
//		
//		if(file.exists())
//			System.out.println("File Deleted " +file.delete());
//		else
//			System.out.println("File not  Esixt");
//
	}
}
