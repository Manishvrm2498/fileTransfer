package com.example.fileTransfer.Controller;

import com.example.fileTransfer.Service.FileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class FileController {

    private final FileService fileService;
    public FileController(FileService fileService) {
        this.fileService = fileService;
    }
    @GetMapping("/get-path")
    public String getPath() throws IOException {
        return fileService.copyFile();
    }
}
