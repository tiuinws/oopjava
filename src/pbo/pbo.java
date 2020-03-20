package pbo;

import alfianLib.fn;

public class pbo {
    /*
    public static void main(String[] args) {
        learnMethod lm = new learnMethod();
        FunFunc fun = new FunFunc();
        fun.println("Object Oriented Programming");
        String[] colleger = lm.inputColleger();
        lm.setColleger(colleger[0], colleger[1]);
        fun.println(lm.getColleger());
        String name = "Budi";
        String nim = "0000000001";
        learnMethod xm = lm;
        xm.name = name;
        xm.nim = nim;
        fun.print(lm.getColleger());
        fun.print(xm.getColleger());
    }
     */
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa("Budi", "1808096025", 4.0);
        //fun.println(mhs.ipk);
        fn.outln(mhs.getName() + " " + mhs.getNIM() + " " + mhs.getIPK());
        fn.outln(mhs.getCourse());
        mhs.setName("Alfian");
        mhs.setNIM("1808096025");
        mhs.setIPK(3.5);
        fn.outln(mhs.getName() + " " + mhs.getNIM() + " " + mhs.getIPK());
    }
}

/*
class learnMethod {
    String name = "Budi";
    String nim = "1808096025";
    FunFunc fun = new FunFunc();
    Scanner scan = new Scanner(System.in);

    void setColleger(String name, String nim) { this.name = name; this.nim = nim; }

    String[] getColleger() { return new String[]{this.name, this.nim}; }

    String[] inputColleger() { fun.print("Enter Name = "); String name = scan.next(); fun.print("Enter NIM = "); String nim = scan.next(); return new String[]{name, nim}; }
}
*/

class Mahasiswa {
    private String name;
    private String nim;
    private double ipk;

    Mahasiswa(String name, String nim, double ipk) { this.name = name; this.nim = nim; this.ipk = ipk; }

    String getName() { return this.name; }

    String getNIM() { return this.nim; }

    double getIPK() { return this.ipk; }

    void setName (String name) { this.name = name; }

    void setNIM (String nim) { this.nim = nim; }

    void setIPK (double ipk) { this.ipk = ipk; }

    private String addCourse() { fn.out("Input Something : "); return fn.inLn(); }

    String getCourse() { return addCourse(); }
}