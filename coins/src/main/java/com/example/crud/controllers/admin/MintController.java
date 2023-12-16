package com.example.crud.controllers.admin;

import com.example.crud.dto.MintDto;
import com.example.crud.dto.NewMintDto;
import com.example.crud.dto.UpdateMintDto;
import com.example.crud.services.mint.MintService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
@AllArgsConstructor
public class MintController {

    private MintService mintService;

    @PostMapping("/country/{countryId}/mint/{mintId}")
    @ResponseStatus(HttpStatus.CREATED)
    public MintDto createMint(@PathVariable Long countryId, @RequestBody NewMintDto newMintDto) {
        return mintService.save(countryId, newMintDto);
    }

    @GetMapping("/country/{countryId}/mint/{mintId}")
    @ResponseStatus(HttpStatus.OK)
    public MintDto getMint(@PathVariable Long countryId, @PathVariable Long mintId) {
        return mintService.get(countryId, mintId);
    }

    @DeleteMapping("/country/{countryId}/mint/{mintId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMint(@PathVariable Long countryId, @PathVariable Long mintId) {
        mintService.delete(countryId, mintId);
        ;
    }

    @PatchMapping("/country/{countryId}/mint/{mintId}")
    @ResponseStatus(HttpStatus.OK)
    public MintDto updateMint(@PathVariable Long countryId, @PathVariable Long mintId, @RequestBody UpdateMintDto mintDto) {
        return mintService.update(countryId, mintId, mintDto);
    }
}
