package com.linkcell.main.service;

import com.linkcell.main.exceptions.GeneralException;
import com.linkcell.main.jsons.CardRest;

import java.util.List;

public interface CardService {

    CardRest getCardById(Long CardId) throws GeneralException;

    String createCard(CardRest cardRest) throws GeneralException;

    List<CardRest> getAllCards() throws GeneralException;
}
