package org.univ;
public class College extends University {
	@Override
	public void ug() {
System.out.println("ug college name = prime");
	}
	public void pg() {
System.out.println("pg college name = sastra");
	}
	public static void main(String[] args) {
		College r = new College();
		r.ug();
		r.pg();
}
}
