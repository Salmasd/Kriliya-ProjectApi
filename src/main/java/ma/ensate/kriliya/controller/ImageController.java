package ma.ensate.kriliya.controller;

import ma.ensate.kriliya.model.Image;
import ma.ensate.kriliya.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/annonce")
public class ImageController {
    @Autowired
    private ImageRepository imageRepository;

}
