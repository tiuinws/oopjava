package praktikum5;

import alfianLib.*;

public class praktikum5 {
    public static void main(String[] args) {
        String[][] listNovel = {
                {"Novel 1", "Budi", "11 oktober 2000", "Novel 1, pembukaan, tentang kelahiran Budi", "40000"},
                {"Novel 2", "Budi", "11 oktober 2001", "Novel 2, klimaks, Budi sedang jatuh-jatuhnya cinta", "49000"},
                {"Novel 3", "Budi", "11 oktober 2002", "Novel 3, penutupan, tentang Budi dan masa depannya", "37000"}};
        novel nv = new novel(listNovel[0][0], listNovel[0][1], listNovel[0][2], listNovel[0][3], listNovel[0][4]);
        novel nv2 = new novel(listNovel[1][0], listNovel[1][1], listNovel[1][2], listNovel[1][3], listNovel[1][4]);
        novel nv3 = new novel(listNovel[2][0], listNovel[2][1], listNovel[2][2], listNovel[2][3], listNovel[2][4]);
        nv.getNovelDetails(); nv2.getNovelDetails(); nv3.getNovelDetails();
        double totalBuyPrice = nv.math.sum(nv.getPrice(), nv.math.sum(nv2.getPrice(), nv3.getPrice()));
        double totalSellPrice = nv.math.sum(nv.sellNovel(), nv.math.sum(nv2.sellNovel(), nv3.sellNovel()));
        nv.fun.outln("Total Harga Beli : Rp" + (int) totalBuyPrice + ",00");
        nv.fun.outln("Total Harga Jual : Rp" + (int)totalSellPrice + ",00");
    }
}

class novel {
    private String title;
    private String author;
    private String datePublished;
    private String desc;
    private double price;
    mathOps math = new mathOps();
    funFunc fun = new funFunc();

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public String getDatePublished() { return datePublished; }

    public void setDatePublished(String datePublished) { this.datePublished = datePublished; }

    public String getDesc() { return desc; }

    public void setDesc(String desc) { this.desc = desc; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    novel(String title, String author, String datePublished, String desc, String price) {
        setTitle(title);
        setAuthor(author);
        setDatePublished(datePublished);
        setDesc(desc);
        setPrice(Double.parseDouble(price));
    }

    double sellNovel() { return math.sub(getPrice(), math.pct(getPrice(), 20)); }

    void getNovelDetails() {
        fun.outln("Title" + "\t\t: " + getTitle());
        fun.outln("Author" + "\t\t: " + getAuthor());
        fun.outln("Date Published" + "\t: " + getDatePublished());
        fun.outln("Description" + "\t: " + getDesc());
        fun.outln("Harga Beli" + "\t: Rp" + (int) getPrice() + ",00");
        fun.outln("Harga Jual" + "\t: Rp" + (int) sellNovel() + ",00"); fun.outln();
    }

}
