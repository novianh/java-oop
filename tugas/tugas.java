class Mahluk_Hidup {
public void adalah(String nama)
{
System.out.println("Jenis Makhluk hidup :"+nama);

}
}

class Hewan extends Mahluk_Hidup{
public void jenis_hewan(String nHewan)
{

System.out.println("jenis Hewan :"+nHewan);
System.out.println("");
}
}

class Tumbuhan extends Mahluk_Hidup{
public void jenis_tmbh(String nTmb)
{
System.out.println("jenis Tumbuhan :"+nTmb);
System.out.println("");
}
}

class Main1{
public static void main(String args[])
{
Hewan h=new Hewan();
h.adalah("Hewan");
h.jenis_hewan("Mamalia");

Hewan h2=new Hewan();
h.adalah("Hewan");
h.jenis_hewan("Reptil");

Tumbuhan t=new Tumbuhan();
t.adalah("Tumbuhan");
t.jenis_tmbh("Sayur");

Tumbuhan t2=new Tumbuhan();
t2.adalah("Tumbuhan");
t2.jenis_tmbh("Buah");

}
}