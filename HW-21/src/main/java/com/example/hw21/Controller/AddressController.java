package com.example.hw21.Controller;

import com.example.hw21.Service.AddressService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/address")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;
    @PostMapping("add")
    public ResponseEntity addAddress (@ResponseBody @Valid)CustomerDetailsDTO dto){
        customerDetailsService.addDetails(dto);
        return ResponseEntity.status(200).body("Details aded to customer");
    }
}

}


}