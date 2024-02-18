package org.lang;

// child class
public class LanguageInfo extends StateDetails {
	private void southIndia() {
System.out.println("southindia state are tamilnadu,karnataka,kerala");
	}
	private void northIndia() {
System.out.println("northindia state are  delhi,punjab,haryana");
	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.northIndia();
		l.southIndia();
		l.englishLanguage();
		l.tamilLanguage();
		l.hindiLanguage();
		}
	}
