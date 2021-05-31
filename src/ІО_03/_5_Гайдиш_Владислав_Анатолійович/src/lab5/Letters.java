package lab5;

public class Letters {
	private String NewWord;
	
	public Letters(String temp, String[] Punc) {
		NewWord = "";
		String[] arr = temp.split(" ");
		//System.out.println(tt);
		for(int i=0; i<arr.length; i++) {
			int p =0;
			String tmp = arr[i];
			int S = tmp.length();
			String[] t = tmp.split("");
			char last = tmp.charAt(S-1);
			for(int j=0; j<S; j++) {
				char b = tmp.charAt(j);
				if(b == last && j!= S-1) {
					t[j]="";
				}
				NewWord+=t[j];
			}
			NewWord+=Punc[p]+" ";
			p+=1;
		}
		//System.out.println(NewWord);
	}
	public String GetNew() {
		return this.NewWord;
	}
	
}
