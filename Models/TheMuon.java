package Models;

public class TheMuon {
	private String MaPhieuMuon;
	private String NgayMuon;
	private String HanTra;
	private String SoHieuSach;
	private SinhVien sv;
	
	public TheMuon(String maPhieuMuon, String ngayMuon, String hanTra, String soHieuSach, SinhVien sV) {
		super();
		MaPhieuMuon = maPhieuMuon;
		NgayMuon = ngayMuon;
		HanTra = hanTra;
		SoHieuSach = soHieuSach;
		sv = sV;
	}

	public String getMaPhieuMuon() {
		return MaPhieuMuon;
	}
	public void setMaPhieuMuon(String maPhieuMuon) {
		MaPhieuMuon = maPhieuMuon;
	}
	public String getNgayMuon() {
		return NgayMuon;
	}
	public void setNgayMuon(String ngayMuon) {
		NgayMuon = ngayMuon;
	}
	public String getHanTra() {
		return HanTra;
	}
	public void setHanTra(String hanTra) {
		HanTra = hanTra;
	}
	public String getSoHieuSach() {
		return SoHieuSach;
	}
	public void setSoHieuSach(String soHieuSach) {
		SoHieuSach = soHieuSach;
	}
	public SinhVien getSV() {
		return sv;
	}
	public void setSV(SinhVien sV) {
		sv = sV;
	}
	@Override
	public String toString() {
		return "TheMuon [MaPhieuMuon=" + MaPhieuMuon + ", NgayMuon=" + NgayMuon + ", HanTra=" + HanTra + ", SoHieuSach="
				+ SoHieuSach + ", SV=" + sv + "]";
	}
	
}



