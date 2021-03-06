package com.products.products.exception;

import lombok.Setter;

import java.util.Date;

@Setter
public class ErrorDetails {

    private Date date;

    private String errorDescription;
}
