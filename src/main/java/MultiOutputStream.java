import java.io.IOException;
import java.io.OutputStream;

public class MultiOutputStream extends OutputStream {
    private OutputStream console;
    private OutputStream file;

    public MultiOutputStream(OutputStream console, OutputStream file) {
        this.console = console;
        this.file = file;
    }

    @Override
    public void write(int b) throws IOException {
        console.write(b); 
        file.write(b);   
    }

    @Override
    public void flush() throws IOException {
        console.flush();
        file.flush();
    }
}
