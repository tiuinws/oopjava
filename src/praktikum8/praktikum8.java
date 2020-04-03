package praktikum8;
/**
 * Alfian Hidayat;
 * 1808096025;
 * Love writing bugs, and do major breaking changes.
 * My Social Media:
 * Github: @alfianguide;
 * Twitter: @alfianguide;
 * My Websites:
 * alfianguide.com;
 * www.alfianguide.com;
 * blog.alfianguide.com;
 * Thank You :)
 */
public class praktikum8 {
    /**
     * Berikut contoh interface;
     * kelas-kelas yang mengimplementasikan interface ini wajib mengikutkan method2 di dalamnya;
     */
    interface Mahasiswa {
        public void sambat();
        public void code();
        public void eat();
        public void sleep();
    }

    static class MahasiswaRebel implements Mahasiswa {
        /**
         * implements Mahasiswa harus dan wajib membuat semua method/override method yang ada di Mahasiswa!!!
         * kalo tidak maka program error!!!
         * coba hapus salah satu method di bawah dan run, maka IDE/Compiler akan mengomel padamu.
         *
         */
        public void sambat() {
            System.out.println("Kuliah online kok tugas terus");
        }
        public void code() {
            System.out.println("Zzz");
        }
        public void eat() {

        }
        public void sleep() {

        }
    }

    abstract static class Geek implements Mahasiswa {
        /**
         * Lihat perbedaan ketika menggunakan abstract, maka bebas kita mau bagaimana;
         * tidak wajib mengikutkan semua method yang terdapat di Mahasiswa;
         * dan ketika abstract, maka tidak dapat dibuat menjadi objek!
         */
        public void yell() {
            System.out.println("Teman2 semua pada bercanda, tak ada yang b̶i̶s̶a̶ mau belajar coding, sepertinya saya salah kelas");
        }
    }

    static class MahasiswaGeek extends Geek {
        /**
         * Karena class abstract Geek ini mengimplements Mahasiswa, maka wajib mengikutkan juga method2 Mahasiswa;
         * @Override adalah opsional, digunakan untuk mengoverride isi method;
         */
        public void yell() {
            super.yell();
        }
        public void sambat() {

        }
        public void code() {

        }
        public void eat() {

        }
        public void sleep() {

        }
    }

    /**
     * Abstract class tidak bisa dibuat seperti object, new Object();
     * hanya bisa diextends, maka MahasiswaGeek ini mengextends Geek;
     * Karena Geek mengimplemen Mahasiswa, untuk konsekuensinya,
     * class MahasiswaGeek harus mengimplementasikan semua method yang ada di Mahasiswa juga.
     *
     */

    public static void main(String[] args) {
        MahasiswaRebel mR = new MahasiswaRebel(); // Create var mR with typeOf and valueOf Object MahasiswaRebel;
        MahasiswaGeek mG = new MahasiswaGeek(); // Create var mR with typeOf and valueOf Object MahasiswaRebel;
        mR.sambat(); // Call method sambat() inside MahasiswaRebel class/object.
        mG.yell(); // Call method yell() inside MahasiswaGeek class/object.
    }

    /**
     * I wonder how long i can survive with this kind of thing, lazy people always judgme as a smart person;
     * But i'm a lazier than that lazy people, cause i do code;
     * the difference between us is that i wanna try, while they were keep yelling and do dirty thing;
     * Well, a geek or need is stay as they are;
     * from born, school, college, life, 'till dead, always occured same thing, same people;
     * See you...
     */
}
