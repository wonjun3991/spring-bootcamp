package com.vroong.bootcamp;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AlbumController {
    private final AlbumService service;

    @PostMapping("/singers")
    public ResponseEntity<Singer> registerSinger(@RequestBody Singer dto) {
        final Singer entity = service.createSinger(dto);
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/singers/{singerId}")
    public ResponseEntity<Singer> getSinger(@PathVariable("singerId") Long singerId) {
        return ResponseEntity.ok(service.getSinger(singerId));
    }
}
