//package scAppDemo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloController {
//
//    @Autowired
//    HelloService helloService;
//
//    @GetMapping(value = "/hi")
//    public String hi(@RequestParam String name) {
//        return helloService.hiService( name );
//    }
//    
//    @GetMapping(value = "/hi2")
//    public String hi2(@RequestParam String name) {
//        return helloService.hiService2( name );
//    }
//}