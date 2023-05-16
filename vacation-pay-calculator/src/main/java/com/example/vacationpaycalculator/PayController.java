package com.example.vacationpaycalculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController
{
    @GetMapping("/calculate")
    public Integer calculate(@RequestParam Integer meanSalary, @RequestParam Integer vacationDays)
    {
        return (int)((double) meanSalary / 29.3 * vacationDays);
    }
}
