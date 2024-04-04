package Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

import Models.TheMuon;

public class Controller {
    
    private static ArrayList<TheMuon> DanhSachTheMuon = new ArrayList<>();

    public static void ThemTheMuon(TheMuon themuon) {
        DanhSachTheMuon.add(themuon);
        // Ghi thông tin vào file sau khi thêm
        ghiFile();
    }
        
    public static void XoaTheMuon(String MaPhieuMuon) {
        AtomicBoolean removed = new AtomicBoolean(false);
        DanhSachTheMuon = DanhSachTheMuon.stream()
                            .filter(theMuon -> {
                                if (theMuon.getMaPhieuMuon().equals(MaPhieuMuon)) {
                                    removed.set(true);
                                    return false;
                                }
                                return true;
                            })
                            .collect(Collectors.toCollection(ArrayList::new));
        
        if (removed.get()) {
            System.out.println("Xoa thanh cong !");
            // Ghi thông tin vào file sau khi xóa
            ghiFile();
        } else {
            System.out.println("The khong ton tai !");
        }
    }
        
    public static void HienThi() {
        DanhSachTheMuon.stream().forEach(System.out::println);
    }

    private static void ghiFile() {
        try {
            FileWriter writer = new FileWriter("ketqua.txt");
            for (TheMuon muon : DanhSachTheMuon) {
                writer.write(muon.toString() + "\n");
            }
            writer.close();
            System.out.println("Ghi file thanh cong!");
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e.getMessage());
        }
    }
}
