package ma.ensate.kriliya.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import ma.ensate.kriliya.model.Annonce;
import ma.ensate.kriliya.service.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/annonce")
public class AnnonceController {

    @Autowired
    private AnnonceService annonceService;

    @PostMapping("/save")
    public String add(@RequestBody Annonce annonce){
        annonceService.saveAnnonce(annonce);
        return "Saved";
    }


    @GetMapping("get")
    public List<Annonce> get(){
        return annonceService.getAllAnnonce();
    }

    @GetMapping("/getannonce/{id}")
    Optional<Annonce> getannonce(@PathVariable int id) {

        return annonceService.findById(id);
    }

    @PostMapping("/annonce")
    public Annonce addAnnonce(Annonce annonce){
        return annonceService.addAnnonce(annonce);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Integer id) {
        annonceService.removeAnnonce(id);
    }

    @GetMapping("/count")
    public long countAnnonce() {
        long count = annonceService.getCountOfAnnonces();
        return count;
    }
    @GetMapping("mesAnnonces/{id}")
    public List<Annonce> getByUser(@PathVariable Integer id){
        return annonceService.getAnnonceByUser(id);
    }

    @PostMapping(path = "/annonce/save", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Annonce save(@RequestPart String annonce, @RequestPart MultipartFile[] files) {

        Annonce annonceOb = new Annonce();
        try {
            annonceOb  = new ObjectMapper().readValue(annonce, Annonce.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return annonceService.addAnnonce(annonceOb, files);
    }

    @PutMapping("annonce/{id}")
    public Annonce update(@PathVariable Integer id, @RequestBody Annonce annonce){
        return  annonceService.updateAnnonce(id, annonce);
    }

    @GetMapping("annonce/{id}")
    public Annonce getAnnonce(@PathVariable Integer id) { return annonceService.getAnnonce(id);}


}
