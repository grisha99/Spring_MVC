package ru.grischenko.springmvc.controllers;

import ru.grischenko.springmvc.models.ErrorModel;

import java.util.LinkedList;
import java.util.List;

public class BaseController {

    protected List<ErrorModel> listError;

    public BaseController() {
        listError = new LinkedList<>();
    }

}
