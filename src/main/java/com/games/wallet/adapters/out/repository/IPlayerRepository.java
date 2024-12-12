package com.games.wallet.adapters.out.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.wallet.adapters.out.repository.entity.PlayerEntity;

public interface IPlayerRepository extends JpaRepository<PlayerEntity, UUID> {

}
