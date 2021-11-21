package ma.ensate.kriliya.service;

import ma.ensate.kriliya.model.Annonce;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public interface AnnonceService {

    public Annonce saveAnnonce(Annonce annonce);
    public List<Annonce> getAllAnnonce();
    Optional< Annonce > findById(int id);
    public Annonce addAnnonce(Annonce annonce);
    public void removeAnnonce(Integer id);
    public long getCountOfAnnonces();

    public List<Annonce> getAnnonceByUser(Integer id);
    public Annonce updateAnnonce(Integer id, Annonce annonce);
    public Annonce addAnnonce(Annonce annonce, MultipartFile[] files);
    public Annonce getAnnonce(Integer id);

}
