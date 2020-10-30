package NHA_DAT;

public class GiaoDichNha extends GiaoDich{
    String LoaiNha;
    int HeSoViTri;
    GiaoDichNha(){
        MaGiaoDich = 0;
        NgayGiaoDich = new Date();
        DonGia = 0;
        LoaiNha = "Nha cao cap";
        DienTich = 0;
        HeSoViTri = 0;
    }
    GiaoDichNha(int maGiaoDich,Date ngayGiaoDich,int donGia, String loaiNha,int dienTich,int heSoViTri){
        MaGiaoDich = maGiaoDich;
        NgayGiaoDich = ngayGiaoDich;
        DonGia = donGia;
        LoaiNha = loaiNha;
        DienTich = dienTich;
        HeSoViTri = heSoViTri;
    }

    public void InThongTin(){
        System.out.println("Ma giao dich: " + Integer.toString(MaGiaoDich));
        System.out.println("Ngay giao dich: " + NgayGiaoDich.PrintDate());
        System.out.println("Don gia: " + Integer.toString(DonGia));
        System.out.println("Loai nha: " + LoaiNha);
        System.out.println("Dien tich: " + Integer.toString(DienTich));
        System.out.println("He so vi tri: " + Integer.toString(HeSoViTri));
    }

    public double ThanhTien(){
        if(LoaiNha == "Nha cao cap") return DonGia * DienTich * HeSoViTri * 1.05d;
        else return DonGia * DienTich * HeSoViTri * 1.05d * 1.5d;
    }
}
