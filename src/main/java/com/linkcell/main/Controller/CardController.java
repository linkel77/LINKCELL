package com.linkcell.main.Controller;

import com.linkcell.main.exceptions.GeneralException;
import com.linkcell.main.jsons.CardRest;
import com.linkcell.main.response.CardResponse;
import com.linkcell.main.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/card" + "/v1")
public class CardController {
    @Autowired
    CardService cardService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value="/getCard/" + "{" + "cardId" + "}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public CardResponse<CardRest> getCardByID(@PathVariable Long cardId) throws GeneralException {
        return new CardResponse<>("Succes", String.valueOf(HttpStatus.OK), "OK", cardService.getCardById(cardId));
    }



}
