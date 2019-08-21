package com.megadahliana.reviewbuku;

import java.util.ArrayList;

public class NovelData {
    public static String[][] data = new String[][]{
            {"Boycandra", "Sebuah Usaha Melupakanmu(2016)", "https://bookishstory.files.wordpress.com/2016/12/6008026_b4260d61-2622-478c-9202-7afe13f64815.jpg?w=250&h=365", "Setelah hari-hari yang sedih berlalu. Bulan-bulan pahit memulihkan diriku. Aku menyadari satu hal;yang bukan untukku, sekeras apa pun kupaksakan, tetap saja tak akan menjadi milikku. Yang kuperjuangkan sekuat usahaku, jika kau tak memperjuangkanku sepenuh hatimu, tetap saja kita akan berlalu.", "Romance"},
            {"Boy Candra", "Seperti Hujan Yang Jatuh ke Bumi(2016)", "https://3.bp.blogspot.com/-YJzA6whsna8/WGpTj0chU9I/AAAAAAAAAv4/XwdWXcOiU_QktkCzlAxivlQbu5yiIW7wgCLcB/s320/97309_f.jpg", "Juned Ardi, lelaki yang dikhianati oleh kekasihnya –Elya Rahma. Perempuan itu selingkuh dengan sahabatnya bernama Ikmal. Memutuskan untuk menggeluti rock climbing (panjat tebing) sebagai pelariannya. Berbekal pengalaman sewaktu SMA, Juned pergi bertualang ke tempat baru guna menenangkan hatinya. Dalam cerita ini, ia mendaki tebing Likunggavali, Gorontalo. Sebagai bab pembuka cerita.", "Romance"},
            {"Diana Febi", "Dear Allah(2018)", "https://a.wattpad.com/cover/110423366-352-k787987.jpg", "Cinta diam-diam Naira tersimpan rapi bertahun-tahun kepada Wildan yang hatinya telah tertambat pada gadis lain. Naira harus menahan rasa sakit saat mendengar Wildan selalu menceritakan gadis yang ia cinta di hadapan Naira. Cinta diam-diamnya begitu berat lagi, ketika Wildan memutuskan akan menikahi gadis lain. ", "Islamic Romance"},
            {"Boy Candra", "Pada Senja Yang Membawamu Pergi(2016)", "https://inc.mizanstore.com/aassets/img/com_cart/produk/covGA001908.jpg", "Apakah kau ingat saat kita berjanji untuk saling membahagiakan?Katamu, setiap perasaan yang tumbuh adalah sebuah alasan. Alasan bahwa hati patut dipertahankan. Namun, cinta saja belum cukup menyatukan mimpi yang berbeda di antara kita. ", "Romance"},
            {"Ziggy Zezsyazeoviennazabrizkie", "Jakarta Sebelum Pagi(2016)", "https://www.gramedia.com/blog/content/images/2018/11/jakarta-sebelum-pagi.jpg", "Jam tiga dini hari, sweater, dan jalanan yang gelap dan sepi .... Ada peta, petunjuk; dan Jakarta menjadi tempat yang belum pernah kami datangi sebelumnya.” Mawar, hyacinth biru, dan melati. Dibawa balon perak, tiga bunga ini diantar setiap hari ke balkon apartemen Emina. Tanpa pengirim, tanpa pesan; hanya kemungkinan adanya stalker mencurigakan yang tahu alamat tempat tinggalnya. Ketika—tanpa rasa takut—Emina mencoba menelusuri jejak sang stalker, pencariannya mengantarkan dirinya kepada gadis kecil misterius di toko bunga, kamar apartemen sebelah tanpa suara, dan setumpuk surat cinta berisi kisah yang terlewat di hadapan bangunan-bangunan tua Kota Jakarta.", "Fiksi"},
            {"Anggrek Lestari", "Jatuh Cinta Awalnya Sederhana", "https://www.gramedia.com/blog/content/images/2018/11/jatuh-cinta-awalnya-sederhana.jpg", "Franko Untuk apa aku menunjukkan perasaan jika akhirnya harus ditinggalkan? Marina Aku hanya dijadikan pengecoh takdir oleh seorang lelaki yang ingin kembali dengan mantannya, lalu lelaki itu mengantarku pada seseorang di masa laluku juga. Haruskah aku kembali pada lelaki dari masa lalu, yang menghadirkan begitu banyak cinta baru? Bukankah menerima kembali berarti rela terlukai lagi? Rij Aku cinta dia tapi tak berani berkomitmen. Aku tak berani berkomitmen tapi tak mau melepasnya.", "Romance"},
            {"Ratih Kumala", "Tabula Rasa", "https://www.gramedia.com/blog/content/images/2018/11/tabula-rasa.jpg", "Cinta tak selamanya harus memiliki. Begitu pula cinta Galih dan Raras. Dalamnya cinta Galih pada Krasnaya, gadis Rusia yang telah begitu memikatnya, membuat Galih sulit untuk jatuh cinta lagi. ", "Romance"},
            {"Kazuki Kaneshiro", "GO : Dua Aksara(2019)", "https://images.gr-assets.com/books/1552867716l/44470812.jpg", "Sebagai siswa Korea di sekolah menengah Jepang, Sugihara harus membela diri terhadap semua jenis perisakan. Namun, dia tidak bisa mempersiapkan diri untuk merasakan sakit hati ketika jatuh cinta pada gadis Jepang bernama Sakurai.", "Romance"},
            {"Fiersa Besari", "Garis Terdepan(2016)", "https://images.gr-assets.com/books/1471933385l/31604219.jpg", "Pada sebuah garis waktu yang merangkak maju, akan ada saatnya kau bertemu dengan satu orang yang mengubah hidupmu untuk selamanya. Pada sebuah garis waktu yang merangkak maju, akan ada saatnya kau terluka dan kehilangan pegangan.", "Romance"},
            {"Fiersa Besari", "Catatn Juang(2017)", "https://images.gr-assets.com/books/1514363101l/37733232.jpg", "Seseorang yang akan menemani setiap langkahmu dengan satu kebaikan kecil setiap harinya.", "Fiksi"},
            {"HABIBURRAHMAN EL SHIRAZY", "Ayat - Ayat Cinta(2015)", "https://images.gr-assets.com/books/1460515808l/28099346.jpg", "Fahri, yang kini tinggal di Edinburgh dan bahkan menjadi dosen di University of Edinburgh, terpaksa menjalani ke hidupan sehari-harinya sendirian. Bersama dengan Paman Hulusi, asisten rumah tangganya yang berdarah Turki, ia meneruskan kehidupannya tanpa Aisha.", "Romantis"},

    };
    public static ArrayList<Novel> getListData(){
        ArrayList<Novel> listnovel = new ArrayList<>();
        for (String[] aData : data){
            Novel novel = new Novel();
            novel.setNama(aData[0]);
            novel.setJudul(aData[1]);
            novel.setPhoto(aData[2]);
            novel.setSpoiler(aData[3]);
            novel.setGenre(aData[4]);

            listnovel.add(novel);
        }
        return listnovel;
    }

}
