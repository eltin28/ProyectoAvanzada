package co.edu.uniquindio.Controladores;

import co.edu.uniquindio.Servicios.Interfaces.ClienteServicio;
import co.edu.uniquindio.dto.MensajeDTO;
import co.edu.uniquindio.dto.RegistroClienteDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/clientes")
public class ClienteControlador {

    private final ClienteServicio clienteServicio;


    @PostMapping("/registrar-cliente")
    public ResponseEntity<MensajeDTO<String>>
    registrarCliente(@Valid @RequestBody
                     RegistroClienteDTO registroClienteDTO) throws Exception {
        clienteServicio.registrarCliente(registroClienteDTO);
        return ResponseEntity.ok().body( new MensajeDTO<>(false,
                "Cliente registrado correctamente"));
    }

}