package com.vroong.bootcamp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class AlbumService {

    private final SingerRepository repository;

    @Transactional
    public Singer createSinger(Singer dto) {
        return repository.save(dto);
    }

    @Transactional
    public Singer getSinger(Long singerId) {
        return repository
                .findById(singerId)
                .orElseThrow(EntityNotFoundException::new);
    }
}
