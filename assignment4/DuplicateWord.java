package assignment4;

public class DuplicateWord {
	
	public static void main(String[] args) {
		
		String txt = "We learn Java basics as part of java sessions in java week1";;
	int count;
	txt =txt.toLowerCase();
	String[] word =txt.split(" ");
	System.out.println("removed the Duplicate word:");
	
	for (int i = 0; i < word.length; i++) {
		count=1;
		for (int j = 0; j < word.length; j++) {
			if (word[i].equals(word[j])) {
				
				word[j]="0";
				count ++;
			}
			}
		if (count > 1) {
			if (count > 1 && word[i] != "0")
				System.out.println(word[i]);
			for (String words : word) {
				if (!words.isEmpty()) {
					System.out.print(words + " ");
				
			}
		
				
			}
			
		}
		
	}
	}
}

	
	
	
	



    