public class person{
private String nama;
public static void main(String [] args){
	person test;
	test = new person ();
	test.setNama ("andi");
	byte b = 100;
	short s = 100;

	person belajarVariabel = test;
	belajarVariabel.setNama("belajar variabel");

	System.out.println(b+s);
	System.out.println("nama : " + test.getNama() + " " + b);
	}
	public void setNama(String aNama){
		this.nama= aNama;
	}
	public String getNama(){
		return this.nama;
	}
	}
