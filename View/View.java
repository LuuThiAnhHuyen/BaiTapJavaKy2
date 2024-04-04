package View;

import Models.SinhVien;
import Models.TheMuon;
import Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JTextField txtMaPhieuMuon, txtNgayMuon, txtHanTra, txtSoHieuSach, txtHoTen, txtTuoi, txtLop;
    private JButton btnThem, btnXoa, btnHienThi;

    public View() {
        setTitle("Quan Ly Thu Vien");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2));

        JLabel lblMaPhieuMuon = new JLabel("Ma Phieu Muon:");
        txtMaPhieuMuon = new JTextField();
        add(lblMaPhieuMuon);
        add(txtMaPhieuMuon);

        JLabel lblNgayMuon = new JLabel("Ngay Muon:");
        txtNgayMuon = new JTextField();
        add(lblNgayMuon);
        add(txtNgayMuon);

        JLabel lblHanTra = new JLabel("Han Tra:");
        txtHanTra = new JTextField();
        add(lblHanTra);
        add(txtHanTra);

        JLabel lblSoHieuSach = new JLabel("So Hieu Sach:");
        txtSoHieuSach = new JTextField();
        add(lblSoHieuSach);
        add(txtSoHieuSach);

        JLabel lblHoTen = new JLabel("Ho Ten:");
        txtHoTen = new JTextField();
        add(lblHoTen);
        add(txtHoTen);

        JLabel lblTuoi = new JLabel("Tuoi:");
        txtTuoi = new JTextField();
        add(lblTuoi);
        add(txtTuoi);

        JLabel lblLop = new JLabel("Lop:");
        txtLop = new JTextField();
        add(lblLop);
        add(txtLop);

        btnThem = new JButton("Them The Muon");
        add(btnThem);
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String MaPhieuMuon = txtMaPhieuMuon.getText();
                String NgayMuon = txtNgayMuon.getText();
                String HanTra = txtHanTra.getText();
                String SoHieuSach = txtSoHieuSach.getText();
                String HoTen = txtHoTen.getText();
                int Tuoi = Integer.parseInt(txtTuoi.getText());
                String Lop = txtLop.getText();

                SinhVien sv = new SinhVien(HoTen, Tuoi, Lop);
                TheMuon themuon = new TheMuon(MaPhieuMuon, NgayMuon, HanTra, SoHieuSach, sv);
                Controller.ThemTheMuon(themuon);
            }
        });

        btnXoa = new JButton("Xoa The Muon");
        add(btnXoa);
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String MaPhieuMuon = txtMaPhieuMuon.getText();
                Controller.XoaTheMuon(MaPhieuMuon);
            }
        });

        btnHienThi = new JButton("Hien Thi Thong Tin");
        add(btnHienThi);
        btnHienThi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.HienThi();
            }
        });

        setVisible(true);
    }
}
