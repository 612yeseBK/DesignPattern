package Decorateor;

import java.io.*;

// 这是一个对InputStream的装饰器
public class LowerInputStream extends FilterInputStream{
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c==-1?c:Character.toLowerCase(c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off;i<off+len;i++){
            b[i] = (byte)Character.toLowerCase(b[i]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException{
        InputStream in = new FileInputStream("E:\\myspace\\gitTOA\\DesignPattern\\src\\main\\java\\Decorateor\\toLower.txt");
        InputStream inputStream = new LowerInputStream(in);
        byte[] bytes = new byte[5];
        OutputStream os = new FileOutputStream("E:\\myspace\\gitTOA\\DesignPattern\\src\\main\\java\\Decorateor\\result.txt");
        while((inputStream.read(bytes))!=-1){
            os.write(bytes);
        }
        os.close();
//        int c;
//        while((c=inputStream.read())!=-1){
//            System.out.print((char)c);
//        }

        in.close();
        inputStream.close();
    }
}
