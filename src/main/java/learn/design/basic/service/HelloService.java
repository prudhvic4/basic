package learn.design.basic.service;

import learn.design.basic.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    HelloRepository helloRepository;
    public String FetchHelloMessage()
    {
        return helloRepository.GetMessageHello();
    }

}
