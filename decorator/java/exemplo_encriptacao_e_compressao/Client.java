package decorator.java.exemplo_encriptacao_e_compressao;

import java.io.File;

import decorator.java.exemplo_encriptacao_e_compressao.decorators.CompressionDecorator;
import decorator.java.exemplo_encriptacao_e_compressao.decorators.DataSourceDecorator;
import decorator.java.exemplo_encriptacao_e_compressao.decorators.EncryptionDecorator;
import decorator.java.exemplo_encriptacao_e_compressao.modelo.DataSource;
import decorator.java.exemplo_encriptacao_e_compressao.modelo.FileDataSource;

public class Client {

    public static void main(String[] args) {
        
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        
        String path = System.getProperty("user.dir");
        String filePathEncoded = path + File.separator + "decorator" + File.separator + "java" + File.separator + "exemplo_encriptacao_e_compressao" + File.separator +  "encoded.txt"; 

        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource(filePathEncoded)));
        encoded.writeData(salaryRecords);
        
        DataSource plainEncoded = new FileDataSource(filePathEncoded);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plainEncoded.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());

        String filePathCompress = path + File.separator + "decorator" + File.separator + "java" + File.separator + "exemplo_encriptacao_e_compressao" + File.separator +  "compress.txt"; 


        System.out.println("");
        System.out.println("");

        DataSourceDecorator compress = new CompressionDecorator(
                                            new FileDataSource(filePathCompress));

        compress.writeData(salaryRecords);
        
        DataSource plainCompress = new FileDataSource(filePathCompress);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Compress --------------");
        System.out.println(plainCompress.readData());
        System.out.println("- decompress --------------");
        System.out.println(compress.readData());

    }
    
}
