package com.shmsoft.ocr.com.hyperiongray.util;

import com.google.common.io.Files;
import java.io.*;
import java.nio.charset.Charset;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.tika.metadata.Metadata;

public class Util {

    public static String getExtension(String fileName) {
        return FilenameUtils.getExtension(fileName);
    }


    public static byte[] getFileContent(String fileName) throws IOException {
        return Files.toByteArray(new File(fileName));
    }

    // Returns the contents of the file in a byte array.
    public static byte[] getBytesFromFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);

        // Get the size of the file
        long length = file.length();

        // You cannot create an array using a long type.
        // It needs to be an int type.
        // Before converting to an int type, check
        // to ensure that file is not larger than Integer.MAX_VALUE.
        if (length > Integer.MAX_VALUE) {
            throw new RuntimeException(file.getName() + " is too large");
        }

        // Create the byte array to hold the data
        byte[] bytes = new byte[(int) length];

        // Read in the bytes
        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length
                && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
            offset += numRead;
        }

        // Ensure all the bytes have been read in
        if (offset < bytes.length) {
            throw new IOException("Could not completely read file " + file.getName());
        }

        // Close the input stream and return bytes
        is.close();
        return bytes;
    }

    /**
     * @param fileName
     * @return content of the file
     */
    public static String readTextFile(String fileName) throws IOException {
        return Files.toString(new File(fileName), Charset.defaultCharset());
    }

    public static void writeTextFile(String fileName, String content) throws IOException {
        Files.write(content, new File(fileName), Charset.defaultCharset());
    }

    public static void appendToTextFile(String fileName, String content) throws IOException {
        Files.append(content, new File(fileName), Charset.defaultCharset());
    }

    public static String toString(Metadata metadata) {
        StringBuilder builder = new StringBuilder();
        String[] names = metadata.names();
        for (String name : names) {
            builder.append(name).append("=").append(metadata.get(name)).append("\n");
        }
        return builder.toString();
    }

    public static boolean isSystemFile(Metadata metadata) {
        return "application/octet-stream".equalsIgnoreCase(
                metadata.get("Content-Type"));
    }

    public static int countLines(String filename) throws IOException {
        LineNumberReader reader = new LineNumberReader(new FileReader(filename));
        int cnt = 0;
        String lineRead = "";
        while ((lineRead = reader.readLine()) != null) {
        }
        cnt = reader.getLineNumber();
        reader.close();
        return cnt;
    }

    public static String arrayToString(String[] strings) {
        StringBuilder builder = new StringBuilder();
        for (String str : strings) {
            builder.append(str).append("\n");
        }
        return builder.toString();
    }
    /**
     * Delete directory with everything underneath. Note that in the case of *nix we use 'rm -fr <dir>, because of
     * the known problems with recursive deletes, and because 'rm -fr' is probably faster.
     * @param dir directory to delete.
     * @throws IOException on any problem with delete.
     */
    public static void deleteDirectory(File dir) throws IOException {
        if (PlatformUtil.isNix()) {
            PlatformUtil.runCommand("rm -fr " + dir.getPath());
        } else {
            FileUtils.deleteDirectory(dir);
        }
    }
}
