//package helloworld;
import java.util.*;
public class TugasMatkom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan huruf yang di outputkan : ");
	String huruf = in.next();
	int i = 0;
	int j = 0;
	int k = 0;
	int l = 0;
	int h = 0;
	int g = 0;
	int f = 0;
	int e = 0;
	int d = 0;
	int c = 0;
	int b = 0;
	int a = 0;
	int nomor = 1;
	System.out.println("Masukkan panjang output : ");
	int masok = in.nextInt();
	System.out.println("Banyaknya string : ");
	System.out.println((int)(Math.pow(huruf.length(),masok)));
	System.out.println("List String : ");
	if(masok == 1) {
		while(true) {
			System.out.printf("%d . ", nomor);
			nomor++;
			System.out.print(huruf.charAt(l));
			l++;
			if(l >= huruf.length()) {
				break;
			}
			System.out.println();
		}
		}
	if(masok == 2) {
		while(true) {
			System.out.printf("%d . ", nomor);
			nomor++;
			System.out.print(huruf.charAt(l));
			System.out.print(huruf.charAt(k));
			k++;
			if(k >= huruf.length()) {
				l++;
				k = 0;
			}if(l >= huruf.length()) {
				break;
			}
			System.out.println();
		}
		}
	if(masok == 3) {
		while(true) {
			System.out.printf("%d . ", nomor);
			nomor++;
			System.out.print(huruf.charAt(l));
			System.out.print(huruf.charAt(k));
			System.out.print(huruf.charAt(j));
			j++;
			if(j >= huruf.length()) {
				k++;
				j = 0;
			}
			if(k >= huruf.length()) {
				l++;
				k = 0;
			}if(l >= huruf.length()) {
				break;
			}
			System.out.println();
		}
		}
	if(masok == 4) {
	while(true) {
		System.out.printf("%d . ", nomor);
		nomor++;
		System.out.print(huruf.charAt(l));
		System.out.print(huruf.charAt(k));
		System.out.print(huruf.charAt(j));
		System.out.print(huruf.charAt(i));
		i++;
		if(i >= huruf.length()) {
			j++;
			i = 0;
		}
		if(j >= huruf.length()) {
			k++;
			j = 0;
		}
		if(k >= huruf.length()) {
			l++;
			k = 0;
		}if(l >= huruf.length()) {
			break;
		}
		System.out.println();
	}
	}
	
	if (masok == 5) {
		while(true) {
			System.out.printf("%d . ", nomor);
			nomor++;
			System.out.print(huruf.charAt(l));
			System.out.print(huruf.charAt(k));
			System.out.print(huruf.charAt(j));
			System.out.print(huruf.charAt(i));
			System.out.print(huruf.charAt(h));
			h++;
			if(h >= huruf.length()) {
				i++;
				h = 0;
			}
			if(i >= huruf.length()) {
				j++;
				i = 0;
			}
			if(j >= huruf.length()) {
				k++;
				j = 0;
			}
			if(k >= huruf.length()) {
				l++;
				k = 0;
			}if(l >= huruf.length()) {
				break;
			}
			System.out.println();
		}
		}
	if (masok == 6) {
		while(true) {System.out.printf("%d . ", nomor);
		nomor++;
			System.out.print(huruf.charAt(l));
			System.out.print(huruf.charAt(k));
			System.out.print(huruf.charAt(j));
			System.out.print(huruf.charAt(i));
			System.out.print(huruf.charAt(h));
			System.out.print(huruf.charAt(g));
			g++;
			if(g >= huruf.length()) {
				h++;
				g = 0;
			}
			if(h >= huruf.length()) {
				i++;
				h = 0;
			}
			if(i >= huruf.length()) {
				j++;
				i = 0;
			}
			if(j >= huruf.length()) {
				k++;
				j = 0;
			}
			if(k >= huruf.length()) {
				l++;
				k = 0;
			}if(l >= huruf.length()) {
				break;
			}
			System.out.println();
		}
		}
	if (masok == 7) {
		while(true) {
			System.out.printf("%d . ", nomor);
			nomor++;
			System.out.print(huruf.charAt(l));
			System.out.print(huruf.charAt(k));
			System.out.print(huruf.charAt(j));
			System.out.print(huruf.charAt(i));
			System.out.print(huruf.charAt(h));
			System.out.print(huruf.charAt(g));
			System.out.print(huruf.charAt(f));
			f++;
			if(f >= huruf.length()) {
				g++;
				f = 0;
			}
			if(g >= huruf.length()) {
				h++;
				g = 0;
			}
			if(h >= huruf.length()) {
				i++;
				h = 0;
			}
			if(i >= huruf.length()) {
				j++;
				i = 0;
			}
			if(j >= huruf.length()) {
				k++;
				j = 0;
			}
			if(k >= huruf.length()) {
				l++;
				k = 0;
			}if(l >= huruf.length()) {
				break;
			}
			System.out.println();
		}
		}
	if (masok == 8) {
		while(true) {
			System.out.printf("%d . ", nomor);
			nomor++;
			System.out.print(huruf.charAt(l));
			System.out.print(huruf.charAt(k));
			System.out.print(huruf.charAt(j));
			System.out.print(huruf.charAt(i));
			System.out.print(huruf.charAt(h));
			System.out.print(huruf.charAt(g));
			System.out.print(huruf.charAt(f));
			System.out.print(huruf.charAt(e));
			e++;
			if(e >= huruf.length()) {
				f++;
				e = 0;
			}
			if(f >= huruf.length()) {
				g++;
				f = 0;
			}
			if(g >= huruf.length()) {
				h++;
				g = 0;
			}
			if(h >= huruf.length()) {
				i++;
				h = 0;
			}
			if(i >= huruf.length()) {
				j++;
				i = 0;
			}
			if(j >= huruf.length()) {
				k++;
				j = 0;
			}
			if(k >= huruf.length()) {
				l++;
				k = 0;
			}if(l >= huruf.length()) {
				break;
			}
			System.out.println();
		}
		}
		if (masok == 9) {
		while(true) {
			System.out.printf("%d . ", nomor);
			nomor++;
			System.out.print(huruf.charAt(l));
			System.out.print(huruf.charAt(k));
			System.out.print(huruf.charAt(j));
			System.out.print(huruf.charAt(i));
			System.out.print(huruf.charAt(h));
			System.out.print(huruf.charAt(g));
			System.out.print(huruf.charAt(f));
			System.out.print(huruf.charAt(e));
			System.out.print(huruf.charAt(d));
			d++;
			if(d >= huruf.length()) {
				e++;
				d = 0;
			}
			if(e >= huruf.length()) {
				f++;
				e = 0;
			}
			if(f >= huruf.length()) {
				g++;
				f = 0;
			}
			if(g >= huruf.length()) {
				h++;
				g = 0;
			}
			if(h >= huruf.length()) {
				i++;
				h = 0;
			}
			if(i >= huruf.length()) {
				j++;
				i = 0;
			}
			if(j >= huruf.length()) {
				k++;
				j = 0;
			}
			if(k >= huruf.length()) {
				l++;
				k = 0;
			}if(l >= huruf.length()) {
				break;
			}
			System.out.println();
		}
		}
		if (masok == 10) {
			while(true) {
				System.out.printf("%d . ", nomor);
				nomor++;
				System.out.print(huruf.charAt(l));
				System.out.print(huruf.charAt(k));
				System.out.print(huruf.charAt(j));
				System.out.print(huruf.charAt(i));
				System.out.print(huruf.charAt(h));
				System.out.print(huruf.charAt(g));
				System.out.print(huruf.charAt(f));
				System.out.print(huruf.charAt(e));
				System.out.print(huruf.charAt(d));
				System.out.print(huruf.charAt(c));
				c++;
				if(c >= huruf.length()) {
					d++;
					c = 0;
				}
				if(d >= huruf.length()) {
					e++;
					d = 0;
				}
				if(e >= huruf.length()) {
					f++;
					e = 0;
				}
				if(f >= huruf.length()) {
					g++;
					f = 0;
				}
				if(g >= huruf.length()) {
					h++;
					g = 0;
				}
				if(h >= huruf.length()) {
					i++;
					h = 0;
				}
				if(i >= huruf.length()) {
					j++;
					i = 0;
				}
				if(j >= huruf.length()) {
					k++;
					j = 0;
				}
				if(k >= huruf.length()) {
					l++;
					k = 0;
				}if(l >= huruf.length()) {
					break;
				}
				System.out.println();
			}
			}
		if (masok == 11) {
			while(true) {
				System.out.printf("%d . ", nomor);
				nomor++;
				System.out.print(huruf.charAt(l));
				System.out.print(huruf.charAt(k));
				System.out.print(huruf.charAt(j));
				System.out.print(huruf.charAt(i));
				System.out.print(huruf.charAt(h));
				System.out.print(huruf.charAt(g));
				System.out.print(huruf.charAt(f));
				System.out.print(huruf.charAt(e));
				System.out.print(huruf.charAt(d));
				System.out.print(huruf.charAt(c));
				System.out.print(huruf.charAt(b));
				b++;
				if(b >= huruf.length()) {
					c++;
					b = 0;
				}
				if(c >= huruf.length()) {
					d++;
					c = 0;
				}
				if(d >= huruf.length()) {
					e++;
					d = 0;
				}
				if(e >= huruf.length()) {
					f++;
					e = 0;
				}
				if(f >= huruf.length()) {
					g++;
					f = 0;
				}
				if(g >= huruf.length()) {
					h++;
					g = 0;
				}
				if(h >= huruf.length()) {
					i++;
					h = 0;
				}
				if(i >= huruf.length()) {
					j++;
					i = 0;
				}
				if(j >= huruf.length()) {
					k++;
					j = 0;
				}
				if(k >= huruf.length()) {
					l++;
					k = 0;
				}if(l >= huruf.length()) {
					break;
				}
				System.out.println();
			}
			}
		if (masok == 12) {
			while(true) {
				System.out.printf("%d . ", nomor);
				nomor++;
				System.out.print(huruf.charAt(l));
				System.out.print(huruf.charAt(k));
				System.out.print(huruf.charAt(j));
				System.out.print(huruf.charAt(i));
				System.out.print(huruf.charAt(h));
				System.out.print(huruf.charAt(g));
				System.out.print(huruf.charAt(f));
				System.out.print(huruf.charAt(e));
				System.out.print(huruf.charAt(d));
				System.out.print(huruf.charAt(c));
				System.out.print(huruf.charAt(b));
				
				System.out.print(huruf.charAt(a));
				a++;
				if(a >= huruf.length()) {
					b++;
					a = 0;
				}
				if(b >= huruf.length()) {
					c++;
					b = 0;
				}
				if(c >= huruf.length()) {
					d++;
					c = 0;
				}
				if(d >= huruf.length()) {
					e++;
					d = 0;
				}
				if(e >= huruf.length()) {
					f++;
					e = 0;
				}
				if(f >= huruf.length()) {
					g++;
					f = 0;
				}
				if(g >= huruf.length()) {
					h++;
					g = 0;
				}
				if(h >= huruf.length()) {
					i++;
					h = 0;
				}
				if(i >= huruf.length()) {
					j++;
					i = 0;
				}
				if(j >= huruf.length()) {
					k++;
					j = 0;
				}
				if(k >= huruf.length()) {
					l++;
					k = 0;
				}if(l >= huruf.length()) {
					break;
				}
				System.out.println();
			}
			}
                System.out.println("");
	}
}
