package Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import ErrorHandling.ProblemExceptionHandler;
import ErrorHandling.ProblemExceptionHandler.ErrorCode;

public class URLHandler {
    public static final String CODE_URL = "src/main/resources/CodeFolder";
    private static final String CODE_SUFFIX = ".cpp";
    public static final String CODE_SUFFIX_COMPILED = ".exe";

    public static String writeFile(String content, String name) throws ProblemExceptionHandler {
        String url = CODE_URL + "/" + name + CODE_SUFFIX;
        writeCodeToUrl(content, url);
        return url;
    }

    public static String getCompiledFile(String name) {
        return CODE_URL + "/" + name + CODE_SUFFIX_COMPILED;
    }

    public static String getCompliedFolder(String name) {
        return CODE_URL + "/" + name;
    }

    public static void removeAllFileCompiled() {
        File dir = new File(CODE_URL);
        for (File file : dir.listFiles())
            if (!file.isDirectory())
                file.delete();
    }

    private static void writeCodeToUrl(String content, String url) throws ProblemExceptionHandler {
        PrintWriter out;
        try {
            out = new PrintWriter(url);
            out.print(content);
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            // need handler
            throw new ProblemExceptionHandler(ErrorCode.FILE_NOT_FOUND, e.getMessage());
        }

    }
}
