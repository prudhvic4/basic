package learn.design.basic.repository;


import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public String GetMessageHello()
    {
        return "Hello World";
    }
}
