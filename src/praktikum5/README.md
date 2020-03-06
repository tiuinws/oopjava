# Praktikum 5
## Enkapsulasi ( Encapsulation )

Enkapsulasi merupakan teknik menyembunyikan atribut dengan memberi hak akses tertentu pada atribut di dalam sebuah kelas.

misalkan ada kelas Mahasiswa.

```
class Mahasiswa {
   String name;
   String nim;
}
```

atribut name dan nim pada kelas tersebut mempunyai hak akses default, sehingga masih dapat diakses dari luar, berikut penjelasan access modifier yang mempengaruhi hak akses atribut beserta keterangannya.

default => bisa dibaca dan ditulis sesama kelas dalam satu paket.
public => bisa dibaca dan ditulis sesama kelas diluar paket.
private => tidak bisa dibaca dan ditulis kecuali oleh kelas yang memiliki atribut itu sendiri.
protected => tidak bisa dibaca dan ditulis kecuali oleh kelas yang memiliki atribut itu sendiri dan inheritance kelas itu.

sehingga, setiap access modifier memiliki tugas dan kewajiban masing-masing.

Lalu apabila access modifiernya private, bagaimana cara mengaksesnya? muncul-lah namanya setter dan getter.

setter => untuk menulis ke atribut.
getter => untuk membaca atribut.

```
class Mahasiswa {
    private String name;
    private String nim;

    void setName(String name){
        this.name = name
    }

    void setNim(String nim){
        this.nim = nim
    }

    String getName(){
        return name;
    }

    String getNim(){
        return nim;
    }
}
```

nah, dengan begitu atribut yang di dalam kelas Mahasiswa dapat diakses oleh kelas lain, akan tetapi tidak secara langsung, bikin rumit bukan?

ya begitulah.


kalo bisa rumit, kenapa harus sederhana?
