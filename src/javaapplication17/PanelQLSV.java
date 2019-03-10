/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class PanelQLSV extends JPanel{
    private ArrayList<SinhVien> sv;
    private JTable tablesv;
    private JTable tabbleadd;
    private JButton btnadd;
    private DefaultTableModel tableModel;
    private DefaultTableModel tableModeladd;
    public PanelQLSV (){
        initData();
        initEvent();
        initUI();
    }

    private void initData() { 
       
        String col[] = {"HoLot","Ten","MSSV", "NgaySinh","DiaChi","Sdt"};
        tableModel= new DefaultTableModel(col, 0);
        tablesv=new JTable(tableModel);
        tableModeladd= new DefaultTableModel(col, 0);
        tableModeladd.addRow(new Object[]{"","","","","",""});
        tabbleadd=new JTable(tableModeladd);
        btnadd = new JButton("ADD");
        /**
         * SINH VIEN ARRAYLIST
         */
        sv = new ArrayList<>();
        sv.add(new SinhVien("Tran Minh", "3117410171", "Nhat", "sd", "090923232", "sd"));
        sv.add(new SinhVien("Tran PHAT", "3117410171", "Nhat", "sd", "090923232", "sd"));
        sv.add(new SinhVien("Tran ASD", "3117410171", "Nhat", "sd", "090923232", "sd"));
        sv.add(new SinhVien("Tran S", "3117410171", "Nhat", "sd", "090923232", "sd"));
        sv.add(new SinhVien("Tran F", "3117410171", "Nhat", "sd", "090923232", "sd"));
        sv.add(new SinhVien("Tran D", "3117410171", "Nhat", "sd", "090923232", "sd"));
        /**
         * ADD TO TABLE
         */
        for (int i = 0; i < sv.size(); i++) {
               tableModel.addRow(new Object[]{
                sv.get(i).getHoLot(),sv.get(i).getTen()
               ,sv.get(i).getMssv(),sv.get(i).getNgaysinh()
               ,sv.get(i).getDiachi(),sv.get(i).getSdt()});
        }
      }

    private void initEvent() {
        btnadd.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                   btnadd.setFocusable(true);
                   tableModel.addRow(new Object[]{
                     tableModeladd.getValueAt(0, 0)
                    ,tableModeladd.getValueAt(0, 1)
                    ,tableModeladd.getValueAt(0, 2)
                    ,tableModeladd.getValueAt(0, 3)
                    ,tableModeladd.getValueAt(0, 4)
                    ,tableModeladd.getValueAt(0, 5)
                   });
              
             }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
             }
        });
    }

    private void initUI() {
        setBackground(Color.red);
        setLayout(new GridLayout(3, 1));
        add(tablesv);
        add(tabbleadd);
        add(btnadd);
    }
   
}
