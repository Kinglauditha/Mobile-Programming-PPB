package com.lauditha.utslauditha;

import java.util.ArrayList;

public class BookData {

    public static String[][] data = new String[][]{
            {"0", "Lolita", "Ini buku favorit soalnya ceritanya bagus banget. Ini buku sastra fenomenal karena ini menceritakan tentang jatuh cinta antara Ayah Tiri dan Anak Tiri. Banyak konflik yang terjadi antara cinta terlarang ini.", "https://i.postimg.cc/hvpfycqB/lolita.jpg"},
            {"1", "Sherlock Holmes ", "Aku sudah baca buku ini sejak kelas 7 SMP dan Damn! sejak itu aku gak pernah bosen sama semua ceritanya. Ini buku pengantar tidur yang paling aku sukai.", "https://i.postimg.cc/QVGnzGgf/sherlock.jpg"},
            {"2", "The Great Gatsby ", "Buku paling epic yang pernah aku baca. Cerita cinta yang sebenernya itu 'wajar' tapi saat mendalami karakter dua tokoh utama dalam buku ini, kita akan paham maksud keputusan keduanya. BAGUS BANGET. KISAH CINTA PALING RASIONAL.", "https://i.postimg.cc/GhXXYyVM/gatsby.jpg"},
            {"3", "The Girl On The Train", "Cerita buku ini benar-benar bikin aku mikir dan gak sadar kalau bakal berakhir seperti itu. Ini tentang cinta segitiga yang berujung pembunuhan. Sebenernya bukan cinta segitiga, tetapi tentang bagaimana untuk memahami bahwa rumput tetangga tidaklah selalu lebih hijau", "https://i.postimg.cc/0ys9MrMH/girl-on-the-train.jpg"},
            {"4", "The Beautiful and The Damned", "Karya dari F.Scotfitzgerald gak pernah buat nyesel. Buku ini ngajarin kita untuk jangan pernah menghamburkan uang dan belajar untuk menghargai status sosial setiap orang. Sedikit sedih bacanya karena gak tau bahwa kayak gitu endingnya.", "https://i.postimg.cc/6pvGw7sj/beautfiul.png"},
            {"5", "Murder On The Orient Express", "Ini sama seperti The Girl On The Train. Ga pernah nyangka akan seperti itu. Selama membacs sku cuman kayak bisa 'ya ampun bisa seperti itu' tetapi di cerita ini bisa membawakan suasana maklum atas kejadian di kereta tersebut. ", "https://i.postimg.cc/7Y72rGrB/express.jpg"},
    };

    public static ArrayList<book> getListData() {
        ArrayList<book> list = new ArrayList<>();
        for (String[] BookData : data) {
            book book = new book();
            book.setId(Integer.parseInt(BookData[0]));
            book.setName(BookData[1]);
            book.setDescription(BookData[2]);
            book.setPhoto(BookData[3]);

            list.add(book);
        }
        return list;
    }
}
