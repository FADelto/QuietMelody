package com.example.QuietMelody.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*!
    \brief Контроллер, используемый для перехода между страницами
    \param @GetMapping() Указывает путь для перехода на страницу
    \return Главная страница веб-приложения
    \return Страница с ошибкой
 */


@Controller
public class MainController {


    @GetMapping("/")
    public String index() /// Метод для вывода главной страницы
    {
        return "index";
    }

    @GetMapping("/error") /// Метод на случай возникновения ошибки
    public String error(){
        return "error";
    }
}