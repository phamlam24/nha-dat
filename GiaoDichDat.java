package NHA_DAT;

public class GiaoDichDat extends GiaoDich{
    char LoaiDat;
    GiaoDichDat(){
        MaGiaoDich = 0;
        NgayGiaoDich = new Date();
        DonGia = 0;
        LoaiDat = 'A';
        DienTich = 0;
    }
    GiaoDichDat(int maGiaoDich,Date ngayGiaoDich,int donGia, char loaiDat,int dienTich){
        MaGiaoDich = maGiaoDich;
        NgayGiaoDich = ngayGiaoDich;
        DonGia = donGia;
        LoaiDat = loaiDat;
        DienTich = dienTich;
    }
    public void InThongTin(){
        System.out.println("Ma giao dich: " + Integer.toString(MaGiaoDich));
        System.out.println("Ngay giao dich: " + NgayGiaoDich.PrintDate());
        System.out.println("Don gia: " + Integer.toString(DonGia));
        System.out.println("Loai dat: " + LoaiDat);
        System.out.println("Dien tich: " + Integer.toString(DienTich));
    }
    public double ThanhTien(){
        if(LoaiDat == 'A') return DonGia * DienTich * 1.1d;
        else return DonGia * DienTich * 1.05d * 2.0d;
    }
}