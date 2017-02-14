package edu.eci.cosw.spademo.controller;

import edu.eci.cosw.spademo.models.Tarea;
import edu2.eci.cosw.stubs.fakeclientslibrary.CliendLoadException;
import edu2.eci.cosw.stubs.fakeclientslibrary.Client;
import edu2.eci.cosw.stubs.fakeclientslibrary.ClientServicesStub;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RequestWrapper;
import java.util.List;
import java.util.Set;

/**
 * Created by 2086255 on 2/14/17.
 */
@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    private ClientServicesStub client = new ClientServicesStub();

    @RequestMapping(method = RequestMethod.GET)
    public Set<Client> getClients() {
        return client.getAllClients();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Client getClientById(@PathVariable int id) {
        try {
            return client.getClientById(id);
        } catch (CliendLoadException e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "/{id}/picture", method = RequestMethod.GET)
    public ResponseEntity<InputStreamResource> getPicture(@PathVariable int id){
        try{
               return ResponseEntity.ok().contentType(MediaType.parseMediaType("image/jpg")).body(new InputStreamResource(client.getClientPicture(id)));
        }catch(CliendLoadException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
