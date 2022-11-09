public class Gaji extends Pegawai {//polymorphysm dari subclass ke superclass
    private double salary;
    public Gaji(String name, String address, int number, double salary){
        super(name, address, number);
        setSalary (salary);
    }
    public void mailCheck(){ //polymorphism upcasting , memiliki nama yg sama dengan superclass (overriding), sehingga bereferensi pada subclass
        System.out.println("Memeriksa kelas gaji dalam surat");
        System.out.println("Surat tertuju untuk" + getName() + "dengan gaji" +  salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary =  newSalary;
        }
    }
    public double computePay(){
        System.out.println("Menghitung pembayaran gaji untuk" + getName()); return salary/52;
    } 
}
