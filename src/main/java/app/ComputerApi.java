package app;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class ComputerApi {

    List<Computer> computers;


    public ComputerApi() {

        Computer computer1 = new Computer();

        computers = Arrays.asList();

    }

    @PostMapping("/api/computer/add")

    public void addComputer(@RequestBody Computer computer){


    }





}
