package br.com.essencialstore.shopping.client.service;

import br.com.essencialstore.shopping.client.dto.UserDTO;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserDTO getUserByCpf(String cpf){
        RestTemplate restTemplateBuilder = new RestTemplate();
        String url = "http://localhost:8080/user/cpf" + cpf;

        ResponseEntity<UserDTO> response = restTemplateBuilder.getForEntity(url, UserDTO.class);

        return response.getBody();
    }
}
