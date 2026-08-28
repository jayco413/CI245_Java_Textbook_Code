import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class FileHandler {

    public enum FileHandlingMethod {
        BUFFERED,
        FILE_CHANNEL,
        SCANNER
    }

    public static String readFile(String path, FileHandlingMethod method)
            throws IOException {
        switch (method) {
            case BUFFERED:
                return readWithBufferedReader(path);
            case FILE_CHANNEL:
                return readWithFileChannel(path);
            case SCANNER:
                return readWithScanner(path);
            default:
                throw new IllegalArgumentException("Invalid file handling method");
        }
    }

    public static void writeFile(String content, String path, FileHandlingMethod method)
            throws IOException {
        switch (method) {
            case BUFFERED:
                writeWithBufferedWriter(content, path);
                break;
            case FILE_CHANNEL:
                writeWithFileChannel(content, path);
                break;
            case SCANNER:
                writeWithPrintWriter(content, path);
                break;
            default:
                throw new IllegalArgumentException("Invalid file handling method");
        }
    }

    private static String readWithBufferedReader(String path) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }
        return content.toString();
    }

    private static void writeWithBufferedWriter(String content, String path)
            throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(content);
        }
    }

    private static String readWithFileChannel(String path) throws IOException {
        StringBuilder content = new StringBuilder();
        try (RandomAccessFile file = new RandomAccessFile(path, "r");
                FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (channel.read(buffer) > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    content.append((char) buffer.get());
                }
                buffer.clear();
            }
        }
        return content.toString();
    }

    private static void writeWithFileChannel(String content, String path)
            throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(path, "rw");
                FileChannel channel = file.getChannel()) {
            file.setLength(0); // discard whatever was in the file before
            ByteBuffer buffer = ByteBuffer.wrap(content.getBytes());
            channel.write(buffer);
        }
    }

    private static String readWithScanner(String path) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append(System.lineSeparator());
            }
        }
        return content.toString();
    }

    private static void writeWithPrintWriter(String content, String path)
            throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new File(path))) {
            writer.write(content);
        }
    }
}
