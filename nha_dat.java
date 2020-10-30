package NHA_DAT;

import java.util.ArrayList;

public class nha_dat {
    public static ArrayList<GiaoDichNha> Nha;
    public static ArrayList<GiaoDichDat> Dat;

    public static void TinhTien(){
        double TongTienDat = 0;
        for(GiaoDichDat i : Dat){
            TongTienDat += i.ThanhTien();
        }
        System.out.println("Tong tien dat la: " + Double.toString(TongTienDat));
        double TongTienNha = 0;
        for(GiaoDichNha i : Nha){
            TongTienNha += i.ThanhTien();
        }
        System.out.println("Tong tien nha la: " + Double.toString(TongTienNha));
    }
    public static void main(String[] args){
        Nha.add(new GiaoDichNha(12, new Date(22,10,2020), 13, "Nha cao cap", 13, 1));
        Nha.add(new GiaoDichNha(4, new Date(6,3,1), 13, "Nha biet thu", 13, 1));
        Nha.add(new GiaoDichNha(2, new Date(3,10,3), 13, "Nha cao cap", 13, 1));
        Nha.add(new GiaoDichNha(13, new Date(6,1,1234), 13, "Nha biet thu", 13, 1));
        Nha.add(new GiaoDichNha(131234, new Date(6,10,53124), 13, "Nha cao cap", 13, 1));
        TinhTien();
    }
}
