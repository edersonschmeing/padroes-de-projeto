package decorator.java.exemplo_encriptacao_e_compressao.decorators;

import decorator.java.exemplo_encriptacao_e_compressao.modelo.DataSource;

public class DataSourceDecorator implements DataSource {
    
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }

}
