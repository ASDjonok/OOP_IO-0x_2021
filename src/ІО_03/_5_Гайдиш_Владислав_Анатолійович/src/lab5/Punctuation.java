package lab5;

public class Punctuation{
	private String[] Punc;
	private String Last;
	
	public Punctuation(String[] Word) {
		Last = "";
		for(int i=0; i<Word.length; i++) {
			   String temp = Word[i];
			   String[] tmp = temp.split("");
			   Punc = new String[Word.length];
			   int k=0;
			   int S = temp.length();
			   char last = temp.charAt(S-1);
			   if(last == '.' || last == ',' || last=='!' || last == '?') {
				   this.Punc[k] = String.valueOf(last);
				   k+=1;
				   tmp[S-1] = "";
				   temp = "";
				   for(int o=0; o<S-1; o++) {
					   temp+=tmp[o];
				   }
				   temp+=" ";
				   Letters Letter = new Letters(temp, Punc);
				   Last += Letter.GetNew();			  
			   }
			}
	}
	
	
	public String GetFinal() {
		return this.Last;
	}
}