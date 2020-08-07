package com.linkcell.main.service.impl;

import com.linkcell.main.entity.Card;
import com.linkcell.main.entity.Icon;
import com.linkcell.main.exceptions.GeneralException;
import com.linkcell.main.exceptions.NotFoundException;
import com.linkcell.main.jsons.CardRest;
import com.linkcell.main.repository.CardRepository;
import com.linkcell.main.repository.IconRepository;
import com.linkcell.main.service.CardService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private IconRepository iconRepository;

    private static final ModelMapper modelMapper = new ModelMapper();

    @Override
    public CardRest getCardById(Long cardId) throws GeneralException {
        return modelMapper.map(getCardEntity(cardId),CardRest.class);
    }

    public String createCard(CardRest cardRest) throws GeneralException{
        final Card card = cardRepository.findByGameCardId(cardRest.getId()).orElse(null);
        //Aqui compruebo si la carta existe, si no existe seguimos sino no la creo
        if (card== null) {
            //Lanzo el crear Icon que ya comprueba si existe o no
               /** iconRepository.
                card.setName(cardRest.getName());
                card.setGameCardId(cardRest.getId());
                card.setMaxLevel(cardRest.getMaxLevel());
                card.setIcon(icon);*/
                cardRepository.save(card);


            return "NO EXISTE, SE CREA";
        }else{
            return "YA EXISTE, NO SE CREA";
        }

    }

    @Override
    public List<CardRest> getAllCards() throws GeneralException {
        final List<Card> cardsEntity = cardRepository.findAll();

        return cardsEntity.stream().map(service -> modelMapper.map(service, CardRest.class)).collect(Collectors.toList());
    }


    private Card getCardEntity(Long cardId) throws GeneralException{
        return cardRepository.findByGameCardId(cardId).orElseThrow(()-> new NotFoundException("SNOT-404-1","CARD_NOT_FOUND"));
    }
}
