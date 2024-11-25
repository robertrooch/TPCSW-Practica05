/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package org.uv.TPCSWPractica05;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author roberto
 */
@RestController
@RequestMapping("/url")
public class Ejemplo {
    @GetMapping
    public String sayHello(){
        return "Hola mundo";
    }
}
