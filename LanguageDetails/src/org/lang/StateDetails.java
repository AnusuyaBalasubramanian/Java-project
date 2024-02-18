package org.lang;

public class StateDetails {

	private void southIndia() {
System.out.println("southindia are chennai,bengaluru");
}

	private void northIndia() {
System.out.println("northindia are punjab,haryana");
	}
	
	public static void main(String[] args) {
		
		StateDetails st = new StateDetails();
		st.southIndia();
		st.northIndia();
		
	LanguageInfo lang = new LanguageInfo();
	
	lang.tamilLanguage();
	lang.englishLanguage();
	lang.hindiLanguage();
		
	}
}

