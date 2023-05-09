import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class App {

    public static void main(String[] args) throws Exception {

        //TODO Crear un fitxer amb la classe File
        //el nom del fitxer serà testfile.html


        String str = urlReader("http://inslaguineueta.cat");

        //TODO cridar la funció perquè guardi str al fitxer

        File file = new File("ejercicio.out");
        saveToFile(str,file,false);
        //TODO LLegir el contingut del fitxer i imprimir-lo
        //per pantalla.

        System.out.println(readFromFile(file));;

    }

    static String readFromFile(File file) throws IOException {
        //TODO usant FileReader i BufferedReader
        FileReader fileread = new FileReader(file); 
        BufferedReader readers = new BufferedReader(fileread);
        StringBuilder bulid = new StringBuilder(); 
        String line;
        while((line = readers.readLine()) != null){ bulid.append(line); }
        readers.close(); 
        return bulid.toString(); 
       }

    static void saveToFile(String str, File file, boolean append)
            throws IOException {
        //TODO usant FileWriter i BufferedWriter
        FileWriter nop = new FileWriter(file, append);
        BufferedWriter nopwriter = new BufferedWriter(nop);
        nopwriter.write(str);
        nopwriter.close();
    }

    public static String urlReader(String url) throws Exception {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            yc.getInputStream()));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null)
                sb.append(inputLine);
            in.close();
            return sb.toString();
    }

}