package com.websystique.springmvc.dao.impl;


import com.websystique.springmvc.dao.CurrencyDao;
import com.websystique.springmvc.persistence.entities.Currency;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CurrencyDaoImpl implements CurrencyDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public void saveCurrency(Currency currency) {
        em.merge(currency);
    }
}
