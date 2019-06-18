package in.khofid.automaker;

import java.util.ArrayList;

public class AutoMakerData {
    public static String[][] data = new String[][] {
            {"Honda", "PT Honda Prospect Motor merupakan Agen Tunggal Pemegang Merek Mobil Honda di Indonesia. Sebagai agen tunggal, PT Honda Prospect Motor merupakan satu-satunya perusahaan yang berhak mengimpor, merakit dan membuat kendaraan bermerk Honda di Indonesia.", "https://upload.wikimedia.org/wikipedia/id/d/d5/Honda-logo.png"},
            {"Toyota", "PT Toyota-Astra Motor atau biasa disingkat dengan TAM merupakan Agen Tunggal Pemegang Merk (ATPM) Mobil Toyota dan Lexus di Indonesia. TAM merupakan perusahaan joint venture antara PT. Astra International Tbk dengan persentase saham 50% dan Toyota Motor Corporation, Jepang dengan persentase saham 50%.", "https://d1r57ja1amoclf.cloudfront.net/wp-content/uploads/2014/04/Toyota-Logo.jpg"},
            {"Suzuki", "Suzuki Motor Corporation adalah perusahaan Jepang yang memproduksi kendaraan seperti mobil, mesin, ATV dan sepeda motor. Di Indonesia, PT. Suzuki Indomobil Sales adalah perusahaan yang memproduksi dan memasarkan mobil, ATV dan sepeda motor merek Suzuki.", "https://banner2.kisspng.com/20180507/xce/kisspng-suzuki-jimny-car-logo-5af0f0bf61ae05.9737538515257397114001.jpg"},
            {"Nissan", "Nissan Motor Company Ltd, biasanya disingkat sebagai Nissan adalah sebuah produsen otomotif multinasional asal Jepang. Merek ini merupakan divisi utama dari Grup Nissan. Nissan dulunya dipasarkan dengan merek Datsun sampai tahun 1983. Kantor utamanya terletak di wilayah Ginza dari Chūō-ku, Tokyo tetapi Nissan merencanakan akan memindahkan kantor utama mereka ke Yokohama, Kanagawa pada 2010, di mana konstruksi sudah dimulai pada 2007. Pada tahun 2011, mereka resmi memindahkan kantor pusat ke Nishi-ku, Yokohama.", "https://img2.pngdownload.id/20180705/hut/kisspng-nissan-juke-car-5b3d99f2d5f416.0107706315307637628764.jpg"},
            {"BMW", "BMW (singkatan untuk Bayerische Motoren Werke, atau dalam Bahasa Inggris, Bavarian Motor Works), adalah sebuah perusahaan otomotif Jerman yang memproduksi mobil dan sepeda motor. BMW didirikan pada tahun 1916 oleh Franz Josef Popp. BMW AG adalah perusahaan induk dari merk mobil MINI dan Rolls-Royce, dan, dulunya Rover. BMW dikenal sebagai salah satu perusahaan mobil mewah dengan performa tinggi, dan juga salah satu perusahaan mobil pertama yang menggunakan teknologi ABS.", "https://jaycurrie.files.wordpress.com/2018/02/bmw-logo-ad930473ac-seeklogo-com.png"},
            {"Mercedes-Benz", "Mercedes-Benz (juga disebut Mercy) adalah sebuah perusahaan otomotif asal Jerman yang memproduksi berbagai macam kendaraan seperti mobil, truk, dan bus. Mercedes-Benz adalah salah satu perusahaan mobil paling dikenal di dunia dan juga perusahaan mobil tertua di dunia yang bertahan sampai sekarang. Mobil mereka terkenal berteknologi dan memiliki tingkat keamanan tinggi.", "https://images-na.ssl-images-amazon.com/images/I/61VaoHj7IbL._SL1500_.jpg"},
            {"Tesla", "Tesla, Inc. (ditulis sebagai T☰SLA, sebelumnya dinamai Tesla Motors) adalah sebuah perusahaan otomotif dan penyimpanan energi asal Amerika Serikat yang didirikan oleh Elon Musk, Martin Eberhard, Marc Tarpenning, JB Straubel dan Ian Wright, serta berbasis di Palo Alto, California.", "https://storage.googleapis.com/webdesignledger.pub.network/WDL/12f213e1-t1.jpg"}
    };

    public static ArrayList<AutoMaker> getListData() {
        AutoMaker autoMaker = null;
        ArrayList<AutoMaker> list = new ArrayList<>();
        for(String[] aData : data ) {
            autoMaker = new AutoMaker();
            autoMaker.setName(aData[0]);
            autoMaker.setDetail(aData[1]);
            autoMaker.setPhoto(aData[2]);

            list.add(autoMaker);
        }

        return list;
    }
}
