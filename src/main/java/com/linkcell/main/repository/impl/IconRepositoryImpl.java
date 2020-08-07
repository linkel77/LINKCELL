package com.linkcell.main.repository.impl;

import com.linkcell.main.entity.Icon;
import com.linkcell.main.repository.IconRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class IconRepositoryImpl implements IconRepository {
    @Override
    public Optional<Icon> findByMediumUrl(String medium) {
        return Optional.empty();
    }

    @Override
    public List<Icon> findAll() {
        return null;
    }

    @Override
    public List<Icon> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Icon> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Icon> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Icon icon) {

    }

    @Override
    public void deleteAll(Iterable<? extends Icon> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Icon> S save(S s) {
        return null;
    }

    @Override
    public <S extends Icon> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Icon> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Icon> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Icon> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Icon getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Icon> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Icon> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Icon> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Icon> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Icon> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Icon> boolean exists(Example<S> example) {
        return false;
    }
}
