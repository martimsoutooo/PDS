package lab12.ex5;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class SizeCalculator extends SimpleFileVisitor<Path> {
    private long totalSize;

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        totalSize += attrs.size();
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.err.println("Falha ao visitar o arquivo: " + file);
        return FileVisitResult.CONTINUE;
    }

    public long getTotalSize() {
        return totalSize;
    }
}

