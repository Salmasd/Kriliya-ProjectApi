package ma.ensate.kriliya.service;

import ma.ensate.kriliya.model.Image;
import ma.ensate.kriliya.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepository imageRepository;

}
