package project;

public class ComplexMethod {

    public String intToEnglishValue(int i) {
        switch(i){
			case 1: return "One";
			case 2: return "Two";
			case 3: return "Three";
			case 4: return "Four";
			case 5: return "Five";
			case 6: return "Six";
			default:
			throw new NotImplementedException();
		}

}