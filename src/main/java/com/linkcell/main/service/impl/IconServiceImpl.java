package com.linkcell.main.service.impl;

import com.linkcell.main.entity.Icon;
import com.linkcell.main.jsons.IconRest;
import com.linkcell.main.repository.IconRepository;
import com.linkcell.main.service.IconService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class IconServiceImpl implements IconService {

    @Autowired
    private IconRepository iconRepository;


}
