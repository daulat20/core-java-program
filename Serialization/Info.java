import java.io.*;

public class Info {
	public static void main(String[] args) throws Exception {
		int wcount = 0;
		int chcount = 0;
		int vcount=0;
		int Concount=0;
		
		File file=new File("D:\\\\download\\\\info.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);

			String[] abc = line.split(" ");
			for (int i = 0; i < abc.length; i++) {
				wcount++;
			}

			for (int i = 0; i < line.length(); i++) {
				line.charAt(i);
				chcount++;

				if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o'
						|| line.charAt(i) == 'u' || line.charAt(i) == 'A' || line.charAt(i) == 'E'
						|| line.charAt(i) == 'I' || line.charAt(i) == 'O' || line.charAt(i) == 'U') {
					vcount++;

				}
				else {
					Concount++;
				}

			}
		}
		System.out.println("Number of word : " + wcount);
		System.out.println("Number of charecter : " + chcount);
		System.out.println("Number of Vowel : " + vcount);
		System.out.println("Number of Consonants : " + Concount);
		br.close();
		System.out.println();
		
		if(file.exists()) {
			System.out.println("File Set Read Only: "+file.setReadOnly());
			System.out.println("File can write: "+file.canWrite());
			System.out.println("File can Read: "+file.canRead());
			System.out.println("File Location Folder: "+file.getParent());
			System.out.println("File Location: "+file.getPath());
			System.out.println("File Size in Byte : "+file.length());
			System.out.println("File Hidden or not : "+file.isHidden());
			System.out.println("File can Exicuted: "+file.canExecute());

		}
	}
	

}
