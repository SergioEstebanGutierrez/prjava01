package prjava01;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author seres
 */
public class Prjava01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("fitxer.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");
            bw.newLine();
            bw.write("  <head>");
            bw.newLine();
            bw.write("    <title>");
            bw.newLine();
            bw.write("      Nova p&agrave;gina  web");
            bw.newLine();
            bw.write("    </title>");
            bw.newLine();
            bw.write("  </head>");
            bw.newLine();
            bw.write("  <body>");
            bw.newLine();
            bw.write(" <h1>DAW2 m08uf4eac4</h1>");bw.newLine(); 
            bw.write("    Nova p&agrave;gina web");
            bw.newLine();
            bw.write("  </body>");
            bw.newLine();
            bw.write("</html>");
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Prjava01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
