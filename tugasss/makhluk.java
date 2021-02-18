public class makhluk {
	/**Creates a new instance of makhluk*/
	public makhluk() {
	}
	public static void main(String[]args){
		int data1, data2, data3;
		Manusia dataMns=new Manusia();
		Hewan dataHwn=new Hewan();
		Tumbuhan dataTmb=new Tumbuhan();
		System.out.println("MAKHLUK HIDUP");
		System.out.println("Nama : Novia Nur Hamidah");
		System.out.println("Kelas : TI-2B");
		System.out.println("NIM : 203307063");
		System.out.println("==================================");
		data1=dataMns.isiData();
		System.out.println("----------------------------------");
		data2=dataHwn.isiData();
		System.out.println("----------------------------------");
		data3=dataTmb.isiData();
		System.out.println("==================================");
	}
}