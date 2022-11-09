public class VirtualDemo {
    public static void main(String[] args) {
        Gaji s =  new Gaji("Wahyu", "KUBAR", 3, 5000.00);//upcasting, dilakukan secara internal dan karena upcasting, objek hanya diizinkan untuk mengakses anggota kelas induk dan anggota kelas anak tertentu (metode yang diganti, dll) tetapi tidak semua anggota. 
        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00);//polymorphysm yang mengkonversi dari child class ke parent class (kelas pegawai)
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --"); 
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
    }
}

//output program tersebut karena dalam konstruktor gaji terdapat kode super yang akses konstruktor, sehingga terdapat "menyusun pegawai" ditampilkan dua kali pada output
