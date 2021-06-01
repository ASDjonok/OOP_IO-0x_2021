package lab5;

public class Text {
    private String[] Words;
    
    public Text(String text) {
    	this.Words = text.split(" ");
    	
    }
    	
	public String[] GetWords() {
		
		return this.Words;
    }
}
