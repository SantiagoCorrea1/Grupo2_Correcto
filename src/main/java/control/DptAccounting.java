/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.net.URL;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author SANTIAGO
 */
public class DptAccounting {
    
    
    
    //crea el pdf y setea la informción según lo almacenado en los arrayLists
    public void llevarCuentas(ArraysControl arraysControl) {
        Document pdf = new Document();
        
        try {
            PdfWriter.getInstance(pdf, new FileOutputStream("src/contabilidad.pdf"));
            pdf.open();
            
            Paragraph title = new Paragraph("Contabilidad Zoo BearHome"
                    + "\nel centro, no sé de direcciones"
                    + "\nzooBearHome@gmail.com");
            title.setAlignment(Element.ALIGN_RIGHT);
            title.setSpacingAfter(-60f);
            pdf.add(title);
            
            URL logo = new URL("https://cdn0.ecologiaverde.com/es/posts/2/3/9/oso_grizzly_que_come_y_caracteristicas_3932_orig.jpg");
            Image imageLogo = Image.getInstance(logo);
            imageLogo.scaleToFit(200f, 200f);
            imageLogo.setSpacingBefore(-60f);
            imageLogo.setSpacingAfter(30f);
            imageLogo.setAlignment(Chunk.ALIGN_LEFT);
            pdf.add(imageLogo);
            
            Paragraph sales = new Paragraph("Informe de ventas");
            sales.setAlignment(Element.ALIGN_LEFT);
            sales.setSpacingAfter(10f);
            sales.setSpacingBefore(30);
            pdf.add(sales);
            
            // Agregar tabla
            PdfPTable table = new PdfPTable(6);
            table.setWidthPercentage(100); 
            table.setSpacingBefore(0f); 
            table.setSpacingAfter(300f);

            Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
            font.setSize(11f);
            PdfPCell cell1 = new PdfPCell(new Paragraph("PLAN", font));
            PdfPCell cell2 = new PdfPCell(new Paragraph("VALOR", font));
            PdfPCell cell3 = new PdfPCell(new Paragraph("CANTIDAD", font));
            PdfPCell cell4 = new PdfPCell(new Paragraph("DESCUENTOS", font));
            PdfPCell cell5 = new PdfPCell(new Paragraph("VALOR VENTA", font));
            PdfPCell cell6 = new PdfPCell(new Paragraph("TOTAL", font));

            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
            table.addCell(cell5);
            table.addCell(cell6);
            
            // Agregar datos a las celdas desde el arrayList de los planes creado en el departamento de ventas
            for (int i = 0; i < arraysControl.getPlans().size(); i++) {
                
                int totalSold = arraysControl.getPlans().get(i).getSoldDiscount() + 
                        arraysControl.getPlans().get(i).getSoldNormal();
                
                table.addCell(arraysControl.getPlans().get(i).getCode());
                table.addCell(arraysControl.getPlans().get(i).getPrice() + "");
                table.addCell(totalSold + "");
                table.addCell(arraysControl.getPlans().get(i).getSoldDiscount() + "");
                table.addCell(arraysControl.getPlans().get(i).getIncomePlan() + "");
                table.addCell(arraysControl.getPlans().get(i).getIncomePlan() + "");
            }
            pdf.add(table);
            
            // agrgar la imágen de zoodi
            Image footImage = Image.getInstance("src/zoodi.jpg");
            footImage.scaleToFit(500f, 600);
            footImage.setSpacingBefore(300f);
            footImage.setSpacingAfter(0f);
            footImage.setAlignment(Chunk.ALIGN_CENTER);
            pdf.add(footImage);
            
            //agregar ubicación 
            Paragraph foot = new Paragraph("    la esquina del barrio");
            foot.setAlignment(Element.ALIGN_LEFT);
            foot.setSpacingBefore(-10f);
            pdf.add(foot);
            
        } catch (DocumentException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            pdf.close();
        }
    }
    
    //abre el pdf en el navegador, hasta donde tengo entendido, solo funciona en windows 
    public void showPDF(){
        String url = "src/contabilidad.pdf";
        ProcessBuilder p = new ProcessBuilder();
        p.command("cmd", "/c", "start", url);
        
        try {
            p.start();
        } catch (IOException ex) {
            Logger.getLogger(DptAccounting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
