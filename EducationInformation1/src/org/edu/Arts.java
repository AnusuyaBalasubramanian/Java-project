package org.edu;
public class Arts extends Education {
	private void bSc() {
		System.out.println("bsc college name = gty");
			}
			private void bEd() {
		System.out.println("bEd college name = dfr");
			}
			private void bA() {
				System.out.println("bA college name = yui");
		}
			private void bBA() {
				System.out.println("bBA college name = grt");
		}
			@Override
			public void ug() {
		System.out.println("ug college name = dps");
			}
			public void pg() {
		System.out.println("pg college name = sdr");
			}
			public static void main(String[] args) {
			Arts a = new Arts();
			a.bA();
			a.bBA();
			a.bEd();
			a.bSc();
			a.pg();
			a.ug();
			}
}
