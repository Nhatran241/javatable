/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author User
 */
public class FrameQLSV extends JFrame {
    public FrameQLSV(){
        initData();
        initUI();
        initEvent();
    }
    private void initUI() {
      setVisible(true);
      setSize(480, 600);
      
//      getContentPane().add(new PanelQLSV());
      add(new PanelQLSV());
    }

    private void initData() { 
       setDefaultCloseOperation(EXIT_ON_CLOSE);
     
    }
    private void initEvent() {
    }

    
}
