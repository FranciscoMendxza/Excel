/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excel;

import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.out;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author panch
 */
public class Excel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        try {
            try(HSSFWorkbook wb = new HSSFWorkbook()){
                
                try(FileOutputStream Fileout = new FileOutputStream("Pakon.xlsx")){
                    
                    wb.write(Fileout);
                }
                
            }
        } catch (Exception e) {
        }
    }
    
}
