package com.ipartek.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import ch.qos.logback.core.model.Model;

@Controller
public class ControladorError {
	
	@ExceptionHandler(org.springframework.web.servlet.NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String paginaNoEncontrada(Model model) {
		return "error/404";
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)	
	public String errorServidor(Exception ex, Model model) {
		return "error/500";
	}
	
}
