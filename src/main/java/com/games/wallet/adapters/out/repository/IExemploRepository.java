package com.games.wallet.adapters.out.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.wallet.adapters.out.repository.entity.ExemploEntity;

public interface IExemploRepository extends JpaRepository<ExemploEntity, UUID> {

}
