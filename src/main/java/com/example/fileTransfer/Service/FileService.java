package com.example.fileTransfer.Service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
@Service
public class FileService {
    public String copyFile() throws IOException {

        Path source = Paths.get("/Users/manishverma/Downloads/demo-3.zip");
        Path target = Paths.get("/Users/manishverma/Documents/demo-3.zip");

        Files.copy(source,target,StandardCopyOption.REPLACE_EXISTING);
        return "File copied";

    }
}
